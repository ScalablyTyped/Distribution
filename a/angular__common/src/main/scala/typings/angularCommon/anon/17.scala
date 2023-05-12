package typings.angularCommon.anon

import typings.angularCommon.angularCommonBooleans.`false`
import typings.angularCommon.angularCommonStrings.ngTemplateOutlet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  var alias: ngTemplateOutlet
  
  var required: `false`
}
object `17` {
  
  inline def apply(): `17` = {
    val __obj = js.Dynamic.literal(alias = "ngTemplateOutlet", required = false)
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `17`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: ngTemplateOutlet): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
