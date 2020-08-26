package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link LicenseException} reflects the necessity of someone agreeing to a license.
  * @since OOo 2.0.4
  */
@js.native
trait LicenseException extends Exception {
  /** contains the value of the attribute `/description/registration/simple-license/@accept-by` from the description.xml */
  var AcceptBy: String = js.native
  /**
    * name of the extension.
    *
    * The display name of the extension. See {@link XPackage.getDisplayName()}
    */
  var ExtensionName: String = js.native
  /** contains the text of the license. */
  var Text: String = js.native
}

object LicenseException {
  @scala.inline
  def apply(AcceptBy: String, Context: XInterface, ExtensionName: String, Message: String, Text: String): LicenseException = {
    val __obj = js.Dynamic.literal(AcceptBy = AcceptBy.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], ExtensionName = ExtensionName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseException]
  }
  @scala.inline
  implicit class LicenseExceptionOps[Self <: LicenseException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceptBy(value: String): Self = this.set("AcceptBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionName(value: String): Self = this.set("ExtensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
  
}

