package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataLabelOptions extends StObject {
  
  /**
    * Determines the visibility of the category field labels.
    */
  var CategoryLabelVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * The option that determines the data label type.
    */
  var DataLabelTypes: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DataLabelTypes] = js.undefined
  
  /**
    * Determines the color of the data labels.
    */
  var LabelColor: js.UndefOr[HexColor] = js.undefined
  
  /**
    * Determines the content of the data labels.
    */
  var LabelContent: js.UndefOr[DataLabelContent] = js.undefined
  
  /**
    * Determines the font configuration of the data labels.
    */
  var LabelFontConfiguration: js.UndefOr[FontConfiguration] = js.undefined
  
  /**
    * Determines the visibility of the measure field labels.
    */
  var MeasureLabelVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * Determines whether overlap is enabled or disabled for the data labels.
    */
  var Overlap: js.UndefOr[DataLabelOverlap] = js.undefined
  
  /**
    * Determines the position of the data labels.
    */
  var Position: js.UndefOr[DataLabelPosition] = js.undefined
  
  /**
    * Determines the visibility of the total.
    */
  var TotalsVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * Determines the visibility of the data labels.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object DataLabelOptions {
  
  inline def apply(): DataLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLabelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataLabelOptions] (val x: Self) extends AnyVal {
    
    inline def setCategoryLabelVisibility(value: Visibility): Self = StObject.set(x, "CategoryLabelVisibility", value.asInstanceOf[js.Any])
    
    inline def setCategoryLabelVisibilityUndefined: Self = StObject.set(x, "CategoryLabelVisibility", js.undefined)
    
    inline def setDataLabelTypes(value: DataLabelTypes): Self = StObject.set(x, "DataLabelTypes", value.asInstanceOf[js.Any])
    
    inline def setDataLabelTypesUndefined: Self = StObject.set(x, "DataLabelTypes", js.undefined)
    
    inline def setDataLabelTypesVarargs(value: DataLabelType*): Self = StObject.set(x, "DataLabelTypes", js.Array(value*))
    
    inline def setLabelColor(value: HexColor): Self = StObject.set(x, "LabelColor", value.asInstanceOf[js.Any])
    
    inline def setLabelColorUndefined: Self = StObject.set(x, "LabelColor", js.undefined)
    
    inline def setLabelContent(value: DataLabelContent): Self = StObject.set(x, "LabelContent", value.asInstanceOf[js.Any])
    
    inline def setLabelContentUndefined: Self = StObject.set(x, "LabelContent", js.undefined)
    
    inline def setLabelFontConfiguration(value: FontConfiguration): Self = StObject.set(x, "LabelFontConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLabelFontConfigurationUndefined: Self = StObject.set(x, "LabelFontConfiguration", js.undefined)
    
    inline def setMeasureLabelVisibility(value: Visibility): Self = StObject.set(x, "MeasureLabelVisibility", value.asInstanceOf[js.Any])
    
    inline def setMeasureLabelVisibilityUndefined: Self = StObject.set(x, "MeasureLabelVisibility", js.undefined)
    
    inline def setOverlap(value: DataLabelOverlap): Self = StObject.set(x, "Overlap", value.asInstanceOf[js.Any])
    
    inline def setOverlapUndefined: Self = StObject.set(x, "Overlap", js.undefined)
    
    inline def setPosition(value: DataLabelPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "Position", js.undefined)
    
    inline def setTotalsVisibility(value: Visibility): Self = StObject.set(x, "TotalsVisibility", value.asInstanceOf[js.Any])
    
    inline def setTotalsVisibilityUndefined: Self = StObject.set(x, "TotalsVisibility", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
