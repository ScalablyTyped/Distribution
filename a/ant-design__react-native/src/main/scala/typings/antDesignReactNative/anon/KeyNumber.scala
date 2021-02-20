package typings.antDesignReactNative.anon

import typings.antDesignReactNative.antDesignReactNativeStrings.unmount
import typings.antDesignReactNative.portalHostMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyNumber extends Operation {
  
  var key: Double = js.native
  
  var `type`: unmount = js.native
}
object KeyNumber {
  
  @scala.inline
  def apply(key: Double, `type`: unmount): KeyNumber = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyNumber]
  }
  
  @scala.inline
  implicit class KeyNumberMutableBuilder[Self <: KeyNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: unmount): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
