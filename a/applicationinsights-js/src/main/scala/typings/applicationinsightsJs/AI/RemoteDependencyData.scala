package typings.applicationinsightsJs.AI

import typings.applicationinsightsJs.Microsoft.Telemetry.Domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteDependencyData extends Domain {
  var async: Boolean
  var commandName: String
  var count: Double
  var dependencyKind: DependencyKind
  var dependencySource: DependencySourceType
  var dependencyTypeName: String
  var id: String
  var kind: DataPointType
  var max: Double
  var min: Double
  var name: String
  var properties: js.Any
  var resultCode: String
  var stdDev: Double
  var success: Boolean
  var value: Double
  var ver: Double
}

object RemoteDependencyData {
  @scala.inline
  def apply(
    async: Boolean,
    commandName: String,
    count: Double,
    dependencyKind: DependencyKind,
    dependencySource: DependencySourceType,
    dependencyTypeName: String,
    id: String,
    kind: DataPointType,
    max: Double,
    min: Double,
    name: String,
    properties: js.Any,
    resultCode: String,
    stdDev: Double,
    success: Boolean,
    value: Double,
    ver: Double
  ): RemoteDependencyData = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dependencyKind = dependencyKind.asInstanceOf[js.Any], dependencySource = dependencySource.asInstanceOf[js.Any], dependencyTypeName = dependencyTypeName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any], stdDev = stdDev.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteDependencyData]
  }
}

