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
  		 * Current full version of the ArcGIS Maps SDK for JavaScript.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-kernel.html#fullVersion)
  		 */
  val fullVersion: String
  
  /**
  		 * Current `major.minor` version of the ArcGIS Maps SDK for JavaScript.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-kernel.html#version)
  		 */
  val version: String
}
object kernel {
  
  inline def apply(fullVersion: String, version: String): kernel = {
    val __obj = js.Dynamic.literal(fullVersion = fullVersion.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[kernel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: kernel] (val x: Self) extends AnyVal {
    
    inline def setFullVersion(value: String): Self = StObject.set(x, "fullVersion", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
