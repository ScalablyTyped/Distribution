package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartProtectedQueryOutput extends StObject {
  
  /**
    * The protected query.
    */
  var protectedQuery: ProtectedQuery
}
object StartProtectedQueryOutput {
  
  inline def apply(protectedQuery: ProtectedQuery): StartProtectedQueryOutput = {
    val __obj = js.Dynamic.literal(protectedQuery = protectedQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartProtectedQueryOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartProtectedQueryOutput] (val x: Self) extends AnyVal {
    
    inline def setProtectedQuery(value: ProtectedQuery): Self = StObject.set(x, "protectedQuery", value.asInstanceOf[js.Any])
  }
}
