package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryBuildBatchOutput extends StObject {
  
  var buildBatch: js.UndefOr[BuildBatch] = js.undefined
}
object RetryBuildBatchOutput {
  
  inline def apply(): RetryBuildBatchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryBuildBatchOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetryBuildBatchOutput] (val x: Self) extends AnyVal {
    
    inline def setBuildBatch(value: BuildBatch): Self = StObject.set(x, "buildBatch", value.asInstanceOf[js.Any])
    
    inline def setBuildBatchUndefined: Self = StObject.set(x, "buildBatch", js.undefined)
  }
}
