package typings.antdMobile

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traverseReactNodeMod {
  
  @JSImport("antd-mobile/es/utils/traverse-react-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def traverseReactNode(children: ReactNode, fn: js.Function2[/* child */ ReactNode, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseReactNode")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
