package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaqStatistics extends StObject {
  
  /**
    * The total number of FAQ questions and answers contained in the index.
    */
  var IndexedQuestionAnswersCount: typings.awsSdk.clientsKendraMod.IndexedQuestionAnswersCount
}
object FaqStatistics {
  
  inline def apply(IndexedQuestionAnswersCount: IndexedQuestionAnswersCount): FaqStatistics = {
    val __obj = js.Dynamic.literal(IndexedQuestionAnswersCount = IndexedQuestionAnswersCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaqStatistics]
  }
  
  extension [Self <: FaqStatistics](x: Self) {
    
    inline def setIndexedQuestionAnswersCount(value: IndexedQuestionAnswersCount): Self = StObject.set(x, "IndexedQuestionAnswersCount", value.asInstanceOf[js.Any])
  }
}
