package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.MISSINGTOKEN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilTokenSchema[BaseToken] extends StObject {
  
  var UNSAFE_util: MISSINGTOKEN
}
object UtilTokenSchema {
  
  inline def apply[BaseToken](UNSAFE_util: MISSINGTOKEN): UtilTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(UNSAFE_util = UNSAFE_util.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilTokenSchema[BaseToken]]
  }
  
  extension [Self <: UtilTokenSchema[?], BaseToken](x: Self & UtilTokenSchema[BaseToken]) {
    
    inline def setUNSAFE_util(value: MISSINGTOKEN): Self = StObject.set(x, "UNSAFE_util", value.asInstanceOf[js.Any])
  }
}
