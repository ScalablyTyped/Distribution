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
    val __obj = js.Dynamic.literal(gSize = gSize, lgSize = lgSize, maxFrac = maxFrac, minFrac = minFrac, minInt = minInt, negPre = negPre, negSuf = negSuf, posPre = posPre, posSuf = posSuf)
  
    __obj.asInstanceOf[ILocaleNumberPatternDescriptor]
  }
}

