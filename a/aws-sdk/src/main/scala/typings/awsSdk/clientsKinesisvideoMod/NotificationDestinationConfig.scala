package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationDestinationConfig extends StObject {
  
  /**
    * The Uniform Resource Idenifier (URI) that identifies where the images will be delivered.
    */
  var Uri: DestinationUri
}
object NotificationDestinationConfig {
  
  inline def apply(Uri: DestinationUri): NotificationDestinationConfig = {
    val __obj = js.Dynamic.literal(Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationDestinationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationDestinationConfig] (val x: Self) extends AnyVal {
    
    inline def setUri(value: DestinationUri): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
  }
}
