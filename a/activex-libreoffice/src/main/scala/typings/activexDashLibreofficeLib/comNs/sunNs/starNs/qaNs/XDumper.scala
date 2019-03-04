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
    acquire: js.Function0[scala.Unit],
    dump: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDumper = {
    val __obj = js.Dynamic.literal(acquire = acquire, dump = dump, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDumper]
  }
}

