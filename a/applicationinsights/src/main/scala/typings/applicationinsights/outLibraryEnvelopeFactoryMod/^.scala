package typings.applicationinsights.outLibraryEnvelopeFactoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.outDeclarationsContractsMod.Envelope
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manages the logic of creating envelopes from Telemetry objects
  */
@JSImport("applicationinsights/out/Library/EnvelopeFactory", JSImport.Namespace)
@js.native
class ^ () extends EnvelopeFactory

@JSImport("applicationinsights/out/Library/EnvelopeFactory", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /* private */ def createAvailabilityData(telemetry: js.Any): js.Any = js.native
  /* private */ def createDependencyData(telemetry: js.Any): js.Any = js.native
  /**
    * Creates envelope ready to be sent by Channel
    * @param telemetry Telemetry data
    * @param telemetryType Type of telemetry
    * @param commonProperties Bag of custom common properties to be added to the envelope
    * @param context Client context
    * @param config Client configuration
    */
  def createEnvelope(telemetry: Telemetry, telemetryType: TelemetryType): Envelope = js.native
  def createEnvelope(telemetry: Telemetry, telemetryType: TelemetryType, commonProperties: StringDictionary[String]): Envelope = js.native
  def createEnvelope(
    telemetry: Telemetry,
    telemetryType: TelemetryType,
    commonProperties: StringDictionary[String],
    context: typings.applicationinsights.outLibraryContextMod.^
  ): Envelope = js.native
  def createEnvelope(
    telemetry: Telemetry,
    telemetryType: TelemetryType,
    commonProperties: StringDictionary[String],
    context: typings.applicationinsights.outLibraryContextMod.^,
    config: typings.applicationinsights.outLibraryConfigMod.^
  ): Envelope = js.native
  /* private */ def createEventData(telemetry: js.Any): js.Any = js.native
  /* private */ def createExceptionData(telemetry: js.Any): js.Any = js.native
  /* private */ def createMetricData(telemetry: js.Any): js.Any = js.native
  /* private */ def createRequestData(telemetry: js.Any): js.Any = js.native
  /* private */ def createTraceData(telemetry: js.Any): js.Any = js.native
  /* private */ def getTags(context: js.Any): js.Any = js.native
  /* private */ def getTags(context: js.Any, tagOverrides: js.Any): js.Any = js.native
  /* private */ def parseStack(stack: js.Any): js.Any = js.native
}

