package typings.antvComponent.typesMod

import org.scalablytyped.runtime.StObject
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
  implicit class ComponentCfgMutableBuilder[Self <: ComponentCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateOption(value: AnimateOption): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateOptionUndefined: Self = StObject.set(x, "animateOption", js.undefined)
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    @scala.inline
    def setDefaultCfg(value: js.Object): Self = StObject.set(x, "defaultCfg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCfgUndefined: Self = StObject.set(x, "defaultCfg", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = StObject.set(x, "LocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationTypeUndefined: Self = StObject.set(x, "LocationType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdateAutoRender(value: Boolean): Self = StObject.set(x, "updateAutoRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAutoRenderUndefined: Self = StObject.set(x, "updateAutoRender", js.undefined)
  }
}
