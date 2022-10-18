package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateExitedEventDetails extends StObject {
  
  /**
    * The name of the state. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)   To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
    */
  var name: Name
  
  /**
    * The JSON output data of the state. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var output: js.UndefOr[SensitiveData] = js.undefined
  
  /**
    * Contains details about the output of an execution history event.
    */
  var outputDetails: js.UndefOr[HistoryEventExecutionDataDetails] = js.undefined
}
object StateExitedEventDetails {
  
  inline def apply(name: Name): StateExitedEventDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateExitedEventDetails]
  }
  
  extension [Self <: StateExitedEventDetails](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: SensitiveData): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputDetails(value: HistoryEventExecutionDataDetails): Self = StObject.set(x, "outputDetails", value.asInstanceOf[js.Any])
    
    inline def setOutputDetailsUndefined: Self = StObject.set(x, "outputDetails", js.undefined)
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
