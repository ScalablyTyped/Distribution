package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStreamInput extends StObject {
  
  /**
    * Optional: The version of the stream that you want to delete.  Specify the version as a safeguard to ensure that your are deleting the correct stream. To get the stream version, use the DescribeStream API. If not specified, only the CreationTime is checked before deleting the stream.
    */
  var CurrentVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to delete. 
    */
  var StreamARN: ResourceARN
}
object DeleteStreamInput {
  
  inline def apply(StreamARN: ResourceARN): DeleteStreamInput = {
    val __obj = js.Dynamic.literal(StreamARN = StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStreamInput]
  }
  
  extension [Self <: DeleteStreamInput](x: Self) {
    
    inline def setCurrentVersion(value: Version): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
  }
}
