package typings.antdMobile.switchMod

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Switch
  extends Component[SwitchProps, js.Any, js.Any] {
  
  def onChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  def onClick(e: js.Any): Unit = js.native
}
