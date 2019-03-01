package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a factory for instances of service {@link com.sun.star.sdb.SQLQueryComposer} . */
trait XSQLQueryComposerFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a new query composer.
    * @returns the {@link SQLQueryComposer} object
    */
  def createQueryComposer(): XSQLQueryComposer
}

object XSQLQueryComposerFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createQueryComposer: js.Function0[XSQLQueryComposer],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSQLQueryComposerFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createQueryComposer")(createQueryComposer)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSQLQueryComposerFactory]
  }
}

