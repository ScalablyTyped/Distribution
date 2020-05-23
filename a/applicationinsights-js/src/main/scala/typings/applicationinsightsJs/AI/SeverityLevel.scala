package typings.applicationinsightsJs.AI

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
  
}

