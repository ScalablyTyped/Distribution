package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccountRequest extends StObject {
  
  /**
    * The name of the Amazon Chime account.
    */
  var Name: AccountName
}
object CreateAccountRequest {
  
  inline def apply(Name: AccountName): CreateAccountRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: AccountName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
