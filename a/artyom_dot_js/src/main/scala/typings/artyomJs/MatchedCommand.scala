package typings.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchedCommand extends StObject {
  
  var index: Double = js.native
  
  var instruction: ArtyomCommand = js.native
  
  var wildcard: js.UndefOr[js.Any] = js.native
}
object MatchedCommand {
  
  @scala.inline
  def apply(index: Double, instruction: ArtyomCommand): MatchedCommand = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedCommand]
  }
  
  @scala.inline
  implicit class MatchedCommandMutableBuilder[Self <: MatchedCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstruction(value: ArtyomCommand): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWildcard(value: js.Any): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
  }
}
