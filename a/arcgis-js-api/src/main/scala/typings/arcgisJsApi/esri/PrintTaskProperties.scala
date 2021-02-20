package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintTaskProperties extends TaskProperties {
  
  /**
    * The time interval in milliseconds between each job status request sent to an asynchronous GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html#updateDelay)
    */
  var updateDelay: js.UndefOr[Double] = js.native
}
object PrintTaskProperties {
  
  @scala.inline
  def apply(): PrintTaskProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintTaskProperties]
  }
  
  @scala.inline
  implicit class PrintTaskPropertiesMutableBuilder[Self <: PrintTaskProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdateDelay(value: Double): Self = StObject.set(x, "updateDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDelayUndefined: Self = StObject.set(x, "updateDelay", js.undefined)
  }
}
