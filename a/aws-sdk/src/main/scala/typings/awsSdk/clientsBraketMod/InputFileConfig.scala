package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputFileConfig extends StObject {
  
  /**
    * A named input source that an Amazon Braket job can consume.
    */
  var channelName: InputFileConfigChannelNameString
  
  /**
    * The MIME type of the data.
    */
  var contentType: js.UndefOr[String256] = js.undefined
  
  /**
    * The location of the channel data.
    */
  var dataSource: DataSource
}
object InputFileConfig {
  
  inline def apply(channelName: InputFileConfigChannelNameString, dataSource: DataSource): InputFileConfig = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputFileConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputFileConfig] (val x: Self) extends AnyVal {
    
    inline def setChannelName(value: InputFileConfigChannelNameString): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String256): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
  }
}
