package typings.antdMobile

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getContainerMod {
  
  @JSImport("antd-mobile/es/utils/get-container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveContainer(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveContainer")().asInstanceOf[HTMLElement]
  inline def resolveContainer(getContainer: js.Function0[HTMLElement]): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveContainer")(getContainer.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def resolveContainer(getContainer: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveContainer")(getContainer.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
}
