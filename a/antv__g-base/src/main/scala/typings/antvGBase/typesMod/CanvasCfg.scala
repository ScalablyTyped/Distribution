package typings.antvGBase.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasCfg
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * 是否可监听
    * @type {boolean}
    */
  var capture: js.UndefOr[Boolean] = js.native
  
  /**
    * 容器
    * @type {string|HTMLElement}
    */
  var container: String | HTMLElement = js.native
  
  /**
    * 画布的 cursor 样式
    * @type {Cursor}
    */
  var cursor: js.UndefOr[Cursor] = js.native
  
  /**
    * 画布高度
    * @type {number}
    */
  var height: Double = js.native
  
  /**
    * 只读属性，渲染引擎
    * @type {string}
    */
  var renderer: js.UndefOr[Renderer] = js.native
  
  /**
    * 画布宽度
    * @type {number}
    */
  var width: Double = js.native
}
object CanvasCfg {
  
  @scala.inline
  def apply(container: String | HTMLElement, height: Double, width: Double): CanvasCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasCfg]
  }
  
  @scala.inline
  implicit class CanvasCfgOps[Self <: CanvasCfg] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String | HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    
    @scala.inline
    def setCursor(value: Cursor): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setRenderer(value: Renderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
  }
}
