package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCommandsResult extends StObject {
  
  /**
    * An array of Command objects that describe each of the specified commands.
    */
  var Commands: js.UndefOr[typings.awsSdk.clientsOpsworksMod.Commands] = js.undefined
}
object DescribeCommandsResult {
  
  inline def apply(): DescribeCommandsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCommandsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCommandsResult] (val x: Self) extends AnyVal {
    
    inline def setCommands(value: Commands): Self = StObject.set(x, "Commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "Commands", js.undefined)
    
    inline def setCommandsVarargs(value: Command*): Self = StObject.set(x, "Commands", js.Array(value*))
  }
}
