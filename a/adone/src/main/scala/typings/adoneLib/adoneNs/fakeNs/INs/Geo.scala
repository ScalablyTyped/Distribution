package typings
package adoneLib.adoneNs.fakeNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geo extends js.Object {
  var lat: java.lang.String
  var lng: java.lang.String
}

object Geo {
  @scala.inline
  def apply(lat: java.lang.String, lng: java.lang.String): Geo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lat")(lat)
    __obj.updateDynamic("lng")(lng)
    __obj.asInstanceOf[Geo]
  }
}

