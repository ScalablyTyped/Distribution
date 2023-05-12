package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordCloudChartConfiguration extends StObject {
  
  /**
    * The label options (label text, label visibility, and sort icon visibility) for the word cloud category.
    */
  var CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The field wells of the visual.
    */
  var FieldWells: js.UndefOr[WordCloudFieldWells] = js.undefined
  
  /**
    * The sort configuration of a word cloud visual.
    */
  var SortConfiguration: js.UndefOr[WordCloudSortConfiguration] = js.undefined
  
  /**
    * The options for a word cloud visual.
    */
  var WordCloudOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.WordCloudOptions] = js.undefined
}
object WordCloudChartConfiguration {
  
  inline def apply(): WordCloudChartConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordCloudChartConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WordCloudChartConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCategoryLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "CategoryLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setCategoryLabelOptionsUndefined: Self = StObject.set(x, "CategoryLabelOptions", js.undefined)
    
    inline def setFieldWells(value: WordCloudFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setSortConfiguration(value: WordCloudSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
    
    inline def setWordCloudOptions(value: WordCloudOptions): Self = StObject.set(x, "WordCloudOptions", value.asInstanceOf[js.Any])
    
    inline def setWordCloudOptionsUndefined: Self = StObject.set(x, "WordCloudOptions", js.undefined)
  }
}
