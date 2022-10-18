package typings.antdMobile

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsRenderMod {
  
  @JSImport("antd-mobile/es/utils/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def render(node: ReactElement, container: ContainerType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(node.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unmount(container: ContainerType): Boolean | js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean | js.Promise[Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antdMobile.anon.ElementMARKRootundefined
    - typings.antdMobile.anon.DocumentFragmentMARKRootu
  */
  trait ContainerType extends StObject
}
