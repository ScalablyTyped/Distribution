package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`lock-raster`
import typings.arcgisJsApi.arcgisJsApiStrings.attribute
import typings.arcgisJsApi.arcgisJsApiStrings.blend
import typings.arcgisJsApi.arcgisJsApiStrings.center_
import typings.arcgisJsApi.arcgisJsApiStrings.first
import typings.arcgisJsApi.arcgisJsApiStrings.last
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.mean
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.nadir
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.northwest
import typings.arcgisJsApi.arcgisJsApiStrings.seamline
import typings.arcgisJsApi.arcgisJsApiStrings.sum
import typings.arcgisJsApi.arcgisJsApiStrings.viewpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MosaicRule
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Indicates whether the sort should be ascending.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#ascending)
  		 */
  var ascending: Boolean = js.native
  
  /**
  		 * The raster function applied on items before mosaicking.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#itemRasterFunction)
  		 */
  var itemRasterFunction: RasterFunction = js.native
  
  /**
  		 * The raster function applied on items before mosaicking.
  		 *
  		 * @deprecated since version 4.27. Use {@link module:esri/layers/support/MosaicRule#itemRasterFunction itemRasterFunction} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#itemRenderingRule)
  		 */
  var itemRenderingRule: scala.Unit = js.native
  
  /**
  		 * An array of raster Ids.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#lockRasterIds)
  		 */
  var lockRasterIds: js.Array[Double] = js.native
  
  /**
  		 * The mosaic method determines how the selected rasters are ordered.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method)
  		 */
  var method: none_ | center_ | nadir | viewpoint | attribute | `lock-raster` | northwest | seamline = js.native
  
  /**
  		 * The multidimensional definitions associated with the [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#mosaicRule).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition)
  		 */
  var multidimensionalDefinition: js.Array[DimensionalDefinition] = js.native
  
  /**
  		 * Defines a selection using a set of ObjectIDs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#objectIds)
  		 */
  var objectIds: js.Array[Double] = js.native
  
  /**
  		 * Defines the mosaic operation used to resolve overlapping pixels.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#operation)
  		 */
  var operation: first | last | min | max | mean | blend | sum = js.native
  
  /**
  		 * The name of the attribute field that is used with a constant sortValue to define the mosaicking order when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortField)
  		 */
  var sortField: String = js.native
  
  /**
  		 * A constant value defining a reference or base value for the sort field when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortValue)
  		 */
  var sortValue: String | Double = js.native
  
  /**
  		 * Defines the viewpoint location on which the ordering is defined based on the distance from the viewpoint and the nadir of rasters.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#viewpoint)
  		 */
  var viewpoint: Point = js.native
  
  /**
  		 * The where clause determines which rasters will participate in the mosaic.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#where)
  		 */
  var where: String = js.native
}
