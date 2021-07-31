package typings.antd.anon

import typings.antd.sliderMod.HandleGeneratorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixCls extends StObject {
  
  var info: HandleGeneratorInfo
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var tooltipPrefixCls: js.UndefOr[String] = js.undefined
}
object PrefixCls {
  
  @scala.inline
  def apply(info: HandleGeneratorInfo): PrefixCls = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixCls]
  }
  
  @scala.inline
  implicit class PrefixClsMutableBuilder[Self <: PrefixCls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: HandleGeneratorInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setTooltipPrefixCls(value: String): Self = StObject.set(x, "tooltipPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipPrefixClsUndefined: Self = StObject.set(x, "tooltipPrefixCls", js.undefined)
  }
}
