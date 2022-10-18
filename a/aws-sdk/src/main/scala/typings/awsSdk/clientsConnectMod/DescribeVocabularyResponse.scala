package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVocabularyResponse extends StObject {
  
  /**
    * A list of specific words that you want Contact Lens for Amazon Connect to recognize in your audio input. They are generally domain-specific words and phrases, words that Contact Lens is not recognizing, or proper nouns.
    */
  var Vocabulary: typings.awsSdk.clientsConnectMod.Vocabulary
}
object DescribeVocabularyResponse {
  
  inline def apply(Vocabulary: Vocabulary): DescribeVocabularyResponse = {
    val __obj = js.Dynamic.literal(Vocabulary = Vocabulary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVocabularyResponse]
  }
  
  extension [Self <: DescribeVocabularyResponse](x: Self) {
    
    inline def setVocabulary(value: Vocabulary): Self = StObject.set(x, "Vocabulary", value.asInstanceOf[js.Any])
  }
}
