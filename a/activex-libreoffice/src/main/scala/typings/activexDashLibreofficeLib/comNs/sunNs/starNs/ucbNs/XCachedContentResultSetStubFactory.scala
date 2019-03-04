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
    acquire: js.Function0[scala.Unit],
    createCachedContentResultSetStub: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCachedContentResultSetStubFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire, createCachedContentResultSetStub = createCachedContentResultSetStub, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XCachedContentResultSetStubFactory]
  }
}

