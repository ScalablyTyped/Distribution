package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** creates a {@link CachedContentResultSetStub} . */
trait XCachedContentResultSetStubFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a remote optimized {@link com.sun.star.sdbc.XResultSet} .
    * @param xSource must be an instance of service {@link ContentResultSet} .
    * @returns an instance of service {@link CachedContentResultSetStub} .
    */
  def createCachedContentResultSetStub(xSource: XResultSet): XResultSet
}
object XCachedContentResultSetStubFactory {
  
  inline def apply(
    acquire: () => Unit,
    createCachedContentResultSetStub: XResultSet => XResultSet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCachedContentResultSetStubFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createCachedContentResultSetStub = js.Any.fromFunction1(createCachedContentResultSetStub), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCachedContentResultSetStubFactory]
  }
  
  extension [Self <: XCachedContentResultSetStubFactory](x: Self) {
    
    inline def setCreateCachedContentResultSetStub(value: XResultSet => XResultSet): Self = StObject.set(x, "createCachedContentResultSetStub", js.Any.fromFunction1(value))
  }
}
