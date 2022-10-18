package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountLimit extends StObject {
  
  /**
    * The maximum size of a function's deployment package and layers when they're extracted.
    */
  var CodeSizeUnzipped: js.UndefOr[Long] = js.undefined
  
  /**
    * The maximum size of a deployment package when it's uploaded directly to Lambda. Use Amazon S3 for larger files.
    */
  var CodeSizeZipped: js.UndefOr[Long] = js.undefined
  
  /**
    * The maximum number of simultaneous function executions.
    */
  var ConcurrentExecutions: js.UndefOr[Integer] = js.undefined
  
  /**
    * The amount of storage space that you can use for all deployment packages and layer archives.
    */
  var TotalCodeSize: js.UndefOr[Long] = js.undefined
  
  /**
    * The maximum number of simultaneous function executions, minus the capacity that's reserved for individual functions with PutFunctionConcurrency.
    */
  var UnreservedConcurrentExecutions: js.UndefOr[typings.awsSdk.clientsLambdaMod.UnreservedConcurrentExecutions] = js.undefined
}
object AccountLimit {
  
  inline def apply(): AccountLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLimit]
  }
  
  extension [Self <: AccountLimit](x: Self) {
    
    inline def setCodeSizeUnzipped(value: Long): Self = StObject.set(x, "CodeSizeUnzipped", value.asInstanceOf[js.Any])
    
    inline def setCodeSizeUnzippedUndefined: Self = StObject.set(x, "CodeSizeUnzipped", js.undefined)
    
    inline def setCodeSizeZipped(value: Long): Self = StObject.set(x, "CodeSizeZipped", value.asInstanceOf[js.Any])
    
    inline def setCodeSizeZippedUndefined: Self = StObject.set(x, "CodeSizeZipped", js.undefined)
    
    inline def setConcurrentExecutions(value: Integer): Self = StObject.set(x, "ConcurrentExecutions", value.asInstanceOf[js.Any])
    
    inline def setConcurrentExecutionsUndefined: Self = StObject.set(x, "ConcurrentExecutions", js.undefined)
    
    inline def setTotalCodeSize(value: Long): Self = StObject.set(x, "TotalCodeSize", value.asInstanceOf[js.Any])
    
    inline def setTotalCodeSizeUndefined: Self = StObject.set(x, "TotalCodeSize", js.undefined)
    
    inline def setUnreservedConcurrentExecutions(value: UnreservedConcurrentExecutions): Self = StObject.set(x, "UnreservedConcurrentExecutions", value.asInstanceOf[js.Any])
    
    inline def setUnreservedConcurrentExecutionsUndefined: Self = StObject.set(x, "UnreservedConcurrentExecutions", js.undefined)
  }
}
