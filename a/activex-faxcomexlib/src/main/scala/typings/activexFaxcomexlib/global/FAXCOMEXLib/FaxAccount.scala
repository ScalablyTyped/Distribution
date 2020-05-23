package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_ACCOUNT_EVENTS_TYPE_ENUM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccount Class */
@JSGlobal("FAXCOMEXLib.FaxAccount")
@js.native
class FaxAccount protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount {
  /** Name of the fax account */
  /* CompleteClass */
  override val AccountName: String = js.native
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxAccount_typekey")
  override var FAXCOMEXLibDotFaxAccount_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount = js.native
  /** Folders belonging to the account */
  /* CompleteClass */
  override val Folders: typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccountFolders = js.native
  /** Events the fax account is listening to */
  /* CompleteClass */
  override val RegisteredEvents: FAX_ACCOUNT_EVENTS_TYPE_ENUM = js.native
  /** Set bit-wise combination of events the fax account listens to */
  /* CompleteClass */
  override def ListenToAccountEvents(EventTypes: FAX_ACCOUNT_EVENTS_TYPE_ENUM): Unit = js.native
}

