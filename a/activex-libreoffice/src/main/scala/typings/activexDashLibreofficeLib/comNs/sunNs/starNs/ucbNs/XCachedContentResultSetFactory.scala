package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** creates a {@link CachedContentResultSet} . */
trait XCachedContentResultSetFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a remote optimized {@link com.sun.star.sdbc.XResultSet} .
    * @param xSource must be an instance of service {@link CachedContentResultSetStub} .
    * @param xMapping can be used for optimization of remote access via the interface {@link XContentAccess} of the {@link CachedContentResultSet} . This para
    * @returns an instance of service {@link CachedContentResultSet} .
    */
  def createCachedContentResultSet(
    xSource: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet,
    xMapping: XContentIdentifierMapping
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet
}

object XCachedContentResultSetFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createCachedContentResultSet: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet, 
      XContentIdentifierMapping, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCachedContentResultSetFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire, createCachedContentResultSet = createCachedContentResultSet, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XCachedContentResultSetFactory]
  }
}

