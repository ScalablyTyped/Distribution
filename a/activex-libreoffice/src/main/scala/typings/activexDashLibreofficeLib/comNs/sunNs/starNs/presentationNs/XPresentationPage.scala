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
    acquire: js.Function0[scala.Unit],
    add: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getNotesPage: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, scala.Unit]
  ): XPresentationPage = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, NotesPage = NotesPage, acquire = acquire, add = add, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, getNotesPage = getNotesPage, hasElements = hasElements, queryInterface = queryInterface, release = release, remove = remove)
  
    __obj.asInstanceOf[XPresentationPage]
  }
}

