package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the reference to a SQL structured type value in the database. A Ref can be saved to persistent storage. A Ref is dereferenced by passing it as a
  * parameter to a SQL statement and executing the statement.
  */
trait XRef
  extends StObject
     with XInterface {
  
  /**
    * gets the fully-qualified SQL structured type name of the referenced item.
    * @returns the base type name
    * @throws SQLException if a database access error occurs.
    */
  val BaseTypeName: String
  
  /**
    * gets the fully-qualified SQL structured type name of the referenced item.
    * @returns the base type name
    * @throws SQLException if a database access error occurs.
    */
  def getBaseTypeName(): String
}
object XRef {
  
  inline def apply(
    BaseTypeName: String,
    acquire: () => Unit,
    getBaseTypeName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XRef = {
    val __obj = js.Dynamic.literal(BaseTypeName = BaseTypeName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBaseTypeName = js.Any.fromFunction0(getBaseTypeName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRef]
  }
  
  extension [Self <: XRef](x: Self) {
    
    inline def setBaseTypeName(value: String): Self = StObject.set(x, "BaseTypeName", value.asInstanceOf[js.Any])
    
    inline def setGetBaseTypeName(value: () => String): Self = StObject.set(x, "getBaseTypeName", js.Any.fromFunction0(value))
  }
}
