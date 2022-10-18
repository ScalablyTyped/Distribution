package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSyncJobMetrics extends StObject {
  
  /**
    * The number of documents added from the data source up to now in the data source sync.
    */
  var DocumentsAdded: js.UndefOr[MetricValue] = js.undefined
  
  /**
    * The number of documents deleted from the data source up to now in the data source sync run.
    */
  var DocumentsDeleted: js.UndefOr[MetricValue] = js.undefined
  
  /**
    * The number of documents that failed to sync from the data source up to now in the data source sync run.
    */
  var DocumentsFailed: js.UndefOr[MetricValue] = js.undefined
  
  /**
    * The number of documents modified in the data source up to now in the data source sync run.
    */
  var DocumentsModified: js.UndefOr[MetricValue] = js.undefined
  
  /**
    * The current number of documents crawled by the current sync job in the data source.
    */
  var DocumentsScanned: js.UndefOr[MetricValue] = js.undefined
}
object DataSourceSyncJobMetrics {
  
  inline def apply(): DataSourceSyncJobMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSyncJobMetrics]
  }
  
  extension [Self <: DataSourceSyncJobMetrics](x: Self) {
    
    inline def setDocumentsAdded(value: MetricValue): Self = StObject.set(x, "DocumentsAdded", value.asInstanceOf[js.Any])
    
    inline def setDocumentsAddedUndefined: Self = StObject.set(x, "DocumentsAdded", js.undefined)
    
    inline def setDocumentsDeleted(value: MetricValue): Self = StObject.set(x, "DocumentsDeleted", value.asInstanceOf[js.Any])
    
    inline def setDocumentsDeletedUndefined: Self = StObject.set(x, "DocumentsDeleted", js.undefined)
    
    inline def setDocumentsFailed(value: MetricValue): Self = StObject.set(x, "DocumentsFailed", value.asInstanceOf[js.Any])
    
    inline def setDocumentsFailedUndefined: Self = StObject.set(x, "DocumentsFailed", js.undefined)
    
    inline def setDocumentsModified(value: MetricValue): Self = StObject.set(x, "DocumentsModified", value.asInstanceOf[js.Any])
    
    inline def setDocumentsModifiedUndefined: Self = StObject.set(x, "DocumentsModified", js.undefined)
    
    inline def setDocumentsScanned(value: MetricValue): Self = StObject.set(x, "DocumentsScanned", value.asInstanceOf[js.Any])
    
    inline def setDocumentsScannedUndefined: Self = StObject.set(x, "DocumentsScanned", js.undefined)
  }
}
