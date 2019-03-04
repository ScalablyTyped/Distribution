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

object DependencyTelemetry {
  @scala.inline
  def apply(
    data: java.lang.String,
    dependencyTypeName: java.lang.String,
    duration: scala.Double,
    name: java.lang.String,
    resultCode: java.lang.String | scala.Double,
    success: scala.Boolean,
    contextObjects: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    tagOverrides: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    target: java.lang.String = null,
    time: stdLib.Date = null
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

