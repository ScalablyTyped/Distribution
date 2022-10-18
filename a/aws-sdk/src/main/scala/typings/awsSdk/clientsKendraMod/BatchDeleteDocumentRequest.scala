package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteDocumentRequest extends StObject {
  
  var DataSourceSyncJobMetricTarget: js.UndefOr[typings.awsSdk.clientsKendraMod.DataSourceSyncJobMetricTarget] = js.undefined
  
  /**
    * One or more identifiers for documents to delete from the index.
    */
  var DocumentIdList: typings.awsSdk.clientsKendraMod.DocumentIdList
  
  /**
    * The identifier of the index that contains the documents to delete.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
}
object BatchDeleteDocumentRequest {
  
  inline def apply(DocumentIdList: DocumentIdList, IndexId: IndexId): BatchDeleteDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentIdList = DocumentIdList.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteDocumentRequest]
  }
  
  extension [Self <: BatchDeleteDocumentRequest](x: Self) {
    
    inline def setDataSourceSyncJobMetricTarget(value: DataSourceSyncJobMetricTarget): Self = StObject.set(x, "DataSourceSyncJobMetricTarget", value.asInstanceOf[js.Any])
    
    inline def setDataSourceSyncJobMetricTargetUndefined: Self = StObject.set(x, "DataSourceSyncJobMetricTarget", js.undefined)
    
    inline def setDocumentIdList(value: DocumentIdList): Self = StObject.set(x, "DocumentIdList", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdListVarargs(value: DocumentId*): Self = StObject.set(x, "DocumentIdList", js.Array(value*))
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
