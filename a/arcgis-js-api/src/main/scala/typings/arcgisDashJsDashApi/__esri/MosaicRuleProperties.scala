package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`lock-raster`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.attribute
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.blend
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.center
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.first
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.last
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.max
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.mean
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.min
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.nadir
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.none
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.northwest
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.seamline
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.sum
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.viewpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicRuleProperties extends js.Object {
  /**
    * Indicates whether the sort should be ascending. This property applies to all mosaic [methods](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) where an ordering is defined except `seamline`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#ascending)
    *
    * @default true
    */
  var ascending: js.UndefOr[Boolean] = js.undefined
  /**
    * The rendering rule applied on items before mosaicking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#itemRenderingRule)
    */
  var itemRenderingRule: js.UndefOr[RasterFunctionProperties] = js.undefined
  /**
    * An array of raster Ids. All the rasters with the given list of raster Ids are selected to participate in the mosaic. The rasters will be visible at all pixel sizes regardless of the minimum and maximum pixel size range of the locked rasters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#lockRasterIds)
    */
  var lockRasterIds: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The mosaic method determines how the selected rasters are ordered. The mosaic method defines how the mosaicked image is created from these input rasters.
    *
    * Value | Description |
    * ----- | ----------- |
    * none | Orders rasters based on the order of [objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#objectIds) in the mosaic dataset attribute table.
    * center | Enables rasters to be sorted based their ZOrder, then PixelSize, and then by a default order where rasters that have their centers closest to the view center are placed on top.
    * nadir | Enables rasters to be sorted by the ZOrder, then PixelSize, and then by the distance between the nadir position and view center. This is similar to the Closest to Center method but uses the nadir point to a raster, which may be different than the center, especially for oblique imagery.
    * viewpoint | Orders rasters based on the ZOrder, then PixelSize, and then by a user-defined location and nadir location for the rasters using the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#viewpoint).
    * attribute | Enables raster ordering based on ZOrder, then PixelSize, and then by a defined metadata attribute and its difference from a base value.
    * lock-raster | Enables a user to lock the display of single or multiple rasters based on the [lockRasterIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#lockRasterIds).
    * northwest | Enables raster ordering by ZOrder, then PixelSize, and then by the shortest distance between the center of a raster to the northwest position.
    * seamline| Cuts the raster using the predefined seamline shape for each raster, using optional feathering along the seams, and orders images based on the ZOrder and then the SOrder fields in the attribute table.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method)
    */
  var method: js.UndefOr[
    none | center | nadir | viewpoint | attribute | `lock-raster` | northwest | seamline
  ] = js.undefined
  /**
    * A multiple dimensional service can have multiple dimensions for one or more variables. Use multiDimensionalDefinitions to filter data based on a slice or range of data. For example, a single ImageryLayer may have a `depth` dimension storing sea temperatures for the same pixel location at various depths. Another dimension could be `time`, where the same pixel stores multiple values based on a window of time.  This property can be used to filter and display ImageryLayer pixels for specific "slices" in those dimensions (e.g. display sea temperature at 1000m below sea level for a specific week in the year).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition)
    */
  var multidimensionalDefinition: js.UndefOr[js.Array[DimensionalDefinitionProperties]] = js.undefined
  /**
    * Defines a selection using a set of ObjectIDs. This property applies to all mosaic methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Defines the mosaic operation used to resolve overlapping pixels.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * first | The overlapping areas will contain the cells from the first raster dataset listed in the source.
    * last | The overlapping areas will contain the cells from the last raster dataset listed in the source.
    * min | The overlapping areas will contain the minimum cell values from all the overlapping cells.
    * max | The overlapping areas will contain the maximum cell values from all the overlapping cells.
    * mean | The overlapping areas will contain the mean cell values from all the overlapping cells.
    * blend | The overlapping areas will be a blend of the cell values that overlap. This blend value relies on an algorithm that is weight based and dependent on the distance from the cells to the edge within the overlapping area.
    * sum | The overlapping areas will contain the total sum of the cell values from all the overlapping cells.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#operation)
    */
  var operation: js.UndefOr[first | last | min | max | mean | blend | sum] = js.undefined
  /**
    * The name of the attribute field that is used with a constant sortValue to define the mosaicking order when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`. The ordering is defined by the absolute value of the difference between the specified sort field value and the sort base value. For example, if the sort field is `Month` and the sort value is `7 (July)`, then the ordering is defined by `ABS(Month -7)`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortField)
    */
  var sortField: js.UndefOr[String] = js.undefined
  /**
    * A constant value defining a reference or base value for the sort field when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortValue)
    */
  var sortValue: js.UndefOr[String] = js.undefined
  /**
    * Defines the viewpoint location on which the ordering is defined based on the distance from the viewpoint and the nadir of rasters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#viewpoint)
    */
  var viewpoint: js.UndefOr[PointProperties] = js.undefined
  /**
    * The where clause determines which rasters will participate in the mosaic. This property applies to all mosaic methods. This property will be overridden by the ImageryLayer's [definitionExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#definitionExpression) property if both properties are set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#where)
    */
  var where: js.UndefOr[String] = js.undefined
}

object MosaicRuleProperties {
  @scala.inline
  def apply(
    ascending: js.UndefOr[Boolean] = js.undefined,
    itemRenderingRule: RasterFunctionProperties = null,
    lockRasterIds: js.Array[Double] = null,
    method: none | center | nadir | viewpoint | attribute | `lock-raster` | northwest | seamline = null,
    multidimensionalDefinition: js.Array[DimensionalDefinitionProperties] = null,
    objectIds: js.Array[Double] = null,
    operation: first | last | min | max | mean | blend | sum = null,
    sortField: String = null,
    sortValue: String = null,
    viewpoint: PointProperties = null,
    where: String = null
  ): MosaicRuleProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.asInstanceOf[js.Any])
    if (itemRenderingRule != null) __obj.updateDynamic("itemRenderingRule")(itemRenderingRule.asInstanceOf[js.Any])
    if (lockRasterIds != null) __obj.updateDynamic("lockRasterIds")(lockRasterIds.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (multidimensionalDefinition != null) __obj.updateDynamic("multidimensionalDefinition")(multidimensionalDefinition.asInstanceOf[js.Any])
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortValue != null) __obj.updateDynamic("sortValue")(sortValue.asInstanceOf[js.Any])
    if (viewpoint != null) __obj.updateDynamic("viewpoint")(viewpoint.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicRuleProperties]
  }
}

