package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XFormattedString extends XInterface {
  var String: java.lang.String = js.native
  def getString(): String = js.native
  def setString(String: String): Unit = js.native
}

object XFormattedString {
  @scala.inline
  def apply(
    String: String,
    acquire: () => Unit,
    getString: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setString: String => Unit
  ): XFormattedString = {
    val __obj = js.Dynamic.literal(String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getString = js.Any.fromFunction0(getString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[XFormattedString]
  }
  @scala.inline
  implicit class XFormattedStringOps[Self <: XFormattedString] (val x: Self) extends AnyVal {
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
    def setString(value: String): Self = this.set("String", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetString(value: () => String): Self = this.set("getString", js.Any.fromFunction0(value))
    @scala.inline
    def setSetString(value: String => Unit): Self = this.set("setString", js.Any.fromFunction1(value))
  }
  
}

