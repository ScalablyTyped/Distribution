package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisVideoStream extends StObject {
  
  /**
    * ARN of the Kinesis video stream stream that streams the source video.
    */
  var Arn: js.UndefOr[KinesisVideoArn] = js.undefined
}
object KinesisVideoStream {
  
  inline def apply(): KinesisVideoStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisVideoStream]
  }
  
  extension [Self <: KinesisVideoStream](x: Self) {
    
    inline def setArn(value: KinesisVideoArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
