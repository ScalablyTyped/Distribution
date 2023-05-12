package typings.angularCommon.anon

import typings.angularCommon.angularCommonBooleans.`false`
import typings.angularCommon.angularCommonStrings.ngIfThen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var alias: ngIfThen
  
  var required: `false`
}
object `14` {
  
  inline def apply(): `14` = {
    val __obj = js.Dynamic.literal(alias = "ngIfThen", required = false)
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `14`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: ngIfThen): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
