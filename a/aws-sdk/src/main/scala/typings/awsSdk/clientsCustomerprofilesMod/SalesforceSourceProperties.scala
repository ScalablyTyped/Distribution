package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceSourceProperties extends StObject {
  
  /**
    * The flag that enables dynamic fetching of new (recently added) fields in the Salesforce objects while running a flow.
    */
  var EnableDynamicFieldUpdate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether Amazon AppFlow includes deleted files in the flow run.
    */
  var IncludeDeletedRecords: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The object specified in the Salesforce flow source.
    */
  var Object: typings.awsSdk.clientsCustomerprofilesMod.Object
}
object SalesforceSourceProperties {
  
  inline def apply(Object: Object): SalesforceSourceProperties = {
    val __obj = js.Dynamic.literal(Object = Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceSourceProperties]
  }
  
  extension [Self <: SalesforceSourceProperties](x: Self) {
    
    inline def setEnableDynamicFieldUpdate(value: Boolean): Self = StObject.set(x, "EnableDynamicFieldUpdate", value.asInstanceOf[js.Any])
    
    inline def setEnableDynamicFieldUpdateUndefined: Self = StObject.set(x, "EnableDynamicFieldUpdate", js.undefined)
    
    inline def setIncludeDeletedRecords(value: Boolean): Self = StObject.set(x, "IncludeDeletedRecords", value.asInstanceOf[js.Any])
    
    inline def setIncludeDeletedRecordsUndefined: Self = StObject.set(x, "IncludeDeletedRecords", js.undefined)
    
    inline def setObject(value: Object): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
  }
}
