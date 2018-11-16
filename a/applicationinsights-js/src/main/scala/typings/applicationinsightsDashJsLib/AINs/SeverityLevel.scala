package typings
package applicationinsightsDashJsLib.AINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SeverityLevel extends js.Object

@JSGlobal("AI.SeverityLevel")
@js.native
object SeverityLevel extends js.Object {
  @js.native
  sealed trait Critical
    extends applicationinsightsDashJsLib.AINs.SeverityLevel
  
  @js.native
  sealed trait Error
    extends applicationinsightsDashJsLib.AINs.SeverityLevel
  
  @js.native
  sealed trait Information
    extends applicationinsightsDashJsLib.AINs.SeverityLevel
  
  @js.native
  sealed trait Verbose
    extends applicationinsightsDashJsLib.AINs.SeverityLevel
  
  @js.native
  sealed trait Warning
    extends applicationinsightsDashJsLib.AINs.SeverityLevel
  
  /* 4 */ val Critical: Critical with scala.Double = js.native
  /* 3 */ val Error: Error with scala.Double = js.native
  /* 1 */ val Information: Information with scala.Double = js.native
  /* 0 */ val Verbose: Verbose with scala.Double = js.native
  /* 2 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[applicationinsightsDashJsLib.AINs.SeverityLevel with scala.Double] = js.native
}

