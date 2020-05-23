package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XFormattedString extends XInterface {
  var String: java.lang.String
  def getString(): String
  def setString(String: String): Unit
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
}

