package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartOfSpeechTag extends StObject {
  
  /**
    * The confidence that Amazon Comprehend has that the part of speech was correctly identified.
    */
  var Score: js.UndefOr[Float] = js.undefined
  
  /**
    * Identifies the part of speech that the token represents.
    */
  var Tag: js.UndefOr[PartOfSpeechTagType] = js.undefined
}
object PartOfSpeechTag {
  
  inline def apply(): PartOfSpeechTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartOfSpeechTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartOfSpeechTag] (val x: Self) extends AnyVal {
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    inline def setTag(value: PartOfSpeechTagType): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
