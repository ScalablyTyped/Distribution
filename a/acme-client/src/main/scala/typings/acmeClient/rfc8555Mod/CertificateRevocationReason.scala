package typings.acmeClient.rfc8555Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CertificateRevocationReason extends js.Object
@JSImport("acme-client/types/rfc8555", "CertificateRevocationReason")
@js.native
object CertificateRevocationReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CertificateRevocationReason with Double] = js.native
  
  @js.native
  sealed trait AACompromise extends CertificateRevocationReason
  /* 10 */ @js.native
  object AACompromise extends TopLevel[AACompromise with Double]
  
  @js.native
  sealed trait AffiliationChanged extends CertificateRevocationReason
  /* 3 */ @js.native
  object AffiliationChanged extends TopLevel[AffiliationChanged with Double]
  
  @js.native
  sealed trait CACompromise extends CertificateRevocationReason
  /* 2 */ @js.native
  object CACompromise extends TopLevel[CACompromise with Double]
  
  @js.native
  sealed trait CertificateHold extends CertificateRevocationReason
  /* 6 */ @js.native
  object CertificateHold extends TopLevel[CertificateHold with Double]
  
  @js.native
  sealed trait CessationOfOperation extends CertificateRevocationReason
  /* 5 */ @js.native
  object CessationOfOperation extends TopLevel[CessationOfOperation with Double]
  
  @js.native
  sealed trait KeyCompromise extends CertificateRevocationReason
  /* 1 */ @js.native
  object KeyCompromise extends TopLevel[KeyCompromise with Double]
  
  @js.native
  sealed trait PrivilegeWithdrawn extends CertificateRevocationReason
  /* 9 */ @js.native
  object PrivilegeWithdrawn extends TopLevel[PrivilegeWithdrawn with Double]
  
  @js.native
  sealed trait RemoveFromCRL extends CertificateRevocationReason
  /* 8 */ @js.native
  object RemoveFromCRL extends TopLevel[RemoveFromCRL with Double]
  
  @js.native
  sealed trait Superseded extends CertificateRevocationReason
  /* 4 */ @js.native
  object Superseded extends TopLevel[Superseded with Double]
  
  @js.native
  sealed trait Unspecified extends CertificateRevocationReason
  /* 0 */ @js.native
  object Unspecified extends TopLevel[Unspecified with Double]
}
