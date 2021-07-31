package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectParametersTransformation
  extends StObject
     with Object {
  
  /**
    * The well-known ID of the datum transformation to apply to the projection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformation)
    */
  var wkid: js.UndefOr[Double] = js.undefined
  
  /**
    * The well-known text that defines a spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformation)
    */
  var wkt: js.UndefOr[String] = js.undefined
}
object ProjectParametersTransformation {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ProjectParametersTransformation = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ProjectParametersTransformation]
  }
  
  @scala.inline
  implicit class ProjectParametersTransformationMutableBuilder[Self <: ProjectParametersTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWkid(value: Double): Self = StObject.set(x, "wkid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWkidUndefined: Self = StObject.set(x, "wkid", js.undefined)
    
    @scala.inline
    def setWkt(value: String): Self = StObject.set(x, "wkt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWktUndefined: Self = StObject.set(x, "wkt", js.undefined)
  }
}
