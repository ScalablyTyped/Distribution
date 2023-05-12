package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalSizeConfig extends StObject {
  
  /**
    * The overall maximum size of the media that you want to store for a stream on the Edge Agent. 
    */
  var MaxLocalMediaSizeInMB: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.MaxLocalMediaSizeInMB] = js.undefined
  
  /**
    * The strategy to perform when a stream’s MaxLocalMediaSizeInMB limit is reached.
    */
  var StrategyOnFullSize: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.StrategyOnFullSize] = js.undefined
}
object LocalSizeConfig {
  
  inline def apply(): LocalSizeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalSizeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalSizeConfig] (val x: Self) extends AnyVal {
    
    inline def setMaxLocalMediaSizeInMB(value: MaxLocalMediaSizeInMB): Self = StObject.set(x, "MaxLocalMediaSizeInMB", value.asInstanceOf[js.Any])
    
    inline def setMaxLocalMediaSizeInMBUndefined: Self = StObject.set(x, "MaxLocalMediaSizeInMB", js.undefined)
    
    inline def setStrategyOnFullSize(value: StrategyOnFullSize): Self = StObject.set(x, "StrategyOnFullSize", value.asInstanceOf[js.Any])
    
    inline def setStrategyOnFullSizeUndefined: Self = StObject.set(x, "StrategyOnFullSize", js.undefined)
  }
}
