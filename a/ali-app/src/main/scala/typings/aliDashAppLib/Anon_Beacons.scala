package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Beacons extends js.Object {
  var beacons: js.Array[aliDashAppLib.myNs.Beacon]
}

object Anon_Beacons {
  @scala.inline
  def apply(beacons: js.Array[aliDashAppLib.myNs.Beacon]): Anon_Beacons = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beacons")(beacons)
    __obj.asInstanceOf[Anon_Beacons]
  }
}

