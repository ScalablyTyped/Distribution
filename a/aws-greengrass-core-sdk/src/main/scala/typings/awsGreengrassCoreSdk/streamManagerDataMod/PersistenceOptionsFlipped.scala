package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.File
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.Memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceOptionsFlipped extends StObject {
  
  var `0`: File
  
  var `1`: Memory
}
object PersistenceOptionsFlipped {
  
  inline def apply(): PersistenceOptionsFlipped = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")("File")
    __obj.updateDynamic("1")("Memory")
    __obj.asInstanceOf[PersistenceOptionsFlipped]
  }
  
  extension [Self <: PersistenceOptionsFlipped](x: Self) {
    
    inline def set0(value: File): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: Memory): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
