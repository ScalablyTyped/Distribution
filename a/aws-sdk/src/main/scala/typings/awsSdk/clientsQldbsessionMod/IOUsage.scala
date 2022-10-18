package typings.awsSdk.clientsQldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOUsage extends StObject {
  
  /**
    * The number of read I/O requests that the command made.
    */
  var ReadIOs: js.UndefOr[typings.awsSdk.clientsQldbsessionMod.ReadIOs] = js.undefined
  
  /**
    * The number of write I/O requests that the command made.
    */
  var WriteIOs: js.UndefOr[typings.awsSdk.clientsQldbsessionMod.WriteIOs] = js.undefined
}
object IOUsage {
  
  inline def apply(): IOUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOUsage]
  }
  
  extension [Self <: IOUsage](x: Self) {
    
    inline def setReadIOs(value: ReadIOs): Self = StObject.set(x, "ReadIOs", value.asInstanceOf[js.Any])
    
    inline def setReadIOsUndefined: Self = StObject.set(x, "ReadIOs", js.undefined)
    
    inline def setWriteIOs(value: WriteIOs): Self = StObject.set(x, "WriteIOs", value.asInstanceOf[js.Any])
    
    inline def setWriteIOsUndefined: Self = StObject.set(x, "WriteIOs", js.undefined)
  }
}
