package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SalesforceSourceProperties extends js.Object {
  
  /**
    *  The flag that enables dynamic fetching of new (recently added) fields in the Salesforce objects while running a flow. 
    */
  var enableDynamicFieldUpdate: js.UndefOr[Boolean] = js.native
  
  /**
    *  Indicates whether Amazon AppFlow includes deleted files in the flow run. 
    */
  var includeDeletedRecords: js.UndefOr[Boolean] = js.native
  
  /**
    *  The object specified in the Salesforce flow source. 
    */
  var `object`: Object = js.native
}
object SalesforceSourceProperties {
  
  @scala.inline
  def apply(`object`: Object): SalesforceSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceSourceProperties]
  }
  
  @scala.inline
  implicit class SalesforceSourcePropertiesOps[Self <: SalesforceSourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObject(value: Object): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDynamicFieldUpdate(value: Boolean): Self = this.set("enableDynamicFieldUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDynamicFieldUpdate: Self = this.set("enableDynamicFieldUpdate", js.undefined)
    
    @scala.inline
    def setIncludeDeletedRecords(value: Boolean): Self = this.set("includeDeletedRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDeletedRecords: Self = this.set("includeDeletedRecords", js.undefined)
  }
}
