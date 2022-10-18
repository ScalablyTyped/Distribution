package typings.antd

import typings.antd.anon.PartialRecordBreakpointbo
import typings.antd.libGridColMod.ColProps
import typings.antd.libGridRowMod.RowProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridMod {
  
  object default {
    
    @JSImport("antd/lib/grid", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/grid", "default.useBreakpoint")
    @js.native
    def useBreakpoint: js.Function0[PartialRecordBreakpointbo] = js.native
    inline def useBreakpoint_=(x: js.Function0[PartialRecordBreakpointbo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useBreakpoint")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd/lib/grid", "Col")
  @js.native
  val Col: ForwardRefExoticComponent[ColProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("antd/lib/grid", "Row")
  @js.native
  val Row: ForwardRefExoticComponent[RowProps & RefAttributes[HTMLDivElement]] = js.native
}
