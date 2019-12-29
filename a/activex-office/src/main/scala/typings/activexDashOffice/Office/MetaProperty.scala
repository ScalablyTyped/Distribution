package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.MetaProperty")
@js.native
class MetaProperty protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val Id: String = js.native
  val IsReadOnly: Boolean = js.native
  val IsRequired: Boolean = js.native
  val Name: String = js.native
  @JSName("Office.MetaProperty_typekey")
  var OfficeDotMetaProperty_typekey: MetaProperty = js.native
  val Parent: js.Any = js.native
  val Type: MsoMetaPropertyType = js.native
  val ValidationError: String = js.native
  var Value: js.Any = js.native
  def Validate(): String = js.native
}

