package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentAnimateOption extends StObject {
  
  /**
    * @title 初入场动画配置
    */
  var appear: js.UndefOr[ComponentAnimateCfg] = js.undefined
  
  /**
    * @title 更新后新入场的动画配置
    */
  var enter: js.UndefOr[ComponentAnimateCfg] = js.undefined
  
  /**
    * @title 离场动画配置
    */
  var leave: js.UndefOr[ComponentAnimateCfg] = js.undefined
  
  /**
    * @title 更新动画配置
    */
  var update: js.UndefOr[ComponentAnimateCfg] = js.undefined
}
object ComponentAnimateOption {
  
  inline def apply(): ComponentAnimateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentAnimateOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentAnimateOption] (val x: Self) extends AnyVal {
    
    inline def setAppear(value: ComponentAnimateCfg): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
    
    inline def setEnter(value: ComponentAnimateCfg): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setLeave(value: ComponentAnimateCfg): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
    
    inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    
    inline def setUpdate(value: ComponentAnimateCfg): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
