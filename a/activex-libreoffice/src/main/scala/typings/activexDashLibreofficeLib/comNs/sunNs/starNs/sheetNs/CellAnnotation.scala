package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a cell annotation object attached to a spreadsheet cell.
  * @see com.sun.star.sheet.SheetCell
  */
trait CellAnnotation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XSimpleText
     with XSheetAnnotation
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild
     with XSheetAnnotationShapeSupplier

object CellAnnotation {
  @scala.inline
  def apply(
    AnnotationShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    Author: java.lang.String,
    Date: java.lang.String,
    End: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    IsVisible: scala.Boolean,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    Start: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    String: java.lang.String,
    acquire: () => scala.Unit,
    createTextCursor: () => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextCursor,
    createTextCursorByRange: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextCursor,
    getAnnotationShape: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getAuthor: () => java.lang.String,
    getDate: () => java.lang.String,
    getEnd: () => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    getIsVisible: () => scala.Boolean,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getPosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    getStart: () => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    getString: () => java.lang.String,
    getText: () => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
    insertControlCharacter: (activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, scala.Double, scala.Boolean) => scala.Unit,
    insertString: (activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, java.lang.String, scala.Boolean) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setIsVisible: scala.Boolean => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setString: java.lang.String => scala.Unit
  ): CellAnnotation = {
    val __obj = js.Dynamic.literal(AnnotationShape = AnnotationShape, Author = Author, Date = Date, End = End, IsVisible = IsVisible, Parent = Parent, Position = Position, Start = Start, String = String, acquire = js.Any.fromFunction0(acquire), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getAnnotationShape = js.Any.fromFunction0(getAnnotationShape), getAuthor = js.Any.fromFunction0(getAuthor), getDate = js.Any.fromFunction0(getDate), getEnd = js.Any.fromFunction0(getEnd), getIsVisible = js.Any.fromFunction0(getIsVisible), getParent = js.Any.fromFunction0(getParent), getPosition = js.Any.fromFunction0(getPosition), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setIsVisible = js.Any.fromFunction1(setIsVisible), setParent = js.Any.fromFunction1(setParent), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[CellAnnotation]
  }
}

