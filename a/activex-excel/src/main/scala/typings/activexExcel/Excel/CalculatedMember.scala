package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedMember extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
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
  def Delete(): Unit = js.native
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
  implicit class CalculatedMemberOps[Self <: CalculatedMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setDisplayFolder(value: String): Self = this.set("DisplayFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamic(value: Boolean): Self = this.set("Dynamic", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotCalculatedMember_typekey(value: CalculatedMember): Self = this.set("Excel.CalculatedMember_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlattenHierarchies(value: Boolean): Self = this.set("FlattenHierarchies", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormula(value: String): Self = this.set("Formula", value.asInstanceOf[js.Any])
    @scala.inline
    def setHierarchizeDistinct(value: Boolean): Self = this.set("HierarchizeDistinct", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("IsValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSolveOrder(value: Double): Self = this.set("SolveOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceName(value: String): Self = this.set("SourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: XlCalculatedMemberType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_Default(value: String): Self = this.set("_Default", value.asInstanceOf[js.Any])
  }
  
}

