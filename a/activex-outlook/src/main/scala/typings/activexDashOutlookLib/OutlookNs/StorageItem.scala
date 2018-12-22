package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.StorageItem")
@js.native
class StorageItem protected () extends js.Object {
  val Application: Application = js.native
  val Attachments: Attachments = js.native
  var Body: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  val CreationTime: activexDashInteropLib.VarDate = js.native
  var Creator: java.lang.String = js.native
  val EntryID: java.lang.String = js.native
  val LastModificationTime: activexDashInteropLib.VarDate = js.native
  var `Outlook.StorageItem_typekey`: StorageItem = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: PropertyAccessor = js.native
  val Session: NameSpace = js.native
  val Size: scala.Double = js.native
  var Subject: java.lang.String = js.native
  val UserProperties: UserProperties = js.native
  def Delete(): scala.Unit = js.native
  def Save(): scala.Unit = js.native
}

