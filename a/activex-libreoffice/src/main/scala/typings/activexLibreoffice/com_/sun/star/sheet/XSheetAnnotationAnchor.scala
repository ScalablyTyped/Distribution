package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a cell annotation attached to a spreadsheet cell.
  * @see com.sun.star.sheet.SheetCell
  * @see com.sun.star.sheet.CellAnnotation
  */
@js.native
trait XSheetAnnotationAnchor extends XInterface {
  /** returns the annotation at this anchor. */
  val Annotation: XSheetAnnotation = js.native
  /** returns the annotation at this anchor. */
  def getAnnotation(): XSheetAnnotation = js.native
}

object XSheetAnnotationAnchor {
  @scala.inline
  def apply(
    Annotation: XSheetAnnotation,
    acquire: () => Unit,
    getAnnotation: () => XSheetAnnotation,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetAnnotationAnchor = {
    val __obj = js.Dynamic.literal(Annotation = Annotation.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAnnotation = js.Any.fromFunction0(getAnnotation), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetAnnotationAnchor]
  }
  @scala.inline
  implicit class XSheetAnnotationAnchorOps[Self <: XSheetAnnotationAnchor] (val x: Self) extends AnyVal {
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
    def setAnnotation(value: XSheetAnnotation): Self = this.set("Annotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAnnotation(value: () => XSheetAnnotation): Self = this.set("getAnnotation", js.Any.fromFunction0(value))
  }
  
}

