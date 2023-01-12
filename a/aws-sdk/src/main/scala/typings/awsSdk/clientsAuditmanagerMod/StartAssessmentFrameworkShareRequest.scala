package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAssessmentFrameworkShareRequest extends StObject {
  
  /**
    *  An optional comment from the sender about the share request. 
    */
  var comment: js.UndefOr[ShareRequestComment] = js.undefined
  
  /**
    *  The Amazon Web Services account of the recipient. 
    */
  var destinationAccount: AccountId
  
  /**
    *  The Amazon Web Services Region of the recipient. 
    */
  var destinationRegion: Region
  
  /**
    *  The unique identifier for the custom framework to be shared. 
    */
  var frameworkId: UUID
}
object StartAssessmentFrameworkShareRequest {
  
  inline def apply(destinationAccount: AccountId, destinationRegion: Region, frameworkId: UUID): StartAssessmentFrameworkShareRequest = {
    val __obj = js.Dynamic.literal(destinationAccount = destinationAccount.asInstanceOf[js.Any], destinationRegion = destinationRegion.asInstanceOf[js.Any], frameworkId = frameworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAssessmentFrameworkShareRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartAssessmentFrameworkShareRequest] (val x: Self) extends AnyVal {
    
    inline def setComment(value: ShareRequestComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDestinationAccount(value: AccountId): Self = StObject.set(x, "destinationAccount", value.asInstanceOf[js.Any])
    
    inline def setDestinationRegion(value: Region): Self = StObject.set(x, "destinationRegion", value.asInstanceOf[js.Any])
    
    inline def setFrameworkId(value: UUID): Self = StObject.set(x, "frameworkId", value.asInstanceOf[js.Any])
  }
}
