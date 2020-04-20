package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUsesOnChanges extends js.Object {
  /**
    * Whether the directive uses NgOnChanges.
    */
  var usesOnChanges: Boolean
}

object AnonUsesOnChanges {
  @scala.inline
  def apply(usesOnChanges: Boolean): AnonUsesOnChanges = {
    val __obj = js.Dynamic.literal(usesOnChanges = usesOnChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUsesOnChanges]
  }
}

