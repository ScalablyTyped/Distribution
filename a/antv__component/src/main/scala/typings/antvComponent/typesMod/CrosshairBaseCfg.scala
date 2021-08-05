package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrosshairBaseCfg
  extends StObject
     with GroupComponentCfg {
  
  /**
    * 线的样式
    * @type {CrosshairLineCfg}
    */
  var line: js.UndefOr[CrosshairLineCfg] = js.undefined
  
  /**
    * 附加文本的样式
    * @type {CrosshairTextCfg}
    */
  var text: js.UndefOr[CrosshairTextCfg] = js.undefined
  
  /**
    * 文本背景的配置项
    * @type {CrosshairTextBackgroundCfg}
    */
  var textBackground: js.UndefOr[CrosshairTextBackgroundCfg] = js.undefined
}
object CrosshairBaseCfg {
  
  inline def apply(container: IGroup): CrosshairBaseCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairBaseCfg]
  }
  
  extension [Self <: CrosshairBaseCfg](x: Self) {
    
    inline def setLine(value: CrosshairLineCfg): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setText(value: CrosshairTextCfg): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextBackground(value: CrosshairTextBackgroundCfg): Self = StObject.set(x, "textBackground", value.asInstanceOf[js.Any])
    
    inline def setTextBackgroundUndefined: Self = StObject.set(x, "textBackground", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
