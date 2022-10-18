package typings.antdMobile

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsRenderImperativelyMod {
  
  @JSImport("antd-mobile/es/utils/render-imperatively", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderImperatively(element: TargetElement): ImperativeHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("renderImperatively")(element.asInstanceOf[js.Any]).asInstanceOf[ImperativeHandler]
  
  trait ImperativeHandler extends StObject {
    
    def close(): Unit
    
    def replace(element: TargetElement): Unit
  }
  object ImperativeHandler {
    
    inline def apply(close: () => Unit, replace: TargetElement => Unit): ImperativeHandler = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), replace = js.Any.fromFunction1(replace))
      __obj.asInstanceOf[ImperativeHandler]
    }
    
    extension [Self <: ImperativeHandler](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setReplace(value: TargetElement => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
    }
  }
  
  trait ImperativeProps extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ImperativeProps {
    
    inline def apply(): ImperativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImperativeProps]
    }
    
    extension [Self <: ImperativeProps](x: Self) {
      
      inline def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type TargetElement = ReactElement
}
