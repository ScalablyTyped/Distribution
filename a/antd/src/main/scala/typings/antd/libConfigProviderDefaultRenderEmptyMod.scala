package typings.antd

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigProviderDefaultRenderEmptyMod {
  
  @JSImport("antd/lib/config-provider/defaultRenderEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ReactNode]
  inline def default(componentName: String): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentName.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  
  type RenderEmptyHandler = js.Function1[/* componentName */ js.UndefOr[String], ReactNode]
}
