package typings.applicationinsightsJs.AI

import typings.applicationinsightsJs.Microsoft.Telemetry.Domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteDependencyData extends Domain {
  var async: Boolean = js.native
  var commandName: String = js.native
  var count: Double = js.native
  var dependencyKind: DependencyKind = js.native
  var dependencySource: DependencySourceType = js.native
  var dependencyTypeName: String = js.native
  var id: String = js.native
  var kind: DataPointType = js.native
  var max: Double = js.native
  var min: Double = js.native
  var name: String = js.native
  var properties: js.Any = js.native
  var resultCode: String = js.native
  var stdDev: Double = js.native
  var success: Boolean = js.native
  var value: Double = js.native
  var ver: Double = js.native
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandName(value: String): Self = this.set("commandName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencyKind(value: DependencyKind): Self = this.set("dependencyKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencySource(value: DependencySourceType): Self = this.set("dependencySource", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencyTypeName(value: String): Self = this.set("dependencyTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: DataPointType): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultCode(value: String): Self = this.set("resultCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdDev(value: Double): Self = this.set("stdDev", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setVer(value: Double): Self = this.set("ver", value.asInstanceOf[js.Any])
  }
  
}

