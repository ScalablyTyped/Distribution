package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackInstanceOutput extends StObject {
  
  /**
    * The stack instance that matches the specified request parameters.
    */
  var StackInstance: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackInstance] = js.undefined
}
object DescribeStackInstanceOutput {
  
  inline def apply(): DescribeStackInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackInstanceOutput]
  }
  
  extension [Self <: DescribeStackInstanceOutput](x: Self) {
    
    inline def setStackInstance(value: StackInstance): Self = StObject.set(x, "StackInstance", value.asInstanceOf[js.Any])
    
    inline def setStackInstanceUndefined: Self = StObject.set(x, "StackInstance", js.undefined)
  }
}
