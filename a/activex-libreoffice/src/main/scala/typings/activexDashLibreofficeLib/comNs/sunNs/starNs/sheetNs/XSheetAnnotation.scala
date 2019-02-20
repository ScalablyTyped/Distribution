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

