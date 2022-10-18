package typings.antvComponent.libTypesMod

import typings.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendBaseCfg
  extends StObject
     with GroupComponentCfg {
  
  /**
    * 背景框配置项
    * @type {LegendBackgroundCfg}
    */
  var background: js.UndefOr[LegendBackgroundCfg] = js.undefined
  
  /**
    * 布局方式： horizontal，vertical
    * @type {String}
    */
  var layout: js.UndefOr[String] = js.undefined
  
  /**
    * 标题
    * @type {LegendTitleCfg}
    */
  var title: js.UndefOr[LegendTitleCfg] = js.undefined
  
  /**
    * 位置 x
    * @type {number}
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * 位置 y
    * @type {number}
    */
  var y: js.UndefOr[Double] = js.undefined
}
object LegendBaseCfg {
  
  inline def apply(container: IGroup): LegendBaseCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendBaseCfg]
  }
  
  extension [Self <: LegendBaseCfg](x: Self) {
    
    inline def setBackground(value: LegendBackgroundCfg): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setTitle(value: LegendTitleCfg): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
