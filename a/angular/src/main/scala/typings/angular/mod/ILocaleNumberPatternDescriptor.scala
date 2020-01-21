package typings.angular.mod

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
    val __obj = js.Dynamic.literal(gSize = gSize.asInstanceOf[js.Any], lgSize = lgSize.asInstanceOf[js.Any], maxFrac = maxFrac.asInstanceOf[js.Any], minFrac = minFrac.asInstanceOf[js.Any], minInt = minInt.asInstanceOf[js.Any], negPre = negPre.asInstanceOf[js.Any], negSuf = negSuf.asInstanceOf[js.Any], posPre = posPre.asInstanceOf[js.Any], posSuf = posSuf.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILocaleNumberPatternDescriptor]
  }
}

