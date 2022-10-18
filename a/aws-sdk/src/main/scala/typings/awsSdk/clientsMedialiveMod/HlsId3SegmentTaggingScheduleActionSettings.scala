package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsId3SegmentTaggingScheduleActionSettings extends StObject {
  
  /**
    * ID3 tag to insert into each segment. Supports special keyword identifiers to substitute in segment-related values.\nSupported keyword identifiers: https://docs.aws.amazon.com/medialive/latest/ug/variable-data-identifiers.html
    */
  var Tag: string
}
object HlsId3SegmentTaggingScheduleActionSettings {
  
  inline def apply(Tag: string): HlsId3SegmentTaggingScheduleActionSettings = {
    val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsId3SegmentTaggingScheduleActionSettings]
  }
  
  extension [Self <: HlsId3SegmentTaggingScheduleActionSettings](x: Self) {
    
    inline def setTag(value: string): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
  }
}
