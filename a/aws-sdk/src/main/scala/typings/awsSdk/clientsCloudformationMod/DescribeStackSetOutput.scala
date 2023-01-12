package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackSetOutput extends StObject {
  
  /**
    * The specified stack set.
    */
  var StackSet: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackSet] = js.undefined
}
object DescribeStackSetOutput {
  
  inline def apply(): DescribeStackSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackSetOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStackSetOutput] (val x: Self) extends AnyVal {
    
    inline def setStackSet(value: StackSet): Self = StObject.set(x, "StackSet", value.asInstanceOf[js.Any])
    
    inline def setStackSetUndefined: Self = StObject.set(x, "StackSet", js.undefined)
  }
}
