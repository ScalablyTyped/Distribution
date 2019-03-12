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
    HasExecutableCode: java.lang.String => scala.Boolean,
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XLibraryQueryExecutable = {
    val __obj = js.Dynamic.literal(HasExecutableCode = js.Any.fromFunction1(HasExecutableCode), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLibraryQueryExecutable]
  }
}

