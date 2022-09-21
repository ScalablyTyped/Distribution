package typings.antd

import typings.antd.responsiveObserveMod.ScreenMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useBreakpointMod {
  
  @JSImport("antd/lib/grid/hooks/useBreakpoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ScreenMap = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ScreenMap]
  inline def default(refreshOnChange: Boolean): ScreenMap = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(refreshOnChange.asInstanceOf[js.Any]).asInstanceOf[ScreenMap]
}
