package typings
package agoraDashRtcDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Birate extends js.Object {
  var birate: scala.Double
  var framerate: scala.Double
  var height: scala.Double
  var width: scala.Double
}

object Anon_Birate {
  @scala.inline
  def apply(birate: scala.Double, framerate: scala.Double, height: scala.Double, width: scala.Double): Anon_Birate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("birate")(birate)
    __obj.updateDynamic("framerate")(framerate)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Birate]
  }
}

