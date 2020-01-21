package typings.acmeClient.rfc8555Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CertificateRevocationReason extends js.Object

@JSImport("acme-client/types/rfc8555", "CertificateRevocationReason")
@js.native
object CertificateRevocationReason extends js.Object {
  @js.native
  sealed trait AACompromise extends CertificateRevocationReason
  
  @js.native
  sealed trait AffiliationChanged extends CertificateRevocationReason
  
  @js.native
  sealed trait CACompromise extends CertificateRevocationReason
  
  @js.native
  sealed trait CertificateHold extends CertificateRevocationReason
  
  @js.native
  sealed trait CessationOfOperation extends CertificateRevocationReason
  
  @js.native
  sealed trait KeyCompromise extends CertificateRevocationReason
  
  @js.native
  sealed trait PrivilegeWithdrawn extends CertificateRevocationReason
  
  @js.native
  sealed trait RemoveFromCRL extends CertificateRevocationReason
  
  @js.native
  sealed trait Superseded extends CertificateRevocationReason
  
  @js.native
  sealed trait Unspecified extends CertificateRevocationReason
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CertificateRevocationReason with Double] = js.native
  /* 10 */ @js.native
  object AACompromise extends TopLevel[AACompromise with Double]
  
  /* 3 */ @js.native
  object AffiliationChanged extends TopLevel[AffiliationChanged with Double]
  
  /* 2 */ @js.native
  object CACompromise extends TopLevel[CACompromise with Double]
  
  /* 6 */ @js.native
  object CertificateHold extends TopLevel[CertificateHold with Double]
  
  /* 5 */ @js.native
  object CessationOfOperation extends TopLevel[CessationOfOperation with Double]
  
  /* 1 */ @js.native
  object KeyCompromise extends TopLevel[KeyCompromise with Double]
  
  /* 9 */ @js.native
  object PrivilegeWithdrawn extends TopLevel[PrivilegeWithdrawn with Double]
  
  /* 8 */ @js.native
  object RemoveFromCRL extends TopLevel[RemoveFromCRL with Double]
  
  /* 4 */ @js.native
  object Superseded extends TopLevel[Superseded with Double]
  
  /* 0 */ @js.native
  object Unspecified extends TopLevel[Unspecified with Double]
  
}

