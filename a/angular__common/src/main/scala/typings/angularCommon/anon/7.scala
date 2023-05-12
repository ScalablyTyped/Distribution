package typings.angularCommon.anon

import typings.angularCommon.angularCommonBooleans.`false`
import typings.angularCommon.angularCommonStrings.ngComponentOutletContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var alias: ngComponentOutletContent
  
  var required: `false`
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal(alias = "ngComponentOutletContent", required = false)
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: ngComponentOutletContent): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
