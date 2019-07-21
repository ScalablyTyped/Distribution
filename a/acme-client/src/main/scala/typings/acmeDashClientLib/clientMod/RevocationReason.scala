package typings
package acmeDashClientLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RevocationReason extends js.Object

@JSImport("acme-client/client", "RevocationReason")
@js.native
object RevocationReason extends js.Object {
  @js.native
  sealed trait AACompromise
    extends acmeDashClientLib.clientMod.RevocationReason
  
  @js.native
  sealed trait AffiliationChanged
    extends acmeDashClientLib.clientMod.RevocationReason
  
  @js.native
  sealed trait CACompromise
    extends acmeDashClientLib.clientMod.RevocationReason
  
  @js.native
  sealed trait CertificateHold
    extends acmeDashClientLib.clientMod.RevocationReason
  
  @js.native
  sealed trait CessationOfOperation
    extends acmeDashClientLib.clientMod.RevocationReason
  
  @js.native
  sealed trait KeyCompromise
    extends acmeDashClientLib.clientMod.RevocationReason
  
  @js.native
  sealed trait PrivilegeWithdrawn
    extends acmeDashClientLib.clientMod.RevocationReason
  
  @js.native
  sealed trait RemoveFromCRL
    extends acmeDashClientLib.clientMod.RevocationReason
  
  @js.native
  sealed trait Supersedeed
    extends acmeDashClientLib.clientMod.RevocationReason
  
  @js.native
  sealed trait Unspecified
    extends acmeDashClientLib.clientMod.RevocationReason
  
  /* 10 */ val AACompromise: AACompromise with scala.Double = js.native
  /* 3 */ val AffiliationChanged: AffiliationChanged with scala.Double = js.native
  /* 2 */ val CACompromise: CACompromise with scala.Double = js.native
  /* 6 */ val CertificateHold: CertificateHold with scala.Double = js.native
  /* 5 */ val CessationOfOperation: CessationOfOperation with scala.Double = js.native
  /* 1 */ val KeyCompromise: KeyCompromise with scala.Double = js.native
  /* 9 */ val PrivilegeWithdrawn: PrivilegeWithdrawn with scala.Double = js.native
  /* 8 */ val RemoveFromCRL: RemoveFromCRL with scala.Double = js.native
  /* 4 */ val Supersedeed: Supersedeed with scala.Double = js.native
  /* 0 */ val Unspecified: Unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[acmeDashClientLib.clientMod.RevocationReason with scala.Double] = js.native
}

