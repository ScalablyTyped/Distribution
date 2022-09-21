package typings.antdMobile

import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLockScrollMod {
  
  @JSImport("antd-mobile/es/utils/use-lock-scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useLockScroll(rootRef: RefObject[HTMLElement], shouldLock: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLockScroll")(rootRef.asInstanceOf[js.Any], shouldLock.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
