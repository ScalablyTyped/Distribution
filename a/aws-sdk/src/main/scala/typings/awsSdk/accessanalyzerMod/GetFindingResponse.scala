package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingResponse extends StObject {
  
  /**
    * A finding object that contains finding details.
    */
  var finding: js.UndefOr[Finding] = js.native
}
object GetFindingResponse {
  
  @scala.inline
  def apply(): GetFindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingResponse]
  }
  
  @scala.inline
  implicit class GetFindingResponseMutableBuilder[Self <: GetFindingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinding(value: Finding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
  }
}
