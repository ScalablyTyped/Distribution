package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRaidArraysResult extends StObject {
  
  /**
    * A RaidArrays object that describes the specified RAID arrays.
    */
  var RaidArrays: js.UndefOr[typings.awsSdk.clientsOpsworksMod.RaidArrays] = js.undefined
}
object DescribeRaidArraysResult {
  
  inline def apply(): DescribeRaidArraysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRaidArraysResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRaidArraysResult] (val x: Self) extends AnyVal {
    
    inline def setRaidArrays(value: RaidArrays): Self = StObject.set(x, "RaidArrays", value.asInstanceOf[js.Any])
    
    inline def setRaidArraysUndefined: Self = StObject.set(x, "RaidArrays", js.undefined)
    
    inline def setRaidArraysVarargs(value: RaidArray*): Self = StObject.set(x, "RaidArrays", js.Array(value*))
  }
}
