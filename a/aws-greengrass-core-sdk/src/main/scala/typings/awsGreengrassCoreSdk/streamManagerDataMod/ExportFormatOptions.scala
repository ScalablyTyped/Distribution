package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`0`
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportFormatOptions extends StObject {
  
  var JSON_BATCHED: `1`
  
  var RAW_NOT_BATCHED: `0`
}
object ExportFormatOptions {
  
  inline def apply(): ExportFormatOptions = {
    val __obj = js.Dynamic.literal(JSON_BATCHED = 1, RAW_NOT_BATCHED = 0)
    __obj.asInstanceOf[ExportFormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportFormatOptions] (val x: Self) extends AnyVal {
    
    inline def setJSON_BATCHED(value: `1`): Self = StObject.set(x, "JSON_BATCHED", value.asInstanceOf[js.Any])
    
    inline def setRAW_NOT_BATCHED(value: `0`): Self = StObject.set(x, "RAW_NOT_BATCHED", value.asInstanceOf[js.Any])
  }
}
