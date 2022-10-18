package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamOutput extends StObject {
  
  /**
    * The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that comprise the stream, and whether there are more shards available.
    */
  var StreamDescription: typings.awsSdk.clientsKinesisMod.StreamDescription
}
object DescribeStreamOutput {
  
  inline def apply(StreamDescription: StreamDescription): DescribeStreamOutput = {
    val __obj = js.Dynamic.literal(StreamDescription = StreamDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamOutput]
  }
  
  extension [Self <: DescribeStreamOutput](x: Self) {
    
    inline def setStreamDescription(value: StreamDescription): Self = StObject.set(x, "StreamDescription", value.asInstanceOf[js.Any])
  }
}
