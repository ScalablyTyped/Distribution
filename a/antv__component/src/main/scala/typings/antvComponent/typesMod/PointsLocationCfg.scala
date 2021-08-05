package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointsLocationCfg
  extends StObject
     with LocationCfg {
  
  /**
    * 定位点的集合
    * @type {Point[]}
    */
  var points: js.UndefOr[js.Array[Point]] = js.undefined
}
object PointsLocationCfg {
  
  inline def apply(): PointsLocationCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointsLocationCfg]
  }
  
  extension [Self <: PointsLocationCfg](x: Self) {
    
    inline def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
