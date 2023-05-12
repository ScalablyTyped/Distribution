package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SankeyDiagramChartConfiguration extends StObject {
  
  /**
    * The data label configuration of a sankey diagram.
    */
  var DataLabels: js.UndefOr[DataLabelOptions] = js.undefined
  
  /**
    * The field well configuration of a sankey diagram.
    */
  var FieldWells: js.UndefOr[SankeyDiagramFieldWells] = js.undefined
  
  /**
    * The sort configuration of a sankey diagram.
    */
  var SortConfiguration: js.UndefOr[SankeyDiagramSortConfiguration] = js.undefined
}
object SankeyDiagramChartConfiguration {
  
  inline def apply(): SankeyDiagramChartConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SankeyDiagramChartConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SankeyDiagramChartConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDataLabels(value: DataLabelOptions): Self = StObject.set(x, "DataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "DataLabels", js.undefined)
    
    inline def setFieldWells(value: SankeyDiagramFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setSortConfiguration(value: SankeyDiagramSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
  }
}
