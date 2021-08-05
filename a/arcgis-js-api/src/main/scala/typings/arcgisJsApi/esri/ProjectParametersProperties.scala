package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectParametersProperties extends StObject {
  
  /**
    * The input geometries to project.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.undefined
  
  /**
    * The spatial reference to which you are projecting the geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#outSR)
    */
  var outSR: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * The spatial reference to which you are projecting the geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * Indicates whether to transform forward or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformForward)
    */
  var transformForward: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The well-known id {wkid:number} or well-known text {wkt:string} of the datum transformation to be applied to the projected geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformation)
    */
  var transformation: js.UndefOr[ProjectParametersTransformation] = js.undefined
}
object ProjectParametersProperties {
  
  inline def apply(): ProjectParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectParametersProperties]
  }
  
  extension [Self <: ProjectParametersProperties](x: Self) {
    
    inline def setGeometries(value: js.Array[GeometryProperties]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    inline def setGeometriesVarargs(value: GeometryProperties*): Self = StObject.set(x, "geometries", js.Array(value :_*))
    
    inline def setOutSR(value: SpatialReferenceProperties): Self = StObject.set(x, "outSR", value.asInstanceOf[js.Any])
    
    inline def setOutSRUndefined: Self = StObject.set(x, "outSR", js.undefined)
    
    inline def setOutSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    inline def setTransformForward(value: Boolean): Self = StObject.set(x, "transformForward", value.asInstanceOf[js.Any])
    
    inline def setTransformForwardUndefined: Self = StObject.set(x, "transformForward", js.undefined)
    
    inline def setTransformation(value: ProjectParametersTransformation): Self = StObject.set(x, "transformation", value.asInstanceOf[js.Any])
    
    inline def setTransformationUndefined: Self = StObject.set(x, "transformation", js.undefined)
  }
}
