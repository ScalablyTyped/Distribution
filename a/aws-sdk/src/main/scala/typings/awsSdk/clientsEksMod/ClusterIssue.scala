package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterIssue extends StObject {
  
  /**
    * The error code of the issue.
    */
  var code: js.UndefOr[ClusterIssueCode] = js.undefined
  
  /**
    * A description of the issue.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The resource IDs that the issue relates to.
    */
  var resourceIds: js.UndefOr[StringList] = js.undefined
}
object ClusterIssue {
  
  inline def apply(): ClusterIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterIssue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterIssue] (val x: Self) extends AnyVal {
    
    inline def setCode(value: ClusterIssueCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setResourceIds(value: StringList): Self = StObject.set(x, "resourceIds", value.asInstanceOf[js.Any])
    
    inline def setResourceIdsUndefined: Self = StObject.set(x, "resourceIds", js.undefined)
    
    inline def setResourceIdsVarargs(value: String*): Self = StObject.set(x, "resourceIds", js.Array(value*))
  }
}
