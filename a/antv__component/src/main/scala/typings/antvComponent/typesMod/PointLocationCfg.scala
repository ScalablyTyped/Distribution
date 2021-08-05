package typings.antvComponent.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointLocationCfg
  extends StObject
     with LocationCfg {
  
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
object PointLocationCfg {
  
  inline def apply(): PointLocationCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointLocationCfg]
  }
  
  extension [Self <: PointLocationCfg](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
