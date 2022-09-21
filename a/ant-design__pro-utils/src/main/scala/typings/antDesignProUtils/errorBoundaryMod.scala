package typings.antDesignProUtils

import typings.antDesignProUtils.anon.Children
import typings.antDesignProUtils.anon.ErrorInfo
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorBoundaryMod {
  
  @JSImport("@ant-design/pro-utils/es/components/ErrorBoundary", "ErrorBoundary")
  @js.native
  open class ErrorBoundary protected () extends Component[Children, ErrorInfo, Any] {
    def this(props: Children) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Children, context: Any) = this()
    
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(error: Any, errorInfo: typings.react.mod.ErrorInfo): Unit = js.native
  }
  object ErrorBoundary {
    
    @JSImport("@ant-design/pro-utils/es/components/ErrorBoundary", "ErrorBoundary")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getDerivedStateFromError(error: js.Error): ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")(error.asInstanceOf[js.Any]).asInstanceOf[ErrorInfo]
  }
}
