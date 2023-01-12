package typings.awsSdk.clientsPollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLexiconOutput extends StObject {
  
  /**
    * Lexicon object that provides name and the string content of the lexicon. 
    */
  var Lexicon: js.UndefOr[typings.awsSdk.clientsPollyMod.Lexicon] = js.undefined
  
  /**
    * Metadata of the lexicon, including phonetic alphabetic used, language code, lexicon ARN, number of lexemes defined in the lexicon, and size of lexicon in bytes.
    */
  var LexiconAttributes: js.UndefOr[typings.awsSdk.clientsPollyMod.LexiconAttributes] = js.undefined
}
object GetLexiconOutput {
  
  inline def apply(): GetLexiconOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLexiconOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLexiconOutput] (val x: Self) extends AnyVal {
    
    inline def setLexicon(value: Lexicon): Self = StObject.set(x, "Lexicon", value.asInstanceOf[js.Any])
    
    inline def setLexiconAttributes(value: LexiconAttributes): Self = StObject.set(x, "LexiconAttributes", value.asInstanceOf[js.Any])
    
    inline def setLexiconAttributesUndefined: Self = StObject.set(x, "LexiconAttributes", js.undefined)
    
    inline def setLexiconUndefined: Self = StObject.set(x, "Lexicon", js.undefined)
  }
}
