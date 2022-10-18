package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.RawToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MISSINGTOKEN extends StObject {
  
  var MISSING_TOKEN: RawToken
  
  var transparent: RawToken
}
object MISSINGTOKEN {
  
  inline def apply(MISSING_TOKEN: RawToken, transparent: RawToken): MISSINGTOKEN = {
    val __obj = js.Dynamic.literal(MISSING_TOKEN = MISSING_TOKEN.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MISSINGTOKEN]
  }
  
  extension [Self <: MISSINGTOKEN](x: Self) {
    
    inline def setMISSING_TOKEN(value: RawToken): Self = StObject.set(x, "MISSING_TOKEN", value.asInstanceOf[js.Any])
    
    inline def setTransparent(value: RawToken): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
  }
}
