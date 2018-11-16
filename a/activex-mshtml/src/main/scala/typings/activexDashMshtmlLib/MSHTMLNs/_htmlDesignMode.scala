package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlDesignMode extends js.Object

@JSGlobal("MSHTML._htmlDesignMode")
@js.native
object _htmlDesignMode extends js.Object {
  @js.native
  sealed trait htmlDesignModeInherit
    extends activexDashMshtmlLib.MSHTMLNs._htmlDesignMode
  
  @js.native
  sealed trait htmlDesignModeOff
    extends activexDashMshtmlLib.MSHTMLNs._htmlDesignMode
  
  @js.native
  sealed trait htmlDesignModeOn
    extends activexDashMshtmlLib.MSHTMLNs._htmlDesignMode
  
  @js.native
  sealed trait htmlDesignMode_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlDesignMode
  
  /* -2 */ val htmlDesignModeInherit: htmlDesignModeInherit with scala.Double = js.native
  /* 0 */ val htmlDesignModeOff: htmlDesignModeOff with scala.Double = js.native
  /* -1 */ val htmlDesignModeOn: htmlDesignModeOn with scala.Double = js.native
  /* 2147483647 */ val htmlDesignMode_Max: htmlDesignMode_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlDesignMode with scala.Double] = js.native
}

