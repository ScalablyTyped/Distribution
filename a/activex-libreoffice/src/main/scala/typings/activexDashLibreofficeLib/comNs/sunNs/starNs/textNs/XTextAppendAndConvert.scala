package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** merges the functions of {@link XTextAppend} , {@link XTextContentAppend} and {@link XTextConvert} . */
trait XTextAppendAndConvert
  extends XTextAppend
     with XTextContentAppend
     with XTextConvert

object XTextAppendAndConvert {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: java.lang.String,
    acquire: js.Function0[scala.Unit],
    appendTextContent: js.Function2[
      XTextContent, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XTextRange
    ],
    appendTextPortion: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XTextRange
    ],
    convertToTable: js.Function4[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
        activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.sequence[XTextRange]]
      ], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
        activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues]
      ], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XTextTable
    ],
    convertToTextFrame: js.Function3[
      XTextRange, 
      XTextRange, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XTextContent
    ],
    createTextCursor: js.Function0[XTextCursor],
    createTextCursorByRange: js.Function1[XTextRange, XTextCursor],
    finishParagraph: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, XTextRange],
    finishParagraphInsert: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XTextRange, 
      XTextRange
    ],
    getEnd: js.Function0[XTextRange],
    getStart: js.Function0[XTextRange],
    getString: js.Function0[java.lang.String],
    getText: js.Function0[XText],
    insertControlCharacter: js.Function3[XTextRange, scala.Double, scala.Boolean, scala.Unit],
    insertString: js.Function3[XTextRange, java.lang.String, scala.Boolean, scala.Unit],
    insertTextContent: js.Function3[XTextRange, XTextContent, scala.Boolean, scala.Unit],
    insertTextContentWithProperties: js.Function3[
      XTextContent, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XTextRange, 
      XTextRange
    ],
    insertTextPortion: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XTextRange, 
      XTextRange
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeTextContent: js.Function1[XTextContent, scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): XTextAppendAndConvert = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("End")(End)
    __obj.updateDynamic("Start")(Start)
    __obj.updateDynamic("String")(String)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("appendTextContent")(appendTextContent)
    __obj.updateDynamic("appendTextPortion")(appendTextPortion)
    __obj.updateDynamic("convertToTable")(convertToTable)
    __obj.updateDynamic("convertToTextFrame")(convertToTextFrame)
    __obj.updateDynamic("createTextCursor")(createTextCursor)
    __obj.updateDynamic("createTextCursorByRange")(createTextCursorByRange)
    __obj.updateDynamic("finishParagraph")(finishParagraph)
    __obj.updateDynamic("finishParagraphInsert")(finishParagraphInsert)
    __obj.updateDynamic("getEnd")(getEnd)
    __obj.updateDynamic("getStart")(getStart)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("insertControlCharacter")(insertControlCharacter)
    __obj.updateDynamic("insertString")(insertString)
    __obj.updateDynamic("insertTextContent")(insertTextContent)
    __obj.updateDynamic("insertTextContentWithProperties")(insertTextContentWithProperties)
    __obj.updateDynamic("insertTextPortion")(insertTextPortion)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeTextContent")(removeTextContent)
    __obj.updateDynamic("setString")(setString)
    __obj.asInstanceOf[XTextAppendAndConvert]
  }
}

