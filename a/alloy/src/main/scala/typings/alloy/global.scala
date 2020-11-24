package typings.alloy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * The global Alloy module.
    */
  val Alloy: AlloyInterface = js.native
  
  /**
    * The current Widget context.
    *
    * Use `Widget.create*` rather than the `Alloy.create*` methods to create
    * components relative to the widget context rather than the Alloy project.
    */
  val Widget: WidgetInterface = js.native
}
