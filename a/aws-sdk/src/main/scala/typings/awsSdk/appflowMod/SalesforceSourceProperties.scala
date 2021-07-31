package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceSourceProperties extends StObject {
  
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
  
  @scala.inline
  def apply(`object`: Object): SalesforceSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceSourceProperties]
  }
  
  @scala.inline
  implicit class SalesforceSourcePropertiesMutableBuilder[Self <: SalesforceSourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableDynamicFieldUpdate(value: Boolean): Self = StObject.set(x, "enableDynamicFieldUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDynamicFieldUpdateUndefined: Self = StObject.set(x, "enableDynamicFieldUpdate", js.undefined)
    
    @scala.inline
    def setIncludeDeletedRecords(value: Boolean): Self = StObject.set(x, "includeDeletedRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeletedRecordsUndefined: Self = StObject.set(x, "includeDeletedRecords", js.undefined)
    
    @scala.inline
    def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
