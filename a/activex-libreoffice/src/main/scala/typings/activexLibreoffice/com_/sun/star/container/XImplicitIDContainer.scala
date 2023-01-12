package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to insert and remove elements in/from a container using an implicit (unique) ID. */
trait XImplicitIDContainer
  extends StObject
     with XImplicitIDReplace {
  
  /**
    * adds a new object to the container and generates an implicit (unique) ID for this object.
    * @returns the implicit ID for the new object.
    */
  def addWithImplicitID(aElement: Any): String
  
  /** removes an object from the container which is specified by an implicit (unique) identifier. */
  def removeByImplicitID(ID: String): Unit
}
object XImplicitIDContainer {
  
  inline def apply(
    acquire: () => Unit,
    addWithImplicitID: Any => String,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeByImplicitID: String => Unit,
    replaceByUniqueID: (String, Any) => Unit
  ): XImplicitIDContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addWithImplicitID = js.Any.fromFunction1(addWithImplicitID), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByImplicitID = js.Any.fromFunction1(removeByImplicitID), replaceByUniqueID = js.Any.fromFunction2(replaceByUniqueID))
    __obj.asInstanceOf[XImplicitIDContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XImplicitIDContainer] (val x: Self) extends AnyVal {
    
    inline def setAddWithImplicitID(value: Any => String): Self = StObject.set(x, "addWithImplicitID", js.Any.fromFunction1(value))
    
    inline def setRemoveByImplicitID(value: String => Unit): Self = StObject.set(x, "removeByImplicitID", js.Any.fromFunction1(value))
  }
}
