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
    acquire: js.Function0[scala.Unit],
    createTextCursor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextCursor],
    createTextCursorByRange: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextCursor
    ],
    getAnnotationShape: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getAuthor: js.Function0[java.lang.String],
    getDate: js.Function0[java.lang.String],
    getEnd: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange],
    getIsVisible: js.Function0[scala.Boolean],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress],
    getStart: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange],
    getString: js.Function0[java.lang.String],
    getText: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText],
    insertControlCharacter: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, 
      scala.Double, 
      scala.Boolean, 
      scala.Unit
    ],
    insertString: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, 
      java.lang.String, 
      scala.Boolean, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setIsVisible: js.Function1[scala.Boolean, scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): CellAnnotation = {
    val __obj = js.Dynamic.literal(AnnotationShape = AnnotationShape, Author = Author, Date = Date, End = End, IsVisible = IsVisible, Parent = Parent, Position = Position, Start = Start, String = String, acquire = acquire, createTextCursor = createTextCursor, createTextCursorByRange = createTextCursorByRange, getAnnotationShape = getAnnotationShape, getAuthor = getAuthor, getDate = getDate, getEnd = getEnd, getIsVisible = getIsVisible, getParent = getParent, getPosition = getPosition, getStart = getStart, getString = getString, getText = getText, insertControlCharacter = insertControlCharacter, insertString = insertString, queryInterface = queryInterface, release = release, setIsVisible = setIsVisible, setParent = setParent, setString = setString)
  
    __obj.asInstanceOf[CellAnnotation]
  }
}

