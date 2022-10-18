package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputTransformer extends StObject {
  
  /**
    * Map of JSON paths to be extracted from the event. You can then insert these in the template in InputTemplate to produce the output you want to be sent to the target.  InputPathsMap is an array key-value pairs, where each value is a valid JSON path. You can have as many as 100 key-value pairs. You must use JSON dot notation, not bracket notation. The keys cannot start with "Amazon Web Services." 
    */
  var InputPathsMap: js.UndefOr[TransformerPaths] = js.undefined
  
  /**
    * Input template where you specify placeholders that will be filled with the values of the keys from InputPathsMap to customize the data sent to the target. Enclose each InputPathsMaps value in brackets: &lt;value&gt; The InputTemplate must be valid JSON. If InputTemplate is a JSON object (surrounded by curly braces), the following restrictions apply:   The placeholder cannot be used as an object key.   The following example shows the syntax for using InputPathsMap and InputTemplate.   "InputTransformer":   {   "InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},   "InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"   }  To have the InputTemplate include quote marks within a JSON string, escape each quote marks with a slash, as in the following example:   "InputTransformer":   {   "InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},   "InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""   }  The InputTemplate can also be valid JSON with varibles in quotes or out, as in the following example:   "InputTransformer":   {   "InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},   "InputTemplate": '{"myInstance": &lt;instance&gt;,"myStatus": "&lt;instance&gt; is in state \"&lt;status&gt;\""}'   } 
    */
  var InputTemplate: TransformerInput
}
object InputTransformer {
  
  inline def apply(InputTemplate: TransformerInput): InputTransformer = {
    val __obj = js.Dynamic.literal(InputTemplate = InputTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTransformer]
  }
  
  extension [Self <: InputTransformer](x: Self) {
    
    inline def setInputPathsMap(value: TransformerPaths): Self = StObject.set(x, "InputPathsMap", value.asInstanceOf[js.Any])
    
    inline def setInputPathsMapUndefined: Self = StObject.set(x, "InputPathsMap", js.undefined)
    
    inline def setInputTemplate(value: TransformerInput): Self = StObject.set(x, "InputTemplate", value.asInstanceOf[js.Any])
  }
}
