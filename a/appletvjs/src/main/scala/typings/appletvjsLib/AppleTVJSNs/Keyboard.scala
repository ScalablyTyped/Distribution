package typings
package appletvjsLib.AppleTVJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyboard extends js.Object {
  /** The text inside of a searchField or textField element. */
  var text: java.lang.String
  /**
  		 * A callback function that is called when the text inside
  		 * of searchField or textField element changes.
  		 * */
  def onTextChange(): scala.Unit
}

object Keyboard {
  @scala.inline
  def apply(onTextChange: js.Function0[scala.Unit], text: java.lang.String): Keyboard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onTextChange")(onTextChange)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Keyboard]
  }
}

