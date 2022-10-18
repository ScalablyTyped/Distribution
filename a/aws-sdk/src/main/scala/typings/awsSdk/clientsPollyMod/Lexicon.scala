package typings.awsSdk.clientsPollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lexicon extends StObject {
  
  /**
    * Lexicon content in string format. The content of a lexicon must be in PLS format.
    */
  var Content: js.UndefOr[LexiconContent] = js.undefined
  
  /**
    * Name of the lexicon.
    */
  var Name: js.UndefOr[LexiconName] = js.undefined
}
object Lexicon {
  
  inline def apply(): Lexicon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lexicon]
  }
  
  extension [Self <: Lexicon](x: Self) {
    
    inline def setContent(value: LexiconContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setName(value: LexiconName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
