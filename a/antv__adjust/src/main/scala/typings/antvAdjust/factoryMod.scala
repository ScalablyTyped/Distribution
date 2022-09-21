package typings.antvAdjust

import typings.antvAdjust.adjustMod.AdjustConstructor
import typings.antvAdjust.adjustMod.default
import typings.antvAdjust.anon.AdjustCfgdimValuesMapDimV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@antv/adjust/lib/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/adjust/lib/factory", "Adjust")
  @js.native
  abstract class Adjust protected () extends default {
    def this(cfg: AdjustCfgdimValuesMapDimV) = this()
  }
  
  /**
    * 根据类型获取 Adjust 类
    * @param type
    */
  inline def getAdjust(`type`: String): AdjustConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjust")(`type`.asInstanceOf[js.Any]).asInstanceOf[AdjustConstructor]
  
  /**
    * 注册自定义 Adjust
    * @param type
    * @param ctor
    */
  inline def registerAdjust(`type`: String, ctor: AdjustConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAdjust")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
