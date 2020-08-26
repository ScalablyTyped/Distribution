package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.drawing.XShapes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a page from a presentation.
  * @see com.sun.star.drawing.DrawPage
  */
@js.native
trait XPresentationPage extends XShapes {
  /**
    * return the note page from the current page in the presentation, the name for the note page in the user interface note view, and one of the views from
    * a presentation page.
    */
  val NotesPage: XDrawPage = js.native
  /**
    * return the note page from the current page in the presentation, the name for the note page in the user interface note view, and one of the views from
    * a presentation page.
    */
  def getNotesPage(): XDrawPage = js.native
}

object XPresentationPage {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    NotesPage: XDrawPage,
    acquire: () => Unit,
    add: XShape => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getNotesPage: () => XDrawPage,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: XShape => Unit
  ): XPresentationPage = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], NotesPage = NotesPage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction1(add), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getNotesPage = js.Any.fromFunction0(getNotesPage), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[XPresentationPage]
  }
  @scala.inline
  implicit class XPresentationPageOps[Self <: XPresentationPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNotesPage(value: XDrawPage): Self = this.set("NotesPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetNotesPage(value: () => XDrawPage): Self = this.set("getNotesPage", js.Any.fromFunction0(value))
  }
  
}

