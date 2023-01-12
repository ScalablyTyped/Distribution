package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastorePartition extends StObject {
  
  /**
    *  A partition dimension defined by an attributeName. 
    */
  var attributePartition: js.UndefOr[Partition] = js.undefined
  
  /**
    *  A partition dimension defined by a timestamp attribute. 
    */
  var timestampPartition: js.UndefOr[TimestampPartition] = js.undefined
}
object DatastorePartition {
  
  inline def apply(): DatastorePartition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastorePartition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatastorePartition] (val x: Self) extends AnyVal {
    
    inline def setAttributePartition(value: Partition): Self = StObject.set(x, "attributePartition", value.asInstanceOf[js.Any])
    
    inline def setAttributePartitionUndefined: Self = StObject.set(x, "attributePartition", js.undefined)
    
    inline def setTimestampPartition(value: TimestampPartition): Self = StObject.set(x, "timestampPartition", value.asInstanceOf[js.Any])
    
    inline def setTimestampPartitionUndefined: Self = StObject.set(x, "timestampPartition", js.undefined)
  }
}
