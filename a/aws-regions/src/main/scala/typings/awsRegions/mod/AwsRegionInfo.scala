package typings.awsRegions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsRegionInfo extends js.Object {
  var code: String = js.native
  var full_name: String = js.native
  var name: String = js.native
  var public: Boolean = js.native
  var zones: js.Array[String] = js.native
}

object AwsRegionInfo {
  @scala.inline
  def apply(code: String, full_name: String, name: String, public: Boolean, zones: js.Array[String]): AwsRegionInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsRegionInfo]
  }
  @scala.inline
  implicit class AwsRegionInfoOps[Self <: AwsRegionInfo] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    @scala.inline
    def setZonesVarargs(value: String*): Self = this.set("zones", js.Array(value :_*))
    @scala.inline
    def setZones(value: js.Array[String]): Self = this.set("zones", value.asInstanceOf[js.Any])
  }
  
}

