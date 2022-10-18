package typings.awsSdk.clientsPollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexiconAttributes extends StObject {
  
  /**
    * Phonetic alphabet used in the lexicon. Valid values are ipa and x-sampa.
    */
  var Alphabet: js.UndefOr[typings.awsSdk.clientsPollyMod.Alphabet] = js.undefined
  
  /**
    * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsPollyMod.LanguageCode] = js.undefined
  
  /**
    * Date lexicon was last modified (a timestamp value).
    */
  var LastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Number of lexemes in the lexicon.
    */
  var LexemesCount: js.UndefOr[typings.awsSdk.clientsPollyMod.LexemesCount] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the lexicon.
    */
  var LexiconArn: js.UndefOr[typings.awsSdk.clientsPollyMod.LexiconArn] = js.undefined
  
  /**
    * Total size of the lexicon, in characters.
    */
  var Size: js.UndefOr[typings.awsSdk.clientsPollyMod.Size] = js.undefined
}
object LexiconAttributes {
  
  inline def apply(): LexiconAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LexiconAttributes]
  }
  
  extension [Self <: LexiconAttributes](x: Self) {
    
    inline def setAlphabet(value: Alphabet): Self = StObject.set(x, "Alphabet", value.asInstanceOf[js.Any])
    
    inline def setAlphabetUndefined: Self = StObject.set(x, "Alphabet", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setLexemesCount(value: LexemesCount): Self = StObject.set(x, "LexemesCount", value.asInstanceOf[js.Any])
    
    inline def setLexemesCountUndefined: Self = StObject.set(x, "LexemesCount", js.undefined)
    
    inline def setLexiconArn(value: LexiconArn): Self = StObject.set(x, "LexiconArn", value.asInstanceOf[js.Any])
    
    inline def setLexiconArnUndefined: Self = StObject.set(x, "LexiconArn", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
