package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelIdMohClass extends StObject {
  
  var channelId: String
  
  var mohClass: js.UndefOr[String] = js.undefined
}
object ChannelIdMohClass {
  
  @scala.inline
  def apply(channelId: String): ChannelIdMohClass = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdMohClass]
  }
  
  @scala.inline
  implicit class ChannelIdMohClassMutableBuilder[Self <: ChannelIdMohClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMohClass(value: String): Self = StObject.set(x, "mohClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMohClassUndefined: Self = StObject.set(x, "mohClass", js.undefined)
  }
}
