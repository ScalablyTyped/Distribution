package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStorageConfiguration extends StObject {
  
  /**
    * The status of the media storage configuration.
    */
  var Status: MediaStorageConfigurationStatus
  
  /**
    * The Amazon Resource Name (ARN) of the stream 
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
}
object MediaStorageConfiguration {
  
  inline def apply(Status: MediaStorageConfigurationStatus): MediaStorageConfiguration = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStorageConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaStorageConfiguration] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: MediaStorageConfigurationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
  }
}
