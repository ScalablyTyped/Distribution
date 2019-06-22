package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fullscreen extends js.Object {
  var fullscreen: scala.Boolean
  var onChange: js.Function0[scala.Null]
  var onPanelChange: js.Function0[scala.Null]
  var onSelect: js.Function0[scala.Null]
}

object Anon_Fullscreen {
  @scala.inline
  def apply(
    fullscreen: scala.Boolean,
    onChange: () => scala.Null,
    onPanelChange: () => scala.Null,
    onSelect: () => scala.Null
  ): Anon_Fullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen, onChange = js.Any.fromFunction0(onChange), onPanelChange = js.Any.fromFunction0(onPanelChange), onSelect = js.Any.fromFunction0(onSelect))
  
    __obj.asInstanceOf[Anon_Fullscreen]
  }
}

