package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureSetup extends js.Object {
  var AdditionalXml: String
  var AllowComments: Boolean
  val Application: js.Any
  val Creator: Double
  val Id: String
  @JSName("Office.SignatureSetup_typekey")
  var OfficeDotSignatureSetup_typekey: SignatureSetup
  val ReadOnly: Boolean
  var ShowSignDate: Boolean
  val SignatureProvider: String
  var SigningInstructions: String
  var SuggestedSigner: String
  var SuggestedSignerEmail: String
  var SuggestedSignerLine2: String
}

object SignatureSetup {
  @scala.inline
  def apply(
    AdditionalXml: String,
    AllowComments: Boolean,
    Application: js.Any,
    Creator: Double,
    Id: String,
    OfficeDotSignatureSetup_typekey: SignatureSetup,
    ReadOnly: Boolean,
    ShowSignDate: Boolean,
    SignatureProvider: String,
    SigningInstructions: String,
    SuggestedSigner: String,
    SuggestedSignerEmail: String,
    SuggestedSignerLine2: String
  ): SignatureSetup = {
    val __obj = js.Dynamic.literal(AdditionalXml = AdditionalXml.asInstanceOf[js.Any], AllowComments = AllowComments.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], ShowSignDate = ShowSignDate.asInstanceOf[js.Any], SignatureProvider = SignatureProvider.asInstanceOf[js.Any], SigningInstructions = SigningInstructions.asInstanceOf[js.Any], SuggestedSigner = SuggestedSigner.asInstanceOf[js.Any], SuggestedSignerEmail = SuggestedSignerEmail.asInstanceOf[js.Any], SuggestedSignerLine2 = SuggestedSignerLine2.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SignatureSetup_typekey")(OfficeDotSignatureSetup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureSetup]
  }
}

