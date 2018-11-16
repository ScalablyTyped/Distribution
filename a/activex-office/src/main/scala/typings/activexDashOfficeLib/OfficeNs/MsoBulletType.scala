package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoBulletType extends js.Object

@JSGlobal("Office.MsoBulletType")
@js.native
object MsoBulletType extends js.Object {
  @js.native
  sealed trait msoBulletMixed
    extends activexDashOfficeLib.OfficeNs.MsoBulletType
  
  @js.native
  sealed trait msoBulletNone
    extends activexDashOfficeLib.OfficeNs.MsoBulletType
  
  @js.native
  sealed trait msoBulletNumbered
    extends activexDashOfficeLib.OfficeNs.MsoBulletType
  
  @js.native
  sealed trait msoBulletPicture
    extends activexDashOfficeLib.OfficeNs.MsoBulletType
  
  @js.native
  sealed trait msoBulletUnnumbered
    extends activexDashOfficeLib.OfficeNs.MsoBulletType
  
  /* -2 */ val msoBulletMixed: msoBulletMixed with scala.Double = js.native
  /* 0 */ val msoBulletNone: msoBulletNone with scala.Double = js.native
  /* 2 */ val msoBulletNumbered: msoBulletNumbered with scala.Double = js.native
  /* 3 */ val msoBulletPicture: msoBulletPicture with scala.Double = js.native
  /* 1 */ val msoBulletUnnumbered: msoBulletUnnumbered with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoBulletType with scala.Double] = js.native
}

