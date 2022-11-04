package typings.antd

import typings.antd.anon.Error
import typings.antd.anon.`0`
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAlertErrorBoundaryMod {
  
  @JSImport("antd/lib/alert/ErrorBoundary", JSImport.Default)
  @js.native
  open class default () extends ErrorBoundary
  
  @js.native
  trait ErrorBoundary extends Component[ErrorBoundaryProps, ErrorBoundaryStates, Any] {
    
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(error: js.Error, info: js.Object): Unit = js.native
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(error: Null, info: js.Object): Unit = js.native
    
    @JSName("state")
    var state_ErrorBoundary: Error = js.native
  }
  
  trait ErrorBoundaryProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var message: js.UndefOr[ReactNode] = js.undefined
  }
  object ErrorBoundaryProps {
    
    inline def apply(): ErrorBoundaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBoundaryProps]
    }
    
    extension [Self <: ErrorBoundaryProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait ErrorBoundaryStates extends StObject {
    
    var error: js.UndefOr[js.Error | Null] = js.undefined
    
    var info: js.UndefOr[`0`] = js.undefined
  }
  object ErrorBoundaryStates {
    
    inline def apply(): ErrorBoundaryStates = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBoundaryStates]
    }
    
    extension [Self <: ErrorBoundaryStates](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInfo(value: `0`): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    }
  }
}
