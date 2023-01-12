package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMultiRegionAccessPointOperationResult extends StObject {
  
  /**
    * A container element containing the details of the asynchronous operation.
    */
  var AsyncOperation: js.UndefOr[typings.awsSdk.clientsS3controlMod.AsyncOperation] = js.undefined
}
object DescribeMultiRegionAccessPointOperationResult {
  
  inline def apply(): DescribeMultiRegionAccessPointOperationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMultiRegionAccessPointOperationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMultiRegionAccessPointOperationResult] (val x: Self) extends AnyVal {
    
    inline def setAsyncOperation(value: AsyncOperation): Self = StObject.set(x, "AsyncOperation", value.asInstanceOf[js.Any])
    
    inline def setAsyncOperationUndefined: Self = StObject.set(x, "AsyncOperation", js.undefined)
  }
}
