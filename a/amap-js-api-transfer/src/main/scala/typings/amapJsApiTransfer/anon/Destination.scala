package typings.amapJsApiTransfer.anon

import typings.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destination extends js.Object {
  /**
    * 终点坐标
    */
  var destination: LocationValue
  /**
    * 终点名称
    */
  var destinationName: js.UndefOr[String] = js.undefined
  /**
    * 起点坐标
    */
  var origin: LocationValue
  /**
    * 起点名称
    */
  var originName: js.UndefOr[String] = js.undefined
}

object Destination {
  @scala.inline
  def apply(
    destination: LocationValue,
    origin: LocationValue,
    destinationName: String = null,
    originName: String = null
  ): Destination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (originName != null) __obj.updateDynamic("originName")(originName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
}

