package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XdSignatureAppearanceType extends js.Object

@JSGlobal("InfoPath.XdSignatureAppearanceType")
@js.native
object XdSignatureAppearanceType extends js.Object {
  @js.native
  sealed trait xdSignatureAppearanceTypeLine
    extends activexDashInfopathLib.InfoPathNs.XdSignatureAppearanceType
  
  @js.native
  sealed trait xdSignatureAppearanceTypeStamp
    extends activexDashInfopathLib.InfoPathNs.XdSignatureAppearanceType
  
  /* 0 */ val xdSignatureAppearanceTypeLine: xdSignatureAppearanceTypeLine with scala.Double = js.native
  /* 1 */ val xdSignatureAppearanceTypeStamp: xdSignatureAppearanceTypeStamp with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashInfopathLib.InfoPathNs.XdSignatureAppearanceType with scala.Double] = js.native
}

