package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyHsmResponse extends StObject {
  
  /**
    * The ARN of the HSM.
    */
  var HsmArn: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.HsmArn] = js.undefined
}
object ModifyHsmResponse {
  
  inline def apply(): ModifyHsmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyHsmResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyHsmResponse] (val x: Self) extends AnyVal {
    
    inline def setHsmArn(value: HsmArn): Self = StObject.set(x, "HsmArn", value.asInstanceOf[js.Any])
    
    inline def setHsmArnUndefined: Self = StObject.set(x, "HsmArn", js.undefined)
  }
}
