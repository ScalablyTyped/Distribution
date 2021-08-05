package typings.awsSdk.chimeMod

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
  
  extension [Self <: CreateAccountRequest](x: Self) {
    
    inline def setName(value: AccountName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
