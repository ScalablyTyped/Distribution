package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  /**
    * An expression that specifies an attribute-value pair in a JSON structure. Use this to specify an attribute from the JSON payload that is made available by the input. Inputs are derived from messages sent to AWS IoT Events (BatchPutMessage). Each such message contains a JSON payload. The attribute (and its paired value) specified here are available for use in the condition expressions used by detectors.  Syntax: &lt;field-name&gt;.&lt;field-name&gt;... 
    */
  var jsonPath: AttributeJsonPath
}
object Attribute {
  
  inline def apply(jsonPath: AttributeJsonPath): Attribute = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  
  extension [Self <: Attribute](x: Self) {
    
    inline def setJsonPath(value: AttributeJsonPath): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
  }
}
