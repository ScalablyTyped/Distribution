package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexStatistics extends StObject {
  
  /**
    * The number of question and answer topics in the index.
    */
  var FaqStatistics: typings.awsSdk.clientsKendraMod.FaqStatistics
  
  /**
    * The number of text documents indexed.
    */
  var TextDocumentStatistics: typings.awsSdk.clientsKendraMod.TextDocumentStatistics
}
object IndexStatistics {
  
  inline def apply(FaqStatistics: FaqStatistics, TextDocumentStatistics: TextDocumentStatistics): IndexStatistics = {
    val __obj = js.Dynamic.literal(FaqStatistics = FaqStatistics.asInstanceOf[js.Any], TextDocumentStatistics = TextDocumentStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexStatistics]
  }
  
  extension [Self <: IndexStatistics](x: Self) {
    
    inline def setFaqStatistics(value: FaqStatistics): Self = StObject.set(x, "FaqStatistics", value.asInstanceOf[js.Any])
    
    inline def setTextDocumentStatistics(value: TextDocumentStatistics): Self = StObject.set(x, "TextDocumentStatistics", value.asInstanceOf[js.Any])
  }
}
