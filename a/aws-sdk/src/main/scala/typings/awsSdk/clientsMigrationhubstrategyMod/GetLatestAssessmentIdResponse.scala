package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLatestAssessmentIdResponse extends StObject {
  
  /**
    * The latest ID for the specific assessment task.
    */
  var id: js.UndefOr[AsyncTaskId] = js.undefined
}
object GetLatestAssessmentIdResponse {
  
  inline def apply(): GetLatestAssessmentIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLatestAssessmentIdResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLatestAssessmentIdResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: AsyncTaskId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
