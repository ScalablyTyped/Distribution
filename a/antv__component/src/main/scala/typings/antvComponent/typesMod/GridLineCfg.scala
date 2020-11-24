package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridLineCfg extends js.Object {
  
  /**
    * 栅格线的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs | ShapeAttrsCallback] = js.native
  
  /**
    * 栅格线的类型
    * @type {string}
    */
  var `type`: js.UndefOr[String] = js.native
}
object GridLineCfg {
  
  @scala.inline
  def apply(): GridLineCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridLineCfg]
  }
  
  @scala.inline
  implicit class GridLineCfgOps[Self <: GridLineCfg] (val x: Self) extends AnyVal {
    
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
    def setStyleFunction3(value: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => ShapeAttrs): Self = this.set("style", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStyle(value: ShapeAttrs | ShapeAttrsCallback): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
