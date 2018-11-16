package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpBulletType extends js.Object

@JSGlobal("PowerPoint.PpBulletType")
@js.native
object PpBulletType extends js.Object {
  @js.native
  sealed trait ppBulletMixed
    extends activexDashPowerpointLib.PowerPointNs.PpBulletType
  
  @js.native
  sealed trait ppBulletNone
    extends activexDashPowerpointLib.PowerPointNs.PpBulletType
  
  @js.native
  sealed trait ppBulletNumbered
    extends activexDashPowerpointLib.PowerPointNs.PpBulletType
  
  @js.native
  sealed trait ppBulletPicture
    extends activexDashPowerpointLib.PowerPointNs.PpBulletType
  
  @js.native
  sealed trait ppBulletUnnumbered
    extends activexDashPowerpointLib.PowerPointNs.PpBulletType
  
  /* -2 */ val ppBulletMixed: ppBulletMixed with scala.Double = js.native
  /* 0 */ val ppBulletNone: ppBulletNone with scala.Double = js.native
  /* 2 */ val ppBulletNumbered: ppBulletNumbered with scala.Double = js.native
  /* 3 */ val ppBulletPicture: ppBulletPicture with scala.Double = js.native
  /* 1 */ val ppBulletUnnumbered: ppBulletUnnumbered with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpBulletType with scala.Double] = js.native
}

