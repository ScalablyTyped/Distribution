package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sheet.FormulaToken
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface specific to spreadsheet data provider backend. */
trait XSheetDataProvider
  extends StObject
     with XInterface {
  
  def createDataSequenceByFormulaTokens(aTokens: SeqEquiv[FormulaToken]): XDataSequence
  
  def createDataSequenceByFormulaTokensPossible(aTokens: SeqEquiv[FormulaToken]): Boolean
}
object XSheetDataProvider {
  
  inline def apply(
    acquire: () => Unit,
    createDataSequenceByFormulaTokens: SeqEquiv[FormulaToken] => XDataSequence,
    createDataSequenceByFormulaTokensPossible: SeqEquiv[FormulaToken] => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetDataProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDataSequenceByFormulaTokens = js.Any.fromFunction1(createDataSequenceByFormulaTokens), createDataSequenceByFormulaTokensPossible = js.Any.fromFunction1(createDataSequenceByFormulaTokensPossible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetDataProvider]
  }
  
  extension [Self <: XSheetDataProvider](x: Self) {
    
    inline def setCreateDataSequenceByFormulaTokens(value: SeqEquiv[FormulaToken] => XDataSequence): Self = StObject.set(x, "createDataSequenceByFormulaTokens", js.Any.fromFunction1(value))
    
    inline def setCreateDataSequenceByFormulaTokensPossible(value: SeqEquiv[FormulaToken] => Boolean): Self = StObject.set(x, "createDataSequenceByFormulaTokensPossible", js.Any.fromFunction1(value))
  }
}
