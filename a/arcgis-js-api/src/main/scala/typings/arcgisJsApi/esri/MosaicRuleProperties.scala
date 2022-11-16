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

trait MosaicRuleProperties extends StObject {
  
  /**
    * Indicates whether the sort should be ascending.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#ascending)
    */
  var ascending: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The rendering rule applied on items before mosaicking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#itemRenderingRule)
    */
  var itemRenderingRule: js.UndefOr[RasterFunctionProperties] = js.undefined
  
  /**
    * An array of raster Ids.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#lockRasterIds)
    */
  var lockRasterIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The mosaic method determines how the selected rasters are ordered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method)
    */
  var method: js.UndefOr[
    none_ | center_ | nadir | viewpoint | attribute | `lock-raster` | northwest | seamline
  ] = js.undefined
  
  /**
    * The multidimensional definitions associated with the [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#mosaicRule).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition)
    */
  var multidimensionalDefinition: js.UndefOr[js.Array[DimensionalDefinitionProperties]] = js.undefined
  
  /**
    * Defines a selection using a set of ObjectIDs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Defines the mosaic operation used to resolve overlapping pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#operation)
    */
  var operation: js.UndefOr[first | last | min | max | mean | blend | sum] = js.undefined
  
  /**
    * The name of the attribute field that is used with a constant sortValue to define the mosaicking order when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortField)
    */
  var sortField: js.UndefOr[String] = js.undefined
  
  /**
    * A constant value defining a reference or base value for the sort field when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortValue)
    */
  var sortValue: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Defines the viewpoint location on which the ordering is defined based on the distance from the viewpoint and the nadir of rasters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#viewpoint)
    */
  var viewpoint: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * The where clause determines which rasters will participate in the mosaic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#where)
    */
  var where: js.UndefOr[String] = js.undefined
}
object MosaicRuleProperties {
  
  inline def apply(): MosaicRuleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MosaicRuleProperties]
  }
  
  extension [Self <: MosaicRuleProperties](x: Self) {
    
    inline def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    inline def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    inline def setItemRenderingRule(value: RasterFunctionProperties): Self = StObject.set(x, "itemRenderingRule", value.asInstanceOf[js.Any])
    
    inline def setItemRenderingRuleUndefined: Self = StObject.set(x, "itemRenderingRule", js.undefined)
    
    inline def setLockRasterIds(value: js.Array[Double]): Self = StObject.set(x, "lockRasterIds", value.asInstanceOf[js.Any])
    
    inline def setLockRasterIdsUndefined: Self = StObject.set(x, "lockRasterIds", js.undefined)
    
    inline def setLockRasterIdsVarargs(value: Double*): Self = StObject.set(x, "lockRasterIds", js.Array(value*))
    
    inline def setMethod(value: none_ | center_ | nadir | viewpoint | attribute | `lock-raster` | northwest | seamline): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMultidimensionalDefinition(value: js.Array[DimensionalDefinitionProperties]): Self = StObject.set(x, "multidimensionalDefinition", value.asInstanceOf[js.Any])
    
    inline def setMultidimensionalDefinitionUndefined: Self = StObject.set(x, "multidimensionalDefinition", js.undefined)
    
    inline def setMultidimensionalDefinitionVarargs(value: DimensionalDefinitionProperties*): Self = StObject.set(x, "multidimensionalDefinition", js.Array(value*))
    
    inline def setObjectIds(value: js.Array[Double]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    inline def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    inline def setObjectIdsVarargs(value: Double*): Self = StObject.set(x, "objectIds", js.Array(value*))
    
    inline def setOperation(value: first | last | min | max | mean | blend | sum): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    inline def setSortValue(value: String | Double): Self = StObject.set(x, "sortValue", value.asInstanceOf[js.Any])
    
    inline def setSortValueUndefined: Self = StObject.set(x, "sortValue", js.undefined)
    
    inline def setViewpoint(value: PointProperties): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    inline def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
    
    inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
