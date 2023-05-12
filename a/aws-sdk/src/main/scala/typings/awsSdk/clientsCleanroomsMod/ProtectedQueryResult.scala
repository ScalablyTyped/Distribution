package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectedQueryResult extends StObject {
  
  /**
    * The output of the protected query.
    */
  var output: ProtectedQueryOutput
}
object ProtectedQueryResult {
  
  inline def apply(output: ProtectedQueryOutput): ProtectedQueryResult = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedQueryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectedQueryResult] (val x: Self) extends AnyVal {
    
    inline def setOutput(value: ProtectedQueryOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
