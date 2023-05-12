package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capacity extends StObject {
  
  /**
    * The amount of space that's being used in a storage system resource without accounting for compression or deduplication.
    */
  var LogicalUsed: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The total amount of space available in a storage system resource.
    */
  var Provisioned: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The amount of space that's being used in a storage system resource.
    */
  var Used: js.UndefOr[NonNegativeLong] = js.undefined
}
object Capacity {
  
  inline def apply(): Capacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Capacity] (val x: Self) extends AnyVal {
    
    inline def setLogicalUsed(value: NonNegativeLong): Self = StObject.set(x, "LogicalUsed", value.asInstanceOf[js.Any])
    
    inline def setLogicalUsedUndefined: Self = StObject.set(x, "LogicalUsed", js.undefined)
    
    inline def setProvisioned(value: NonNegativeLong): Self = StObject.set(x, "Provisioned", value.asInstanceOf[js.Any])
    
    inline def setProvisionedUndefined: Self = StObject.set(x, "Provisioned", js.undefined)
    
    inline def setUsed(value: NonNegativeLong): Self = StObject.set(x, "Used", value.asInstanceOf[js.Any])
    
    inline def setUsedUndefined: Self = StObject.set(x, "Used", js.undefined)
  }
}
