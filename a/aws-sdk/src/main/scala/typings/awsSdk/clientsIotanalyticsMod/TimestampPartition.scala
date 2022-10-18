package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampPartition extends StObject {
  
  /**
    *  The attribute name of the partition defined by a timestamp. 
    */
  var attributeName: PartitionAttributeName
  
  /**
    *  The timestamp format of a partition defined by a timestamp. The default format is seconds since epoch (January 1, 1970 at midnight UTC time). 
    */
  var timestampFormat: js.UndefOr[TimestampFormat] = js.undefined
}
object TimestampPartition {
  
  inline def apply(attributeName: PartitionAttributeName): TimestampPartition = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampPartition]
  }
  
  extension [Self <: TimestampPartition](x: Self) {
    
    inline def setAttributeName(value: PartitionAttributeName): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setTimestampFormat(value: TimestampFormat): Self = StObject.set(x, "timestampFormat", value.asInstanceOf[js.Any])
    
    inline def setTimestampFormatUndefined: Self = StObject.set(x, "timestampFormat", js.undefined)
  }
}
