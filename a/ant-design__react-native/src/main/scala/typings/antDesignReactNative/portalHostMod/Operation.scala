package typings.antDesignReactNative.portalHostMod

import typings.antDesignReactNative.antDesignReactNativeStrings.mount
import typings.antDesignReactNative.antDesignReactNativeStrings.unmount
import typings.antDesignReactNative.antDesignReactNativeStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.antDesignReactNative.anon.ChildrenKey
  - typings.antDesignReactNative.anon.KeyType
  - typings.antDesignReactNative.anon.KeyNumber
*/
trait Operation extends js.Object
object Operation {
  
  @scala.inline
  def ChildrenKey(key: Double, `type`: mount): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  def KeyType(key: Double, `type`: update): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  def KeyNumber(key: Double, `type`: unmount): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}
