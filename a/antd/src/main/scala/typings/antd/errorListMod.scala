package typings.antd

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorListMod {
  
  @JSImport("antd/lib/form/ErrorList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasErrorsHelpOnDomErrorVisibleChange: ErrorListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasErrorsHelpOnDomErrorVisibleChange.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ErrorListProps extends StObject {
    
    var errors: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    /** @private Internal usage. Do not use in your production */
    var help: js.UndefOr[ReactNode] = js.undefined
    
    /** @private Internal usage. Do not use in your production */
    var onDomErrorVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  }
  object ErrorListProps {
    
    @scala.inline
    def apply(): ErrorListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorListProps]
    }
    
    @scala.inline
    implicit class ErrorListPropsMutableBuilder[Self <: ErrorListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[ReactNode]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: ReactNode*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setHelp(value: ReactNode): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setOnDomErrorVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onDomErrorVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDomErrorVisibleChangeUndefined: Self = StObject.set(x, "onDomErrorVisibleChange", js.undefined)
    }
  }
}
