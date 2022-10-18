package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeywordFilter extends StObject {
  
  /**
    * A value for the keyword.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object KeywordFilter {
  
  inline def apply(): KeywordFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeywordFilter]
  }
  
  extension [Self <: KeywordFilter](x: Self) {
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
