package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsId3SegmentTaggingScheduleActionSettings extends StObject {
  
  /**
    * Base64 string formatted according to the ID3 specification: http://id3.org/id3v2.4.0-structure
    */
  var Id3: js.UndefOr[string] = js.undefined
  
  /**
    * ID3 tag to insert into each segment. Supports special keyword identifiers to substitute in segment-related values.\nSupported keyword identifiers: https://docs.aws.amazon.com/medialive/latest/ug/variable-data-identifiers.html
    */
  var Tag: js.UndefOr[string] = js.undefined
}
object HlsId3SegmentTaggingScheduleActionSettings {
  
  inline def apply(): HlsId3SegmentTaggingScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsId3SegmentTaggingScheduleActionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HlsId3SegmentTaggingScheduleActionSettings] (val x: Self) extends AnyVal {
    
    inline def setId3(value: string): Self = StObject.set(x, "Id3", value.asInstanceOf[js.Any])
    
    inline def setId3Undefined: Self = StObject.set(x, "Id3", js.undefined)
    
    inline def setTag(value: string): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
