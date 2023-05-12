package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterSnapshotInput extends StObject {
  
  /**
    * The arn of the Elastic DocumentDB snapshot that is to be deleted.
    */
  var snapshotArn: String
}
object DeleteClusterSnapshotInput {
  
  inline def apply(snapshotArn: String): DeleteClusterSnapshotInput = {
    val __obj = js.Dynamic.literal(snapshotArn = snapshotArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterSnapshotInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteClusterSnapshotInput] (val x: Self) extends AnyVal {
    
    inline def setSnapshotArn(value: String): Self = StObject.set(x, "snapshotArn", value.asInstanceOf[js.Any])
  }
}
