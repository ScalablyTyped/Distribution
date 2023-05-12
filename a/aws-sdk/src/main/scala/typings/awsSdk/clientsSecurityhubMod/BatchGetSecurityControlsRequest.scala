package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetSecurityControlsRequest extends StObject {
  
  /**
    *  A list of security controls (identified with SecurityControlId, SecurityControlArn, or a mix of both parameters). The security control ID or Amazon Resource Name (ARN) is the same across standards. 
    */
  var SecurityControlIds: StringList
}
object BatchGetSecurityControlsRequest {
  
  inline def apply(SecurityControlIds: StringList): BatchGetSecurityControlsRequest = {
    val __obj = js.Dynamic.literal(SecurityControlIds = SecurityControlIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetSecurityControlsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetSecurityControlsRequest] (val x: Self) extends AnyVal {
    
    inline def setSecurityControlIds(value: StringList): Self = StObject.set(x, "SecurityControlIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityControlIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecurityControlIds", js.Array(value*))
  }
}
