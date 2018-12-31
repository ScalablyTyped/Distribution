package typings
package applicationinsightsLib.outDeclarationsContractsTelemetryTypesDependencyTelemetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyTelemetry
  extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry {
  /**
    * Remote call data. This is the most detailed information about the call, such as full URL or SQL statement
    */
  var data: java.lang.String
  /**
    * Type name of the telemetry, such as HTTP of SQL
    */
  var dependencyTypeName: java.lang.String
  /**
    * Remote call duration in ms
    */
  var duration: scala.Double
  /**
    * Remote call name
    */
  var name: java.lang.String
  /**
    * Result code returned form the remote component. This is domain specific and can be HTTP status code or SQL result code
    */
  var resultCode: java.lang.String | scala.Double
  /**
    * True if remote call was successful, false otherwise
    */
  var success: scala.Boolean
  /**
    * Remote component general target information
    * If left empty, this will be prepopulated with an extracted hostname from the data field, if it is a url.
    * This prepopulation happens when calling `trackDependency`. Use `track` directly to avoid this behavior.
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
}

