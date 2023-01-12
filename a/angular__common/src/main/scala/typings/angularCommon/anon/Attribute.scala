package typings.angularCommon.anon

import typings.angularCommon.angularCommonStrings.ngPluralCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  var attribute: ngPluralCase
}
object Attribute {
  
  inline def apply(): Attribute = {
    val __obj = js.Dynamic.literal(attribute = "ngPluralCase")
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: ngPluralCase): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
  }
}
