package typings.activexOffice.Office

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signature extends StObject {
  
  val Application: Any = js.native
  
  var AttachCertificate: Boolean = js.native
  
  val CanSetup: Boolean = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Details: SignatureInfo = js.native
  
  val ExpireDate: VarDate = js.native
  
  val IsCertificateExpired: Boolean = js.native
  
  val IsCertificateRevoked: Boolean = js.native
  
  val IsSignatureLine: Boolean = js.native
  
  val IsSigned: Boolean = js.native
  
  val IsValid: Boolean = js.native
  
  val Issuer: String = js.native
  
  /* private */ @JSName("Office.Signature_typekey")
  var OfficeDotSignature_typekey: Signature = js.native
  
  val Parent: Any = js.native
  
  val Setup: SignatureSetup = js.native
  
  def ShowDetails(): Unit = js.native
  
  def Sign(): Unit = js.native
  def Sign(varSigImg: Any): Unit = js.native
  def Sign(varSigImg: Any, varDelSuggSigner: Any): Unit = js.native
  def Sign(varSigImg: Any, varDelSuggSigner: Any, varDelSuggSignerLine2: Any): Unit = js.native
  def Sign(varSigImg: Any, varDelSuggSigner: Any, varDelSuggSignerLine2: Any, varDelSuggSignerEmail: Any): Unit = js.native
  def Sign(varSigImg: Any, varDelSuggSigner: Any, varDelSuggSignerLine2: Unit, varDelSuggSignerEmail: Any): Unit = js.native
  def Sign(varSigImg: Any, varDelSuggSigner: Unit, varDelSuggSignerLine2: Any): Unit = js.native
  def Sign(varSigImg: Any, varDelSuggSigner: Unit, varDelSuggSignerLine2: Any, varDelSuggSignerEmail: Any): Unit = js.native
  def Sign(varSigImg: Any, varDelSuggSigner: Unit, varDelSuggSignerLine2: Unit, varDelSuggSignerEmail: Any): Unit = js.native
  def Sign(varSigImg: Unit, varDelSuggSigner: Any): Unit = js.native
  def Sign(varSigImg: Unit, varDelSuggSigner: Any, varDelSuggSignerLine2: Any): Unit = js.native
  def Sign(varSigImg: Unit, varDelSuggSigner: Any, varDelSuggSignerLine2: Any, varDelSuggSignerEmail: Any): Unit = js.native
  def Sign(varSigImg: Unit, varDelSuggSigner: Any, varDelSuggSignerLine2: Unit, varDelSuggSignerEmail: Any): Unit = js.native
  def Sign(varSigImg: Unit, varDelSuggSigner: Unit, varDelSuggSignerLine2: Any): Unit = js.native
  def Sign(varSigImg: Unit, varDelSuggSigner: Unit, varDelSuggSignerLine2: Any, varDelSuggSignerEmail: Any): Unit = js.native
  def Sign(varSigImg: Unit, varDelSuggSigner: Unit, varDelSuggSignerLine2: Unit, varDelSuggSignerEmail: Any): Unit = js.native
  
  val SignDate: VarDate = js.native
  
  val SignatureLineShape: Shape = js.native
  
  val Signer: String = js.native
  
  val SortHint: Double = js.native
}
