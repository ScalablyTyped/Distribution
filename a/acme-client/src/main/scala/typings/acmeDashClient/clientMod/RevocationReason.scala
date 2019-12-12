package typings.acmeDashClient.clientMod

import org.scalablytyped.runtime.TopLevel
import typings.acmeDashClient.clientMod.RevocationReason.AACompromise
import typings.acmeDashClient.clientMod.RevocationReason.AffiliationChanged
import typings.acmeDashClient.clientMod.RevocationReason.CACompromise
import typings.acmeDashClient.clientMod.RevocationReason.CertificateHold
import typings.acmeDashClient.clientMod.RevocationReason.CessationOfOperation
import typings.acmeDashClient.clientMod.RevocationReason.KeyCompromise
import typings.acmeDashClient.clientMod.RevocationReason.PrivilegeWithdrawn
import typings.acmeDashClient.clientMod.RevocationReason.RemoveFromCRL
import typings.acmeDashClient.clientMod.RevocationReason.Supersedeed
import typings.acmeDashClient.clientMod.RevocationReason.Unspecified
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RevocationReason with Double] = js.native
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
  object Supersedeed extends TopLevel[Supersedeed with Double]
  
  /* 0 */ @js.native
  object Unspecified extends TopLevel[Unspecified with Double]
  
}

