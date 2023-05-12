package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wave extends StObject {
  
  /**
    * Wave ARN.
    */
  var arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Wave creation dateTime.
    */
  var creationDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Wave description.
    */
  var description: js.UndefOr[WaveDescription] = js.undefined
  
  /**
    * Wave archival status.
    */
  var isArchived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Wave last modified dateTime.
    */
  var lastModifiedDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Wave name.
    */
  var name: js.UndefOr[WaveName] = js.undefined
  
  /**
    * Wave tags.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * Wave aggregated status.
    */
  var waveAggregatedStatus: js.UndefOr[WaveAggregatedStatus] = js.undefined
  
  /**
    * Wave ID.
    */
  var waveID: js.UndefOr[WaveID] = js.undefined
}
object Wave {
  
  inline def apply(): Wave = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Wave]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Wave] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDescription(value: WaveDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIsArchived(value: Boolean): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
    
    inline def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
    
    inline def setLastModifiedDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setName(value: WaveName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setWaveAggregatedStatus(value: WaveAggregatedStatus): Self = StObject.set(x, "waveAggregatedStatus", value.asInstanceOf[js.Any])
    
    inline def setWaveAggregatedStatusUndefined: Self = StObject.set(x, "waveAggregatedStatus", js.undefined)
    
    inline def setWaveID(value: WaveID): Self = StObject.set(x, "waveID", value.asInstanceOf[js.Any])
    
    inline def setWaveIDUndefined: Self = StObject.set(x, "waveID", js.undefined)
  }
}
