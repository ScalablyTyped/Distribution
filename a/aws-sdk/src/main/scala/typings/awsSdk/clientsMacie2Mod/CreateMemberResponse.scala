package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMemberResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the account that was associated with the administrator account.
    */
  var arn: js.UndefOr[string] = js.undefined
}
object CreateMemberResponse {
  
  inline def apply(): CreateMemberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMemberResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMemberResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
  }
}
