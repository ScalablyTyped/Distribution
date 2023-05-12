package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Utility for retrieving the current version of the API.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-kernel.html)
  */
trait kernel extends StObject {
  
  /**
    * Current version of the ArcGIS Maps SDK for JavaScript.
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: kernel] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
