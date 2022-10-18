package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Record extends StObject {
  
  /**
    * The data blob, which is base64-encoded when the blob is serialized. The maximum size of the data blob, before base64-encoding, is 1,000 KiB.
    */
  var Data: typings.awsSdk.clientsFirehoseMod.Data
}
object Record {
  
  inline def apply(Data: Data): Record = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
  
  extension [Self <: Record](x: Self) {
    
    inline def setData(value: Data): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
  }
}
