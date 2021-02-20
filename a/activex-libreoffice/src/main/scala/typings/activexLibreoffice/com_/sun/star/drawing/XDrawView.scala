package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is implemented by views that display {@link DrawPages} or {@link MasterPages} . */
@js.native
trait XDrawView extends XInterface {
  
  /**
    * returns the current page.
    * @returns the {@link DrawPage} or {@link MasterPage} that is currently displayed.
    */
  var CurrentPage: XDrawPage = js.native
  
  /**
    * returns the current page.
    * @returns the {@link DrawPage} or {@link MasterPage} that is currently displayed.
    */
  def getCurrentPage(): XDrawPage = js.native
  
  /**
    * changes the current page.
    * @param xPage this {@link DrawPage} or {@link MasterPage} will be displayed inside this view.
    */
  def setCurrentPage(xPage: XDrawPage): Unit = js.native
}
object XDrawView {
  
  @scala.inline
  def apply(
    CurrentPage: XDrawPage,
    acquire: () => Unit,
    getCurrentPage: () => XDrawPage,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCurrentPage: XDrawPage => Unit
  ): XDrawView = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCurrentPage = js.Any.fromFunction0(getCurrentPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentPage = js.Any.fromFunction1(setCurrentPage))
    __obj.asInstanceOf[XDrawView]
  }
  
  @scala.inline
  implicit class XDrawViewMutableBuilder[Self <: XDrawView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPage(value: XDrawPage): Self = StObject.set(x, "CurrentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurrentPage(value: () => XDrawPage): Self = StObject.set(x, "getCurrentPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCurrentPage(value: XDrawPage => Unit): Self = StObject.set(x, "setCurrentPage", js.Any.fromFunction1(value))
  }
}
