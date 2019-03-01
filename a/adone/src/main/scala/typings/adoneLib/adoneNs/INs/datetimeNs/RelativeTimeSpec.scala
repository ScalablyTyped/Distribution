package typings
package adoneLib.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeSpec extends js.Object {
  var M: RelativeTimeSpecVal
  var MM: RelativeTimeSpecVal
  var d: RelativeTimeSpecVal
  var dd: RelativeTimeSpecVal
  var future: RelativeTimeFuturePastVal
  var h: RelativeTimeSpecVal
  var hh: RelativeTimeSpecVal
  var m: RelativeTimeSpecVal
  var mm: RelativeTimeSpecVal
  var past: RelativeTimeFuturePastVal
  var s: RelativeTimeSpecVal
  var y: RelativeTimeSpecVal
  var yy: RelativeTimeSpecVal
}

object RelativeTimeSpec {
  @scala.inline
  def apply(
    M: RelativeTimeSpecVal,
    MM: RelativeTimeSpecVal,
    d: RelativeTimeSpecVal,
    dd: RelativeTimeSpecVal,
    future: RelativeTimeFuturePastVal,
    h: RelativeTimeSpecVal,
    hh: RelativeTimeSpecVal,
    m: RelativeTimeSpecVal,
    mm: RelativeTimeSpecVal,
    past: RelativeTimeFuturePastVal,
    s: RelativeTimeSpecVal,
    y: RelativeTimeSpecVal,
    yy: RelativeTimeSpecVal
  ): RelativeTimeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("M")(M.asInstanceOf[js.Any])
    __obj.updateDynamic("MM")(MM.asInstanceOf[js.Any])
    __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    __obj.updateDynamic("dd")(dd.asInstanceOf[js.Any])
    __obj.updateDynamic("future")(future.asInstanceOf[js.Any])
    __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    __obj.updateDynamic("hh")(hh.asInstanceOf[js.Any])
    __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    __obj.updateDynamic("mm")(mm.asInstanceOf[js.Any])
    __obj.updateDynamic("past")(past.asInstanceOf[js.Any])
    __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.updateDynamic("yy")(yy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeSpec]
  }
}

