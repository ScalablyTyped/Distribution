package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows converting selections of text to frames or tables. */
trait XTextConvert
  extends StObject
     with XInterface {
  
  /**
    * converts the paragraphs marked in TableRanges into a table.
    * @param TableRanges contains the {@link TextRange} interfaces of the paragraphs, cells and rows of the table. The inner sequence contains the start and e
    * @param CellProperties contains the properties of each cell.
    * @param RowProperties contains the properties of each table row.
    * @param TableProperties contains the properties of the table.
    * @returns the created table.
    */
  def convertToTable(
    TableRanges: SeqEquiv[SeqEquiv[sequence[XTextRange]]],
    CellProperties: SeqEquiv[SeqEquiv[PropertyValues]],
    RowProperties: SeqEquiv[PropertyValues],
    TableProperties: PropertyValues
  ): XTextTable
  
  /**
    * moves the paragraphs from Start to End into a text frame.
    * @param Start start position of frame content
    * @param End end position of frame content
    * @param FrameProperties contains the properties of the to-be-created text frame
    * @returns the newly created text frame
    */
  def convertToTextFrame(Start: XTextRange, End: XTextRange, FrameProperties: PropertyValues): XTextContent
}
object XTextConvert {
  
  inline def apply(
    acquire: () => Unit,
    convertToTable: (SeqEquiv[SeqEquiv[sequence[XTextRange]]], SeqEquiv[SeqEquiv[PropertyValues]], SeqEquiv[PropertyValues], PropertyValues) => XTextTable,
    convertToTextFrame: (XTextRange, XTextRange, PropertyValues) => XTextContent,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XTextConvert = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertToTable = js.Any.fromFunction4(convertToTable), convertToTextFrame = js.Any.fromFunction3(convertToTextFrame), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextConvert]
  }
  
  extension [Self <: XTextConvert](x: Self) {
    
    inline def setConvertToTable(
      value: (SeqEquiv[SeqEquiv[sequence[XTextRange]]], SeqEquiv[SeqEquiv[PropertyValues]], SeqEquiv[PropertyValues], PropertyValues) => XTextTable
    ): Self = StObject.set(x, "convertToTable", js.Any.fromFunction4(value))
    
    inline def setConvertToTextFrame(value: (XTextRange, XTextRange, PropertyValues) => XTextContent): Self = StObject.set(x, "convertToTextFrame", js.Any.fromFunction3(value))
  }
}
