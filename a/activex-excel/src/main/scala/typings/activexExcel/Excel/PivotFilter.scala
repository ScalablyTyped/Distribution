package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotFilter extends js.Object {
  val Active: Boolean
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  val DataCubeField: CubeField
  val DataField: typings.activexExcel.Excel.PivotField
  val Description: String
  @JSName("Excel.PivotFilter_typekey")
  var ExcelDotPivotFilter_typekey: PivotFilter
  val FilterType: XlPivotFilterType
  val IsMemberPropertyFilter: Boolean
  val MemberPropertyField: typings.activexExcel.Excel.PivotField
  val Name: String
  var Order: Double
  val Parent: js.Any
  val PivotField: typings.activexExcel.Excel.PivotField
  val Value1: js.Any
  val Value2: js.Any
  def Delete(): Unit
}

object PivotFilter {
  @scala.inline
  def apply(
    Active: Boolean,
    Application: Application,
    Creator: XlCreator,
    DataCubeField: CubeField,
    DataField: PivotField,
    Delete: () => Unit,
    Description: String,
    ExcelDotPivotFilter_typekey: PivotFilter,
    FilterType: XlPivotFilterType,
    IsMemberPropertyFilter: Boolean,
    MemberPropertyField: PivotField,
    Name: String,
    Order: Double,
    Parent: js.Any,
    PivotField: PivotField,
    Value1: js.Any,
    Value2: js.Any
  ): PivotFilter = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DataCubeField = DataCubeField.asInstanceOf[js.Any], DataField = DataField.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Description = Description.asInstanceOf[js.Any], FilterType = FilterType.asInstanceOf[js.Any], IsMemberPropertyFilter = IsMemberPropertyFilter.asInstanceOf[js.Any], MemberPropertyField = MemberPropertyField.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PivotField = PivotField.asInstanceOf[js.Any], Value1 = Value1.asInstanceOf[js.Any], Value2 = Value2.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.PivotFilter_typekey")(ExcelDotPivotFilter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotFilter]
  }
}

