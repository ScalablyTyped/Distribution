package typings.awsDashRegions.awsDashRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsRegionInfo extends js.Object {
  var code: String
  var full_name: String
  var name: String
  var public: Boolean
  var zones: js.Array[String]
}

object AwsRegionInfo {
  @scala.inline
  def apply(code: String, full_name: String, name: String, public: Boolean, zones: js.Array[String]): AwsRegionInfo = {
    val __obj = js.Dynamic.literal(code = code, full_name = full_name, name = name, public = public, zones = zones)
  
    __obj.asInstanceOf[AwsRegionInfo]
  }
}

