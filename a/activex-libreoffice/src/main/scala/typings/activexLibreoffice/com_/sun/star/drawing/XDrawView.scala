package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is implemented by views that display {@link DrawPages} or {@link MasterPages} . */
trait XDrawView
  extends StObject
     with XInterface {
  
  /**
    * returns the current page.
    * @returns the {@link DrawPage} or {@link MasterPage} that is currently displayed.
    */
  var CurrentPage: XDrawPage
  
  /**
    * returns the current page.
    * @returns the {@link DrawPage} or {@link MasterPage} that is currently displayed.
    */
  def getCurrentPage(): XDrawPage
  
  /**
    * changes the current page.
    * @param xPage this {@link DrawPage} or {@link MasterPage} will be displayed inside this view.
    */
  def setCurrentPage(xPage: XDrawPage): Unit
}
object XDrawView {
  
  inline def apply(
    CurrentPage: XDrawPage,
    acquire: () => Unit,
    getCurrentPage: () => XDrawPage,
    queryInterface: `type` => Any,
    release: () => Unit,
    setCurrentPage: XDrawPage => Unit
  ): XDrawView = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCurrentPage = js.Any.fromFunction0(getCurrentPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentPage = js.Any.fromFunction1(setCurrentPage))
    __obj.asInstanceOf[XDrawView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDrawView] (val x: Self) extends AnyVal {
    
    inline def setCurrentPage(value: XDrawPage): Self = StObject.set(x, "CurrentPage", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentPage(value: () => XDrawPage): Self = StObject.set(x, "getCurrentPage", js.Any.fromFunction0(value))
    
    inline def setSetCurrentPage(value: XDrawPage => Unit): Self = StObject.set(x, "setCurrentPage", js.Any.fromFunction1(value))
  }
}
