package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AllowNullsEnum extends js.Object

@JSGlobal("ADOX.AllowNullsEnum")
@js.native
object AllowNullsEnum extends js.Object {
  @js.native
  sealed trait adIndexNullsAllow
    extends activexDashAdoxLib.ADOXNs.AllowNullsEnum
  
  @js.native
  sealed trait adIndexNullsDisallow
    extends activexDashAdoxLib.ADOXNs.AllowNullsEnum
  
  @js.native
  sealed trait adIndexNullsIgnore
    extends activexDashAdoxLib.ADOXNs.AllowNullsEnum
  
  @js.native
  sealed trait adIndexNullsIgnoreAny
    extends activexDashAdoxLib.ADOXNs.AllowNullsEnum
  
  /* 0 */ val adIndexNullsAllow: adIndexNullsAllow with scala.Double = js.native
  /* 1 */ val adIndexNullsDisallow: adIndexNullsDisallow with scala.Double = js.native
  /* 2 */ val adIndexNullsIgnore: adIndexNullsIgnore with scala.Double = js.native
  /* 4 */ val adIndexNullsIgnoreAny: adIndexNullsIgnoreAny with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdoxLib.ADOXNs.AllowNullsEnum with scala.Double] = js.native
}

