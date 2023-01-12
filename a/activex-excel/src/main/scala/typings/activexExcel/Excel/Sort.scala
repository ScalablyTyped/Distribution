package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sort extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  def Apply(): Unit
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.Sort_typekey")
  var ExcelDotSort_typekey: Sort
  
  var Header: XlYesNoGuess
  
  var MatchCase: Boolean
  
  var Orientation: XlSortOrientation
  
  val Parent: Any
  
  def Rng(Address: String): Range
  def Rng(RowIndex: Double): Range
  def Rng(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("Rng")
  val Rng_Original: Range
  
  def SetRange(Rng: Range): Unit
  
  def SortFields(Index: Any): SortField
  @JSName("SortFields")
  val SortFields_Original: SortFields
  
  var SortMethod: XlSortMethod
}
object Sort {
  
  inline def apply(
    Application: Application,
    Apply: () => Unit,
    Creator: XlCreator,
    ExcelDotSort_typekey: Sort,
    Header: XlYesNoGuess,
    MatchCase: Boolean,
    Orientation: XlSortOrientation,
    Parent: Any,
    Rng: Range,
    SetRange: Range => Unit,
    SortFields: SortFields,
    SortMethod: XlSortMethod
  ): Sort = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), Creator = Creator.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], MatchCase = MatchCase.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Rng = Rng.asInstanceOf[js.Any], SetRange = js.Any.fromFunction1(SetRange), SortFields = SortFields.asInstanceOf[js.Any], SortMethod = SortMethod.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Sort_typekey")(ExcelDotSort_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sort] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApply(value: () => Unit): Self = StObject.set(x, "Apply", js.Any.fromFunction0(value))
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotSort_typekey(value: Sort): Self = StObject.set(x, "Excel.Sort_typekey", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: XlYesNoGuess): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setMatchCase(value: Boolean): Self = StObject.set(x, "MatchCase", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: XlSortOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRng(value: Range): Self = StObject.set(x, "Rng", value.asInstanceOf[js.Any])
    
    inline def setSetRange(value: Range => Unit): Self = StObject.set(x, "SetRange", js.Any.fromFunction1(value))
    
    inline def setSortFields(value: SortFields): Self = StObject.set(x, "SortFields", value.asInstanceOf[js.Any])
    
    inline def setSortMethod(value: XlSortMethod): Self = StObject.set(x, "SortMethod", value.asInstanceOf[js.Any])
  }
}
