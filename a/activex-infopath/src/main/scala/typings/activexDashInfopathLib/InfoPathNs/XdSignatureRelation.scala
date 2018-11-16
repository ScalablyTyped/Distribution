package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XdSignatureRelation extends js.Object

@JSGlobal("InfoPath.XdSignatureRelation")
@js.native
object XdSignatureRelation extends js.Object {
  @js.native
  sealed trait xdSignatureRelationCoSign
    extends activexDashInfopathLib.InfoPathNs.XdSignatureRelation
  
  @js.native
  sealed trait xdSignatureRelationCounterSign
    extends activexDashInfopathLib.InfoPathNs.XdSignatureRelation
  
  @js.native
  sealed trait xdSignatureRelationSingle
    extends activexDashInfopathLib.InfoPathNs.XdSignatureRelation
  
  /* 2 */ val xdSignatureRelationCoSign: xdSignatureRelationCoSign with scala.Double = js.native
  /* 3 */ val xdSignatureRelationCounterSign: xdSignatureRelationCounterSign with scala.Double = js.native
  /* 1 */ val xdSignatureRelationSingle: xdSignatureRelationSingle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashInfopathLib.InfoPathNs.XdSignatureRelation with scala.Double] = js.native
}

