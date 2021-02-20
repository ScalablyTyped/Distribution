package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointsLocationCfg extends LocationCfg {
  
  /**
    * 定位点的集合
    * @type {Point[]}
    */
  var points: js.UndefOr[js.Array[Point]] = js.native
}
object PointsLocationCfg {
  
  @scala.inline
  def apply(): PointsLocationCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointsLocationCfg]
  }
  
  @scala.inline
  implicit class PointsLocationCfgMutableBuilder[Self <: PointsLocationCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
