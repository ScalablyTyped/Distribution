package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typings.applicationinsightsJs.AI.DataPointType
import typings.applicationinsightsJs.AI.DependencyKind
import typings.applicationinsightsJs.AI.DependencySourceType
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteDependencyData
  extends typings.applicationinsightsJs.AI.RemoteDependencyData
     with ISerializable {
  /* private */ def formatDependencyName(method: js.Any, absoluteUrl: js.Any): js.Any = js.native
}

object RemoteDependencyData {
  @scala.inline
  def apply(
    aiDataContract: js.Any,
    async: Boolean,
    commandName: String,
    count: Double,
    dependencyKind: DependencyKind,
    dependencySource: DependencySourceType,
    dependencyTypeName: String,
    formatDependencyName: (js.Any, js.Any) => js.Any,
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
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dependencyKind = dependencyKind.asInstanceOf[js.Any], dependencySource = dependencySource.asInstanceOf[js.Any], dependencyTypeName = dependencyTypeName.asInstanceOf[js.Any], formatDependencyName = js.Any.fromFunction2(formatDependencyName), id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any], stdDev = stdDev.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteDependencyData]
  }
  @scala.inline
  implicit class RemoteDependencyDataOps[Self <: RemoteDependencyData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormatDependencyName(value: (js.Any, js.Any) => js.Any): Self = this.set("formatDependencyName", js.Any.fromFunction2(value))
  }
  
}

