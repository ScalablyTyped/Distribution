package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueLegendHandlerCfg extends js.Object {
  
  /**
    * 滑块大小
    * @type {number}
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * 滑块样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
}
object ContinueLegendHandlerCfg {
  
  @scala.inline
  def apply(): ContinueLegendHandlerCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueLegendHandlerCfg]
  }
  
  @scala.inline
  implicit class ContinueLegendHandlerCfgOps[Self <: ContinueLegendHandlerCfg] (val x: Self) extends AnyVal {
    
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
