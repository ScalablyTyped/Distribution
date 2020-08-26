package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`lock-raster`
import typings.arcgisJsApi.arcgisJsApiStrings.attribute
import typings.arcgisJsApi.arcgisJsApiStrings.blend
import typings.arcgisJsApi.arcgisJsApiStrings.center
import typings.arcgisJsApi.arcgisJsApiStrings.first
import typings.arcgisJsApi.arcgisJsApiStrings.last
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.mean
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.nadir
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.northwest
import typings.arcgisJsApi.arcgisJsApiStrings.seamline
import typings.arcgisJsApi.arcgisJsApiStrings.sum
import typings.arcgisJsApi.arcgisJsApiStrings.viewpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicRule
  extends Accessor
     with JSONSupport {
  /**
    * Indicates whether the sort should be ascending. This property applies to all mosaic [methods](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) where an ordering is defined except `seamline`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#ascending)
    *
    * @default true
    */
  var ascending: Boolean = js.native
  /**
    * The rendering rule applied on items before mosaicking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#itemRenderingRule)
    */
  var itemRenderingRule: RasterFunction = js.native
  /**
    * An array of raster Ids. All the rasters with the given list of raster Ids are selected to participate in the mosaic. The rasters will be visible at all pixel sizes regardless of the minimum and maximum pixel size range of the locked rasters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#lockRasterIds)
    */
  var lockRasterIds: js.Array[Double] = js.native
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
  var method: none | center | nadir | viewpoint | attribute | `lock-raster` | northwest | seamline = js.native
  /**
    * A multiple dimensional service can have multiple dimensions for one or more variables. Use multiDimensionalDefinitions to filter data based on a slice or range of data. For example, a single ImageryLayer may have a `depth` dimension storing sea temperatures for the same pixel location at various depths. Another dimension could be `time`, where the same pixel stores multiple values based on a window of time.  This property can be used to filter and display ImageryLayer pixels for specific "slices" in those dimensions (e.g. display sea temperature at 1000m below sea level for a specific week in the year).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition)
    */
  var multidimensionalDefinition: js.Array[DimensionalDefinition] = js.native
  /**
    * Defines a selection using a set of ObjectIDs. This property applies to all mosaic methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#objectIds)
    */
  var objectIds: js.Array[Double] = js.native
  /**
    * Defines the mosaic operation used to resolve overlapping pixels.  **Possible Values**
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
  var operation: first | last | min | max | mean | blend | sum = js.native
  /**
    * The name of the attribute field that is used with a constant sortValue to define the mosaicking order when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`. The ordering is defined by the absolute value of the difference between the specified sort field value and the sort base value. For example, if the sort field is `Month` and the sort value is `7 (July)`, then the ordering is defined by `ABS(Month -7)`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortField)
    */
  var sortField: String = js.native
  /**
    * A constant value defining a reference or base value for the sort field when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortValue)
    */
  var sortValue: String = js.native
  /**
    * Defines the viewpoint location on which the ordering is defined based on the distance from the viewpoint and the nadir of rasters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#viewpoint)
    */
  var viewpoint: Point = js.native
  /**
    * The where clause determines which rasters will participate in the mosaic. This property applies to all mosaic methods. This property will be overridden by the ImageryLayer's [definitionExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#definitionExpression) property if both properties are set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#where)
    */
  var where: String = js.native
}

