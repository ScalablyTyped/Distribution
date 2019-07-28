package typings.acmeDashClient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RevocationReason extends js.Object

@JSImport("acme-client/client", "RevocationReason")
@js.native
object RevocationReason extends js.Object {
  @js.native
  sealed trait AACompromise extends RevocationReason
  
  @js.native
  sealed trait AffiliationChanged extends RevocationReason
  
  @js.native
  sealed trait CACompromise extends RevocationReason
  
  @js.native
  sealed trait CertificateHold extends RevocationReason
  
  @js.native
  sealed trait CessationOfOperation extends RevocationReason
  
  @js.native
  sealed trait KeyCompromise extends RevocationReason
  
  @js.native
  sealed trait PrivilegeWithdrawn extends RevocationReason
  
  @js.native
  sealed trait RemoveFromCRL extends RevocationReason
  
  @js.native
  sealed trait Supersedeed extends RevocationReason
  
  @js.native
  sealed trait Unspecified extends RevocationReason
  
  /* 10 */ val AACompromise: typings.acmeDashClient.clientMod.RevocationReason.AACompromise with Double = js.native
  /* 3 */ val AffiliationChanged: typings.acmeDashClient.clientMod.RevocationReason.AffiliationChanged with Double = js.native
  /* 2 */ val CACompromise: typings.acmeDashClient.clientMod.RevocationReason.CACompromise with Double = js.native
  /* 6 */ val CertificateHold: typings.acmeDashClient.clientMod.RevocationReason.CertificateHold with Double = js.native
  /* 5 */ val CessationOfOperation: typings.acmeDashClient.clientMod.RevocationReason.CessationOfOperation with Double = js.native
  /* 1 */ val KeyCompromise: typings.acmeDashClient.clientMod.RevocationReason.KeyCompromise with Double = js.native
  /* 9 */ val PrivilegeWithdrawn: typings.acmeDashClient.clientMod.RevocationReason.PrivilegeWithdrawn with Double = js.native
  /* 8 */ val RemoveFromCRL: typings.acmeDashClient.clientMod.RevocationReason.RemoveFromCRL with Double = js.native
  /* 4 */ val Supersedeed: typings.acmeDashClient.clientMod.RevocationReason.Supersedeed with Double = js.native
  /* 0 */ val Unspecified: typings.acmeDashClient.clientMod.RevocationReason.Unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RevocationReason with Double] = js.native
}

