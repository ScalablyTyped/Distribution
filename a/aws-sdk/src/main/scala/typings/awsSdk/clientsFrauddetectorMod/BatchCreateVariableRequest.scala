package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateVariableRequest extends StObject {
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.undefined
  
  /**
    * The list of variables for the batch create variable request.
    */
  var variableEntries: VariableEntryList
}
object BatchCreateVariableRequest {
  
  inline def apply(variableEntries: VariableEntryList): BatchCreateVariableRequest = {
    val __obj = js.Dynamic.literal(variableEntries = variableEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateVariableRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateVariableRequest] (val x: Self) extends AnyVal {
    
    inline def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVariableEntries(value: VariableEntryList): Self = StObject.set(x, "variableEntries", value.asInstanceOf[js.Any])
    
    inline def setVariableEntriesVarargs(value: VariableEntry*): Self = StObject.set(x, "variableEntries", js.Array(value*))
  }
}
