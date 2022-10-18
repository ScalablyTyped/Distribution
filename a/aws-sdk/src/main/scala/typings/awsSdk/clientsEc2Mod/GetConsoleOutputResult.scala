package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConsoleOutputResult extends StObject {
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The console output, base64-encoded. If you are using a command line tool, the tool decodes the output for you.
    */
  var Output: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the output was last updated.
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
}
object GetConsoleOutputResult {
  
  inline def apply(): GetConsoleOutputResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConsoleOutputResult]
  }
  
  extension [Self <: GetConsoleOutputResult](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setOutput(value: String): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
