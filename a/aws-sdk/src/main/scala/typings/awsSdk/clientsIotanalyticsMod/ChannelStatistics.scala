package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelStatistics extends StObject {
  
  /**
    * The estimated size of the channel.
    */
  var size: js.UndefOr[EstimatedResourceSize] = js.undefined
}
object ChannelStatistics {
  
  inline def apply(): ChannelStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelStatistics]
  }
  
  extension [Self <: ChannelStatistics](x: Self) {
    
    inline def setSize(value: EstimatedResourceSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
