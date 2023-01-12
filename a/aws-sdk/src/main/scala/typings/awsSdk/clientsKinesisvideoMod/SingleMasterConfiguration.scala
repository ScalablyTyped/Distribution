package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleMasterConfiguration extends StObject {
  
  /**
    * The period of time a signaling channel retains undelivered messages before they are discarded.
    */
  var MessageTtlSeconds: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.MessageTtlSeconds] = js.undefined
}
object SingleMasterConfiguration {
  
  inline def apply(): SingleMasterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleMasterConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleMasterConfiguration] (val x: Self) extends AnyVal {
    
    inline def setMessageTtlSeconds(value: MessageTtlSeconds): Self = StObject.set(x, "MessageTtlSeconds", value.asInstanceOf[js.Any])
    
    inline def setMessageTtlSecondsUndefined: Self = StObject.set(x, "MessageTtlSeconds", js.undefined)
  }
}
