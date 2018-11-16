package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RuleEnum extends js.Object

@JSGlobal("ADOX.RuleEnum")
@js.native
object RuleEnum extends js.Object {
  @js.native
  sealed trait adRICascade
    extends activexDashAdoxLib.ADOXNs.RuleEnum
  
  @js.native
  sealed trait adRINone
    extends activexDashAdoxLib.ADOXNs.RuleEnum
  
  @js.native
  sealed trait adRISetDefault
    extends activexDashAdoxLib.ADOXNs.RuleEnum
  
  @js.native
  sealed trait adRISetNull
    extends activexDashAdoxLib.ADOXNs.RuleEnum
  
  /* 1 */ val adRICascade: adRICascade with scala.Double = js.native
  /* 0 */ val adRINone: adRINone with scala.Double = js.native
  /* 3 */ val adRISetDefault: adRISetDefault with scala.Double = js.native
  /* 2 */ val adRISetNull: adRISetNull with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdoxLib.ADOXNs.RuleEnum with scala.Double] = js.native
}

