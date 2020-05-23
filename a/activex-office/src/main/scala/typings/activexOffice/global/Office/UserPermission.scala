package typings.activexOffice.global.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.UserPermission")
@js.native
class UserPermission protected ()
  extends typings.activexOffice.Office.UserPermission {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var ExpirationDate: VarDate = js.native
  /* CompleteClass */
  @JSName("Office.UserPermission_typekey")
  override var OfficeDotUserPermission_typekey: typings.activexOffice.Office.UserPermission = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Permission: Double = js.native
  /* CompleteClass */
  override val UserId: String = js.native
  /* CompleteClass */
  override def Remove(): Unit = js.native
}

