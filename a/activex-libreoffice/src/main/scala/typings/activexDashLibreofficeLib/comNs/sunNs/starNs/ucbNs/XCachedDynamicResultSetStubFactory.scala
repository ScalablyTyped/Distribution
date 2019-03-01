package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * creates a {@link CachedDynamicResultSetStub} and connects a non-remote optimized {@link DynamicResultSet} to a remote optimized {@link
  * CachedDynamicResultSet} .
  *
  * Pay attention to instantiate this helper on server side where your source {@link DynamicResultSet} was instantiated.
  *
  * Method {@link XCachedDynamicResultSetStubFactory.createCachedDynamicResultSetStub()} can be used to create a stub on server side.
  *
  * If you have instantiated a {@link CachedDynamicResultSet} on client side already, use method {@link connectToCache()} to connect your given {@link
  * DynamicResultSet} with this Cache.
  *
  * The needed cache on server side you can create using {@link XCachedDynamicResultSetFactory} .
  */
trait XCachedDynamicResultSetStubFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * If you have instantiated a {@link CachedDynamicResultSet} on client side already, use this to connect your given Source on server side to the
    * TargetCache.
    * @param Source is an instance of service {@link DynamicResultSet} .
    * @param TargetCache is an instance of service {@link CachedDynamicResultSet} .
    * @param SortingInfo can be an empty sequence. Otherwise, Source will be sorted according to the given sorting data.
    * @param CompareFactory will be ignored unless {@link SortingInfo} is not empty. Then the supplied factory will be used to instantiate objects used to com
    * @throws ListenerAlreadySetException if `Source` is already in use.
    * @throws AlreadyInitializedException if `TargetCache` already has been initialized.
    */
  def connectToCache(
    Source: XDynamicResultSet,
    TargetCache: XDynamicResultSet,
    SortingInfo: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[NumberedSortingInfo],
    CompareFactory: XAnyCompareFactory
  ): scala.Unit
  /**
    * creates a remote optimizes {@link XDynamicResultSet} .
    * @param Source must be an instance of service {@link DynamicResultSet} .
    * @returns an instance of service {@link CachedDynamicResultSetStub} .
    */
  def createCachedDynamicResultSetStub(Source: XDynamicResultSet): XDynamicResultSet
}

object XCachedDynamicResultSetStubFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    connectToCache: js.Function4[
      XDynamicResultSet, 
      XDynamicResultSet, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[NumberedSortingInfo], 
      XAnyCompareFactory, 
      scala.Unit
    ],
    createCachedDynamicResultSetStub: js.Function1[XDynamicResultSet, XDynamicResultSet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCachedDynamicResultSetStubFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("connectToCache")(connectToCache)
    __obj.updateDynamic("createCachedDynamicResultSetStub")(createCachedDynamicResultSetStub)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XCachedDynamicResultSetStubFactory]
  }
}

