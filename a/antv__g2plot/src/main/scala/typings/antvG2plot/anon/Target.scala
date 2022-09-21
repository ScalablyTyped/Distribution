package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  /**
    * @title 来源节点
    * @description 在 nodes 中的 index
    */
  val source: Double
  
  /**
    * @title 目标节点
    * @description  在 nodes 中的 index
    */
  val target: Double
  
  /**
    * @title 边的值
    */
  val value: Double
}
object Target {
  
  inline def apply(source: Double, target: Double, value: Double): Target = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
