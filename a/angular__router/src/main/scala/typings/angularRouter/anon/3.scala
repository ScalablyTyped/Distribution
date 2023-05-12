package typings.angularRouter.anon

import typings.angularRouter.angularRouterBooleans.`false`
import typings.angularRouter.angularRouterStrings.preserveFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var alias: preserveFragment
  
  var required: `false`
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal(alias = "preserveFragment", required = false)
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: preserveFragment): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
