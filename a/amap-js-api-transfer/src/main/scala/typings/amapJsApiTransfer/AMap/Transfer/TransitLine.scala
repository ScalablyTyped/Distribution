package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitLine extends js.Object {
  /**
    * 公交路线末班车时间
    */
  var etime: String | js.Array[scala.Nothing]
  /**
    * 公交路线ID
    */
  var id: String
  /**
    * 公交路线名
    */
  var name: String
  /**
    * 公交路线首班车时间
    */
  var stime: String | js.Array[scala.Nothing]
  /**
    * 公交类型
    */
  var `type`: String
}

object TransitLine {
  @scala.inline
  def apply(
    etime: String | js.Array[scala.Nothing],
    id: String,
    name: String,
    stime: String | js.Array[scala.Nothing],
    `type`: String
  ): TransitLine = {
    val __obj = js.Dynamic.literal(etime = etime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stime = stime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitLine]
  }
}

