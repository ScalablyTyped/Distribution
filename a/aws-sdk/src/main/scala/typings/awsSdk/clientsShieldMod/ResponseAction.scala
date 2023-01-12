package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseAction extends StObject {
  
  /**
    * Specifies that Shield Advanced should configure its WAF rules with the WAF Block action.  You must specify exactly one action, either Block or Count.
    */
  var Block: js.UndefOr[BlockAction] = js.undefined
  
  /**
    * Specifies that Shield Advanced should configure its WAF rules with the WAF Count action.  You must specify exactly one action, either Block or Count.
    */
  var Count: js.UndefOr[CountAction] = js.undefined
}
object ResponseAction {
  
  inline def apply(): ResponseAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseAction] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: BlockAction): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "Block", js.undefined)
    
    inline def setCount(value: CountAction): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
  }
}
