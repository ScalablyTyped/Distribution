package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustedAdvisorCheckDescription extends StObject {
  
  /**
    * The category of the Trusted Advisor check.
    */
  var category: String
  
  /**
    * The description of the Trusted Advisor check, which includes the alert criteria and recommended operations (contains HTML markup).
    */
  var description: String
  
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var id: String
  
  /**
    * The column headings for the data returned by the Trusted Advisor check. The order of the headings corresponds to the order of the data in the Metadata element of the TrustedAdvisorResourceDetail for the check. Metadata contains all the data that is shown in the Excel download, even in those cases where the UI shows just summary data. 
    */
  var metadata: StringList
  
  /**
    * The display name for the Trusted Advisor check.
    */
  var name: String
}
object TrustedAdvisorCheckDescription {
  
  inline def apply(category: String, description: String, id: String, metadata: StringList, name: String): TrustedAdvisorCheckDescription = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorCheckDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrustedAdvisorCheckDescription] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: StringList): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataVarargs(value: String*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
