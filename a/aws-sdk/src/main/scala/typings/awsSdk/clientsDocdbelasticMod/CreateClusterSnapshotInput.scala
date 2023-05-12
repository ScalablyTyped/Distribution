package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterSnapshotInput extends StObject {
  
  /**
    * The arn of the Elastic DocumentDB cluster that the snapshot will be taken from.
    */
  var clusterArn: String
  
  /**
    * The name of the Elastic DocumentDB snapshot.
    */
  var snapshotName: CreateClusterSnapshotInputSnapshotNameString
  
  /**
    * The tags to be assigned to the new Elastic DocumentDB snapshot.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateClusterSnapshotInput {
  
  inline def apply(clusterArn: String, snapshotName: CreateClusterSnapshotInputSnapshotNameString): CreateClusterSnapshotInput = {
    val __obj = js.Dynamic.literal(clusterArn = clusterArn.asInstanceOf[js.Any], snapshotName = snapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterSnapshotInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateClusterSnapshotInput] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    inline def setSnapshotName(value: CreateClusterSnapshotInputSnapshotNameString): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
