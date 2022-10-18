package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`0`
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`1`
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`2`
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`3`
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusLevelOptions extends StObject {
  
  var DEBUG: `3`
  
  var ERROR: `0`
  
  var INFO: `2`
  
  var TRACE: `4`
  
  var WARN: `1`
}
object StatusLevelOptions {
  
  inline def apply(): StatusLevelOptions = {
    val __obj = js.Dynamic.literal(DEBUG = 3, ERROR = 0, INFO = 2, TRACE = 4, WARN = 1)
    __obj.asInstanceOf[StatusLevelOptions]
  }
  
  extension [Self <: StatusLevelOptions](x: Self) {
    
    inline def setDEBUG(value: `3`): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
    
    inline def setERROR(value: `0`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setINFO(value: `2`): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
    
    inline def setTRACE(value: `4`): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
    
    inline def setWARN(value: `1`): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
  }
}
