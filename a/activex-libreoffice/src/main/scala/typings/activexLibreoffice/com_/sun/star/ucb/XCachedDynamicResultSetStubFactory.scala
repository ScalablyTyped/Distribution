package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
@js.native
trait XCachedDynamicResultSetStubFactory extends XInterface {
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
    SortingInfo: SeqEquiv[NumberedSortingInfo],
    CompareFactory: XAnyCompareFactory
  ): Unit = js.native
  /**
    * creates a remote optimizes {@link XDynamicResultSet} .
    * @param Source must be an instance of service {@link DynamicResultSet} .
    * @returns an instance of service {@link CachedDynamicResultSetStub} .
    */
  def createCachedDynamicResultSetStub(Source: XDynamicResultSet): XDynamicResultSet = js.native
}

object XCachedDynamicResultSetStubFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    connectToCache: (XDynamicResultSet, XDynamicResultSet, SeqEquiv[NumberedSortingInfo], XAnyCompareFactory) => Unit,
    createCachedDynamicResultSetStub: XDynamicResultSet => XDynamicResultSet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCachedDynamicResultSetStubFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), connectToCache = js.Any.fromFunction4(connectToCache), createCachedDynamicResultSetStub = js.Any.fromFunction1(createCachedDynamicResultSetStub), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCachedDynamicResultSetStubFactory]
  }
  @scala.inline
  implicit class XCachedDynamicResultSetStubFactoryOps[Self <: XCachedDynamicResultSetStubFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectToCache(
      value: (XDynamicResultSet, XDynamicResultSet, SeqEquiv[NumberedSortingInfo], XAnyCompareFactory) => Unit
    ): Self = this.set("connectToCache", js.Any.fromFunction4(value))
    @scala.inline
    def setCreateCachedDynamicResultSetStub(value: XDynamicResultSet => XDynamicResultSet): Self = this.set("createCachedDynamicResultSetStub", js.Any.fromFunction1(value))
  }
  
}

