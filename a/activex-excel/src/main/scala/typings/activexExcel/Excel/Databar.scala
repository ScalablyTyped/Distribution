package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Databar extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  def AppliesTo(Address: String): Range
  def AppliesTo(RowIndex: Double): Range
  def AppliesTo(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("AppliesTo")
  val AppliesTo_Original: Range
  
  val AxisColor: FormatColor
  
  var AxisPosition: XlDataBarAxisPosition
  
  val BarBorder: DataBarBorder
  
  val BarColor: FormatColor
  
  var BarFillType: XlDataBarFillType
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  var Direction: Double
  
  /* private */ @JSName("Excel.Databar_typekey")
  var ExcelDotDatabar_typekey: Databar
  
  var Formula: String
  
  val MaxPoint: ConditionValue
  
  val MinPoint: ConditionValue
  
  def ModifyAppliesToRange(Range: Range): Unit
  
  val NegativeBarFormat: typings.activexExcel.Excel.NegativeBarFormat
  
  val PTCondition: Boolean
  
  val Parent: Any
  
  var PercentMax: Double
  
  var PercentMin: Double
  
  var Priority: Double
  
  var ScopeType: XlPivotConditionScope
  
  def SetFirstPriority(): Unit
  
  def SetLastPriority(): Unit
  
  var ShowValue: Boolean
  
  val StopIfTrue: Boolean
  
  val Type: Double
}
object Databar {
  
  inline def apply(
    Application: Application,
    AppliesTo: Range,
    AxisColor: FormatColor,
    AxisPosition: XlDataBarAxisPosition,
    BarBorder: DataBarBorder,
    BarColor: FormatColor,
    BarFillType: XlDataBarFillType,
    Creator: XlCreator,
    Delete: () => Unit,
    Direction: Double,
    ExcelDotDatabar_typekey: Databar,
    Formula: String,
    MaxPoint: ConditionValue,
    MinPoint: ConditionValue,
    ModifyAppliesToRange: Range => Unit,
    NegativeBarFormat: NegativeBarFormat,
    PTCondition: Boolean,
    Parent: Any,
    PercentMax: Double,
    PercentMin: Double,
    Priority: Double,
    ScopeType: XlPivotConditionScope,
    SetFirstPriority: () => Unit,
    SetLastPriority: () => Unit,
    ShowValue: Boolean,
    StopIfTrue: Boolean,
    Type: Double
  ): Databar = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AppliesTo = AppliesTo.asInstanceOf[js.Any], AxisColor = AxisColor.asInstanceOf[js.Any], AxisPosition = AxisPosition.asInstanceOf[js.Any], BarBorder = BarBorder.asInstanceOf[js.Any], BarColor = BarColor.asInstanceOf[js.Any], BarFillType = BarFillType.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Direction = Direction.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], MaxPoint = MaxPoint.asInstanceOf[js.Any], MinPoint = MinPoint.asInstanceOf[js.Any], ModifyAppliesToRange = js.Any.fromFunction1(ModifyAppliesToRange), NegativeBarFormat = NegativeBarFormat.asInstanceOf[js.Any], PTCondition = PTCondition.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PercentMax = PercentMax.asInstanceOf[js.Any], PercentMin = PercentMin.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], ScopeType = ScopeType.asInstanceOf[js.Any], SetFirstPriority = js.Any.fromFunction0(SetFirstPriority), SetLastPriority = js.Any.fromFunction0(SetLastPriority), ShowValue = ShowValue.asInstanceOf[js.Any], StopIfTrue = StopIfTrue.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Databar_typekey")(ExcelDotDatabar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Databar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Databar] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAppliesTo(value: Range): Self = StObject.set(x, "AppliesTo", value.asInstanceOf[js.Any])
    
    inline def setAxisColor(value: FormatColor): Self = StObject.set(x, "AxisColor", value.asInstanceOf[js.Any])
    
    inline def setAxisPosition(value: XlDataBarAxisPosition): Self = StObject.set(x, "AxisPosition", value.asInstanceOf[js.Any])
    
    inline def setBarBorder(value: DataBarBorder): Self = StObject.set(x, "BarBorder", value.asInstanceOf[js.Any])
    
    inline def setBarColor(value: FormatColor): Self = StObject.set(x, "BarColor", value.asInstanceOf[js.Any])
    
    inline def setBarFillType(value: XlDataBarFillType): Self = StObject.set(x, "BarFillType", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDirection(value: Double): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setExcelDotDatabar_typekey(value: Databar): Self = StObject.set(x, "Excel.Databar_typekey", value.asInstanceOf[js.Any])
    
    inline def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    inline def setMaxPoint(value: ConditionValue): Self = StObject.set(x, "MaxPoint", value.asInstanceOf[js.Any])
    
    inline def setMinPoint(value: ConditionValue): Self = StObject.set(x, "MinPoint", value.asInstanceOf[js.Any])
    
    inline def setModifyAppliesToRange(value: Range => Unit): Self = StObject.set(x, "ModifyAppliesToRange", js.Any.fromFunction1(value))
    
    inline def setNegativeBarFormat(value: NegativeBarFormat): Self = StObject.set(x, "NegativeBarFormat", value.asInstanceOf[js.Any])
    
    inline def setPTCondition(value: Boolean): Self = StObject.set(x, "PTCondition", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPercentMax(value: Double): Self = StObject.set(x, "PercentMax", value.asInstanceOf[js.Any])
    
    inline def setPercentMin(value: Double): Self = StObject.set(x, "PercentMin", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setScopeType(value: XlPivotConditionScope): Self = StObject.set(x, "ScopeType", value.asInstanceOf[js.Any])
    
    inline def setSetFirstPriority(value: () => Unit): Self = StObject.set(x, "SetFirstPriority", js.Any.fromFunction0(value))
    
    inline def setSetLastPriority(value: () => Unit): Self = StObject.set(x, "SetLastPriority", js.Any.fromFunction0(value))
    
    inline def setShowValue(value: Boolean): Self = StObject.set(x, "ShowValue", value.asInstanceOf[js.Any])
    
    inline def setStopIfTrue(value: Boolean): Self = StObject.set(x, "StopIfTrue", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
