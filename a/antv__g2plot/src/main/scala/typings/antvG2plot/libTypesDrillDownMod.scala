package typings.antvG2plot

import typings.antvG2plot.anon.ActiveTextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesDrillDownMod {
  
  trait DrillDownCfg extends StObject {
    
    /**
      * @title 面包屑
      * @description 设置面包屑相关配置
      */
    var breadCrumb: js.UndefOr[ActiveTextStyle] = js.undefined
    
    /**
      * @title 是否启用
      * @description 是否启用 drillDown interaction
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
  }
  object DrillDownCfg {
    
    inline def apply(): DrillDownCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillDownCfg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrillDownCfg] (val x: Self) extends AnyVal {
      
      inline def setBreadCrumb(value: ActiveTextStyle): Self = StObject.set(x, "breadCrumb", value.asInstanceOf[js.Any])
      
      inline def setBreadCrumbUndefined: Self = StObject.set(x, "breadCrumb", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
}
