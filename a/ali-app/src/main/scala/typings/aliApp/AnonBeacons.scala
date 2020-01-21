package typings.aliApp

import typings.aliApp.my.Beacon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBeacons extends js.Object {
  var beacons: js.Array[Beacon]
}

object AnonBeacons {
  @scala.inline
  def apply(beacons: js.Array[Beacon]): AnonBeacons = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBeacons]
  }
}

