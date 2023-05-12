package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIndexOutput extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the index.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the index was originally created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the index was last updated.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This response value is present only if this index is Type=AGGREGATOR. A list of the Amazon Web Services Regions that replicate their content to the index in this Region.
    */
  var ReplicatingFrom: js.UndefOr[RegionList] = js.undefined
  
  /**
    * This response value is present only if this index is Type=LOCAL. The Amazon Web Services Region that contains the aggregator index, if one exists. If an aggregator index does exist then the Region in which you called this operation replicates its index information to the Region specified in this response value. 
    */
  var ReplicatingTo: js.UndefOr[RegionList] = js.undefined
  
  /**
    * The current state of the index in this Amazon Web Services Region.
    */
  var State: js.UndefOr[IndexState] = js.undefined
  
  /**
    * Tag key and value pairs that are attached to the index.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of the index in this Region. For information about the aggregator index and how it differs from a local index, see Turning on cross-Region search by creating an aggregator index.
    */
  var Type: js.UndefOr[IndexType] = js.undefined
}
object GetIndexOutput {
  
  inline def apply(): GetIndexOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIndexOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIndexOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setReplicatingFrom(value: RegionList): Self = StObject.set(x, "ReplicatingFrom", value.asInstanceOf[js.Any])
    
    inline def setReplicatingFromUndefined: Self = StObject.set(x, "ReplicatingFrom", js.undefined)
    
    inline def setReplicatingFromVarargs(value: String*): Self = StObject.set(x, "ReplicatingFrom", js.Array(value*))
    
    inline def setReplicatingTo(value: RegionList): Self = StObject.set(x, "ReplicatingTo", value.asInstanceOf[js.Any])
    
    inline def setReplicatingToUndefined: Self = StObject.set(x, "ReplicatingTo", js.undefined)
    
    inline def setReplicatingToVarargs(value: String*): Self = StObject.set(x, "ReplicatingTo", js.Array(value*))
    
    inline def setState(value: IndexState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: IndexType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
