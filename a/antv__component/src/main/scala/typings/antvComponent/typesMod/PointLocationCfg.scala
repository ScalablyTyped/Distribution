package typings.antvComponent.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointLocationCfg extends LocationCfg {
  
  /**
    * 位置 x
    * @type {number}
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * 位置 y
    * @type {number}
    */
  var y: js.UndefOr[Double] = js.native
}
object PointLocationCfg {
  
  @scala.inline
  def apply(): PointLocationCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointLocationCfg]
  }
  
  @scala.inline
  implicit class PointLocationCfgMutableBuilder[Self <: PointLocationCfg] (val x: Self) extends AnyVal {
    
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
