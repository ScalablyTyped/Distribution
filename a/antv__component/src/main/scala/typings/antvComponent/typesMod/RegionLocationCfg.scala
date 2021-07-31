package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionLocationCfg
  extends StObject
     with LocationCfg {
  
  /**
    * 结束点
    * @type {Point}
    */
  var end: js.UndefOr[Point] = js.undefined
  
  /**
    * 起始点
    * @type {Point}
    */
  var start: js.UndefOr[Point] = js.undefined
}
object RegionLocationCfg {
  
  @scala.inline
  def apply(): RegionLocationCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionLocationCfg]
  }
  
  @scala.inline
  implicit class RegionLocationCfgMutableBuilder[Self <: RegionLocationCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
