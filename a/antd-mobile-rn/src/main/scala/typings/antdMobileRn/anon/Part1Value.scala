package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Part1Value extends StObject {
  
  var part1Value: Double
  
  var part2Value: Double
}
object Part1Value {
  
  inline def apply(part1Value: Double, part2Value: Double): Part1Value = {
    val __obj = js.Dynamic.literal(part1Value = part1Value.asInstanceOf[js.Any], part2Value = part2Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part1Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Part1Value] (val x: Self) extends AnyVal {
    
    inline def setPart1Value(value: Double): Self = StObject.set(x, "part1Value", value.asInstanceOf[js.Any])
    
    inline def setPart2Value(value: Double): Self = StObject.set(x, "part2Value", value.asInstanceOf[js.Any])
  }
}
