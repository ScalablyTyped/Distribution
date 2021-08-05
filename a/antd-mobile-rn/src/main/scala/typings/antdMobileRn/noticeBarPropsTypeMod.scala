package typings.antdMobileRn

import typings.antdMobileRn.antdMobileRnStrings.closable
import typings.antdMobileRn.antdMobileRnStrings.link
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeBarPropsTypeMod {
  
  trait NoticeBarPropsType extends StObject {
    
    var action: js.UndefOr[ReactElement] = js.undefined
    
    var icon: js.UndefOr[ReactElement] = js.undefined
    
    var mode: js.UndefOr[closable | link] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object NoticeBarPropsType {
    
    inline def apply(): NoticeBarPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeBarPropsType]
    }
    
    extension [Self <: NoticeBarPropsType](x: Self) {
      
      inline def setAction(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMode(value: closable | link): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
