package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintTaskProperties
  extends StObject
     with TaskProperties {
  
  /**
    * The time interval in milliseconds between each job status request sent to an asynchronous GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html#updateDelay)
    */
  var updateDelay: js.UndefOr[Double] = js.undefined
}
object PrintTaskProperties {
  
  inline def apply(): PrintTaskProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintTaskProperties]
  }
  
  extension [Self <: PrintTaskProperties](x: Self) {
    
    inline def setUpdateDelay(value: Double): Self = StObject.set(x, "updateDelay", value.asInstanceOf[js.Any])
    
    inline def setUpdateDelayUndefined: Self = StObject.set(x, "updateDelay", js.undefined)
  }
}
