package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridLineCfg extends StObject {
  
  /**
    * 栅格线的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs | ShapeAttrsCallback] = js.native
  
  /**
    * 栅格线的类型
    * @type {string}
    */
  var `type`: js.UndefOr[String] = js.native
}
object GridLineCfg {
  
  @scala.inline
  def apply(): GridLineCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridLineCfg]
  }
  
  @scala.inline
  implicit class GridLineCfgMutableBuilder[Self <: GridLineCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: ShapeAttrs | ShapeAttrsCallback): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleFunction3(value: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => ShapeAttrs): Self = StObject.set(x, "style", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
