package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateControlMappingSource extends StObject {
  
  /**
    *  The description of the data source that determines where Audit Manager collects evidence from for the control. 
    */
  var sourceDescription: js.UndefOr[SourceDescription] = js.undefined
  
  /**
    *  The frequency of evidence collection for the control mapping source. 
    */
  var sourceFrequency: js.UndefOr[SourceFrequency] = js.undefined
  
  var sourceKeyword: js.UndefOr[SourceKeyword] = js.undefined
  
  /**
    *  The name of the control mapping data source. 
    */
  var sourceName: js.UndefOr[SourceName] = js.undefined
  
  /**
    *  The setup option for the data source, which reflects if the evidence collection is automated or manual. 
    */
  var sourceSetUpOption: js.UndefOr[SourceSetUpOption] = js.undefined
  
  /**
    *  Specifies one of the five types of data sources for evidence collection. 
    */
  var sourceType: js.UndefOr[SourceType] = js.undefined
  
  /**
    *  The instructions for troubleshooting the control. 
    */
  var troubleshootingText: js.UndefOr[TroubleshootingText] = js.undefined
}
object CreateControlMappingSource {
  
  inline def apply(): CreateControlMappingSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateControlMappingSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateControlMappingSource] (val x: Self) extends AnyVal {
    
    inline def setSourceDescription(value: SourceDescription): Self = StObject.set(x, "sourceDescription", value.asInstanceOf[js.Any])
    
    inline def setSourceDescriptionUndefined: Self = StObject.set(x, "sourceDescription", js.undefined)
    
    inline def setSourceFrequency(value: SourceFrequency): Self = StObject.set(x, "sourceFrequency", value.asInstanceOf[js.Any])
    
    inline def setSourceFrequencyUndefined: Self = StObject.set(x, "sourceFrequency", js.undefined)
    
    inline def setSourceKeyword(value: SourceKeyword): Self = StObject.set(x, "sourceKeyword", value.asInstanceOf[js.Any])
    
    inline def setSourceKeywordUndefined: Self = StObject.set(x, "sourceKeyword", js.undefined)
    
    inline def setSourceName(value: SourceName): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameUndefined: Self = StObject.set(x, "sourceName", js.undefined)
    
    inline def setSourceSetUpOption(value: SourceSetUpOption): Self = StObject.set(x, "sourceSetUpOption", value.asInstanceOf[js.Any])
    
    inline def setSourceSetUpOptionUndefined: Self = StObject.set(x, "sourceSetUpOption", js.undefined)
    
    inline def setSourceType(value: SourceType): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setTroubleshootingText(value: TroubleshootingText): Self = StObject.set(x, "troubleshootingText", value.asInstanceOf[js.Any])
    
    inline def setTroubleshootingTextUndefined: Self = StObject.set(x, "troubleshootingText", js.undefined)
  }
}
