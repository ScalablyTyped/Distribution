package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentDBEventSourceConfig extends StObject {
  
  /**
    *  The name of the collection to consume within the database. If you do not specify a collection, Lambda consumes all collections. 
    */
  var CollectionName: js.UndefOr[typings.awsSdk.clientsLambdaMod.CollectionName] = js.undefined
  
  /**
    *  The name of the database to consume within the DocumentDB cluster. 
    */
  var DatabaseName: js.UndefOr[typings.awsSdk.clientsLambdaMod.DatabaseName] = js.undefined
  
  /**
    *  Determines what DocumentDB sends to your event stream during document update operations. If set to UpdateLookup, DocumentDB sends a delta describing the changes, along with a copy of the entire document. Otherwise, DocumentDB sends only a partial document that contains the changes. 
    */
  var FullDocument: js.UndefOr[typings.awsSdk.clientsLambdaMod.FullDocument] = js.undefined
}
object DocumentDBEventSourceConfig {
  
  inline def apply(): DocumentDBEventSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentDBEventSourceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentDBEventSourceConfig] (val x: Self) extends AnyVal {
    
    inline def setCollectionName(value: CollectionName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
    
    inline def setCollectionNameUndefined: Self = StObject.set(x, "CollectionName", js.undefined)
    
    inline def setDatabaseName(value: DatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setFullDocument(value: FullDocument): Self = StObject.set(x, "FullDocument", value.asInstanceOf[js.Any])
    
    inline def setFullDocumentUndefined: Self = StObject.set(x, "FullDocument", js.undefined)
  }
}
