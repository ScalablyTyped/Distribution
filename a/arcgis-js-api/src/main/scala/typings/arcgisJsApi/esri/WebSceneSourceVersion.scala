package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSceneSourceVersion extends StObject {
  
  /**
    * The major version of the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#sourceVersion)
    */
  var major: Double
  
  /**
    * The minor version of the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#sourceVersion)
    */
  var minor: Double
}
object WebSceneSourceVersion {
  
  inline def apply(major: Double, minor: Double): WebSceneSourceVersion = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSceneSourceVersion]
  }
  
  extension [Self <: WebSceneSourceVersion](x: Self) {
    
    inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
  }
}
