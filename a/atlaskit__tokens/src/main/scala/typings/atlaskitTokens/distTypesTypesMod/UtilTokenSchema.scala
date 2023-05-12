package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.Transparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilTokenSchema[BaseToken] extends StObject {
  
  var UNSAFE: Transparent
}
object UtilTokenSchema {
  
  inline def apply[BaseToken](UNSAFE: Transparent): UtilTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(UNSAFE = UNSAFE.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilTokenSchema[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtilTokenSchema[?], BaseToken] (val x: Self & UtilTokenSchema[BaseToken]) extends AnyVal {
    
    inline def setUNSAFE(value: Transparent): Self = StObject.set(x, "UNSAFE", value.asInstanceOf[js.Any])
  }
}
