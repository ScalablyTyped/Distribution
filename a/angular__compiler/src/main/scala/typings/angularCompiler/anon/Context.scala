package typings.angularCompiler.anon

import typings.angularCompiler.abstractEmitterMod.EmitterVisitorContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var context: EmitterVisitorContext
  
  var sourceText: String
}
object Context {
  
  inline def apply(context: EmitterVisitorContext, sourceText: String): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], sourceText = sourceText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setContext(value: EmitterVisitorContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setSourceText(value: String): Self = StObject.set(x, "sourceText", value.asInstanceOf[js.Any])
  }
}
