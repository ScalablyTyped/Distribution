package typings.activexLibreoffice.com_.sun.star.frame.status

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains a list of format IDs and names which are part of the system clipboard.
  * @since OOo 2.0
  */
@js.native
trait ClipboardFormats extends js.Object {
  /** specifies a sequence of format IDs which are contained in the system clipboard. */
  var Identifiers: SafeArray[Double] = js.native
  /** specifies a sequence of format names which are contained in the system clipboard. */
  var Names: SafeArray[String] = js.native
}

object ClipboardFormats {
  @scala.inline
  def apply(Identifiers: SafeArray[Double], Names: SafeArray[String]): ClipboardFormats = {
    val __obj = js.Dynamic.literal(Identifiers = Identifiers.asInstanceOf[js.Any], Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardFormats]
  }
  @scala.inline
  implicit class ClipboardFormatsOps[Self <: ClipboardFormats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentifiers(value: SafeArray[Double]): Self = this.set("Identifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setNames(value: SafeArray[String]): Self = this.set("Names", value.asInstanceOf[js.Any])
  }
  
}

