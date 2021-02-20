package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebMapSourceVersion extends Object {
  
  /**
    * The major version of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#sourceVersion)
    */
  var major: Double = js.native
  
  /**
    * The minor version of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#sourceVersion)
    */
  var minor: Double = js.native
}
object WebMapSourceVersion {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    major: Double,
    minor: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WebMapSourceVersion = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WebMapSourceVersion]
  }
  
  @scala.inline
  implicit class WebMapSourceVersionMutableBuilder[Self <: WebMapSourceVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
  }
}
