package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIDResponse extends StObject {
  
  /**
    * Cluster on which the user is assigned
    */
  var clusterName: String
  
  /**
    * Data size used by the user.
    */
  var dataSize: Double
  
  /**
    * Number of records belonging to the user.
    */
  var nbRecords: Double
  
  /**
    * userID of the user.
    */
  var userID: String
}
object UserIDResponse {
  
  inline def apply(clusterName: String, dataSize: Double, nbRecords: Double, userID: String): UserIDResponse = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], nbRecords = nbRecords.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIDResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserIDResponse] (val x: Self) extends AnyVal {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
    
    inline def setNbRecords(value: Double): Self = StObject.set(x, "nbRecords", value.asInstanceOf[js.Any])
    
    inline def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
  }
}
