package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AffectEnum extends js.Object

@JSGlobal("ADODB.AffectEnum")
@js.native
object AffectEnum extends js.Object {
  @js.native
  sealed trait adAffectAll
    extends activexDashAdodbLib.ADODBNs.AffectEnum
  
  @js.native
  sealed trait adAffectAllChapters
    extends activexDashAdodbLib.ADODBNs.AffectEnum
  
  @js.native
  sealed trait adAffectCurrent
    extends activexDashAdodbLib.ADODBNs.AffectEnum
  
  @js.native
  sealed trait adAffectGroup
    extends activexDashAdodbLib.ADODBNs.AffectEnum
  
  /* 3 */ val adAffectAll: adAffectAll with scala.Double = js.native
  /* 4 */ val adAffectAllChapters: adAffectAllChapters with scala.Double = js.native
  /* 1 */ val adAffectCurrent: adAffectCurrent with scala.Double = js.native
  /* 2 */ val adAffectGroup: adAffectGroup with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.AffectEnum with scala.Double] = js.native
}

