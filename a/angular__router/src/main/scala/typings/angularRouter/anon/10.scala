package typings.angularRouter.anon

import typings.angularRouter.angularRouterBooleans.`false`
import typings.angularRouter.angularRouterStrings.name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var alias: name
  
  var required: `false`
}
object `10` {
  
  inline def apply(): `10` = {
    val __obj = js.Dynamic.literal(alias = "name", required = false)
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `10`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: name): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
