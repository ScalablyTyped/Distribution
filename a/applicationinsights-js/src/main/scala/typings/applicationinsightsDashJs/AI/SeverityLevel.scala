package typings.applicationinsightsDashJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SeverityLevel extends js.Object

@JSGlobal("AI.SeverityLevel")
@js.native
object SeverityLevel extends js.Object {
  @js.native
  sealed trait Critical extends SeverityLevel
  
  @js.native
  sealed trait Error extends SeverityLevel
  
  @js.native
  sealed trait Information extends SeverityLevel
  
  @js.native
  sealed trait Verbose extends SeverityLevel
  
  @js.native
  sealed trait Warning extends SeverityLevel
  
  /* 4 */ val Critical: typings.applicationinsightsDashJs.AI.SeverityLevel.Critical with Double = js.native
  /* 3 */ val Error: typings.applicationinsightsDashJs.AI.SeverityLevel.Error with Double = js.native
  /* 1 */ val Information: typings.applicationinsightsDashJs.AI.SeverityLevel.Information with Double = js.native
  /* 0 */ val Verbose: typings.applicationinsightsDashJs.AI.SeverityLevel.Verbose with Double = js.native
  /* 2 */ val Warning: typings.applicationinsightsDashJs.AI.SeverityLevel.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SeverityLevel with Double] = js.native
}

