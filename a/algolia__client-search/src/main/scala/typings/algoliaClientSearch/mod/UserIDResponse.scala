package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserIDResponse extends StObject {
  
  /**
    * Cluster on which the user is assigned
    */
  var clusterName: String = js.native
  
  /**
    * Data size used by the user.
    */
  var dataSize: Double = js.native
  
  /**
    * Number of records belonging to the user.
    */
  var nbRecords: Double = js.native
  
  /**
    * userID of the user.
    */
  var userID: String = js.native
}
object UserIDResponse {
  
  @scala.inline
  def apply(clusterName: String, dataSize: Double, nbRecords: Double, userID: String): UserIDResponse = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], nbRecords = nbRecords.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIDResponse]
  }
  
  @scala.inline
  implicit class UserIDResponseMutableBuilder[Self <: UserIDResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbRecords(value: Double): Self = StObject.set(x, "nbRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
  }
}
