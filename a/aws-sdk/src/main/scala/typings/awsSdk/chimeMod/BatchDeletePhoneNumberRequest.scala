package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeletePhoneNumberRequest extends StObject {
  
  /**
    * List of phone number IDs.
    */
  var PhoneNumberIds: NonEmptyStringList = js.native
}
object BatchDeletePhoneNumberRequest {
  
  @scala.inline
  def apply(PhoneNumberIds: NonEmptyStringList): BatchDeletePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberIds = PhoneNumberIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeletePhoneNumberRequest]
  }
  
  @scala.inline
  implicit class BatchDeletePhoneNumberRequestMutableBuilder[Self <: BatchDeletePhoneNumberRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumberIds(value: NonEmptyStringList): Self = StObject.set(x, "PhoneNumberIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberIdsVarargs(value: String*): Self = StObject.set(x, "PhoneNumberIds", js.Array(value :_*))
  }
}
