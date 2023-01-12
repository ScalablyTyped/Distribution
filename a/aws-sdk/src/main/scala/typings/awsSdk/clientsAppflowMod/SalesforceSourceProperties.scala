package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceSourceProperties extends StObject {
  
  /**
    * Specifies which Salesforce API is used by Amazon AppFlow when your flow transfers data from Salesforce.  AUTOMATIC  The default. Amazon AppFlow selects which API to use based on the number of records that your flow transfers from Salesforce. If your flow transfers fewer than 1,000,000 records, Amazon AppFlow uses Salesforce REST API. If your flow transfers 1,000,000 records or more, Amazon AppFlow uses Salesforce Bulk API 2.0. Each of these Salesforce APIs structures data differently. If Amazon AppFlow selects the API automatically, be aware that, for recurring flows, the data output might vary from one flow run to the next. For example, if a flow runs daily, it might use REST API on one day to transfer 900,000 records, and it might use Bulk API 2.0 on the next day to transfer 1,100,000 records. For each of these flow runs, the respective Salesforce API formats the data differently. Some of the differences include how dates are formatted and null values are represented. Also, Bulk API 2.0 doesn't transfer Salesforce compound fields. By choosing this option, you optimize flow performance for both small and large data transfers, but the tradeoff is inconsistent formatting in the output.  BULKV2  Amazon AppFlow uses only Salesforce Bulk API 2.0. This API runs asynchronous data transfers, and it's optimal for large sets of data. By choosing this option, you ensure that your flow writes consistent output, but you optimize performance only for large data transfers. Note that Bulk API 2.0 does not transfer Salesforce compound fields.  REST_SYNC  Amazon AppFlow uses only Salesforce REST API. By choosing this option, you ensure that your flow writes consistent output, but you decrease performance for large data transfers that are better suited for Bulk API 2.0. In some cases, if your flow attempts to transfer a vary large set of data, it might fail with a timed out error.  
    */
  var dataTransferApi: js.UndefOr[SalesforceDataTransferApi] = js.undefined
  
  /**
    *  The flag that enables dynamic fetching of new (recently added) fields in the Salesforce objects while running a flow. 
    */
  var enableDynamicFieldUpdate: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Indicates whether Amazon AppFlow includes deleted files in the flow run. 
    */
  var includeDeletedRecords: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The object specified in the Salesforce flow source. 
    */
  var `object`: Object
}
object SalesforceSourceProperties {
  
  inline def apply(`object`: Object): SalesforceSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SalesforceSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setDataTransferApi(value: SalesforceDataTransferApi): Self = StObject.set(x, "dataTransferApi", value.asInstanceOf[js.Any])
    
    inline def setDataTransferApiUndefined: Self = StObject.set(x, "dataTransferApi", js.undefined)
    
    inline def setEnableDynamicFieldUpdate(value: Boolean): Self = StObject.set(x, "enableDynamicFieldUpdate", value.asInstanceOf[js.Any])
    
    inline def setEnableDynamicFieldUpdateUndefined: Self = StObject.set(x, "enableDynamicFieldUpdate", js.undefined)
    
    inline def setIncludeDeletedRecords(value: Boolean): Self = StObject.set(x, "includeDeletedRecords", value.asInstanceOf[js.Any])
    
    inline def setIncludeDeletedRecordsUndefined: Self = StObject.set(x, "includeDeletedRecords", js.undefined)
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
