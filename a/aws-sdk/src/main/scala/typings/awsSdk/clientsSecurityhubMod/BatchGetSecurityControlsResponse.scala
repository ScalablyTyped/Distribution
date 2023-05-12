package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetSecurityControlsResponse extends StObject {
  
  /**
    *  An array that returns the identifier, Amazon Resource Name (ARN), and other details about a security control. The same information is returned whether the request includes SecurityControlId or SecurityControlArn. 
    */
  var SecurityControls: typings.awsSdk.clientsSecurityhubMod.SecurityControls
  
  /**
    *  A security control (identified with SecurityControlId, SecurityControlArn, or a mix of both parameters) for which details cannot be returned. 
    */
  var UnprocessedIds: js.UndefOr[UnprocessedSecurityControls] = js.undefined
}
object BatchGetSecurityControlsResponse {
  
  inline def apply(SecurityControls: SecurityControls): BatchGetSecurityControlsResponse = {
    val __obj = js.Dynamic.literal(SecurityControls = SecurityControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetSecurityControlsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetSecurityControlsResponse] (val x: Self) extends AnyVal {
    
    inline def setSecurityControls(value: SecurityControls): Self = StObject.set(x, "SecurityControls", value.asInstanceOf[js.Any])
    
    inline def setSecurityControlsVarargs(value: SecurityControl*): Self = StObject.set(x, "SecurityControls", js.Array(value*))
    
    inline def setUnprocessedIds(value: UnprocessedSecurityControls): Self = StObject.set(x, "UnprocessedIds", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedIdsUndefined: Self = StObject.set(x, "UnprocessedIds", js.undefined)
    
    inline def setUnprocessedIdsVarargs(value: UnprocessedSecurityControl*): Self = StObject.set(x, "UnprocessedIds", js.Array(value*))
  }
}
