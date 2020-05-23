package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalculatedMember extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  val DisplayFolder: String
  val Dynamic: Boolean
  @JSName("Excel.CalculatedMember_typekey")
  var ExcelDotCalculatedMember_typekey: CalculatedMember
  var FlattenHierarchies: Boolean
  val Formula: String
  var HierarchizeDistinct: Boolean
  val IsValid: Boolean
  val Name: String
  val Parent: js.Any
  val SolveOrder: Double
  val SourceName: String
  val Type: XlCalculatedMemberType
  val _Default: String
  def Delete(): Unit
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
}

