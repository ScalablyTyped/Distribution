package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.PropertyAccessor")
@js.native
class PropertyAccessor protected ()
  extends typings.activexOutlook.Outlook.PropertyAccessor {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  @JSName("Outlook.PropertyAccessor_typekey")
  override var OutlookDotPropertyAccessor_typekey: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def BinaryToString(Value: js.Any): String = js.native
  /* CompleteClass */
  override def DeleteProperties(SchemaNames: js.Any): js.Any = js.native
  /* CompleteClass */
  override def DeleteProperty(SchemaName: String): Unit = js.native
  /* CompleteClass */
  override def GetProperties(SchemaNames: js.Any): js.Any = js.native
  /* CompleteClass */
  override def GetProperty(SchemaName: String): js.Any = js.native
  /* CompleteClass */
  override def LocalTimeToUTC(Value: VarDate): VarDate = js.native
  /* CompleteClass */
  override def SetProperties(SchemaNames: js.Any, Values: js.Any): js.Any = js.native
  /* CompleteClass */
  override def SetProperty(SchemaName: String, Value: js.Any): Unit = js.native
  /* CompleteClass */
  override def StringToBinary(Value: String): js.Any = js.native
  /* CompleteClass */
  override def UTCToLocalTime(Value: VarDate): VarDate = js.native
}

