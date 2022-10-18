package typings.awsSdk.clientsPollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLexiconsOutput extends StObject {
  
  /**
    * A list of lexicon names and attributes.
    */
  var Lexicons: js.UndefOr[LexiconDescriptionList] = js.undefined
  
  /**
    * The pagination token to use in the next request to continue the listing of lexicons. NextToken is returned only if the response is truncated.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPollyMod.NextToken] = js.undefined
}
object ListLexiconsOutput {
  
  inline def apply(): ListLexiconsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLexiconsOutput]
  }
  
  extension [Self <: ListLexiconsOutput](x: Self) {
    
    inline def setLexicons(value: LexiconDescriptionList): Self = StObject.set(x, "Lexicons", value.asInstanceOf[js.Any])
    
    inline def setLexiconsUndefined: Self = StObject.set(x, "Lexicons", js.undefined)
    
    inline def setLexiconsVarargs(value: LexiconDescription*): Self = StObject.set(x, "Lexicons", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
