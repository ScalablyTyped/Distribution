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
    acquire: js.Function0[scala.Unit],
    getAuthor: js.Function0[java.lang.String],
    getDate: js.Function0[java.lang.String],
    getIsVisible: js.Function0[scala.Boolean],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setIsVisible: js.Function1[scala.Boolean, scala.Unit]
  ): XSheetAnnotation = {
    val __obj = js.Dynamic.literal(Author = Author, Date = Date, IsVisible = IsVisible, Position = Position, acquire = acquire, getAuthor = getAuthor, getDate = getDate, getIsVisible = getIsVisible, getPosition = getPosition, queryInterface = queryInterface, release = release, setIsVisible = setIsVisible)
  
    __obj.asInstanceOf[XSheetAnnotation]
  }
}

