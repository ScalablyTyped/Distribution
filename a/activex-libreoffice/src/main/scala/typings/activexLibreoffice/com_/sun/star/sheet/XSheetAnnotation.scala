package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to query data of the annotation and to show and hide it.
  * @see com.sun.star.sheet.CellAnnotation
  */
trait XSheetAnnotation extends XInterface {
  /** returns the name of the user who last changed the annotation. */
  val Author: String
  /** returns a formatted string representing the date when the annotation was last changed. */
  val Date: String
  /** returns, whether the annotation is permanently visible. */
  var IsVisible: Boolean
  /** returns the position of cell in the spreadsheet document that contains this annotation. */
  val Position: CellAddress
  /** returns the name of the user who last changed the annotation. */
  def getAuthor(): String
  /** returns a formatted string representing the date when the annotation was last changed. */
  def getDate(): String
  /** returns, whether the annotation is permanently visible. */
  def getIsVisible(): Boolean
  /** returns the position of cell in the spreadsheet document that contains this annotation. */
  def getPosition(): CellAddress
  /** specifies whether the annotation is permanently visible. */
  def setIsVisible(bIsVisible: Boolean): Unit
}

object XSheetAnnotation {
  @scala.inline
  def apply(
    Author: String,
    Date: String,
    IsVisible: Boolean,
    Position: CellAddress,
    acquire: () => Unit,
    getAuthor: () => String,
    getDate: () => String,
    getIsVisible: () => Boolean,
    getPosition: () => CellAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setIsVisible: Boolean => Unit
  ): XSheetAnnotation = {
    val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAuthor = js.Any.fromFunction0(getAuthor), getDate = js.Any.fromFunction0(getDate), getIsVisible = js.Any.fromFunction0(getIsVisible), getPosition = js.Any.fromFunction0(getPosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setIsVisible = js.Any.fromFunction1(setIsVisible))
    __obj.asInstanceOf[XSheetAnnotation]
  }
}

