package typings.angularRouter.anon

import typings.angularRouter.angularRouterBooleans.`false`
import typings.angularRouter.angularRouterStrings.relativeTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var alias: relativeTo
  
  var required: `false`
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(alias = "relativeTo", required = false)
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: relativeTo): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
