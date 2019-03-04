package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLibraryQueryExecutable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def HasExecutableCode(name: java.lang.String): scala.Boolean
}

object XLibraryQueryExecutable {
  @scala.inline
  def apply(
    HasExecutableCode: js.Function1[java.lang.String, scala.Boolean],
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XLibraryQueryExecutable = {
    val __obj = js.Dynamic.literal(HasExecutableCode = HasExecutableCode, acquire = acquire, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XLibraryQueryExecutable]
  }
}

