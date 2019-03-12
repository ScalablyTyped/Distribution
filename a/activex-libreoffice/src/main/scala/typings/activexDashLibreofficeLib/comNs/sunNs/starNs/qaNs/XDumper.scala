package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.qaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Dumps the content into a string. This is an internal interface and should not be used outside of Libreoffice source code */
trait XDumper
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * dump the content into a string
    * @since LibreOffice 3.6
    */
  def dump(): java.lang.String
}

object XDumper {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    dump: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDumper = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dump = js.Any.fromFunction0(dump), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDumper]
  }
}

