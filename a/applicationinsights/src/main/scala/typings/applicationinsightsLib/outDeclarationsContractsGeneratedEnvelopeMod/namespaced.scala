package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedEnvelopeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System variables for a telemetry item.
  */
@JSImport("applicationinsights/out/Declarations/Contracts/Generated/Envelope", JSImport.Namespace)
@js.native
class namespaced () extends Envelope {
  /**
    * Telemetry data item.
    */
  /* CompleteClass */
  override var data: applicationinsightsLib.outDeclarationsContractsGeneratedBaseMod.namespaced = js.native
  /**
    * The application's instrumentation key. The key is typically represented as a GUID, but there are cases when it is not a guid. No code should rely on iKey being a GUID. Instrumentation key is case insensitive.
    */
  /* CompleteClass */
  override var iKey: java.lang.String = js.native
  /**
    * Type name of telemetry data item.
    */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * Sampling rate used in application. This telemetry item represents 1 / sampleRate actual telemetry items.
    */
  /* CompleteClass */
  override var sampleRate: scala.Double = js.native
  /**
    * Sequence field used to track absolute order of uploaded events.
    */
  /* CompleteClass */
  override var seq: java.lang.String = js.native
  /**
    * Key/value collection of context properties. See ContextTagKeys for information on available properties.
    */
  /* CompleteClass */
  override var tags: js.Any = js.native
  /**
    * Event date time when telemetry item was created. This is the wall clock time on the client when the event was generated. There is no guarantee that the client's time is accurate. This field must be formatted in UTC ISO 8601 format, with a trailing 'Z' character, as described publicly on https://en.wikipedia.org/wiki/ISO_8601#UTC. Note: the number of decimal seconds digits provided are variable (and unspecified). Consumers should handle this, i.e. managed code consumers should not use format 'O' for parsing as it specifies a fixed length. Example: 2009-06-15T13:45:30.0000000Z.
    */
  /* CompleteClass */
  override var time: java.lang.String = js.native
  /**
    * Envelope version. For internal use only. By assigning this the default, it will not be serialized within the payload unless changed to a value other than #1.
    */
  /* CompleteClass */
  override var ver: scala.Double = js.native
}

