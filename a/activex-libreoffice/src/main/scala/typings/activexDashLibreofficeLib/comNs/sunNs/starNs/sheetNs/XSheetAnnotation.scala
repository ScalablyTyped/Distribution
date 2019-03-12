package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to query data of the annotation and to show and hide it.
  * @see com.sun.star.sheet.CellAnnotation
  */
trait XSheetAnnotation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the name of the user who last changed the annotation. */
  val Author: java.lang.String
  /** returns a formatted string representing the date when the annotation was last changed. */
  val Date: java.lang.String
  /** returns, whether the annotation is permanently visible. */
  var IsVisible: scala.Boolean
  /** returns the position of cell in the spreadsheet document that contains this annotation. */
  val Position: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  /** returns the name of the user who last changed the annotation. */
  def getAuthor(): java.lang.String
  /** returns a formatted string representing the date when the annotation was last changed. */
  def getDate(): java.lang.String
  /** returns, whether the annotation is permanently visible. */
  def getIsVisible(): scala.Boolean
  /** returns the position of cell in the spreadsheet document that contains this annotation. */
  def getPosition(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  /** specifies whether the annotation is permanently visible. */
  def setIsVisible(bIsVisible: scala.Boolean): scala.Unit
}

object XSheetAnnotation {
  @scala.inline
  def apply(
    Author: java.lang.String,
    Date: java.lang.String,
    IsVisible: scala.Boolean,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    acquire: () => scala.Unit,
    getAuthor: () => java.lang.String,
    getDate: () => java.lang.String,
    getIsVisible: () => scala.Boolean,
    getPosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setIsVisible: scala.Boolean => scala.Unit
  ): XSheetAnnotation = {
    val __obj = js.Dynamic.literal(Author = Author, Date = Date, IsVisible = IsVisible, Position = Position, acquire = js.Any.fromFunction0(acquire), getAuthor = js.Any.fromFunction0(getAuthor), getDate = js.Any.fromFunction0(getDate), getIsVisible = js.Any.fromFunction0(getIsVisible), getPosition = js.Any.fromFunction0(getPosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setIsVisible = js.Any.fromFunction1(setIsVisible))
  
    __obj.asInstanceOf[XSheetAnnotation]
  }
}

