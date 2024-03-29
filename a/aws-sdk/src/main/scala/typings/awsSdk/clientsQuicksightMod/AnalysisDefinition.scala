package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisDefinition extends StObject {
  
  var AnalysisDefaults: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AnalysisDefaults] = js.undefined
  
  /**
    * An array of calculated field definitions for the analysis.
    */
  var CalculatedFields: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CalculatedFields] = js.undefined
  
  /**
    *  An array of analysis-level column configurations. Column configurations can be used to set default formatting for a column to be used throughout an analysis. 
    */
  var ColumnConfigurations: js.UndefOr[ColumnConfigurationList] = js.undefined
  
  /**
    * An array of dataset identifier declarations. This mapping allows the usage of dataset identifiers instead of dataset ARNs throughout analysis sub-structures.
    */
  var DataSetIdentifierDeclarations: DataSetIdentifierDeclarationList
  
  /**
    * Filter definitions for an analysis. For more information, see Filtering Data in Amazon QuickSight in the Amazon QuickSight User Guide.
    */
  var FilterGroups: js.UndefOr[FilterGroupList] = js.undefined
  
  /**
    * An array of parameter declarations for an analysis. Parameters are named variables that can transfer a value for use by an action or an object. For more information, see Parameters in Amazon QuickSight in the Amazon QuickSight User Guide.
    */
  var ParameterDeclarations: js.UndefOr[ParameterDeclarationList] = js.undefined
  
  /**
    * An array of sheet definitions for an analysis. Each SheetDefinition provides detailed information about a sheet within this analysis.
    */
  var Sheets: js.UndefOr[SheetDefinitionList] = js.undefined
}
object AnalysisDefinition {
  
  inline def apply(DataSetIdentifierDeclarations: DataSetIdentifierDeclarationList): AnalysisDefinition = {
    val __obj = js.Dynamic.literal(DataSetIdentifierDeclarations = DataSetIdentifierDeclarations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisDefinition] (val x: Self) extends AnyVal {
    
    inline def setAnalysisDefaults(value: AnalysisDefaults): Self = StObject.set(x, "AnalysisDefaults", value.asInstanceOf[js.Any])
    
    inline def setAnalysisDefaultsUndefined: Self = StObject.set(x, "AnalysisDefaults", js.undefined)
    
    inline def setCalculatedFields(value: CalculatedFields): Self = StObject.set(x, "CalculatedFields", value.asInstanceOf[js.Any])
    
    inline def setCalculatedFieldsUndefined: Self = StObject.set(x, "CalculatedFields", js.undefined)
    
    inline def setCalculatedFieldsVarargs(value: CalculatedField*): Self = StObject.set(x, "CalculatedFields", js.Array(value*))
    
    inline def setColumnConfigurations(value: ColumnConfigurationList): Self = StObject.set(x, "ColumnConfigurations", value.asInstanceOf[js.Any])
    
    inline def setColumnConfigurationsUndefined: Self = StObject.set(x, "ColumnConfigurations", js.undefined)
    
    inline def setColumnConfigurationsVarargs(value: ColumnConfiguration*): Self = StObject.set(x, "ColumnConfigurations", js.Array(value*))
    
    inline def setDataSetIdentifierDeclarations(value: DataSetIdentifierDeclarationList): Self = StObject.set(x, "DataSetIdentifierDeclarations", value.asInstanceOf[js.Any])
    
    inline def setDataSetIdentifierDeclarationsVarargs(value: DataSetIdentifierDeclaration*): Self = StObject.set(x, "DataSetIdentifierDeclarations", js.Array(value*))
    
    inline def setFilterGroups(value: FilterGroupList): Self = StObject.set(x, "FilterGroups", value.asInstanceOf[js.Any])
    
    inline def setFilterGroupsUndefined: Self = StObject.set(x, "FilterGroups", js.undefined)
    
    inline def setFilterGroupsVarargs(value: FilterGroup*): Self = StObject.set(x, "FilterGroups", js.Array(value*))
    
    inline def setParameterDeclarations(value: ParameterDeclarationList): Self = StObject.set(x, "ParameterDeclarations", value.asInstanceOf[js.Any])
    
    inline def setParameterDeclarationsUndefined: Self = StObject.set(x, "ParameterDeclarations", js.undefined)
    
    inline def setParameterDeclarationsVarargs(value: ParameterDeclaration*): Self = StObject.set(x, "ParameterDeclarations", js.Array(value*))
    
    inline def setSheets(value: SheetDefinitionList): Self = StObject.set(x, "Sheets", value.asInstanceOf[js.Any])
    
    inline def setSheetsUndefined: Self = StObject.set(x, "Sheets", js.undefined)
    
    inline def setSheetsVarargs(value: SheetDefinition*): Self = StObject.set(x, "Sheets", js.Array(value*))
  }
}
