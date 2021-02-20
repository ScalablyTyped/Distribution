package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrosshairBaseCfg extends GroupComponentCfg {
  
  /**
    * 线的样式
    * @type {CrosshairLineCfg}
    */
  var line: js.UndefOr[CrosshairLineCfg] = js.native
  
  /**
    * 附加文本的样式
    * @type {CrosshairTextCfg}
    */
  var text: js.UndefOr[CrosshairTextCfg] = js.native
  
  /**
    * 文本背景的配置项
    * @type {CrosshairTextBackgroundCfg}
    */
  var textBackground: js.UndefOr[CrosshairTextBackgroundCfg] = js.native
}
object CrosshairBaseCfg {
  
  @scala.inline
  def apply(container: IGroup): CrosshairBaseCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairBaseCfg]
  }
  
  @scala.inline
  implicit class CrosshairBaseCfgMutableBuilder[Self <: CrosshairBaseCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: CrosshairLineCfg): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setText(value: CrosshairTextCfg): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBackground(value: CrosshairTextBackgroundCfg): Self = StObject.set(x, "textBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBackgroundUndefined: Self = StObject.set(x, "textBackground", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
