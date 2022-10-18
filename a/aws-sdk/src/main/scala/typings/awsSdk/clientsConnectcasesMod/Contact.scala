package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contact extends StObject {
  
  /**
    * A unique identifier of a contact in Amazon Connect.
    */
  var contactArn: ContactArn
}
object Contact {
  
  inline def apply(contactArn: ContactArn): Contact = {
    val __obj = js.Dynamic.literal(contactArn = contactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
  
  extension [Self <: Contact](x: Self) {
    
    inline def setContactArn(value: ContactArn): Self = StObject.set(x, "contactArn", value.asInstanceOf[js.Any])
  }
}
