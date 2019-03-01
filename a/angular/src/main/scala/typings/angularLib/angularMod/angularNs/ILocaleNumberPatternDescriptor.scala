package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocaleNumberPatternDescriptor extends js.Object {
  var gSize: scala.Double
  var lgSize: scala.Double
  var maxFrac: scala.Double
  var minFrac: scala.Double
  var minInt: scala.Double
  var negPre: java.lang.String
  var negSuf: java.lang.String
  var posPre: java.lang.String
  var posSuf: java.lang.String
}

object ILocaleNumberPatternDescriptor {
  @scala.inline
  def apply(
    gSize: scala.Double,
    lgSize: scala.Double,
    maxFrac: scala.Double,
    minFrac: scala.Double,
    minInt: scala.Double,
    negPre: java.lang.String,
    negSuf: java.lang.String,
    posPre: java.lang.String,
    posSuf: java.lang.String
  ): ILocaleNumberPatternDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gSize")(gSize)
    __obj.updateDynamic("lgSize")(lgSize)
    __obj.updateDynamic("maxFrac")(maxFrac)
    __obj.updateDynamic("minFrac")(minFrac)
    __obj.updateDynamic("minInt")(minInt)
    __obj.updateDynamic("negPre")(negPre)
    __obj.updateDynamic("negSuf")(negSuf)
    __obj.updateDynamic("posPre")(posPre)
    __obj.updateDynamic("posSuf")(posSuf)
    __obj.asInstanceOf[ILocaleNumberPatternDescriptor]
  }
}

