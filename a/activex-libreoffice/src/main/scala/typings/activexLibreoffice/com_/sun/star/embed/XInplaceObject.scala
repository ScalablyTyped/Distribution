package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.KeyEvent
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents common functionality for inplace embedded objects. */
trait XInplaceObject
  extends StObject
     with XInterface {
  
  /**
    * enables or disables modeless dialogs of the object.
    *
    * In case container wants to show a modal dialog it should disable modeless of embedded object dialogs with this call. Later the same call can be used
    * to enable it.
    * @param bEnable `TRUE` to enable object modeless `FALSE` to disable it
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def enableModeless(bEnable: Boolean): Unit
  
  /**
    * sets the visible part of the inplace object.
    *
    * Both rectangles are provided in object's parent window coordinates in pixels. The intersection of rectangles specifies the visible part of the object.
    * In case the position window has a size that is different from object's visual area size, the object should either scale or deactivate.
    *
    * The method must activate object repainting.
    * @param aPosRect specifies a new position rectangle
    * @param aClipRect specifies a new clip rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in invalid state
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def setObjectRectangles(aPosRect: Rectangle, aClipRect: Rectangle): Unit
  
  /**
    * provides accelerator table the container wants to use during inplace editing.
    * @returns an accelerator table from container
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state
    */
  def translateAccelerators(aKeys: SeqEquiv[KeyEvent]): Unit
}
object XInplaceObject {
  
  inline def apply(
    acquire: () => Unit,
    enableModeless: Boolean => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    setObjectRectangles: (Rectangle, Rectangle) => Unit,
    translateAccelerators: SeqEquiv[KeyEvent] => Unit
  ): XInplaceObject = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), enableModeless = js.Any.fromFunction1(enableModeless), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setObjectRectangles = js.Any.fromFunction2(setObjectRectangles), translateAccelerators = js.Any.fromFunction1(translateAccelerators))
    __obj.asInstanceOf[XInplaceObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XInplaceObject] (val x: Self) extends AnyVal {
    
    inline def setEnableModeless(value: Boolean => Unit): Self = StObject.set(x, "enableModeless", js.Any.fromFunction1(value))
    
    inline def setSetObjectRectangles(value: (Rectangle, Rectangle) => Unit): Self = StObject.set(x, "setObjectRectangles", js.Any.fromFunction2(value))
    
    inline def setTranslateAccelerators(value: SeqEquiv[KeyEvent] => Unit): Self = StObject.set(x, "translateAccelerators", js.Any.fromFunction1(value))
  }
}
