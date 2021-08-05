package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindTaskProperties
  extends StObject
     with TaskProperties {
  
  /**
    * Specify the geodatabase version to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-FindTask.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
}
object FindTaskProperties {
  
  inline def apply(): FindTaskProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindTaskProperties]
  }
  
  extension [Self <: FindTaskProperties](x: Self) {
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
  }
}
