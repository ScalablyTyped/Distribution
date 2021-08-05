package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentifyTaskProperties
  extends StObject
     with TaskProperties {
  
  /**
    * Specify the geodatabase version to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-IdentifyTask.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
}
object IdentifyTaskProperties {
  
  inline def apply(): IdentifyTaskProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentifyTaskProperties]
  }
  
  extension [Self <: IdentifyTaskProperties](x: Self) {
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
  }
}
