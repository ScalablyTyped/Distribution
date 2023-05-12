package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightVisual extends StObject {
  
  /**
    * The list of custom actions that are configured for a visual.
    */
  var Actions: js.UndefOr[VisualCustomActionList] = js.undefined
  
  /**
    * The dataset that is used in the insight visual.
    */
  var DataSetIdentifier: typings.awsSdk.clientsQuicksightMod.DataSetIdentifier
  
  /**
    * The configuration of an insight visual.
    */
  var InsightConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.InsightConfiguration] = js.undefined
  
  /**
    * The subtitle that is displayed on the visual.
    */
  var Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined
  
  /**
    * The title that is displayed on the visual.
    */
  var Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
  
  /**
    * The unique identifier of a visual. This identifier must be unique within the context of a dashboard, template, or analysis. Two dashboards, analyses, or templates can have visuals with the same identifiers.
    */
  var VisualId: ShortRestrictiveResourceId
}
object InsightVisual {
  
  inline def apply(DataSetIdentifier: DataSetIdentifier, VisualId: ShortRestrictiveResourceId): InsightVisual = {
    val __obj = js.Dynamic.literal(DataSetIdentifier = DataSetIdentifier.asInstanceOf[js.Any], VisualId = VisualId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightVisual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsightVisual] (val x: Self) extends AnyVal {
    
    inline def setActions(value: VisualCustomActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: VisualCustomAction*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setDataSetIdentifier(value: DataSetIdentifier): Self = StObject.set(x, "DataSetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setInsightConfiguration(value: InsightConfiguration): Self = StObject.set(x, "InsightConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInsightConfigurationUndefined: Self = StObject.set(x, "InsightConfiguration", js.undefined)
    
    inline def setSubtitle(value: VisualSubtitleLabelOptions): Self = StObject.set(x, "Subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "Subtitle", js.undefined)
    
    inline def setTitle(value: VisualTitleLabelOptions): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setVisualId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "VisualId", value.asInstanceOf[js.Any])
  }
}
