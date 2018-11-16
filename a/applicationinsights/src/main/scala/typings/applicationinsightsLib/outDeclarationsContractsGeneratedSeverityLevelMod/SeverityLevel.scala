package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SeverityLevel extends js.Object

@JSImport("applicationinsights/out/Declarations/Contracts/Generated/SeverityLevel", "SeverityLevel")
@js.native
object SeverityLevel extends js.Object {
  @js.native
  sealed trait Critical
    extends applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel
  
  @js.native
  sealed trait Error
    extends applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel
  
  @js.native
  sealed trait Information
    extends applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel
  
  @js.native
  sealed trait Verbose
    extends applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel
  
  @js.native
  sealed trait Warning
    extends applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel
  
}

