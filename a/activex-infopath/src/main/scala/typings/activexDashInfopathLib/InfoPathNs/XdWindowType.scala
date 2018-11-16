package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XdWindowType extends js.Object

@JSGlobal("InfoPath.XdWindowType")
@js.native
object XdWindowType extends js.Object {
  @js.native
  sealed trait xdDesignerWindow
    extends activexDashInfopathLib.InfoPathNs.XdWindowType
  
  @js.native
  sealed trait xdEditorWindow
    extends activexDashInfopathLib.InfoPathNs.XdWindowType
  
  /* 1 */ val xdDesignerWindow: xdDesignerWindow with scala.Double = js.native
  /* 0 */ val xdEditorWindow: xdEditorWindow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashInfopathLib.InfoPathNs.XdWindowType with scala.Double] = js.native
}

