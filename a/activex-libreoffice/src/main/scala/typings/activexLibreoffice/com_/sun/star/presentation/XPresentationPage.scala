package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.drawing.XShapes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a page from a presentation.
  * @see com.sun.star.drawing.DrawPage
  */
trait XPresentationPage
  extends StObject
     with XShapes {
  
  /**
    * return the note page from the current page in the presentation, the name for the note page in the user interface note view, and one of the views from
    * a presentation page.
    */
  val NotesPage: XDrawPage
  
  /**
    * return the note page from the current page in the presentation, the name for the note page in the user interface note view, and one of the views from
    * a presentation page.
    */
  def getNotesPage(): XDrawPage
}
object XPresentationPage {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    NotesPage: XDrawPage,
    acquire: () => Unit,
    add: XShape => Unit,
    getByIndex: Double => Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getNotesPage: () => XDrawPage,
    hasElements: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    remove: XShape => Unit
  ): XPresentationPage = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], NotesPage = NotesPage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction1(add), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getNotesPage = js.Any.fromFunction0(getNotesPage), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[XPresentationPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPresentationPage] (val x: Self) extends AnyVal {
    
    inline def setGetNotesPage(value: () => XDrawPage): Self = StObject.set(x, "getNotesPage", js.Any.fromFunction0(value))
    
    inline def setNotesPage(value: XDrawPage): Self = StObject.set(x, "NotesPage", value.asInstanceOf[js.Any])
  }
}
