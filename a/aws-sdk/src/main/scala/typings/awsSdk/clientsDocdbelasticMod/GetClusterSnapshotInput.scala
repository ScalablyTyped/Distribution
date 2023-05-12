package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClusterSnapshotInput extends StObject {
  
  /**
    * The arn of the Elastic DocumentDB snapshot.
    */
  var snapshotArn: String
}
object GetClusterSnapshotInput {
  
  inline def apply(snapshotArn: String): GetClusterSnapshotInput = {
    val __obj = js.Dynamic.literal(snapshotArn = snapshotArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterSnapshotInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClusterSnapshotInput] (val x: Self) extends AnyVal {
    
    inline def setSnapshotArn(value: String): Self = StObject.set(x, "snapshotArn", value.asInstanceOf[js.Any])
  }
}
