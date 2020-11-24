package typings.antvAdjust.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DodgeCfg extends js.Object {
  
  val adjustNames: js.UndefOr[js.Array[String]] = js.native
  
  val columnWidthRatio: js.UndefOr[Double] = js.native
  
  val defaultSize: js.UndefOr[Double] = js.native
  
  val dodgeBy: js.UndefOr[String] = js.native
  
  val dodgePadding: js.UndefOr[Double] = js.native
  
  val dodgeRatio: js.UndefOr[Double] = js.native
  
  val groupNum: js.UndefOr[Double] = js.native
  
  val intervalPadding: js.UndefOr[Double] = js.native
  
  val marginRatio: js.UndefOr[Double] = js.native
  
  val maxColumnWidth: js.UndefOr[Double] = js.native
  
  val minColumnWidth: js.UndefOr[Double] = js.native
  
  val xDimensionLength: js.UndefOr[Double] = js.native
  
  val xField: String = js.native
  
  val yField: js.UndefOr[String] = js.native
}
object DodgeCfg {
  
  @scala.inline
  def apply(xField: String): DodgeCfg = {
    val __obj = js.Dynamic.literal(xField = xField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DodgeCfg]
  }
  
  @scala.inline
  implicit class DodgeCfgOps[Self <: DodgeCfg] (val x: Self) extends AnyVal {
    
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
    def setXField(value: String): Self = this.set("xField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustNamesVarargs(value: String*): Self = this.set("adjustNames", js.Array(value :_*))
    
    @scala.inline
    def setAdjustNames(value: js.Array[String]): Self = this.set("adjustNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustNames: Self = this.set("adjustNames", js.undefined)
    
    @scala.inline
    def setColumnWidthRatio(value: Double): Self = this.set("columnWidthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidthRatio: Self = this.set("columnWidthRatio", js.undefined)
    
    @scala.inline
    def setDefaultSize(value: Double): Self = this.set("defaultSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSize: Self = this.set("defaultSize", js.undefined)
    
    @scala.inline
    def setDodgeBy(value: String): Self = this.set("dodgeBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDodgeBy: Self = this.set("dodgeBy", js.undefined)
    
    @scala.inline
    def setDodgePadding(value: Double): Self = this.set("dodgePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDodgePadding: Self = this.set("dodgePadding", js.undefined)
    
    @scala.inline
    def setDodgeRatio(value: Double): Self = this.set("dodgeRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDodgeRatio: Self = this.set("dodgeRatio", js.undefined)
    
    @scala.inline
    def setGroupNum(value: Double): Self = this.set("groupNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupNum: Self = this.set("groupNum", js.undefined)
    
    @scala.inline
    def setIntervalPadding(value: Double): Self = this.set("intervalPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntervalPadding: Self = this.set("intervalPadding", js.undefined)
    
    @scala.inline
    def setMarginRatio(value: Double): Self = this.set("marginRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRatio: Self = this.set("marginRatio", js.undefined)
    
    @scala.inline
    def setMaxColumnWidth(value: Double): Self = this.set("maxColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxColumnWidth: Self = this.set("maxColumnWidth", js.undefined)
    
    @scala.inline
    def setMinColumnWidth(value: Double): Self = this.set("minColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinColumnWidth: Self = this.set("minColumnWidth", js.undefined)
    
    @scala.inline
    def setXDimensionLength(value: Double): Self = this.set("xDimensionLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXDimensionLength: Self = this.set("xDimensionLength", js.undefined)
    
    @scala.inline
    def setYField(value: String): Self = this.set("yField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYField: Self = this.set("yField", js.undefined)
  }
}
