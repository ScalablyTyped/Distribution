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
    acquire: () => scala.Unit,
    createQueryComposer: () => XSQLQueryComposer,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSQLQueryComposerFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createQueryComposer = js.Any.fromFunction0(createQueryComposer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSQLQueryComposerFactory]
  }
}

