package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the possibility of setting and retrieving the position of the current cell in a grid control.
  *
  * Note that a grid control does not allow free control over the current row: In such a control, every line represents a row of data of the underlying
  * {@link com.sun.star.form.component.DataForm} . Thus, the **current row** of the grid control always equals the current row of the {@link
  * com.sun.star.form.component.DataForm} , and can be affected only by changing the latter. ;  The current column of a grid control, whoever, can be
  * freely controlled.
  * @deprecated Deprecated
  * @see com.sun.star.form.component.GridControl
  * @see com.sun.star.form.control.GridControl
  */
@js.native
trait XGrid extends XInterface {
  
  /** retrieves the current column position. */
  var CurrentColumnPosition: Double = js.native
  
  /** retrieves the current column position. */
  def getCurrentColumnPosition(): Double = js.native
  
  /** sets the current column position. */
  def setCurrentColumnPosition(nPos: Double): Unit = js.native
}
object XGrid {
  
  @scala.inline
  def apply(
    CurrentColumnPosition: Double,
    acquire: () => Unit,
    getCurrentColumnPosition: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCurrentColumnPosition: Double => Unit
  ): XGrid = {
    val __obj = js.Dynamic.literal(CurrentColumnPosition = CurrentColumnPosition.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCurrentColumnPosition = js.Any.fromFunction0(getCurrentColumnPosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentColumnPosition = js.Any.fromFunction1(setCurrentColumnPosition))
    __obj.asInstanceOf[XGrid]
  }
  
  @scala.inline
  implicit class XGridMutableBuilder[Self <: XGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentColumnPosition(value: Double): Self = StObject.set(x, "CurrentColumnPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurrentColumnPosition(value: () => Double): Self = StObject.set(x, "getCurrentColumnPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCurrentColumnPosition(value: Double => Unit): Self = StObject.set(x, "setCurrentColumnPosition", js.Any.fromFunction1(value))
  }
}
