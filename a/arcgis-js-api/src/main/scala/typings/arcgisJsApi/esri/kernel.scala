package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait kernel extends StObject {
  
  /**
    * Current version of the ArcGIS API for JavaScript.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-kernel.html#version)
    */
  val version: String
}
object kernel {
  
  inline def apply(version: String): kernel = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[kernel]
  }
  
  extension [Self <: kernel](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
