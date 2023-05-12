package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolutionContact extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a contact in the engagement resolution process. 
    */
  var ContactArn: SsmContactsArn
  
  /**
    * The stage in the escalation plan that resolves to this contact.
    */
  var StageIndex: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.StageIndex] = js.undefined
  
  /**
    * The type of contact for a resolution step.
    */
  var Type: ContactType
}
object ResolutionContact {
  
  inline def apply(ContactArn: SsmContactsArn, Type: ContactType): ResolutionContact = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolutionContact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolutionContact] (val x: Self) extends AnyVal {
    
    inline def setContactArn(value: SsmContactsArn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    inline def setStageIndex(value: StageIndex): Self = StObject.set(x, "StageIndex", value.asInstanceOf[js.Any])
    
    inline def setStageIndexUndefined: Self = StObject.set(x, "StageIndex", js.undefined)
    
    inline def setType(value: ContactType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
