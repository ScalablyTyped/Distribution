package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Part1Value extends StObject {
  
  var part1Value: Double = js.native
  
  var part2Value: Double = js.native
}
object Part1Value {
  
  @scala.inline
  def apply(part1Value: Double, part2Value: Double): Part1Value = {
    val __obj = js.Dynamic.literal(part1Value = part1Value.asInstanceOf[js.Any], part2Value = part2Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part1Value]
  }
  
  @scala.inline
  implicit class Part1ValueMutableBuilder[Self <: Part1Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPart1Value(value: Double): Self = StObject.set(x, "part1Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPart2Value(value: Double): Self = StObject.set(x, "part2Value", value.asInstanceOf[js.Any])
  }
}
