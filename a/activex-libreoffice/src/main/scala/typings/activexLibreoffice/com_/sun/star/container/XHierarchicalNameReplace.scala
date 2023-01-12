package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Replacement of hierarchical elements. */
trait XHierarchicalNameReplace
  extends StObject
     with XHierarchicalNameAccess {
  
  /** replaces the element at the specified name. */
  def replaceByHierarchicalName(aName: String, aElement: Any): Unit
}
object XHierarchicalNameReplace {
  
  inline def apply(
    acquire: () => Unit,
    getByHierarchicalName: String => Any,
    hasByHierarchicalName: String => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    replaceByHierarchicalName: (String, Any) => Unit
  ): XHierarchicalNameReplace = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByHierarchicalName = js.Any.fromFunction2(replaceByHierarchicalName))
    __obj.asInstanceOf[XHierarchicalNameReplace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XHierarchicalNameReplace] (val x: Self) extends AnyVal {
    
    inline def setReplaceByHierarchicalName(value: (String, Any) => Unit): Self = StObject.set(x, "replaceByHierarchicalName", js.Any.fromFunction2(value))
  }
}
