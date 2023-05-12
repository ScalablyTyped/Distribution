package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMediaStorageConfigurationInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the channel.
    */
  var ChannelARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the channel.
    */
  var ChannelName: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.ChannelName] = js.undefined
}
object DescribeMediaStorageConfigurationInput {
  
  inline def apply(): DescribeMediaStorageConfigurationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMediaStorageConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMediaStorageConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
    
    inline def setChannelARNUndefined: Self = StObject.set(x, "ChannelARN", js.undefined)
    
    inline def setChannelName(value: ChannelName): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNameUndefined: Self = StObject.set(x, "ChannelName", js.undefined)
  }
}
