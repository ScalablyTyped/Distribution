package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelRequest extends StObject {
  
  /**
    * The name of the channel.
    */
  var channelName: ChannelName
  
  /**
    * Where channel data is stored. You can choose one of serviceManagedS3 or customerManagedS3 storage. If not specified, the default is serviceManagedS3. You can't change this storage option after the channel is created.
    */
  var channelStorage: js.UndefOr[ChannelStorage] = js.undefined
  
  /**
    * How long, in days, message data is kept for the channel. When customerManagedS3 storage is selected, this parameter is ignored.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  
  /**
    * Metadata which can be used to manage the channel.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateChannelRequest {
  
  inline def apply(channelName: ChannelName): CreateChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelName(value: ChannelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setChannelStorage(value: ChannelStorage): Self = StObject.set(x, "channelStorage", value.asInstanceOf[js.Any])
    
    inline def setChannelStorageUndefined: Self = StObject.set(x, "channelStorage", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
