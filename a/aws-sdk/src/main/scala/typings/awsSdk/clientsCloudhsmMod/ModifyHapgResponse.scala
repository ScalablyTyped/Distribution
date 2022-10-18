package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyHapgResponse extends StObject {
  
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.HapgArn] = js.undefined
}
object ModifyHapgResponse {
  
  inline def apply(): ModifyHapgResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyHapgResponse]
  }
  
  extension [Self <: ModifyHapgResponse](x: Self) {
    
    inline def setHapgArn(value: HapgArn): Self = StObject.set(x, "HapgArn", value.asInstanceOf[js.Any])
    
    inline def setHapgArnUndefined: Self = StObject.set(x, "HapgArn", js.undefined)
  }
}
