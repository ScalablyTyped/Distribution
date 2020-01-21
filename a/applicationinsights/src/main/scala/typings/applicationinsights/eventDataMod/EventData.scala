package typings.applicationinsights.eventDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instances of Event represent structured event records that can be grouped and searched by their properties. Event data item also creates a metric of event count by name.
  */
@js.native
trait EventData
  extends typings.applicationinsights.domainMod.^ {
  /**
    * Collection of custom measurements.
    */
  var measurements: js.Any = js.native
  /**
    * Event name. Keep it low cardinality to allow proper grouping and useful metrics.
    */
  var name: String = js.native
  /**
    * Collection of custom properties.
    */
  var properties: js.Any = js.native
  /**
    * Schema version
    */
  var ver: Double = js.native
}

