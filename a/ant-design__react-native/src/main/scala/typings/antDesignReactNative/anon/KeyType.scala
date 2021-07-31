package typings.antDesignReactNative.anon

import typings.antDesignReactNative.antDesignReactNativeStrings.update
import typings.antDesignReactNative.portalHostMod.Operation
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyType
  extends StObject
     with Operation {
  
  var children: ReactNode
  
  var key: Double
  
  var `type`: update
}
object KeyType {
  
  @scala.inline
  def apply(key: Double): KeyType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("update")
    __obj.asInstanceOf[KeyType]
  }
  
  @scala.inline
  implicit class KeyTypeMutableBuilder[Self <: KeyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
