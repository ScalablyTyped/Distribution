package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPipelineChangeProgressResponse extends StObject {
  
  /**
    * The current status of the change happening on the pipeline.
    */
  var ChangeProgressStatuses: js.UndefOr[ChangeProgressStatusList] = js.undefined
}
object GetPipelineChangeProgressResponse {
  
  inline def apply(): GetPipelineChangeProgressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineChangeProgressResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPipelineChangeProgressResponse] (val x: Self) extends AnyVal {
    
    inline def setChangeProgressStatuses(value: ChangeProgressStatusList): Self = StObject.set(x, "ChangeProgressStatuses", value.asInstanceOf[js.Any])
    
    inline def setChangeProgressStatusesUndefined: Self = StObject.set(x, "ChangeProgressStatuses", js.undefined)
    
    inline def setChangeProgressStatusesVarargs(value: ChangeProgressStatus*): Self = StObject.set(x, "ChangeProgressStatuses", js.Array(value*))
  }
}
