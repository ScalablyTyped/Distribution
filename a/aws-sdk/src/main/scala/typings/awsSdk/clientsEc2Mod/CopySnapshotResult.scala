package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopySnapshotResult extends StObject {
  
  /**
    * The ID of the new snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags applied to the new snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CopySnapshotResult {
  
  inline def apply(): CopySnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopySnapshotResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopySnapshotResult] (val x: Self) extends AnyVal {
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
