package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.alexaSdk.alexaSdkStrings.Standard
  - typings.alexaSdk.alexaSdkStrings.Simple
  - typings.alexaSdk.alexaSdkStrings.LinkAccount
  - typings.alexaSdk.alexaSdkStrings.AskForPermissionsConsent
*/
trait CardType extends js.Object

object CardType {
  @scala.inline
  def AskForPermissionsConsent: typings.alexaSdk.alexaSdkStrings.AskForPermissionsConsent = this.cast("AskForPermissionsConsent")
  @scala.inline
  def LinkAccount: typings.alexaSdk.alexaSdkStrings.LinkAccount = this.cast("LinkAccount")
  @scala.inline
  def Simple: typings.alexaSdk.alexaSdkStrings.Simple = this.cast("Simple")
  @scala.inline
  def Standard: typings.alexaSdk.alexaSdkStrings.Standard = this.cast("Standard")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

