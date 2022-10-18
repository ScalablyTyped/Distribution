package typings.antvComponent.libTypesMod

import typings.antvGBase.libTypesMod.Point
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
  
  inline def apply(): RegionLocationCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionLocationCfg]
  }
  
  extension [Self <: RegionLocationCfg](x: Self) {
    
    inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
