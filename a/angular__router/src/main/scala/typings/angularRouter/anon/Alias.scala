package typings.angularRouter.anon

import typings.angularRouter.angularRouterBooleans.`false`
import typings.angularRouter.angularRouterStrings.target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alias extends StObject {
  
  var alias: target
  
  var required: `false`
}
object Alias {
  
  inline def apply(): Alias = {
    val __obj = js.Dynamic.literal(alias = "target", required = false)
    __obj.asInstanceOf[Alias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: target): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
