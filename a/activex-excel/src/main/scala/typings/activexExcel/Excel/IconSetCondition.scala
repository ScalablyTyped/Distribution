package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconSetCondition extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  def AppliesTo(Address: String): Range
  def AppliesTo(RowIndex: Double): Range
  def AppliesTo(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("AppliesTo")
  val AppliesTo_Original: Range
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  @JSName("Excel.IconSetCondition_typekey")
  var ExcelDotIconSetCondition_typekey: IconSetCondition
  
  var Formula: String
  
  def IconCriteria(Index: Double): IconCriterion
  @JSName("IconCriteria")
  val IconCriteria_Original: IconCriteria
  
  def IconSet(Index: Double): typings.activexExcel.Excel.IconSet
  @JSName("IconSet")
  var IconSet_Original: IconSets
  
  def ModifyAppliesToRange(Range: Range): Unit
  
  val PTCondition: Boolean
  
  val Parent: js.Any
  
  var PercentileValues: Boolean
  
  var Priority: Double
  
  var ReverseOrder: Boolean
  
  var ScopeType: XlPivotConditionScope
  
  def SetFirstPriority(): Unit
  
  def SetLastPriority(): Unit
  
  var ShowIconOnly: Boolean
  
  val StopIfTrue: Boolean
  
  val Type: Double
}
object IconSetCondition {
  
  @scala.inline
  def apply(
    Application: Application,
    AppliesTo: Range,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotIconSetCondition_typekey: IconSetCondition,
    Formula: String,
    IconCriteria: IconCriteria,
    IconSet: IconSets,
    ModifyAppliesToRange: Range => Unit,
    PTCondition: Boolean,
    Parent: js.Any,
    PercentileValues: Boolean,
    Priority: Double,
    ReverseOrder: Boolean,
    ScopeType: XlPivotConditionScope,
    SetFirstPriority: () => Unit,
    SetLastPriority: () => Unit,
    ShowIconOnly: Boolean,
    StopIfTrue: Boolean,
    Type: Double
  ): IconSetCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AppliesTo = AppliesTo.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Formula = Formula.asInstanceOf[js.Any], IconCriteria = IconCriteria.asInstanceOf[js.Any], IconSet = IconSet.asInstanceOf[js.Any], ModifyAppliesToRange = js.Any.fromFunction1(ModifyAppliesToRange), PTCondition = PTCondition.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PercentileValues = PercentileValues.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], ReverseOrder = ReverseOrder.asInstanceOf[js.Any], ScopeType = ScopeType.asInstanceOf[js.Any], SetFirstPriority = js.Any.fromFunction0(SetFirstPriority), SetLastPriority = js.Any.fromFunction0(SetLastPriority), ShowIconOnly = ShowIconOnly.asInstanceOf[js.Any], StopIfTrue = StopIfTrue.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.IconSetCondition_typekey")(ExcelDotIconSetCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSetCondition]
  }
  
  @scala.inline
  implicit class IconSetConditionMutableBuilder[Self <: IconSetCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliesTo(value: Range): Self = StObject.set(x, "AppliesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcelDotIconSetCondition_typekey(value: IconSetCondition): Self = StObject.set(x, "Excel.IconSetCondition_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconCriteria(value: IconCriteria): Self = StObject.set(x, "IconCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSet(value: IconSets): Self = StObject.set(x, "IconSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyAppliesToRange(value: Range => Unit): Self = StObject.set(x, "ModifyAppliesToRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPTCondition(value: Boolean): Self = StObject.set(x, "PTCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentileValues(value: Boolean): Self = StObject.set(x, "PercentileValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseOrder(value: Boolean): Self = StObject.set(x, "ReverseOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeType(value: XlPivotConditionScope): Self = StObject.set(x, "ScopeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFirstPriority(value: () => Unit): Self = StObject.set(x, "SetFirstPriority", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLastPriority(value: () => Unit): Self = StObject.set(x, "SetLastPriority", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowIconOnly(value: Boolean): Self = StObject.set(x, "ShowIconOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopIfTrue(value: Boolean): Self = StObject.set(x, "StopIfTrue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
