package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstancesResult extends StObject {
  
  /**
    * An array of Instance objects that describe the instances.
    */
  var Instances: js.UndefOr[typings.awsSdk.clientsOpsworksMod.Instances] = js.undefined
}
object DescribeInstancesResult {
  
  inline def apply(): DescribeInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInstancesResult] (val x: Self) extends AnyVal {
    
    inline def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value*))
  }
}
