package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamSummaryInput extends StObject {
  
  /**
    * The name of the stream to describe.
    */
  var StreamName: typings.awsSdk.clientsKinesisMod.StreamName
}
object DescribeStreamSummaryInput {
  
  inline def apply(StreamName: StreamName): DescribeStreamSummaryInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamSummaryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStreamSummaryInput] (val x: Self) extends AnyVal {
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
