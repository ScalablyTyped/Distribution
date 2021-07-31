package typings.antDesignReactNative.anon

import typings.antDesignReactNative.antDesignReactNativeStrings.mount
import typings.antDesignReactNative.portalHostMod.Operation
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenKey
  extends StObject
     with Operation {
  
  var children: ReactNode
  
  var key: Double
  
  var `type`: mount
}
object ChildrenKey {
  
  @scala.inline
  def apply(key: Double): ChildrenKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mount")
    __obj.asInstanceOf[ChildrenKey]
  }
  
  @scala.inline
  implicit class ChildrenKeyMutableBuilder[Self <: ChildrenKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: mount): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
