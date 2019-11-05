package typings.adhan.adhanMod

import typings.adhan.Anon_Asr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paramater extends js.Object {
  var adjustments: Anon_Asr
  var fajrAngle: Double
  var highLatitudeRule: HighLatitudeRule
  var ishaAngle: Double
  var ishaInterval: Double
  var madhab: Madhab
  val method: String
}

object Paramater {
  @scala.inline
  def apply(
    adjustments: Anon_Asr,
    fajrAngle: Double,
    highLatitudeRule: HighLatitudeRule,
    ishaAngle: Double,
    ishaInterval: Double,
    madhab: Madhab,
    method: String
  ): Paramater = {
    val __obj = js.Dynamic.literal(adjustments = adjustments, fajrAngle = fajrAngle, highLatitudeRule = highLatitudeRule, ishaAngle = ishaAngle, ishaInterval = ishaInterval, madhab = madhab, method = method)
  
    __obj.asInstanceOf[Paramater]
  }
}

