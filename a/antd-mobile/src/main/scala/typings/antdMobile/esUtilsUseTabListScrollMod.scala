package typings.antdMobile

import typings.antdMobile.anon.Animate
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsUseTabListScrollMod {
  
  @JSImport("antd-mobile/es/utils/use-tab-list-scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTabListScroll(targetRef: RefObject[HTMLElement]): Animate = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabListScroll")(targetRef.asInstanceOf[js.Any]).asInstanceOf[Animate]
  inline def useTabListScroll(targetRef: RefObject[HTMLElement], activeIndex: Double): Animate = (^.asInstanceOf[js.Dynamic].applyDynamic("useTabListScroll")(targetRef.asInstanceOf[js.Any], activeIndex.asInstanceOf[js.Any])).asInstanceOf[Animate]
}
