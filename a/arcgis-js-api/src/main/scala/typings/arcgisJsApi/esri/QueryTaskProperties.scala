package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryTaskProperties
  extends StObject
     with TaskProperties {
  
  /**
    * Specify the geodatabase version to query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
}
object QueryTaskProperties {
  
  @scala.inline
  def apply(): QueryTaskProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTaskProperties]
  }
  
  @scala.inline
  implicit class QueryTaskPropertiesMutableBuilder[Self <: QueryTaskProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
  }
}
