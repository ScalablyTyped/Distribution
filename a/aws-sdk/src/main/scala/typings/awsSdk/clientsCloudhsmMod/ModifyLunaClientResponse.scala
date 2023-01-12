package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyLunaClientResponse extends StObject {
  
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.ClientArn] = js.undefined
}
object ModifyLunaClientResponse {
  
  inline def apply(): ModifyLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyLunaClientResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyLunaClientResponse] (val x: Self) extends AnyVal {
    
    inline def setClientArn(value: ClientArn): Self = StObject.set(x, "ClientArn", value.asInstanceOf[js.Any])
    
    inline def setClientArnUndefined: Self = StObject.set(x, "ClientArn", js.undefined)
  }
}
