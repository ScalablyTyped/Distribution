package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationValueTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.animations.AnimationValueType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait COLOR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationValueTypeNs.Constants
  
  @js.native
  sealed trait NUMBER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationValueTypeNs.Constants
  
  @js.native
  sealed trait STRING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationValueTypeNs.Constants
  
  /* 2 */ val COLOR: COLOR with scala.Double = js.native
  /* 1 */ val NUMBER: NUMBER with scala.Double = js.native
  /* 0 */ val STRING: STRING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationValueTypeNs.Constants with scala.Double
  ] = js.native
}

