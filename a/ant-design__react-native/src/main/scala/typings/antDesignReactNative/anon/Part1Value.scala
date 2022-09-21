package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Part1Value extends StObject {
  
  var disabled: Boolean
  
  var part1Value: Double
  
  var part2Value: Double
  
  var part3Value: Double
}
object Part1Value {
  
  inline def apply(disabled: Boolean, part1Value: Double, part2Value: Double, part3Value: Double): Part1Value = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], part1Value = part1Value.asInstanceOf[js.Any], part2Value = part2Value.asInstanceOf[js.Any], part3Value = part3Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part1Value]
  }
  
  extension [Self <: Part1Value](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setPart1Value(value: Double): Self = StObject.set(x, "part1Value", value.asInstanceOf[js.Any])
    
    inline def setPart2Value(value: Double): Self = StObject.set(x, "part2Value", value.asInstanceOf[js.Any])
    
    inline def setPart3Value(value: Double): Self = StObject.set(x, "part3Value", value.asInstanceOf[js.Any])
  }
}
