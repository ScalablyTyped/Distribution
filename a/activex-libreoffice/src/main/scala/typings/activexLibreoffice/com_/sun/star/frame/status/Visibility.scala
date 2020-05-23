package typings.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the visibility state of a property.
  * @since OOo 2.0
  */
trait Visibility extends js.Object {
  /** `TRUE` if the property is visible otherwise `FALSE` . */
  var bVisible: Boolean
}

object Visibility {
  @scala.inline
  def apply(bVisible: Boolean): Visibility = {
    val __obj = js.Dynamic.literal(bVisible = bVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visibility]
  }
}

