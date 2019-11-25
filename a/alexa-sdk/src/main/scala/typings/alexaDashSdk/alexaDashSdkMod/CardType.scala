package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.alexaDashSdk.alexaDashSdkStrings.Standard
  - typings.alexaDashSdk.alexaDashSdkStrings.Simple
  - typings.alexaDashSdk.alexaDashSdkStrings.LinkAccount
  - typings.alexaDashSdk.alexaDashSdkStrings.AskForPermissionsConsent
*/
trait CardType extends js.Object

object CardType {
  @scala.inline
  def AskForPermissionsConsent: typings.alexaDashSdk.alexaDashSdkStrings.AskForPermissionsConsent = this.cast("AskForPermissionsConsent")
  @scala.inline
  def LinkAccount: typings.alexaDashSdk.alexaDashSdkStrings.LinkAccount = this.cast("LinkAccount")
  @scala.inline
  def Simple: typings.alexaDashSdk.alexaDashSdkStrings.Simple = this.cast("Simple")
  @scala.inline
  def Standard: typings.alexaDashSdk.alexaDashSdkStrings.Standard = this.cast("Standard")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

