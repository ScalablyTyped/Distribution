package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISImageServiceCapabilitiesMensuration extends StObject {
  
  /**
    * Indicates if the layer supports 3D mensuration operations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supports3D: Boolean
  
  /**
    * Indicates if the layer supports area and perimeter mensuration operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsAreaAndPerimeter: Boolean
  
  /**
    * Indicates if the layer supports distance and angle mensuration operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsDistanceAndAngle: Boolean
  
  /**
    * Indicates if the layer supports a mensuration operation for calculating a height of a ground feature by measuring from the base of the object to the top of the object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsHeightFromBaseAndTop: Boolean
  
  /**
    * Indicates if the layer supports a mensuration operation for calculating a height of a feature by measuring from the base of the object to the top of the object's shadow on the ground.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsHeightFromBaseAndTopShadow: Boolean
  
  /**
    * Indicates if the layer supports mensuration operation for calculating a height from the top of the object to the top of the objects's shadow on the ground.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsHeightFromTopAndTopShadow: Boolean
  
  /**
    * Indicates if the layer supports point or centroid mensuration operations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsPointOrCentroid: Boolean
}
object ArcGISImageServiceCapabilitiesMensuration {
  
  inline def apply(
    supports3D: Boolean,
    supportsAreaAndPerimeter: Boolean,
    supportsDistanceAndAngle: Boolean,
    supportsHeightFromBaseAndTop: Boolean,
    supportsHeightFromBaseAndTopShadow: Boolean,
    supportsHeightFromTopAndTopShadow: Boolean,
    supportsPointOrCentroid: Boolean
  ): ArcGISImageServiceCapabilitiesMensuration = {
    val __obj = js.Dynamic.literal(supports3D = supports3D.asInstanceOf[js.Any], supportsAreaAndPerimeter = supportsAreaAndPerimeter.asInstanceOf[js.Any], supportsDistanceAndAngle = supportsDistanceAndAngle.asInstanceOf[js.Any], supportsHeightFromBaseAndTop = supportsHeightFromBaseAndTop.asInstanceOf[js.Any], supportsHeightFromBaseAndTopShadow = supportsHeightFromBaseAndTopShadow.asInstanceOf[js.Any], supportsHeightFromTopAndTopShadow = supportsHeightFromTopAndTopShadow.asInstanceOf[js.Any], supportsPointOrCentroid = supportsPointOrCentroid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISImageServiceCapabilitiesMensuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcGISImageServiceCapabilitiesMensuration] (val x: Self) extends AnyVal {
    
    inline def setSupports3D(value: Boolean): Self = StObject.set(x, "supports3D", value.asInstanceOf[js.Any])
    
    inline def setSupportsAreaAndPerimeter(value: Boolean): Self = StObject.set(x, "supportsAreaAndPerimeter", value.asInstanceOf[js.Any])
    
    inline def setSupportsDistanceAndAngle(value: Boolean): Self = StObject.set(x, "supportsDistanceAndAngle", value.asInstanceOf[js.Any])
    
    inline def setSupportsHeightFromBaseAndTop(value: Boolean): Self = StObject.set(x, "supportsHeightFromBaseAndTop", value.asInstanceOf[js.Any])
    
    inline def setSupportsHeightFromBaseAndTopShadow(value: Boolean): Self = StObject.set(x, "supportsHeightFromBaseAndTopShadow", value.asInstanceOf[js.Any])
    
    inline def setSupportsHeightFromTopAndTopShadow(value: Boolean): Self = StObject.set(x, "supportsHeightFromTopAndTopShadow", value.asInstanceOf[js.Any])
    
    inline def setSupportsPointOrCentroid(value: Boolean): Self = StObject.set(x, "supportsPointOrCentroid", value.asInstanceOf[js.Any])
  }
}
