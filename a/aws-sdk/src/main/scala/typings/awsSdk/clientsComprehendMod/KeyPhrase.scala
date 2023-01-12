package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPhrase extends StObject {
  
  /**
    * The zero-based offset from the beginning of the source text to the first character in the key phrase.
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The zero-based offset from the beginning of the source text to the last character in the key phrase.
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.undefined
  
  /**
    * The text of a key noun phrase.
    */
  var Text: js.UndefOr[String] = js.undefined
}
object KeyPhrase {
  
  inline def apply(): KeyPhrase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPhrase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyPhrase] (val x: Self) extends AnyVal {
    
    inline def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    inline def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
