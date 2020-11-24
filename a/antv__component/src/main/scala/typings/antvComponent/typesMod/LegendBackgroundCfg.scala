package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendBackgroundCfg extends js.Object {
  
  /**
    * @type {number|number[]}
    * 背景的留白
    */
  var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * @type {ShapeAttrs}
    * 背景配置项
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
}
object LegendBackgroundCfg {
  
  @scala.inline
  def apply(): LegendBackgroundCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendBackgroundCfg]
  }
  
  @scala.inline
  implicit class LegendBackgroundCfgOps[Self <: LegendBackgroundCfg] (val x: Self) extends AnyVal {
    
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
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: Double | js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
