package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccountSuppressionAttributesRequest extends StObject {
  
  /**
    * A list that contains the reasons that email addresses will be automatically added to the suppression list for your account. This list can contain any or all of the following:    COMPLAINT – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a complaint.    BOUNCE – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a hard bounce.  
    */
  var SuppressedReasons: js.UndefOr[SuppressionListReasons] = js.undefined
}
object PutAccountSuppressionAttributesRequest {
  
  inline def apply(): PutAccountSuppressionAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAccountSuppressionAttributesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAccountSuppressionAttributesRequest] (val x: Self) extends AnyVal {
    
    inline def setSuppressedReasons(value: SuppressionListReasons): Self = StObject.set(x, "SuppressedReasons", value.asInstanceOf[js.Any])
    
    inline def setSuppressedReasonsUndefined: Self = StObject.set(x, "SuppressedReasons", js.undefined)
    
    inline def setSuppressedReasonsVarargs(value: SuppressionListReason*): Self = StObject.set(x, "SuppressedReasons", js.Array(value*))
  }
}
