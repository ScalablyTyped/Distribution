package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
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
  
  @scala.inline
  def apply(container: IGroup): LegendBaseCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendBaseCfg]
  }
  
  @scala.inline
  implicit class LegendBaseCfgMutableBuilder[Self <: LegendBaseCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: LegendBackgroundCfg): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setTitle(value: LegendTitleCfg): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
