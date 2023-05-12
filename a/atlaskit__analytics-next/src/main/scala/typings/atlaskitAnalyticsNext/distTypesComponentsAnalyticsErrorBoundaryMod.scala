package typings.atlaskitAnalyticsNext

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsAnalyticsErrorBoundaryMod {
  
  @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsErrorBoundary", JSImport.Default)
  @js.native
  open class default protected () extends AnalyticsErrorBoundary {
    def this(props: AnalyticsErrorBoundaryProps) = this()
  }
  
  @js.native
  trait AnalyticsErrorBoundary extends Component[AnalyticsErrorBoundaryProps, AnalyticsErrorBoundaryState, Any] {
    
    @JSName("componentDidCatch")
    def componentDidCatch_MAnalyticsErrorBoundary(error: js.Error): Unit = js.native
    @JSName("componentDidCatch")
    def componentDidCatch_MAnalyticsErrorBoundary(error: js.Error, info: AnalyticsErrorBoundaryErrorInfo): Unit = js.native
  }
  
  trait AnalyticsErrorBoundaryErrorInfo extends StObject {
    
    var componentStack: String
  }
  object AnalyticsErrorBoundaryErrorInfo {
    
    inline def apply(componentStack: String): AnalyticsErrorBoundaryErrorInfo = {
      val __obj = js.Dynamic.literal(componentStack = componentStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsErrorBoundaryErrorInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticsErrorBoundaryErrorInfo] (val x: Self) extends AnyVal {
      
      inline def setComponentStack(value: String): Self = StObject.set(x, "componentStack", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnalyticsErrorBoundaryProps extends StObject {
    
    var ErrorComponent: js.UndefOr[ComponentType[js.Object]] = js.undefined
    
    var channel: String
    
    /** React component to be wrapped */
    var children: ReactNode
    
    var onError: js.UndefOr[
        js.Function2[/* error */ js.Error, /* info */ js.UndefOr[AnalyticsErrorBoundaryErrorInfo], Unit]
      ] = js.undefined
  }
  object AnalyticsErrorBoundaryProps {
    
    inline def apply(channel: String): AnalyticsErrorBoundaryProps = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsErrorBoundaryProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticsErrorBoundaryProps] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setErrorComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "ErrorComponent", value.asInstanceOf[js.Any])
      
      inline def setErrorComponentUndefined: Self = StObject.set(x, "ErrorComponent", js.undefined)
      
      inline def setOnError(value: (/* error */ js.Error, /* info */ js.UndefOr[AnalyticsErrorBoundaryErrorInfo]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    }
  }
  
  trait AnalyticsErrorBoundaryState extends StObject {
    
    var hasError: Boolean
  }
  object AnalyticsErrorBoundaryState {
    
    inline def apply(hasError: Boolean): AnalyticsErrorBoundaryState = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsErrorBoundaryState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticsErrorBoundaryState] (val x: Self) extends AnyVal {
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    }
  }
}
