package typings.angularCommon.anon

import typings.angularCommon.angularCommonBooleans.`false`
import typings.angularCommon.angularCommonStrings.ngComponentOutlet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasRequired extends StObject {
  
  var alias: ngComponentOutlet
  
  var required: `false`
}
object AliasRequired {
  
  inline def apply(): AliasRequired = {
    val __obj = js.Dynamic.literal(alias = "ngComponentOutlet", required = false)
    __obj.asInstanceOf[AliasRequired]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AliasRequired] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: ngComponentOutlet): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
