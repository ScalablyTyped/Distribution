package typings.applicationinsights.outDeclarationsContractsTelemetryTypesDependencyTelemetryMod

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyTelemetry extends Telemetry {
  /**
    * Remote call data. This is the most detailed information about the call, such as full URL or SQL statement
    */
  var data: String
  /**
    * Type name of the telemetry, such as HTTP of SQL
    */
  var dependencyTypeName: String
  /**
    * Remote call duration in ms
    */
  var duration: Double
  /**
    * Remote call name
    */
  var name: String
  /**
    * Result code returned form the remote component. This is domain specific and can be HTTP status code or SQL result code
    */
  var resultCode: String | Double
  /**
    * True if remote call was successful, false otherwise
    */
  var success: Boolean
  /**
    * Remote component general target information
    * If left empty, this will be prepopulated with an extracted hostname from the data field, if it is a url.
    * This prepopulation happens when calling `trackDependency`. Use `track` directly to avoid this behavior.
    */
  var target: js.UndefOr[String] = js.undefined
}

object DependencyTelemetry {
  @scala.inline
  def apply(
    data: String,
    dependencyTypeName: String,
    duration: Double,
    name: String,
    resultCode: String | Double,
    success: Boolean,
    contextObjects: StringDictionary[js.Any] = null,
    properties: StringDictionary[String] = null,
    tagOverrides: StringDictionary[String] = null,
    target: String = null,
    time: Date = null
  ): DependencyTelemetry = {
    val __obj = js.Dynamic.literal(data = data, dependencyTypeName = dependencyTypeName, duration = duration, name = name, resultCode = resultCode.asInstanceOf[js.Any], success = success)
    if (contextObjects != null) __obj.updateDynamic("contextObjects")(contextObjects)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (tagOverrides != null) __obj.updateDynamic("tagOverrides")(tagOverrides)
    if (target != null) __obj.updateDynamic("target")(target)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[DependencyTelemetry]
  }
}

