package typings.antvComponent.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridItem
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * 唯一值，用于动画或者查找
    * @type {string}
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * 栅格线的点集合
    * @type {Point[]}
    */
  var points: js.Array[Point]
}
object GridItem {
  
  inline def apply(points: js.Array[Point]): GridItem = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridItem]
  }
  
  extension [Self <: GridItem](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
