package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePlaybackKeyPairRequest extends StObject {
  
  /**
    * ARN of the key pair to be deleted.
    */
  var arn: PlaybackKeyPairArn
}
object DeletePlaybackKeyPairRequest {
  
  inline def apply(arn: PlaybackKeyPairArn): DeletePlaybackKeyPairRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePlaybackKeyPairRequest]
  }
  
  extension [Self <: DeletePlaybackKeyPairRequest](x: Self) {
    
    inline def setArn(value: PlaybackKeyPairArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
