package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackResourceOutput extends StObject {
  
  /**
    * A StackResourceDetail structure containing the description of the specified resource in the specified stack.
    */
  var StackResourceDetail: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackResourceDetail] = js.undefined
}
object DescribeStackResourceOutput {
  
  inline def apply(): DescribeStackResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackResourceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStackResourceOutput] (val x: Self) extends AnyVal {
    
    inline def setStackResourceDetail(value: StackResourceDetail): Self = StObject.set(x, "StackResourceDetail", value.asInstanceOf[js.Any])
    
    inline def setStackResourceDetailUndefined: Self = StObject.set(x, "StackResourceDetail", js.undefined)
  }
}
