package typings.antd

import typings.antd.gridColMod.ColProps
import typings.antd.gridRowMod.RowProps
import typings.antd.responsiveObserveMod.ScreenMap
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/grid", JSImport.Namespace)
@js.native
object libGridMod extends js.Object {
  
  val Col: ForwardRefExoticComponent[ColProps with RefAttributes[HTMLDivElement]] = js.native
  
  val Row: ForwardRefExoticComponent[RowProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  object default extends js.Object {
    
    var useBreakpoint: js.Function0[ScreenMap] = js.native
  }
}
