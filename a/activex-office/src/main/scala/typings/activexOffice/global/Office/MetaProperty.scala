package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoMetaPropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.MetaProperty")
@js.native
class MetaProperty protected ()
  extends typings.activexOffice.Office.MetaProperty {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Id: String = js.native
  /* CompleteClass */
  override val IsReadOnly: Boolean = js.native
  /* CompleteClass */
  override val IsRequired: Boolean = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  @JSName("Office.MetaProperty_typekey")
  override var OfficeDotMetaProperty_typekey: typings.activexOffice.Office.MetaProperty = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Type: MsoMetaPropertyType = js.native
  /* CompleteClass */
  override val ValidationError: String = js.native
  /* CompleteClass */
  override var Value: js.Any = js.native
  /* CompleteClass */
  override def Validate(): String = js.native
}

