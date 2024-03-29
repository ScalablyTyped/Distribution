package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Insertion and removal of hierarchical elements. */
trait XHierarchicalNameContainer
  extends StObject
     with XHierarchicalNameReplace {
  
  /** inserts the element at the specified name. */
  def insertByHierarchicalName(aName: String, aElement: Any): Unit
  
  /** removes the element at the specified name. */
  def removeByHierarchicalName(Name: String): Unit
}
object XHierarchicalNameContainer {
  
  inline def apply(
    acquire: () => Unit,
    getByHierarchicalName: String => Any,
    hasByHierarchicalName: String => Boolean,
    insertByHierarchicalName: (String, Any) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeByHierarchicalName: String => Unit,
    replaceByHierarchicalName: (String, Any) => Unit
  ): XHierarchicalNameContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), insertByHierarchicalName = js.Any.fromFunction2(insertByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByHierarchicalName = js.Any.fromFunction1(removeByHierarchicalName), replaceByHierarchicalName = js.Any.fromFunction2(replaceByHierarchicalName))
    __obj.asInstanceOf[XHierarchicalNameContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XHierarchicalNameContainer] (val x: Self) extends AnyVal {
    
    inline def setInsertByHierarchicalName(value: (String, Any) => Unit): Self = StObject.set(x, "insertByHierarchicalName", js.Any.fromFunction2(value))
    
    inline def setRemoveByHierarchicalName(value: String => Unit): Self = StObject.set(x, "removeByHierarchicalName", js.Any.fromFunction1(value))
  }
}
