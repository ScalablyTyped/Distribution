package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fullscreen extends js.Object {
  var fullscreen: scala.Boolean
  var headerRender: scala.Null
  var onChange: js.Function0[scala.Null]
  var onPanelChange: js.Function0[scala.Null]
  var onSelect: js.Function0[scala.Null]
}

object Anon_Fullscreen {
  @scala.inline
  def apply(
    fullscreen: scala.Boolean,
    headerRender: scala.Null,
    onChange: () => scala.Null,
    onPanelChange: () => scala.Null,
    onSelect: () => scala.Null
  ): Anon_Fullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen, headerRender = headerRender, onChange = js.Any.fromFunction0(onChange), onPanelChange = js.Any.fromFunction0(onPanelChange), onSelect = js.Any.fromFunction0(onSelect))
  
    __obj.asInstanceOf[Anon_Fullscreen]
  }
}

