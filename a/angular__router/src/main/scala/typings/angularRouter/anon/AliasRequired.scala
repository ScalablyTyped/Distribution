package typings.angularRouter.anon

import typings.angularRouter.angularRouterBooleans.`false`
import typings.angularRouter.angularRouterStrings.fragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasRequired extends StObject {
  
  var alias: fragment
  
  var required: `false`
}
object AliasRequired {
  
  inline def apply(): AliasRequired = {
    val __obj = js.Dynamic.literal(alias = "fragment", required = false)
    __obj.asInstanceOf[AliasRequired]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AliasRequired] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: fragment): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
