package typings.antdMobile

import typings.antdMobile.antdMobileStrings.strict
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsUseLockScrollMod {
  
  @JSImport("antd-mobile/es/utils/use-lock-scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useLockScroll(rootRef: RefObject[HTMLElement], shouldLock: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLockScroll")(rootRef.asInstanceOf[js.Any], shouldLock.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useLockScroll_strict(rootRef: RefObject[HTMLElement], shouldLock: strict): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLockScroll")(rootRef.asInstanceOf[js.Any], shouldLock.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
