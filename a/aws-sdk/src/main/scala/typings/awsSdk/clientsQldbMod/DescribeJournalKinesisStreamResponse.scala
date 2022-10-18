package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJournalKinesisStreamResponse extends StObject {
  
  /**
    * Information about the QLDB journal stream returned by a DescribeJournalS3Export request.
    */
  var Stream: js.UndefOr[JournalKinesisStreamDescription] = js.undefined
}
object DescribeJournalKinesisStreamResponse {
  
  inline def apply(): DescribeJournalKinesisStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJournalKinesisStreamResponse]
  }
  
  extension [Self <: DescribeJournalKinesisStreamResponse](x: Self) {
    
    inline def setStream(value: JournalKinesisStreamDescription): Self = StObject.set(x, "Stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "Stream", js.undefined)
  }
}
