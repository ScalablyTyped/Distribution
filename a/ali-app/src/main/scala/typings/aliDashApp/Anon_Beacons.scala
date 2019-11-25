package typings.aliDashApp

import typings.aliDashApp.my.Beacon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Beacons extends js.Object {
  var beacons: js.Array[Beacon]
}

object Anon_Beacons {
  @scala.inline
  def apply(beacons: js.Array[Beacon]): Anon_Beacons = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Beacons]
  }
}

