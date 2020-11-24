package typings.antvAdjust.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackCfg extends js.Object {
  
  val adjustNames: js.UndefOr[js.Array[String]] = js.native
  
  val height: js.UndefOr[Double] = js.native
  
  val reverseOrder: js.UndefOr[Boolean] = js.native
  
  val size: js.UndefOr[Double] = js.native
  
  val xField: String = js.native
  
  val yField: js.UndefOr[String] = js.native
}
object StackCfg {
  
  @scala.inline
  def apply(xField: String): StackCfg = {
    val __obj = js.Dynamic.literal(xField = xField.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackCfg]
  }
  
  @scala.inline
  implicit class StackCfgOps[Self <: StackCfg] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setReverseOrder(value: Boolean): Self = this.set("reverseOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseOrder: Self = this.set("reverseOrder", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setYField(value: String): Self = this.set("yField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYField: Self = this.set("yField", js.undefined)
  }
}
