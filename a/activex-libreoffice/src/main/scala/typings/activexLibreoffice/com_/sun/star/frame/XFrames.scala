package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * manages and creates frames.
  *
  * Frames may contain other frames (by implementing an {@link XFrames} interface) and may be contained in other frames.
  * @see XFrame
  * @see Frame
  */
trait XFrames
  extends StObject
     with XIndexAccess {
  
  /**
    * appends the specified {@link Frame} to the list of sub-frames.
    * @param xFrame new frame for inserting into this container
    */
  def append(xFrame: XFrame): Unit
  
  /**
    * provides access to the list of all currently existing frames inside this container and their sub frames
    * @param nSearchFlags use combinations of {@link FrameSearchFlag} to specify which frames should be found
    * @returns all frames of this container and all available frames of the whole frame tree which match search parameter **SearchFlags**
    */
  def queryFrames(nSearchFlags: Double): SafeArray[XFrame]
  
  /**
    * removes the frame from its container.
    *
    * Note: The method XComponent::dispose() is not called implicitly by this method.The creator attribute of the frame must be reset by the caller of this
    * method.
    * @param xFrame frame which should be removed from this container
    */
  def remove(xFrame: XFrame): Unit
}
object XFrames {
  
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    append: XFrame => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryFrames: Double => SafeArray[XFrame],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: XFrame => Unit
  ): XFrames = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), append = js.Any.fromFunction1(append), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryFrames = js.Any.fromFunction1(queryFrames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[XFrames]
  }
  
  @scala.inline
  implicit class XFramesMutableBuilder[Self <: XFrames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppend(value: XFrame => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryFrames(value: Double => SafeArray[XFrame]): Self = StObject.set(x, "queryFrames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: XFrame => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
