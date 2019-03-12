package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** creates a {@link CachedContentResultSetStub} . */
trait XCachedContentResultSetStubFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a remote optimized {@link com.sun.star.sdbc.XResultSet} .
    * @param xSource must be an instance of service {@link ContentResultSet} .
    * @returns an instance of service {@link CachedContentResultSetStub} .
    */
  def createCachedContentResultSetStub(xSource: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet
}

object XCachedContentResultSetStubFactory {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createCachedContentResultSetStub: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XCachedContentResultSetStubFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createCachedContentResultSetStub = js.Any.fromFunction1(createCachedContentResultSetStub), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCachedContentResultSetStubFactory]
  }
}

