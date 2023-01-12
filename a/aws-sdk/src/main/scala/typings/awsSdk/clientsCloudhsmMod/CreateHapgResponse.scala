package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHapgResponse extends StObject {
  
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.HapgArn] = js.undefined
}
object CreateHapgResponse {
  
  inline def apply(): CreateHapgResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHapgResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateHapgResponse] (val x: Self) extends AnyVal {
    
    inline def setHapgArn(value: HapgArn): Self = StObject.set(x, "HapgArn", value.asInstanceOf[js.Any])
    
    inline def setHapgArnUndefined: Self = StObject.set(x, "HapgArn", js.undefined)
  }
}
