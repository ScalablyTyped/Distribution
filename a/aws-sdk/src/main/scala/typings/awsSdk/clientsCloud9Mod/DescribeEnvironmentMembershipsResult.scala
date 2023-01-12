package typings.awsSdk.clientsCloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEnvironmentMembershipsResult extends StObject {
  
  /**
    * Information about the environment members for the environment.
    */
  var memberships: js.UndefOr[EnvironmentMembersList] = js.undefined
  
  /**
    * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object DescribeEnvironmentMembershipsResult {
  
  inline def apply(): DescribeEnvironmentMembershipsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentMembershipsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEnvironmentMembershipsResult] (val x: Self) extends AnyVal {
    
    inline def setMemberships(value: EnvironmentMembersList): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    inline def setMembershipsVarargs(value: EnvironmentMember*): Self = StObject.set(x, "memberships", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
