package typings.antvComponent.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridItem
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * 唯一值，用于动画或者查找
    * @type {string}
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 栅格线的点集合
    * @type {Point[]}
    */
  var points: js.Array[Point] = js.native
}
object GridItem {
  
  @scala.inline
  def apply(points: js.Array[Point]): GridItem = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridItem]
  }
  
  @scala.inline
  implicit class GridItemMutableBuilder[Self <: GridItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
