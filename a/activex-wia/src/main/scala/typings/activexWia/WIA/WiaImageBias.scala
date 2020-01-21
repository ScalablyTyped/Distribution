package typings.activexWia.WIA

import typings.activexWia.activexWiaNumbers.`131072`
import typings.activexWia.activexWiaNumbers.`65536`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The WiaImageBias enumeration helps specify what type of data the image is intended to represent. */
/* Rewritten from type alias, can be one of: 
  - typings.activexWia.activexWiaNumbers.`131072`
  - typings.activexWia.activexWiaNumbers.`65536`
*/
trait WiaImageBias extends js.Object

object WiaImageBias {
  @scala.inline
  def MaximizeQuality: `131072` = this.cast(131072)
  @scala.inline
  def MinimizeSize: `65536` = this.cast(65536)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

