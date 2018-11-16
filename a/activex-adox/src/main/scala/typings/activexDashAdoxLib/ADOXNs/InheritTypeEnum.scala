package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InheritTypeEnum extends js.Object

@JSGlobal("ADOX.InheritTypeEnum")
@js.native
object InheritTypeEnum extends js.Object {
  @js.native
  sealed trait adInheritBoth
    extends activexDashAdoxLib.ADOXNs.InheritTypeEnum
  
  @js.native
  sealed trait adInheritContainers
    extends activexDashAdoxLib.ADOXNs.InheritTypeEnum
  
  @js.native
  sealed trait adInheritNoPropogate
    extends activexDashAdoxLib.ADOXNs.InheritTypeEnum
  
  @js.native
  sealed trait adInheritNone
    extends activexDashAdoxLib.ADOXNs.InheritTypeEnum
  
  @js.native
  sealed trait adInheritObjects
    extends activexDashAdoxLib.ADOXNs.InheritTypeEnum
  
  /* 3 */ val adInheritBoth: adInheritBoth with scala.Double = js.native
  /* 2 */ val adInheritContainers: adInheritContainers with scala.Double = js.native
  /* 4 */ val adInheritNoPropogate: adInheritNoPropogate with scala.Double = js.native
  /* 0 */ val adInheritNone: adInheritNone with scala.Double = js.native
  /* 1 */ val adInheritObjects: adInheritObjects with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdoxLib.ADOXNs.InheritTypeEnum with scala.Double] = js.native
}

