package typings.antvComponent.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentCfg extends BaseCfg {
  
  /**
    * 定位的方式
    * @type {string}
    */
  var LocationType: js.UndefOr[String] = js.native
  
  /**
    * 是否允许动画，不同组件允许动画的内容不同
    * @type {boolean}
    */
  var animate: js.UndefOr[Boolean] = js.native
  
  /**
    * 动画的配置项
    * @type {AnimateCfg}
    */
  var animateOption: js.UndefOr[AnimateOption] = js.native
  
  /**
    * 是否会捕捉事件
    */
  var capture: js.UndefOr[Boolean] = js.native
  
  /**
    * @protected
    * 配置项生效时的默认值，一些配置项是对象时，防止将一些内置的配置项清空，减少判空判断
    * @example
    * new Axis({
    *   tickLine: {
    *     length: 10 // 此时没有设置 style，内部调用 tickLine.style 时会出问题
    *   }
    * })
    * @type {object}
    */
  var defaultCfg: js.UndefOr[js.Object] = js.native
  
  /**
    * 事件对象，可以在配置项中传入事件
    * @example
    * events: {
    *   itemclick: ev => {
    *
    *   }
    * }
    * // 等效于
    * component.on('itemclick', ev => {
    *
    * });
    * @type {object}
    */
  var events: js.UndefOr[js.Object] = js.native
  
  /**
    * 唯一标定组件的 id
    * @type {string}
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 组件名称， axis, legend, tooltip
    * @type {string}
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * 偏移位置 x
    * @type {number}
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * 偏移位置 y
    * @type {number}
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  /**
    * 组件的类型，同 name 配合使用可以确定具体组件的类型，例如：
    *  name: 'axis',
    *  type: 'line'
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * 更新时自动渲染, 所有 html 的组件 update 时自动调用渲染，group 的组件默认 false
    */
  var updateAutoRender: js.UndefOr[Boolean] = js.native
}
object ComponentCfg {
  
  @scala.inline
  def apply(): ComponentCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentCfg]
  }
  
  @scala.inline
  implicit class ComponentCfgOps[Self <: ComponentCfg] (val x: Self) extends AnyVal {
    
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
    def setLocationType(value: String): Self = this.set("LocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationType: Self = this.set("LocationType", js.undefined)
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setAnimateOption(value: AnimateOption): Self = this.set("animateOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateOption: Self = this.set("animateOption", js.undefined)
    
    @scala.inline
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    
    @scala.inline
    def setDefaultCfg(value: js.Object): Self = this.set("defaultCfg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCfg: Self = this.set("defaultCfg", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Object): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdateAutoRender(value: Boolean): Self = this.set("updateAutoRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateAutoRender: Self = this.set("updateAutoRender", js.undefined)
  }
}
