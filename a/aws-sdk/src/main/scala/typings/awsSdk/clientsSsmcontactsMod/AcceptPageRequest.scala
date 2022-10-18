package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptPageRequest extends StObject {
  
  /**
    * The accept code is a 6-digit code used to acknowledge the page.
    */
  var AcceptCode: typings.awsSdk.clientsSsmcontactsMod.AcceptCode
  
  /**
    * An optional field that Incident Manager uses to ENFORCE AcceptCode validation when acknowledging an page. Acknowledgement can occur by replying to a page, or when entering the AcceptCode in the console. Enforcing AcceptCode validation causes Incident Manager to verify that the code entered by the user matches the code sent by Incident Manager with the page. Incident Manager can also IGNORE AcceptCode validation. Ignoring AcceptCode validation causes Incident Manager to accept any value entered for the AcceptCode.
    */
  var AcceptCodeValidation: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.AcceptCodeValidation] = js.undefined
  
  /**
    * The type indicates if the page was DELIVERED or READ.
    */
  var AcceptType: typings.awsSdk.clientsSsmcontactsMod.AcceptType
  
  /**
    * The ARN of the contact channel.
    */
  var ContactChannelId: js.UndefOr[SsmContactsArn] = js.undefined
  
  /**
    * Information provided by the user when the user acknowledges the page.
    */
  var Note: js.UndefOr[ReceiptInfo] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the engagement to a contact channel.
    */
  var PageId: SsmContactsArn
}
object AcceptPageRequest {
  
  inline def apply(AcceptCode: AcceptCode, AcceptType: AcceptType, PageId: SsmContactsArn): AcceptPageRequest = {
    val __obj = js.Dynamic.literal(AcceptCode = AcceptCode.asInstanceOf[js.Any], AcceptType = AcceptType.asInstanceOf[js.Any], PageId = PageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptPageRequest]
  }
  
  extension [Self <: AcceptPageRequest](x: Self) {
    
    inline def setAcceptCode(value: AcceptCode): Self = StObject.set(x, "AcceptCode", value.asInstanceOf[js.Any])
    
    inline def setAcceptCodeValidation(value: AcceptCodeValidation): Self = StObject.set(x, "AcceptCodeValidation", value.asInstanceOf[js.Any])
    
    inline def setAcceptCodeValidationUndefined: Self = StObject.set(x, "AcceptCodeValidation", js.undefined)
    
    inline def setAcceptType(value: AcceptType): Self = StObject.set(x, "AcceptType", value.asInstanceOf[js.Any])
    
    inline def setContactChannelId(value: SsmContactsArn): Self = StObject.set(x, "ContactChannelId", value.asInstanceOf[js.Any])
    
    inline def setContactChannelIdUndefined: Self = StObject.set(x, "ContactChannelId", js.undefined)
    
    inline def setNote(value: ReceiptInfo): Self = StObject.set(x, "Note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "Note", js.undefined)
    
    inline def setPageId(value: SsmContactsArn): Self = StObject.set(x, "PageId", value.asInstanceOf[js.Any])
  }
}
