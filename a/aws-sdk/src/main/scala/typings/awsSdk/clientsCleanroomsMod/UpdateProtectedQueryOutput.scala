package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProtectedQueryOutput extends StObject {
  
  /**
    * The protected query output.
    */
  var protectedQuery: ProtectedQuery
}
object UpdateProtectedQueryOutput {
  
  inline def apply(protectedQuery: ProtectedQuery): UpdateProtectedQueryOutput = {
    val __obj = js.Dynamic.literal(protectedQuery = protectedQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProtectedQueryOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProtectedQueryOutput] (val x: Self) extends AnyVal {
    
    inline def setProtectedQuery(value: ProtectedQuery): Self = StObject.set(x, "protectedQuery", value.asInstanceOf[js.Any])
  }
}
