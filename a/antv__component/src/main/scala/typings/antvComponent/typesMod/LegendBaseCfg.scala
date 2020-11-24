package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendBaseCfg extends GroupComponentCfg {
  
  /**
    * 背景框配置项
    * @type {LegendBackgroundCfg}
    */
  var background: js.UndefOr[LegendBackgroundCfg] = js.native
  
  /**
    * 布局方式： horizontal，vertical
    * @type {String}
    */
  var layout: js.UndefOr[String] = js.native
  
  /**
    * 标题
    * @type {LegendTitleCfg}
    */
  var title: js.UndefOr[LegendTitleCfg] = js.native
  
  /**
    * 位置 x
    * @type {number}
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * 位置 y
    * @type {number}
    */
  var y: js.UndefOr[Double] = js.native
}
object LegendBaseCfg {
  
  @scala.inline
  def apply(container: IGroup): LegendBaseCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendBaseCfg]
  }
  
  @scala.inline
  implicit class LegendBaseCfgOps[Self <: LegendBaseCfg] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: LegendBackgroundCfg): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setTitle(value: LegendTitleCfg): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
