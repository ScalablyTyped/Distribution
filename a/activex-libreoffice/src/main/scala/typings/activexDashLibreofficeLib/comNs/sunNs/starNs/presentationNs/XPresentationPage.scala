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

