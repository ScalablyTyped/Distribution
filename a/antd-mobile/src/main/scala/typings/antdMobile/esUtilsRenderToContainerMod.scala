package typings.antdMobile

import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsRenderToContainerMod {
  
  @JSImport("antd-mobile/es/utils/render-to-container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderToContainer(getContainer: GetContainer, node: ReactElement): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToContainer")(getContainer.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  type GetContainer = HTMLElement | js.Function0[HTMLElement] | Null
}
