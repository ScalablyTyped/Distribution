package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePublisherInput extends StObject {
  
  /**
    * The ID of the extension publisher. If you don't supply a PublisherId, and you have registered as an extension publisher, DescribePublisher returns information about your own publisher account.
    */
  var PublisherId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.PublisherId] = js.undefined
}
object DescribePublisherInput {
  
  inline def apply(): DescribePublisherInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePublisherInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePublisherInput] (val x: Self) extends AnyVal {
    
    inline def setPublisherId(value: PublisherId): Self = StObject.set(x, "PublisherId", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdUndefined: Self = StObject.set(x, "PublisherId", js.undefined)
  }
}
