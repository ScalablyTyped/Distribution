package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebMapSourceVersion extends StObject {
  
  /**
  		 * The major version of the WebMap.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#sourceVersion)
  		 */
  var major: Double
  
  /**
  		 * The minor version of the WebMap.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#sourceVersion)
  		 */
  var minor: Double
}
object WebMapSourceVersion {
  
  inline def apply(major: Double, minor: Double): WebMapSourceVersion = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebMapSourceVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebMapSourceVersion] (val x: Self) extends AnyVal {
    
    inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
  }
}
