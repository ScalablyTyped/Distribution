package typings.angularCompiler.anon

import typings.angularCompiler.abstractEmitterMod.EmitterVisitorContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends StObject {
  
  var context: EmitterVisitorContext = js.native
  
  var sourceText: String = js.native
}
object Context {
  
  @scala.inline
  def apply(context: EmitterVisitorContext, sourceText: String): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], sourceText = sourceText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: EmitterVisitorContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceText(value: String): Self = StObject.set(x, "sourceText", value.asInstanceOf[js.Any])
  }
}
