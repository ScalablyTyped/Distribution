package typings.awsSdk.clientsPollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLexiconsInput extends StObject {
  
  /**
    * An opaque pagination token returned from previous ListLexicons operation. If present, indicates where to continue the list of lexicons.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPollyMod.NextToken] = js.undefined
}
object ListLexiconsInput {
  
  inline def apply(): ListLexiconsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLexiconsInput]
  }
  
  extension [Self <: ListLexiconsInput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
