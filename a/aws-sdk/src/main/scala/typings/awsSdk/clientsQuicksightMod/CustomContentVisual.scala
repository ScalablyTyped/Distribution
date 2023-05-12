package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomContentVisual extends StObject {
  
  /**
    * The list of custom actions that are configured for a visual.
    */
  var Actions: js.UndefOr[VisualCustomActionList] = js.undefined
  
  /**
    * The configuration of a CustomContentVisual.
    */
  var ChartConfiguration: js.UndefOr[CustomContentConfiguration] = js.undefined
  
  /**
    * The dataset that is used to create the custom content visual. You can't create a visual without a dataset.
    */
  var DataSetIdentifier: typings.awsSdk.clientsQuicksightMod.DataSetIdentifier
  
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
object CustomContentVisual {
  
  inline def apply(DataSetIdentifier: DataSetIdentifier, VisualId: ShortRestrictiveResourceId): CustomContentVisual = {
    val __obj = js.Dynamic.literal(DataSetIdentifier = DataSetIdentifier.asInstanceOf[js.Any], VisualId = VisualId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomContentVisual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomContentVisual] (val x: Self) extends AnyVal {
    
    inline def setActions(value: VisualCustomActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: VisualCustomAction*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setChartConfiguration(value: CustomContentConfiguration): Self = StObject.set(x, "ChartConfiguration", value.asInstanceOf[js.Any])
    
    inline def setChartConfigurationUndefined: Self = StObject.set(x, "ChartConfiguration", js.undefined)
    
    inline def setDataSetIdentifier(value: DataSetIdentifier): Self = StObject.set(x, "DataSetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: VisualSubtitleLabelOptions): Self = StObject.set(x, "Subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "Subtitle", js.undefined)
    
    inline def setTitle(value: VisualTitleLabelOptions): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setVisualId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "VisualId", value.asInstanceOf[js.Any])
  }
}
