package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to access, add, and remove the {@link Shapes} in a collection.
  * @see DrawPage
  * @see MasterPage
  * @see DrawingDocumentDrawView
  */
trait XShapes
  extends StObject
     with XIndexAccess {
  
  /**
    * inserts a {@link Shape} into this collection.
    * @param xShape a {@link Shape} that will be inserted.
    */
  def add(xShape: XShape): Unit
  
  /**
    * removes a {@link Shape} from this collection.
    * @param xShape the {@link Shape} will be removed from the collection and disposed.
    */
  def remove(xShape: XShape): Unit
}
object XShapes {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    add: XShape => Unit,
    getByIndex: Double => Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    remove: XShape => Unit
  ): XShapes = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction1(add), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[XShapes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XShapes] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: XShape => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setRemove(value: XShape => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
