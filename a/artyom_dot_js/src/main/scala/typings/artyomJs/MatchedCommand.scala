package typings.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchedCommand extends StObject {
  
  var index: Double
  
  var instruction: ArtyomCommand
  
  var wildcard: js.UndefOr[js.Any] = js.undefined
}
object MatchedCommand {
  
  inline def apply(index: Double, instruction: ArtyomCommand): MatchedCommand = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedCommand]
  }
  
  extension [Self <: MatchedCommand](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInstruction(value: ArtyomCommand): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    inline def setWildcard(value: js.Any): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
    
    inline def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
  }
}
