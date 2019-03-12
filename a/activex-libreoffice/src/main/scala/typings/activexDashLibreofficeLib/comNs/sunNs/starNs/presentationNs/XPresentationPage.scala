package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a page from a presentation.
  * @see com.sun.star.drawing.DrawPage
  */
trait XPresentationPage
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapes {
  /**
    * return the note page from the current page in the presentation, the name for the note page in the user interface note view, and one of the views from
    * a presentation page.
    */
  val NotesPage: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage
  /**
    * return the note page from the current page in the presentation, the name for the note page in the user interface note view, and one of the views from
    * a presentation page.
    */
  def getNotesPage(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage
}

object XPresentationPage {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    NotesPage: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    acquire: () => scala.Unit,
    add: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape => scala.Unit,
    getByIndex: scala.Double => js.Any,
    getCount: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getNotesPage: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    remove: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape => scala.Unit
  ): XPresentationPage = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, NotesPage = NotesPage, acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction1(add), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getNotesPage = js.Any.fromFunction0(getNotesPage), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[XPresentationPage]
  }
}

