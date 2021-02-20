package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalculatedMember extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  val DisplayFolder: String = js.native
  
  val Dynamic: Boolean = js.native
  
  @JSName("Excel.CalculatedMember_typekey")
  var ExcelDotCalculatedMember_typekey: CalculatedMember = js.native
  
  var FlattenHierarchies: Boolean = js.native
  
  val Formula: String = js.native
  
  var HierarchizeDistinct: Boolean = js.native
  
  val IsValid: Boolean = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val SolveOrder: Double = js.native
  
  val SourceName: String = js.native
  
  val Type: XlCalculatedMemberType = js.native
  
  val _Default: String = js.native
}
object CalculatedMember {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    DisplayFolder: String,
    Dynamic: Boolean,
    ExcelDotCalculatedMember_typekey: CalculatedMember,
    FlattenHierarchies: Boolean,
    Formula: String,
    HierarchizeDistinct: Boolean,
    IsValid: Boolean,
    Name: String,
    Parent: js.Any,
    SolveOrder: Double,
    SourceName: String,
    Type: XlCalculatedMemberType,
    _Default: String
  ): CalculatedMember = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayFolder = DisplayFolder.asInstanceOf[js.Any], Dynamic = Dynamic.asInstanceOf[js.Any], FlattenHierarchies = FlattenHierarchies.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], HierarchizeDistinct = HierarchizeDistinct.asInstanceOf[js.Any], IsValid = IsValid.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SolveOrder = SolveOrder.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.CalculatedMember_typekey")(ExcelDotCalculatedMember_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedMember]
  }
  
  @scala.inline
  implicit class CalculatedMemberMutableBuilder[Self <: CalculatedMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplayFolder(value: String): Self = StObject.set(x, "DisplayFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamic(value: Boolean): Self = StObject.set(x, "Dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotCalculatedMember_typekey(value: CalculatedMember): Self = StObject.set(x, "Excel.CalculatedMember_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenHierarchies(value: Boolean): Self = StObject.set(x, "FlattenHierarchies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchizeDistinct(value: Boolean): Self = StObject.set(x, "HierarchizeDistinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "IsValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolveOrder(value: Double): Self = StObject.set(x, "SolveOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceName(value: String): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: XlCalculatedMemberType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Default(value: String): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
