package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectAttributesActivity extends StObject {
  
  /**
    * A list of the attributes to select from the message.
    */
  var attributes: AttributeNames
  
  /**
    * The name of the selectAttributes activity.
    */
  var name: ActivityName
  
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
}
object SelectAttributesActivity {
  
  inline def apply(attributes: AttributeNames, name: ActivityName): SelectAttributesActivity = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectAttributesActivity]
  }
  
  extension [Self <: SelectAttributesActivity](x: Self) {
    
    inline def setAttributes(value: AttributeNames): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: AttributeName*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setName(value: ActivityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNext(value: ActivityName): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
