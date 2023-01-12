package typings.atlaskitDsLib

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUseCloseOnEscapePressMod {
  
  @JSImport("@atlaskit/ds-lib/dist/types/hooks/use-close-on-escape-press", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: UseCloseOnEscapePressOpts): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait UseCloseOnEscapePressOpts extends StObject {
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    def onClose(e: KeyboardEvent): Unit
  }
  object UseCloseOnEscapePressOpts {
    
    inline def apply(onClose: KeyboardEvent => Unit): UseCloseOnEscapePressOpts = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose))
      __obj.asInstanceOf[UseCloseOnEscapePressOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseCloseOnEscapePressOpts] (val x: Self) extends AnyVal {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setOnClose(value: KeyboardEvent => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    }
  }
}
