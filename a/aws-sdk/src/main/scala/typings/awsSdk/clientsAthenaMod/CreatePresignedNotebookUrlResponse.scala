package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePresignedNotebookUrlResponse extends StObject {
  
  /**
    * The authentication token for the notebook.
    */
  var AuthToken: typings.awsSdk.clientsAthenaMod.AuthToken
  
  /**
    * The UTC epoch time when the authentication token expires.
    */
  var AuthTokenExpirationTime: Long
  
  /**
    * The URL of the notebook. The URL includes the authentication token and notebook file name and points directly to the opened notebook.
    */
  var NotebookUrl: String
}
object CreatePresignedNotebookUrlResponse {
  
  inline def apply(AuthToken: AuthToken, AuthTokenExpirationTime: Long, NotebookUrl: String): CreatePresignedNotebookUrlResponse = {
    val __obj = js.Dynamic.literal(AuthToken = AuthToken.asInstanceOf[js.Any], AuthTokenExpirationTime = AuthTokenExpirationTime.asInstanceOf[js.Any], NotebookUrl = NotebookUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedNotebookUrlResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePresignedNotebookUrlResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthToken(value: AuthToken): Self = StObject.set(x, "AuthToken", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenExpirationTime(value: Long): Self = StObject.set(x, "AuthTokenExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setNotebookUrl(value: String): Self = StObject.set(x, "NotebookUrl", value.asInstanceOf[js.Any])
  }
}
