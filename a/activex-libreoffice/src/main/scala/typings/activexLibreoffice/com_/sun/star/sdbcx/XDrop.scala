package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides methods to remove an element of its container and to drop it from the related database. */
trait XDrop
  extends StObject
     with XInterface {
  
  /**
    * drops an object of the related container identified by its position.
    * @param index the position of the element to be dropped
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropByIndex(index: Double): Unit
  
  /**
    * drops an object of the related container identified by its name.
    * @param elementName the name of the element to be dropped
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropByName(elementName: String): Unit
}
object XDrop {
  
  inline def apply(
    acquire: () => Unit,
    dropByIndex: Double => Unit,
    dropByName: String => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDrop = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dropByIndex = js.Any.fromFunction1(dropByIndex), dropByName = js.Any.fromFunction1(dropByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDrop]
  }
  
  extension [Self <: XDrop](x: Self) {
    
    inline def setDropByIndex(value: Double => Unit): Self = StObject.set(x, "dropByIndex", js.Any.fromFunction1(value))
    
    inline def setDropByName(value: String => Unit): Self = StObject.set(x, "dropByName", js.Any.fromFunction1(value))
  }
}
