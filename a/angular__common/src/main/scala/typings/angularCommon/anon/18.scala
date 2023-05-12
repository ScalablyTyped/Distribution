package typings.angularCommon.anon

import typings.angularCommon.angularCommonBooleans.`false`
import typings.angularCommon.angularCommonStrings.ngTemplateOutletInjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var alias: ngTemplateOutletInjector
  
  var required: `false`
}
object `18` {
  
  inline def apply(): `18` = {
    val __obj = js.Dynamic.literal(alias = "ngTemplateOutletInjector", required = false)
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `18`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: ngTemplateOutletInjector): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
