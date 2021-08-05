package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentStack extends StObject {
  
  var componentStack: js.UndefOr[String] = js.undefined
}
object ComponentStack {
  
  inline def apply(): ComponentStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentStack]
  }
  
  extension [Self <: ComponentStack](x: Self) {
    
    inline def setComponentStack(value: String): Self = StObject.set(x, "componentStack", value.asInstanceOf[js.Any])
    
    inline def setComponentStackUndefined: Self = StObject.set(x, "componentStack", js.undefined)
  }
}
