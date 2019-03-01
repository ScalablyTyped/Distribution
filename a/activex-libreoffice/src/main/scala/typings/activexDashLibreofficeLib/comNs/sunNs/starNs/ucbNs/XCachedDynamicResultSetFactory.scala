package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * creates a {@link CachedDynamicResultSet} .
  *
  * Pay attention to instantiate this helper on client side where your want to read the data respectively where you have instantiated the listener to the
  * {@link XDynamicResultSet} .
  *
  * The needed stub on server side can be created using {@link XCachedDynamicResultSetStubFactory} .
  */
trait XCachedDynamicResultSetFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a remote optimizes {@link XDynamicResultSet} .
    * @param SourceStub must be an instance of service {@link CachedDynamicResultSetStub} . It can be `NULL` . In this case you can use the interface {@link X
    * @param ContentIdentifierMapping is not required, but can be set if it is necessary to change the identity of the contents accessible via the interface {
    * @returns an instance of service {@link CachedDynamicResultSet} .
    */
  def createCachedDynamicResultSet(SourceStub: XDynamicResultSet, ContentIdentifierMapping: XContentIdentifierMapping): XDynamicResultSet
}

object XCachedDynamicResultSetFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createCachedDynamicResultSet: js.Function2[XDynamicResultSet, XContentIdentifierMapping, XDynamicResultSet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCachedDynamicResultSetFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createCachedDynamicResultSet")(createCachedDynamicResultSet)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XCachedDynamicResultSetFactory]
  }
}

