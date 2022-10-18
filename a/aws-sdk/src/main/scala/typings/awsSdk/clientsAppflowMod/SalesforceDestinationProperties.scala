package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceDestinationProperties extends StObject {
  
  /**
    * Specifies which Salesforce API is used by Amazon AppFlow when your flow transfers data to Salesforce.  AUTOMATIC  The default. Amazon AppFlow selects which API to use based on the number of records that your flow transfers to Salesforce. If your flow transfers fewer than 1,000 records, Amazon AppFlow uses Salesforce REST API. If your flow transfers 1,000 records or more, Amazon AppFlow uses Salesforce Bulk API 2.0. Each of these Salesforce APIs structures data differently. If Amazon AppFlow selects the API automatically, be aware that, for recurring flows, the data output might vary from one flow run to the next. For example, if a flow runs daily, it might use REST API on one day to transfer 900 records, and it might use Bulk API 2.0 on the next day to transfer 1,100 records. For each of these flow runs, the respective Salesforce API formats the data differently. Some of the differences include how dates are formatted and null values are represented. Also, Bulk API 2.0 doesn't transfer Salesforce compound fields. By choosing this option, you optimize flow performance for both small and large data transfers, but the tradeoff is inconsistent formatting in the output.  BULKV2  Amazon AppFlow uses only Salesforce Bulk API 2.0. This API runs asynchronous data transfers, and it's optimal for large sets of data. By choosing this option, you ensure that your flow writes consistent output, but you optimize performance only for large data transfers. Note that Bulk API 2.0 does not transfer Salesforce compound fields.  REST_SYNC  Amazon AppFlow uses only Salesforce REST API. By choosing this option, you ensure that your flow writes consistent output, but you decrease performance for large data transfers that are better suited for Bulk API 2.0. In some cases, if your flow attempts to transfer a vary large set of data, it might fail with a timed out error.  
    */
  var dataTransferApi: js.UndefOr[SalesforceDataTransferApi] = js.undefined
  
  /**
    *  The settings that determine how Amazon AppFlow handles an error when placing data in the Salesforce destination. For example, this setting would determine if the flow should fail after one insertion error, or continue and attempt to insert every record regardless of the initial failure. ErrorHandlingConfig is a part of the destination connector details. 
    */
  var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined
  
  /**
    *  The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update or delete. 
    */
  var idFieldNames: js.UndefOr[IdFieldNameList] = js.undefined
  
  /**
    *  The object specified in the Salesforce flow destination. 
    */
  var `object`: Object
  
  /**
    *  This specifies the type of write operation to be performed in Salesforce. When the value is UPSERT, then idFieldNames is required. 
    */
  var writeOperationType: js.UndefOr[WriteOperationType] = js.undefined
}
object SalesforceDestinationProperties {
  
  inline def apply(`object`: Object): SalesforceDestinationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceDestinationProperties]
  }
  
  extension [Self <: SalesforceDestinationProperties](x: Self) {
    
    inline def setDataTransferApi(value: SalesforceDataTransferApi): Self = StObject.set(x, "dataTransferApi", value.asInstanceOf[js.Any])
    
    inline def setDataTransferApiUndefined: Self = StObject.set(x, "dataTransferApi", js.undefined)
    
    inline def setErrorHandlingConfig(value: ErrorHandlingConfig): Self = StObject.set(x, "errorHandlingConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorHandlingConfigUndefined: Self = StObject.set(x, "errorHandlingConfig", js.undefined)
    
    inline def setIdFieldNames(value: IdFieldNameList): Self = StObject.set(x, "idFieldNames", value.asInstanceOf[js.Any])
    
    inline def setIdFieldNamesUndefined: Self = StObject.set(x, "idFieldNames", js.undefined)
    
    inline def setIdFieldNamesVarargs(value: Name*): Self = StObject.set(x, "idFieldNames", js.Array(value*))
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setWriteOperationType(value: WriteOperationType): Self = StObject.set(x, "writeOperationType", value.asInstanceOf[js.Any])
    
    inline def setWriteOperationTypeUndefined: Self = StObject.set(x, "writeOperationType", js.undefined)
  }
}
