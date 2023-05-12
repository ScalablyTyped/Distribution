package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComputeOutput extends StObject {
  
  /**
    * The details of the compute resource you registered to the specified fleet.
    */
  var Compute: js.UndefOr[typings.awsSdk.clientsGameliftMod.Compute] = js.undefined
}
object DescribeComputeOutput {
  
  inline def apply(): DescribeComputeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComputeOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeComputeOutput] (val x: Self) extends AnyVal {
    
    inline def setCompute(value: Compute): Self = StObject.set(x, "Compute", value.asInstanceOf[js.Any])
    
    inline def setComputeUndefined: Self = StObject.set(x, "Compute", js.undefined)
  }
}
