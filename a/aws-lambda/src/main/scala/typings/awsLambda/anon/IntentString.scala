package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentString extends StObject {
  
  var intent: String
}
object IntentString {
  
  inline def apply(intent: String): IntentString = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntentString] (val x: Self) extends AnyVal {
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
  }
}
