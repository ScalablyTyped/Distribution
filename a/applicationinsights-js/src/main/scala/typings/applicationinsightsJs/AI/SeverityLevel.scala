package typings.applicationinsightsJs.AI

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SeverityLevel with Double] = js.native
  /* 4 */ @js.native
  object Critical extends TopLevel[Critical with Double]
  
  /* 3 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 1 */ @js.native
  object Information extends TopLevel[Information with Double]
  
  /* 0 */ @js.native
  object Verbose extends TopLevel[Verbose with Double]
  
  /* 2 */ @js.native
  object Warning extends TopLevel[Warning with Double]
  
}

