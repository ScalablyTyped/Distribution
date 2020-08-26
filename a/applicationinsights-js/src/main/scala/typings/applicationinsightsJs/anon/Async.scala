package typings.applicationinsightsJs.anon

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Async extends js.Object {
  var async: FieldType = js.native
  var commandName: FieldType = js.native
  var count: FieldType = js.native
  var dependencyKind: FieldType = js.native
  var dependencySource: FieldType = js.native
  var dependencyTypeName: FieldType = js.native
  var id: FieldType = js.native
  var kind: FieldType = js.native
  var max: FieldType = js.native
  var min: FieldType = js.native
  var name: FieldType = js.native
  var properties: FieldType = js.native
  var resultCode: FieldType = js.native
  var stdDev: FieldType = js.native
  var success: FieldType = js.native
  var value: FieldType = js.native
  var ver: FieldType = js.native
}

object Async {
  @scala.inline
  def apply(
    async: FieldType,
    commandName: FieldType,
    count: FieldType,
    dependencyKind: FieldType,
    dependencySource: FieldType,
    dependencyTypeName: FieldType,
    id: FieldType,
    kind: FieldType,
    max: FieldType,
    min: FieldType,
    name: FieldType,
    properties: FieldType,
    resultCode: FieldType,
    stdDev: FieldType,
    success: FieldType,
    value: FieldType,
    ver: FieldType
  ): Async = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dependencyKind = dependencyKind.asInstanceOf[js.Any], dependencySource = dependencySource.asInstanceOf[js.Any], dependencyTypeName = dependencyTypeName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any], stdDev = stdDev.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
  @scala.inline
  implicit class AsyncOps[Self <: Async] (val x: Self) extends AnyVal {
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
    def setAsync(value: FieldType): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandName(value: FieldType): Self = this.set("commandName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: FieldType): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencyKind(value: FieldType): Self = this.set("dependencyKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencySource(value: FieldType): Self = this.set("dependencySource", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencyTypeName(value: FieldType): Self = this.set("dependencyTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: FieldType): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: FieldType): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: FieldType): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: FieldType): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: FieldType): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: FieldType): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultCode(value: FieldType): Self = this.set("resultCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdDev(value: FieldType): Self = this.set("stdDev", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: FieldType): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: FieldType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setVer(value: FieldType): Self = this.set("ver", value.asInstanceOf[js.Any])
  }
  
}

