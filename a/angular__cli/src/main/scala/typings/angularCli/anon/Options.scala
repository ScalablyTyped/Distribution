package typings.angularCli.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: GetYargsCompletions & (Record[String, Any])
  
  var positional: js.Array[String]
}
object Options {
  
  inline def apply(options: GetYargsCompletions & (Record[String, Any]), positional: js.Array[String]): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], positional = positional.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: GetYargsCompletions & (Record[String, Any])): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPositional(value: js.Array[String]): Self = StObject.set(x, "positional", value.asInstanceOf[js.Any])
    
    inline def setPositionalVarargs(value: String*): Self = StObject.set(x, "positional", js.Array(value*))
  }
}
