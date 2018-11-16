package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SignatureProviderDetail extends js.Object

@JSGlobal("Office.SignatureProviderDetail")
@js.native
object SignatureProviderDetail extends js.Object {
  @js.native
  sealed trait sigprovdetHashAlgorithm
    extends activexDashOfficeLib.OfficeNs.SignatureProviderDetail
  
  @js.native
  sealed trait sigprovdetUIOnly
    extends activexDashOfficeLib.OfficeNs.SignatureProviderDetail
  
  @js.native
  sealed trait sigprovdetUrl
    extends activexDashOfficeLib.OfficeNs.SignatureProviderDetail
  
  @js.native
  sealed trait sigprovdetUseOfficeStampUI
    extends activexDashOfficeLib.OfficeNs.SignatureProviderDetail
  
  @js.native
  sealed trait sigprovdetUseOfficeUI
    extends activexDashOfficeLib.OfficeNs.SignatureProviderDetail
  
  /* 1 */ val sigprovdetHashAlgorithm: sigprovdetHashAlgorithm with scala.Double = js.native
  /* 2 */ val sigprovdetUIOnly: sigprovdetUIOnly with scala.Double = js.native
  /* 0 */ val sigprovdetUrl: sigprovdetUrl with scala.Double = js.native
  /* 4 */ val sigprovdetUseOfficeStampUI: sigprovdetUseOfficeStampUI with scala.Double = js.native
  /* 3 */ val sigprovdetUseOfficeUI: sigprovdetUseOfficeUI with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.SignatureProviderDetail with scala.Double] = js.native
}

