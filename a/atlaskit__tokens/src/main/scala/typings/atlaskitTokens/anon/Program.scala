package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Program extends StObject {
  
  var Program: Enter
}
object Program {
  
  inline def apply(Program: Enter): Program = {
    val __obj = js.Dynamic.literal(Program = Program.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
  
  extension [Self <: Program](x: Self) {
    
    inline def setProgram(value: Enter): Self = StObject.set(x, "Program", value.asInstanceOf[js.Any])
  }
}
