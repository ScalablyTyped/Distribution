package typings.antDesignReactNative

import typings.antDesignReactNative.antDesignReactNativeStrings.closable
import typings.antDesignReactNative.antDesignReactNativeStrings.link
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNoticeBarPropsTypeMod {
  
  trait NoticeBarPropsType extends StObject {
    
    var action: js.UndefOr[ReactElement] = js.undefined
    
    var icon: js.UndefOr[ReactElement] = js.undefined
    
    var mode: js.UndefOr[closable | link] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object NoticeBarPropsType {
    
    inline def apply(): NoticeBarPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeBarPropsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoticeBarPropsType] (val x: Self) extends AnyVal {
      
      inline def setAction(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMode(value: closable | link): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    }
  }
}
