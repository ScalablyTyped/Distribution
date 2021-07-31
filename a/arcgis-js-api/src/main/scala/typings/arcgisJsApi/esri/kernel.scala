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
  
  @scala.inline
  def apply(version: String): kernel = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[kernel]
  }
  
  @scala.inline
  implicit class kernelMutableBuilder[Self <: kernel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
