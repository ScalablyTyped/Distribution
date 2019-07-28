package typings.applicationinsights.outDeclarationsContractsMod

import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryTypeValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Declarations/Contracts", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def baseTypeToTelemetryType(baseType: TelemetryTypeValues): typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType = js.native
  def domainSupportsProperties(domain: typings.applicationinsights.outDeclarationsContractsGeneratedMod.Domain): /* is applicationinsights.applicationinsights/out/Declarations/Contracts/Constants.ISupportProperties */ Boolean = js.native
  def telemetryTypeToBaseType(
    `type`: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
  ): TelemetryTypeValues = js.native
}

