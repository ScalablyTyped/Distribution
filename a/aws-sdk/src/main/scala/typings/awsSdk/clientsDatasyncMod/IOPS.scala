package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOPS extends StObject {
  
  /**
    * Peak IOPS unrelated to read and write operations.
    */
  var Other: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak IOPS related to read operations.
    */
  var Read: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak total IOPS on your on-premises storage system resource.
    */
  var Total: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak IOPS related to write operations.
    */
  var Write: js.UndefOr[NonNegativeDouble] = js.undefined
}
object IOPS {
  
  inline def apply(): IOPS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOPS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOPS] (val x: Self) extends AnyVal {
    
    inline def setOther(value: NonNegativeDouble): Self = StObject.set(x, "Other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "Other", js.undefined)
    
    inline def setRead(value: NonNegativeDouble): Self = StObject.set(x, "Read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "Read", js.undefined)
    
    inline def setTotal(value: NonNegativeDouble): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
    
    inline def setWrite(value: NonNegativeDouble): Self = StObject.set(x, "Write", value.asInstanceOf[js.Any])
    
    inline def setWriteUndefined: Self = StObject.set(x, "Write", js.undefined)
  }
}
