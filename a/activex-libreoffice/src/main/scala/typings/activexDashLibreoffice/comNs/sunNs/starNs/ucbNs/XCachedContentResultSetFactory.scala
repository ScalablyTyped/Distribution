package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XResultSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** creates a {@link CachedContentResultSet} . */
trait XCachedContentResultSetFactory extends XInterface {
  /**
    * creates a remote optimized {@link com.sun.star.sdbc.XResultSet} .
    * @param xSource must be an instance of service {@link CachedContentResultSetStub} .
    * @param xMapping can be used for optimization of remote access via the interface {@link XContentAccess} of the {@link CachedContentResultSet} . This para
    * @returns an instance of service {@link CachedContentResultSet} .
    */
  def createCachedContentResultSet(xSource: XResultSet, xMapping: XContentIdentifierMapping): XResultSet
}

object XCachedContentResultSetFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createCachedContentResultSet: (XResultSet, XContentIdentifierMapping) => XResultSet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCachedContentResultSetFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createCachedContentResultSet = js.Any.fromFunction2(createCachedContentResultSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCachedContentResultSetFactory]
  }
}

