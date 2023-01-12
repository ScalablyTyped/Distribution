package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDashboardForJobRunResponse extends StObject {
  
  /**
    * The URL to view job run's dashboard.
    */
  var url: js.UndefOr[Url] = js.undefined
}
object GetDashboardForJobRunResponse {
  
  inline def apply(): GetDashboardForJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDashboardForJobRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDashboardForJobRunResponse] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
