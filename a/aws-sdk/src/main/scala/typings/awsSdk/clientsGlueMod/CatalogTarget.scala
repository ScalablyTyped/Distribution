package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogTarget extends StObject {
  
  /**
    * The name of the connection for an Amazon S3-backed Data Catalog table to be a target of the crawl when using a Catalog connection type paired with a NETWORK Connection type.
    */
  var ConnectionName: js.UndefOr[typings.awsSdk.clientsGlueMod.ConnectionName] = js.undefined
  
  /**
    * The name of the database to be synchronized.
    */
  var DatabaseName: NameString
  
  /**
    * A valid Amazon dead-letter SQS ARN. For example, arn:aws:sqs:region:account:deadLetterQueue.
    */
  var DlqEventQueueArn: js.UndefOr[EventQueueArn] = js.undefined
  
  /**
    * A valid Amazon SQS ARN. For example, arn:aws:sqs:region:account:sqs.
    */
  var EventQueueArn: js.UndefOr[typings.awsSdk.clientsGlueMod.EventQueueArn] = js.undefined
  
  /**
    * A list of the tables to be synchronized.
    */
  var Tables: CatalogTablesList
}
object CatalogTarget {
  
  inline def apply(DatabaseName: NameString, Tables: CatalogTablesList): CatalogTarget = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Tables = Tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTarget]
  }
  
  extension [Self <: CatalogTarget](x: Self) {
    
    inline def setConnectionName(value: ConnectionName): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDlqEventQueueArn(value: EventQueueArn): Self = StObject.set(x, "DlqEventQueueArn", value.asInstanceOf[js.Any])
    
    inline def setDlqEventQueueArnUndefined: Self = StObject.set(x, "DlqEventQueueArn", js.undefined)
    
    inline def setEventQueueArn(value: EventQueueArn): Self = StObject.set(x, "EventQueueArn", value.asInstanceOf[js.Any])
    
    inline def setEventQueueArnUndefined: Self = StObject.set(x, "EventQueueArn", js.undefined)
    
    inline def setTables(value: CatalogTablesList): Self = StObject.set(x, "Tables", value.asInstanceOf[js.Any])
    
    inline def setTablesVarargs(value: NameString*): Self = StObject.set(x, "Tables", js.Array(value*))
  }
}
