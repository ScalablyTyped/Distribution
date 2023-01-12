package typings.awsSdk.clientsKinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HLSFragmentSelector extends StObject {
  
  /**
    * The source of the timestamps for the requested media. When FragmentSelectorType is set to PRODUCER_TIMESTAMP and GetHLSStreamingSessionURLInput$PlaybackMode is ON_DEMAND or LIVE_REPLAY, the first fragment ingested with a producer timestamp within the specified FragmentSelector$TimestampRange is included in the media playlist. In addition, the fragments with producer timestamps within the TimestampRange ingested immediately following the first fragment (up to the GetHLSStreamingSessionURLInput$MaxMediaPlaylistFragmentResults value) are included.  Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are producing a stream of fragments with producer timestamps that are approximately equal to the true clock time, the HLS media playlists will contain all of the fragments within the requested timestamp range. If some fragments are ingested within the same time range and very different points in time, only the oldest ingested collection of fragments are returned. When FragmentSelectorType is set to PRODUCER_TIMESTAMP and GetHLSStreamingSessionURLInput$PlaybackMode is LIVE, the producer timestamps are used in the MP4 fragments and for deduplication. But the most recently ingested fragments based on server timestamps are included in the HLS media playlist. This means that even if fragments ingested in the past have producer timestamps with values now, they are not included in the HLS media playlist. The default is SERVER_TIMESTAMP.
    */
  var FragmentSelectorType: js.UndefOr[HLSFragmentSelectorType] = js.undefined
  
  /**
    * The start and end of the timestamp range for the requested media. This value should not be present if PlaybackType is LIVE.
    */
  var TimestampRange: js.UndefOr[HLSTimestampRange] = js.undefined
}
object HLSFragmentSelector {
  
  inline def apply(): HLSFragmentSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HLSFragmentSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HLSFragmentSelector] (val x: Self) extends AnyVal {
    
    inline def setFragmentSelectorType(value: HLSFragmentSelectorType): Self = StObject.set(x, "FragmentSelectorType", value.asInstanceOf[js.Any])
    
    inline def setFragmentSelectorTypeUndefined: Self = StObject.set(x, "FragmentSelectorType", js.undefined)
    
    inline def setTimestampRange(value: HLSTimestampRange): Self = StObject.set(x, "TimestampRange", value.asInstanceOf[js.Any])
    
    inline def setTimestampRangeUndefined: Self = StObject.set(x, "TimestampRange", js.undefined)
  }
}
