package typings.antDesignReactNative.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  var icon: Element
  
  var text: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 420, starting with typings.antDesignReactNative.antDesignReactNativeStrings.number, typings.antDesignReactNative.antDesignReactNativeStrings.function, typings.antDesignReactNative.antDesignReactNativeStrings.audio */ Any
}
object Icon {
  
  inline def apply(
    icon: Element,
    text: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 420, starting with typings.antDesignReactNative.antDesignReactNativeStrings.number, typings.antDesignReactNative.antDesignReactNativeStrings.function, typings.antDesignReactNative.antDesignReactNativeStrings.audio */ Any
  ): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setText(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 420, starting with typings.antDesignReactNative.antDesignReactNativeStrings.number, typings.antDesignReactNative.antDesignReactNativeStrings.function, typings.antDesignReactNative.antDesignReactNativeStrings.audio */ Any
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
