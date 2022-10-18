package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceConfiguration extends StObject {
  
  /**
    * The selected video streams to capture for a specified media capture pipeline. The number of video streams can't exceed 25.
    */
  var SelectedVideoStreams: js.UndefOr[typings.awsSdk.clientsChimeMod.SelectedVideoStreams] = js.undefined
}
object SourceConfiguration {
  
  inline def apply(): SourceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConfiguration]
  }
  
  extension [Self <: SourceConfiguration](x: Self) {
    
    inline def setSelectedVideoStreams(value: SelectedVideoStreams): Self = StObject.set(x, "SelectedVideoStreams", value.asInstanceOf[js.Any])
    
    inline def setSelectedVideoStreamsUndefined: Self = StObject.set(x, "SelectedVideoStreams", js.undefined)
  }
}
