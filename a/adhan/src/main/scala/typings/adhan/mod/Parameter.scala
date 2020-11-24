package typings.adhan.mod

import typings.adhan.anon.Asr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameter extends js.Object {
  
  var adjustments: Asr = js.native
  
  var fajrAngle: Double = js.native
  
  var highLatitudeRule: HighLatitudeRule = js.native
  
  var ishaAngle: Double = js.native
  
  var ishaInterval: Double = js.native
  
  var madhab: Madhab = js.native
  
  val method: String = js.native
}
object Parameter {
  
  @scala.inline
  def apply(
    adjustments: Asr,
    fajrAngle: Double,
    highLatitudeRule: HighLatitudeRule,
    ishaAngle: Double,
    ishaInterval: Double,
    madhab: Madhab,
    method: String
  ): Parameter = {
    val __obj = js.Dynamic.literal(adjustments = adjustments.asInstanceOf[js.Any], fajrAngle = fajrAngle.asInstanceOf[js.Any], highLatitudeRule = highLatitudeRule.asInstanceOf[js.Any], ishaAngle = ishaAngle.asInstanceOf[js.Any], ishaInterval = ishaInterval.asInstanceOf[js.Any], madhab = madhab.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
  
  @scala.inline
  implicit class ParameterOps[Self <: Parameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdjustments(value: Asr): Self = this.set("adjustments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFajrAngle(value: Double): Self = this.set("fajrAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighLatitudeRule(value: HighLatitudeRule): Self = this.set("highLatitudeRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIshaAngle(value: Double): Self = this.set("ishaAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIshaInterval(value: Double): Self = this.set("ishaInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMadhab(value: Madhab): Self = this.set("madhab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
  }
}
