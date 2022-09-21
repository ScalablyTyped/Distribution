package typings.antvG2

import typings.antvG2.pathMod.PathCfg
import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areaMod {
  
  @JSImport("@antv/g2/lib/geometry/area", JSImport.Default)
  @js.native
  open class default protected () extends Area {
    def this(cfg: AreaCfg) = this()
  }
  
  @js.native
  trait Area
    extends typings.antvG2.pathMod.default {
    
    /**
      * 面积图是否从 0 基准线开始填充。
      * 1. 默认值为 `true`，表现如下：
      * ![image](https://gw.alipayobjects.com/zos/rmsportal/ZQqwUCczalrKqGgagOVp.png)
      * 2. 当值为 `false` 时，表现如下：
      * ![image](https://gw.alipayobjects.com/zos/rmsportal/yPswkaXvUpCYOdhocGwB.png)
      */
    val startOnZero: Boolean = js.native
  }
  
  trait AreaCfg
    extends StObject
       with PathCfg {
    
    /**
      * 面积图是否从 0 基准线开始填充。
      * 1. 默认值为 `true`，表现如下：
      * ![image](https://gw.alipayobjects.com/zos/rmsportal/ZQqwUCczalrKqGgagOVp.png)
      * 2. 当值为 `false` 时，表现如下：
      * ![image](https://gw.alipayobjects.com/zos/rmsportal/yPswkaXvUpCYOdhocGwB.png)
      */
    var startOnZero: js.UndefOr[Boolean] = js.undefined
  }
  object AreaCfg {
    
    inline def apply(container: IGroup): AreaCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[AreaCfg]
    }
    
    extension [Self <: AreaCfg](x: Self) {
      
      inline def setStartOnZero(value: Boolean): Self = StObject.set(x, "startOnZero", value.asInstanceOf[js.Any])
      
      inline def setStartOnZeroUndefined: Self = StObject.set(x, "startOnZero", js.undefined)
    }
  }
}
