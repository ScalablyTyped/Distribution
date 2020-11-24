package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Part1Value extends js.Object {
  
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
  implicit class Part1ValueOps[Self <: Part1Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPart1Value(value: Double): Self = this.set("part1Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPart2Value(value: Double): Self = this.set("part2Value", value.asInstanceOf[js.Any])
  }
}
