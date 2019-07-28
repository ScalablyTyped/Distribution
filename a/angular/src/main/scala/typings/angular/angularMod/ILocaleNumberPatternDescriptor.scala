package typings.angular.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocaleNumberPatternDescriptor extends js.Object {
  var gSize: Double
  var lgSize: Double
  var maxFrac: Double
  var minFrac: Double
  var minInt: Double
  var negPre: String
  var negSuf: String
  var posPre: String
  var posSuf: String
}

object ILocaleNumberPatternDescriptor {
  @scala.inline
  def apply(
    gSize: Double,
    lgSize: Double,
    maxFrac: Double,
    minFrac: Double,
    minInt: Double,
    negPre: String,
    negSuf: String,
    posPre: String,
    posSuf: String
  ): ILocaleNumberPatternDescriptor = {
    val __obj = js.Dynamic.literal(gSize = gSize, lgSize = lgSize, maxFrac = maxFrac, minFrac = minFrac, minInt = minInt, negPre = negPre, negSuf = negSuf, posPre = posPre, posSuf = posSuf)
  
    __obj.asInstanceOf[ILocaleNumberPatternDescriptor]
  }
}

