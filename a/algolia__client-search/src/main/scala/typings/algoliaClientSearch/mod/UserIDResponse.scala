package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserIDResponse extends js.Object {
  
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
  implicit class UserIDResponseOps[Self <: UserIDResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSize(value: Double): Self = this.set("dataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbRecords(value: Double): Self = this.set("nbRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserID(value: String): Self = this.set("userID", value.asInstanceOf[js.Any])
  }
}
