package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is a factory for instances of service {@link com.sun.star.sdb.SQLQueryComposer} . */
trait XSQLQueryComposerFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a new query composer.
    * @returns the {@link SQLQueryComposer} object
    */
  def createQueryComposer(): XSQLQueryComposer
}
object XSQLQueryComposerFactory {
  
  inline def apply(
    acquire: () => Unit,
    createQueryComposer: () => XSQLQueryComposer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSQLQueryComposerFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createQueryComposer = js.Any.fromFunction0(createQueryComposer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSQLQueryComposerFactory]
  }
  
  extension [Self <: XSQLQueryComposerFactory](x: Self) {
    
    inline def setCreateQueryComposer(value: () => XSQLQueryComposer): Self = StObject.set(x, "createQueryComposer", js.Any.fromFunction0(value))
  }
}
