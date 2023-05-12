package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProtectedQueryOutput extends StObject {
  
  /**
    * The query processing metadata.
    */
  var protectedQuery: ProtectedQuery
}
object GetProtectedQueryOutput {
  
  inline def apply(protectedQuery: ProtectedQuery): GetProtectedQueryOutput = {
    val __obj = js.Dynamic.literal(protectedQuery = protectedQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProtectedQueryOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetProtectedQueryOutput] (val x: Self) extends AnyVal {
    
    inline def setProtectedQuery(value: ProtectedQuery): Self = StObject.set(x, "protectedQuery", value.asInstanceOf[js.Any])
  }
}
