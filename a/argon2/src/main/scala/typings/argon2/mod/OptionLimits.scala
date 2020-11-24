package typings.argon2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionLimits extends js.Object {
  
  var hashLength: NumericLimit = js.native
  
  var memoryCost: NumericLimit = js.native
  
  var parallelism: NumericLimit = js.native
  
  var timeCost: NumericLimit = js.native
}
object OptionLimits {
  
  @scala.inline
  def apply(
    hashLength: NumericLimit,
    memoryCost: NumericLimit,
    parallelism: NumericLimit,
    timeCost: NumericLimit
  ): OptionLimits = {
    val __obj = js.Dynamic.literal(hashLength = hashLength.asInstanceOf[js.Any], memoryCost = memoryCost.asInstanceOf[js.Any], parallelism = parallelism.asInstanceOf[js.Any], timeCost = timeCost.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionLimits]
  }
  
  @scala.inline
  implicit class OptionLimitsOps[Self <: OptionLimits] (val x: Self) extends AnyVal {
    
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
    def setHashLength(value: NumericLimit): Self = this.set("hashLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryCost(value: NumericLimit): Self = this.set("memoryCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelism(value: NumericLimit): Self = this.set("parallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCost(value: NumericLimit): Self = this.set("timeCost", value.asInstanceOf[js.Any])
  }
}
