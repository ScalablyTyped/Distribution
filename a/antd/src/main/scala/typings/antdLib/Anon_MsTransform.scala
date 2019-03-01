package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MsTransform extends js.Object {
  var WebkitTransform: java.lang.String
  var msTransform: java.lang.String
  var transform: java.lang.String
  var transition: js.UndefOr[java.lang.String]
}

object Anon_MsTransform {
  @scala.inline
  def apply(
    WebkitTransform: java.lang.String,
    msTransform: java.lang.String,
    transform: java.lang.String,
    transition: java.lang.String = null
  ): Anon_MsTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("WebkitTransform")(WebkitTransform)
    __obj.updateDynamic("msTransform")(msTransform)
    __obj.updateDynamic("transform")(transform)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[Anon_MsTransform]
  }
}

