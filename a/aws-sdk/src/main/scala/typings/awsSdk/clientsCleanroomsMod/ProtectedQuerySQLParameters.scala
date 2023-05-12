package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectedQuerySQLParameters extends StObject {
  
  /**
    * The query string to be submitted.
    */
  var queryString: ProtectedQuerySQLParametersQueryStringString
}
object ProtectedQuerySQLParameters {
  
  inline def apply(queryString: ProtectedQuerySQLParametersQueryStringString): ProtectedQuerySQLParameters = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedQuerySQLParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectedQuerySQLParameters] (val x: Self) extends AnyVal {
    
    inline def setQueryString(value: ProtectedQuerySQLParametersQueryStringString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
  }
}
