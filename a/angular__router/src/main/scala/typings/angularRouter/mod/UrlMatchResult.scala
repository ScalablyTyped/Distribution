package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlMatchResult extends StObject {
  
  var consumed: js.Array[UrlSegment]
  
  var posParams: js.UndefOr[StringDictionary[UrlSegment]] = js.undefined
}
object UrlMatchResult {
  
  inline def apply(consumed: js.Array[UrlSegment]): UrlMatchResult = {
    val __obj = js.Dynamic.literal(consumed = consumed.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlMatchResult]
  }
  
  extension [Self <: UrlMatchResult](x: Self) {
    
    inline def setConsumed(value: js.Array[UrlSegment]): Self = StObject.set(x, "consumed", value.asInstanceOf[js.Any])
    
    inline def setConsumedVarargs(value: UrlSegment*): Self = StObject.set(x, "consumed", js.Array(value :_*))
    
    inline def setPosParams(value: StringDictionary[UrlSegment]): Self = StObject.set(x, "posParams", value.asInstanceOf[js.Any])
    
    inline def setPosParamsUndefined: Self = StObject.set(x, "posParams", js.undefined)
  }
}
