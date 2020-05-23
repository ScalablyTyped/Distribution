package typings.aliApp.anon

import typings.aliApp.my.Beacon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Beacons extends js.Object {
  var beacons: js.Array[Beacon]
}

object Beacons {
  @scala.inline
  def apply(beacons: js.Array[Beacon]): Beacons = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beacons]
  }
}

