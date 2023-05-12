package typings.angularCommon.anon

import typings.angularCommon.angularCommonBooleans.`false`
import typings.angularCommon.angularCommonStrings.ngComponentOutletInjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var alias: ngComponentOutletInjector
  
  var required: `false`
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal(alias = "ngComponentOutletInjector", required = false)
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: ngComponentOutletInjector): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
