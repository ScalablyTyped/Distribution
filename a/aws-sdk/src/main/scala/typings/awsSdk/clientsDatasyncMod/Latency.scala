package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Latency extends StObject {
  
  /**
    * Peak latency for operations unrelated to read and write operations.
    */
  var Other: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak latency for read operations.
    */
  var Read: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak latency for write operations.
    */
  var Write: js.UndefOr[NonNegativeDouble] = js.undefined
}
object Latency {
  
  inline def apply(): Latency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Latency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Latency] (val x: Self) extends AnyVal {
    
    inline def setOther(value: NonNegativeDouble): Self = StObject.set(x, "Other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "Other", js.undefined)
    
    inline def setRead(value: NonNegativeDouble): Self = StObject.set(x, "Read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "Read", js.undefined)
    
    inline def setWrite(value: NonNegativeDouble): Self = StObject.set(x, "Write", value.asInstanceOf[js.Any])
    
    inline def setWriteUndefined: Self = StObject.set(x, "Write", js.undefined)
  }
}
