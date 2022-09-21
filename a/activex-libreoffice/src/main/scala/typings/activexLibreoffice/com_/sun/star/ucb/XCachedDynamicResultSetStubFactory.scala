package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with XInterface {
  
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
  ): Unit
  
  /**
    * creates a remote optimizes {@link XDynamicResultSet} .
    * @param Source must be an instance of service {@link DynamicResultSet} .
    * @returns an instance of service {@link CachedDynamicResultSetStub} .
    */
  def createCachedDynamicResultSetStub(Source: XDynamicResultSet): XDynamicResultSet
}
object XCachedDynamicResultSetStubFactory {
  
  inline def apply(
    acquire: () => Unit,
    connectToCache: (XDynamicResultSet, XDynamicResultSet, SeqEquiv[NumberedSortingInfo], XAnyCompareFactory) => Unit,
    createCachedDynamicResultSetStub: XDynamicResultSet => XDynamicResultSet,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XCachedDynamicResultSetStubFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), connectToCache = js.Any.fromFunction4(connectToCache), createCachedDynamicResultSetStub = js.Any.fromFunction1(createCachedDynamicResultSetStub), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCachedDynamicResultSetStubFactory]
  }
  
  extension [Self <: XCachedDynamicResultSetStubFactory](x: Self) {
    
    inline def setConnectToCache(
      value: (XDynamicResultSet, XDynamicResultSet, SeqEquiv[NumberedSortingInfo], XAnyCompareFactory) => Unit
    ): Self = StObject.set(x, "connectToCache", js.Any.fromFunction4(value))
    
    inline def setCreateCachedDynamicResultSetStub(value: XDynamicResultSet => XDynamicResultSet): Self = StObject.set(x, "createCachedDynamicResultSetStub", js.Any.fromFunction1(value))
  }
}
