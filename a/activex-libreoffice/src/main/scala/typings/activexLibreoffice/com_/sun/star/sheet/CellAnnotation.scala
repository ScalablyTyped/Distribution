package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.text.XSimpleText
import typings.activexLibreoffice.com_.sun.star.text.XText
import typings.activexLibreoffice.com_.sun.star.text.XTextCursor
import typings.activexLibreoffice.com_.sun.star.text.XTextRange
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a cell annotation object attached to a spreadsheet cell.
  * @see com.sun.star.sheet.SheetCell
  */
@js.native
trait CellAnnotation
  extends XSimpleText
     with XSheetAnnotation
     with XChild
     with XSheetAnnotationShapeSupplier

object CellAnnotation {
  @scala.inline
  def apply(
    AnnotationShape: XShape,
    Author: String,
    Date: String,
    End: XTextRange,
    IsVisible: Boolean,
    Parent: XInterface,
    Position: CellAddress,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    getAnnotationShape: () => XShape,
    getAuthor: () => String,
    getDate: () => String,
    getEnd: () => XTextRange,
    getIsVisible: () => Boolean,
    getParent: () => XInterface,
    getPosition: () => CellAddress,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    insertControlCharacter: (XTextRange, Double, Boolean) => Unit,
    insertString: (XTextRange, String, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setIsVisible: Boolean => Unit,
    setParent: XInterface => Unit,
    setString: String => Unit
  ): CellAnnotation = {
    val __obj = js.Dynamic.literal(AnnotationShape = AnnotationShape.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getAnnotationShape = js.Any.fromFunction0(getAnnotationShape), getAuthor = js.Any.fromFunction0(getAuthor), getDate = js.Any.fromFunction0(getDate), getEnd = js.Any.fromFunction0(getEnd), getIsVisible = js.Any.fromFunction0(getIsVisible), getParent = js.Any.fromFunction0(getParent), getPosition = js.Any.fromFunction0(getPosition), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setIsVisible = js.Any.fromFunction1(setIsVisible), setParent = js.Any.fromFunction1(setParent), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[CellAnnotation]
  }
}

