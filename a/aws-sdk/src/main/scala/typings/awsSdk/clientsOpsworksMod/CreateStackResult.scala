package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStackResult extends StObject {
  
  /**
    * The stack ID, which is an opaque string that you use to identify the stack when performing actions such as DescribeStacks.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object CreateStackResult {
  
  inline def apply(): CreateStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStackResult] (val x: Self) extends AnyVal {
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
