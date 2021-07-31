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
  
  @scala.inline
  def apply(): ProjectParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectParametersProperties]
  }
  
  @scala.inline
  implicit class ProjectParametersPropertiesMutableBuilder[Self <: ProjectParametersProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometries(value: js.Array[GeometryProperties]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    @scala.inline
    def setGeometriesVarargs(value: GeometryProperties*): Self = StObject.set(x, "geometries", js.Array(value :_*))
    
    @scala.inline
    def setOutSR(value: SpatialReferenceProperties): Self = StObject.set(x, "outSR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutSRUndefined: Self = StObject.set(x, "outSR", js.undefined)
    
    @scala.inline
    def setOutSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    @scala.inline
    def setTransformForward(value: Boolean): Self = StObject.set(x, "transformForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformForwardUndefined: Self = StObject.set(x, "transformForward", js.undefined)
    
    @scala.inline
    def setTransformation(value: ProjectParametersTransformation): Self = StObject.set(x, "transformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationUndefined: Self = StObject.set(x, "transformation", js.undefined)
  }
}
