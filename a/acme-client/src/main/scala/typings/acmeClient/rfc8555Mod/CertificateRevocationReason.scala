package typings.acmeClient.rfc8555Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CertificateRevocationReason extends StObject
@JSImport("acme-client/types/rfc8555", "CertificateRevocationReason")
@js.native
object CertificateRevocationReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CertificateRevocationReason & Double] = js.native
  
  @js.native
  sealed trait AACompromise
    extends StObject
       with CertificateRevocationReason
  /* 10 */ val AACompromise: typings.acmeClient.rfc8555Mod.CertificateRevocationReason.AACompromise & Double = js.native
  
  @js.native
  sealed trait AffiliationChanged
    extends StObject
       with CertificateRevocationReason
  /* 3 */ val AffiliationChanged: typings.acmeClient.rfc8555Mod.CertificateRevocationReason.AffiliationChanged & Double = js.native
  
  @js.native
  sealed trait CACompromise
    extends StObject
       with CertificateRevocationReason
  /* 2 */ val CACompromise: typings.acmeClient.rfc8555Mod.CertificateRevocationReason.CACompromise & Double = js.native
  
  @js.native
  sealed trait CertificateHold
    extends StObject
       with CertificateRevocationReason
  /* 6 */ val CertificateHold: typings.acmeClient.rfc8555Mod.CertificateRevocationReason.CertificateHold & Double = js.native
  
  @js.native
  sealed trait CessationOfOperation
    extends StObject
       with CertificateRevocationReason
  /* 5 */ val CessationOfOperation: typings.acmeClient.rfc8555Mod.CertificateRevocationReason.CessationOfOperation & Double = js.native
  
  @js.native
  sealed trait KeyCompromise
    extends StObject
       with CertificateRevocationReason
  /* 1 */ val KeyCompromise: typings.acmeClient.rfc8555Mod.CertificateRevocationReason.KeyCompromise & Double = js.native
  
  @js.native
  sealed trait PrivilegeWithdrawn
    extends StObject
       with CertificateRevocationReason
  /* 9 */ val PrivilegeWithdrawn: typings.acmeClient.rfc8555Mod.CertificateRevocationReason.PrivilegeWithdrawn & Double = js.native
  
  @js.native
  sealed trait RemoveFromCRL
    extends StObject
       with CertificateRevocationReason
  /* 8 */ val RemoveFromCRL: typings.acmeClient.rfc8555Mod.CertificateRevocationReason.RemoveFromCRL & Double = js.native
  
  @js.native
  sealed trait Superseded
    extends StObject
       with CertificateRevocationReason
  /* 4 */ val Superseded: typings.acmeClient.rfc8555Mod.CertificateRevocationReason.Superseded & Double = js.native
  
  @js.native
  sealed trait Unspecified
    extends StObject
       with CertificateRevocationReason
  /* 0 */ val Unspecified: typings.acmeClient.rfc8555Mod.CertificateRevocationReason.Unspecified & Double = js.native
}
