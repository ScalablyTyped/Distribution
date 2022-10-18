package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentStatistics extends StObject {
  
  /**
    * The total size, in bytes, of the indexed documents.
    */
  var IndexedTextBytes: typings.awsSdk.clientsKendraMod.IndexedTextBytes
  
  /**
    * The number of text documents indexed.
    */
  var IndexedTextDocumentsCount: typings.awsSdk.clientsKendraMod.IndexedTextDocumentsCount
}
object TextDocumentStatistics {
  
  inline def apply(IndexedTextBytes: IndexedTextBytes, IndexedTextDocumentsCount: IndexedTextDocumentsCount): TextDocumentStatistics = {
    val __obj = js.Dynamic.literal(IndexedTextBytes = IndexedTextBytes.asInstanceOf[js.Any], IndexedTextDocumentsCount = IndexedTextDocumentsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentStatistics]
  }
  
  extension [Self <: TextDocumentStatistics](x: Self) {
    
    inline def setIndexedTextBytes(value: IndexedTextBytes): Self = StObject.set(x, "IndexedTextBytes", value.asInstanceOf[js.Any])
    
    inline def setIndexedTextDocumentsCount(value: IndexedTextDocumentsCount): Self = StObject.set(x, "IndexedTextDocumentsCount", value.asInstanceOf[js.Any])
  }
}
