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
@js.native
trait XSheetAnnotation extends XInterface {
  /** returns the name of the user who last changed the annotation. */
  val Author: String = js.native
  /** returns a formatted string representing the date when the annotation was last changed. */
  val Date: String = js.native
  /** returns, whether the annotation is permanently visible. */
  var IsVisible: Boolean = js.native
  /** returns the position of cell in the spreadsheet document that contains this annotation. */
  val Position: CellAddress = js.native
  /** returns the name of the user who last changed the annotation. */
  def getAuthor(): String = js.native
  /** returns a formatted string representing the date when the annotation was last changed. */
  def getDate(): String = js.native
  /** returns, whether the annotation is permanently visible. */
  def getIsVisible(): Boolean = js.native
  /** returns the position of cell in the spreadsheet document that contains this annotation. */
  def getPosition(): CellAddress = js.native
  /** specifies whether the annotation is permanently visible. */
  def setIsVisible(bIsVisible: Boolean): Unit = js.native
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
  @scala.inline
  implicit class XSheetAnnotationOps[Self <: XSheetAnnotation] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String): Self = this.set("Author", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: String): Self = this.set("Date", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("IsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: CellAddress): Self = this.set("Position", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAuthor(value: () => String): Self = this.set("getAuthor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDate(value: () => String): Self = this.set("getDate", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIsVisible(value: () => Boolean): Self = this.set("getIsVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPosition(value: () => CellAddress): Self = this.set("getPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setSetIsVisible(value: Boolean => Unit): Self = this.set("setIsVisible", js.Any.fromFunction1(value))
  }
  
}

