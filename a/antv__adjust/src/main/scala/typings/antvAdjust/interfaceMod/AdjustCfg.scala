package typings.antvAdjust.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdjustCfg extends js.Object {
  
  val adjustNames: js.UndefOr[js.Array[String]] = js.native
  
  val dodgeBy: js.UndefOr[String] = js.native
  
  val dodgeRatio: js.UndefOr[Double] = js.native
  
  val height: js.UndefOr[Double] = js.native
  
  val marginRatio: js.UndefOr[Double] = js.native
  
  val reverseOrder: js.UndefOr[Boolean] = js.native
  
  val size: js.UndefOr[Double] = js.native
  
  val xField: js.UndefOr[String] = js.native
  
  val yField: js.UndefOr[String] = js.native
}
object AdjustCfg {
  
  @scala.inline
  def apply(): AdjustCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustCfg]
  }
  
  @scala.inline
  implicit class AdjustCfgOps[Self <: AdjustCfg] (val x: Self) extends AnyVal {
    
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
    def setAdjustNamesVarargs(value: String*): Self = this.set("adjustNames", js.Array(value :_*))
    
    @scala.inline
    def setAdjustNames(value: js.Array[String]): Self = this.set("adjustNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustNames: Self = this.set("adjustNames", js.undefined)
    
    @scala.inline
    def setDodgeBy(value: String): Self = this.set("dodgeBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDodgeBy: Self = this.set("dodgeBy", js.undefined)
    
    @scala.inline
    def setDodgeRatio(value: Double): Self = this.set("dodgeRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDodgeRatio: Self = this.set("dodgeRatio", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMarginRatio(value: Double): Self = this.set("marginRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRatio: Self = this.set("marginRatio", js.undefined)
    
    @scala.inline
    def setReverseOrder(value: Boolean): Self = this.set("reverseOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseOrder: Self = this.set("reverseOrder", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setXField(value: String): Self = this.set("xField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXField: Self = this.set("xField", js.undefined)
    
    @scala.inline
    def setYField(value: String): Self = this.set("yField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYField: Self = this.set("yField", js.undefined)
  }
}
