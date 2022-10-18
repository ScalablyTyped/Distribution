package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContactResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the created contact or escalation plan.
    */
  var ContactArn: SsmContactsArn
}
object CreateContactResult {
  
  inline def apply(ContactArn: SsmContactsArn): CreateContactResult = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactResult]
  }
  
  extension [Self <: CreateContactResult](x: Self) {
    
    inline def setContactArn(value: SsmContactsArn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
  }
}
