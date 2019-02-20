package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is for a page shape. A page shape displays a preview of another page. These shapes are used inside notes pages to preview the
  * corresponding drawing page. They're also used in the handout page to preview the printing position and order of pages
  */
trait PageShape extends Shape {
  /**
    * this is the page number that is used for the preview. For page shapes on notes pages, this can't be changed. For page shapes on handout pages, this
    * value only describes the relative order of the different page shapes on the page.
    */
  var PageNumber: scala.Double
}

