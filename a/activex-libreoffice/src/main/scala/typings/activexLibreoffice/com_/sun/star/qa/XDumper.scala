package typings.activexLibreoffice.com_.sun.star.qa

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Dumps the content into a string. This is an internal interface and should not be used outside of Libreoffice source code */
trait XDumper extends XInterface {
  /**
    * dump the content into a string
    * @since LibreOffice 3.6
    */
  def dump(): String
}

object XDumper {
  @scala.inline
  def apply(acquire: () => Unit, dump: () => String, queryInterface: `type` => js.Any, release: () => Unit): XDumper = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dump = js.Any.fromFunction0(dump), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDumper]
  }
}

