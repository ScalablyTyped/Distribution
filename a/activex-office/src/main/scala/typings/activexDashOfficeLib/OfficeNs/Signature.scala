package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.Signature")
@js.native
class Signature protected () extends js.Object {
  val Application: js.Any = js.native
  var AttachCertificate: scala.Boolean = js.native
  val CanSetup: scala.Boolean = js.native
  val Creator: scala.Double = js.native
  val Details: SignatureInfo = js.native
  val ExpireDate: activexDashInteropLib.VarDate = js.native
  val IsCertificateExpired: scala.Boolean = js.native
  val IsCertificateRevoked: scala.Boolean = js.native
  val IsSignatureLine: scala.Boolean = js.native
  val IsSigned: scala.Boolean = js.native
  val IsValid: scala.Boolean = js.native
  val Issuer: java.lang.String = js.native
  var `Office.Signature_typekey`: Signature = js.native
  val Parent: js.Any = js.native
  val Setup: SignatureSetup = js.native
  val SignDate: activexDashInteropLib.VarDate = js.native
  val SignatureLineShape: Shape = js.native
  val Signer: java.lang.String = js.native
  val SortHint: scala.Double = js.native
  def Delete(): scala.Unit = js.native
  def ShowDetails(): scala.Unit = js.native
  def Sign(): scala.Unit = js.native
  def Sign(varSigImg: js.Any): scala.Unit = js.native
  def Sign(varSigImg: js.Any, varDelSuggSigner: js.Any): scala.Unit = js.native
  def Sign(varSigImg: js.Any, varDelSuggSigner: js.Any, varDelSuggSignerLine2: js.Any): scala.Unit = js.native
  def Sign(
    varSigImg: js.Any,
    varDelSuggSigner: js.Any,
    varDelSuggSignerLine2: js.Any,
    varDelSuggSignerEmail: js.Any
  ): scala.Unit = js.native
}

