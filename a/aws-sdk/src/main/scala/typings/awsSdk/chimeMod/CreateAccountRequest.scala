package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccountRequest extends StObject {
  
  /**
    * The name of the Amazon Chime account.
    */
  var Name: AccountName = js.native
}
object CreateAccountRequest {
  
  @scala.inline
  def apply(Name: AccountName): CreateAccountRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountRequest]
  }
  
  @scala.inline
  implicit class CreateAccountRequestMutableBuilder[Self <: CreateAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: AccountName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
