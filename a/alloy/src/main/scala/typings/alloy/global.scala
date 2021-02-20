package typings.alloy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * The global Alloy module.
    */
  @JSGlobal("Alloy")
  @js.native
  val Alloy: AlloyInterface = js.native
  
  /**
    * The current Widget context.
    *
    * Use `Widget.create*` rather than the `Alloy.create*` methods to create
    * components relative to the widget context rather than the Alloy project.
    */
  @JSGlobal("Widget")
  @js.native
  val Widget: WidgetInterface = js.native
}
