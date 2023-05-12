package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Application extends StObject {
  
  /**
    * Application aggregated status.
    */
  var applicationAggregatedStatus: js.UndefOr[ApplicationAggregatedStatus] = js.undefined
  
  /**
    * Application ID.
    */
  var applicationID: js.UndefOr[ApplicationID] = js.undefined
  
  /**
    * Application ARN.
    */
  var arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Application creation dateTime.
    */
  var creationDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Application description.
    */
  var description: js.UndefOr[ApplicationDescription] = js.undefined
  
  /**
    * Application archival status.
    */
  var isArchived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Application last modified dateTime.
    */
  var lastModifiedDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Application name.
    */
  var name: js.UndefOr[ApplicationName] = js.undefined
  
  /**
    * Application tags.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * Application wave ID.
    */
  var waveID: js.UndefOr[WaveID] = js.undefined
}
object Application {
  
  inline def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
    
    inline def setApplicationAggregatedStatus(value: ApplicationAggregatedStatus): Self = StObject.set(x, "applicationAggregatedStatus", value.asInstanceOf[js.Any])
    
    inline def setApplicationAggregatedStatusUndefined: Self = StObject.set(x, "applicationAggregatedStatus", js.undefined)
    
    inline def setApplicationID(value: ApplicationID): Self = StObject.set(x, "applicationID", value.asInstanceOf[js.Any])
    
    inline def setApplicationIDUndefined: Self = StObject.set(x, "applicationID", js.undefined)
    
    inline def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDescription(value: ApplicationDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIsArchived(value: Boolean): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
    
    inline def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
    
    inline def setLastModifiedDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setName(value: ApplicationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setWaveID(value: WaveID): Self = StObject.set(x, "waveID", value.asInstanceOf[js.Any])
    
    inline def setWaveIDUndefined: Self = StObject.set(x, "waveID", js.undefined)
  }
}
