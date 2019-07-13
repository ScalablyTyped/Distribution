package typings
package awsDashRegionsLib.awsDashRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsRegionInfo extends js.Object {
  var code: java.lang.String
  var full_name: java.lang.String
  var name: java.lang.String
  var public: scala.Boolean
  var zones: js.Array[java.lang.String]
}

object AwsRegionInfo {
  @scala.inline
  def apply(
    code: java.lang.String,
    full_name: java.lang.String,
    name: java.lang.String,
    public: scala.Boolean,
    zones: js.Array[java.lang.String]
  ): AwsRegionInfo = {
    val __obj = js.Dynamic.literal(code = code, full_name = full_name, name = name, public = public, zones = zones)
  
    __obj.asInstanceOf[AwsRegionInfo]
  }
}

