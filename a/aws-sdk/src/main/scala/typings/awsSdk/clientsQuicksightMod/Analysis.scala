package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analysis extends StObject {
  
  /**
    * The ID of the analysis.
    */
  var AnalysisId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the analysis.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The time that the analysis was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARNs of the datasets of the analysis.
    */
  var DataSetArns: js.UndefOr[DataSetArnsList] = js.undefined
  
  /**
    * Errors associated with the analysis.
    */
  var Errors: js.UndefOr[AnalysisErrorList] = js.undefined
  
  /**
    * The time that the analysis was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The descriptive name of the analysis.
    */
  var Name: js.UndefOr[AnalysisName] = js.undefined
  
  /**
    * A list of the associated sheets with the unique identifier and name of each sheet.
    */
  var Sheets: js.UndefOr[SheetList] = js.undefined
  
  /**
    * Status associated with the analysis.
    */
  var Status: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * The ARN of the theme of the analysis.
    */
  var ThemeArn: js.UndefOr[Arn] = js.undefined
}
object Analysis {
  
  inline def apply(): Analysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analysis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Analysis] (val x: Self) extends AnyVal {
    
    inline def setAnalysisId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    inline def setAnalysisIdUndefined: Self = StObject.set(x, "AnalysisId", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDataSetArns(value: DataSetArnsList): Self = StObject.set(x, "DataSetArns", value.asInstanceOf[js.Any])
    
    inline def setDataSetArnsUndefined: Self = StObject.set(x, "DataSetArns", js.undefined)
    
    inline def setDataSetArnsVarargs(value: Arn*): Self = StObject.set(x, "DataSetArns", js.Array(value*))
    
    inline def setErrors(value: AnalysisErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: AnalysisError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: AnalysisName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSheets(value: SheetList): Self = StObject.set(x, "Sheets", value.asInstanceOf[js.Any])
    
    inline def setSheetsUndefined: Self = StObject.set(x, "Sheets", js.undefined)
    
    inline def setSheetsVarargs(value: Sheet*): Self = StObject.set(x, "Sheets", js.Array(value*))
    
    inline def setStatus(value: ResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setThemeArn(value: Arn): Self = StObject.set(x, "ThemeArn", value.asInstanceOf[js.Any])
    
    inline def setThemeArnUndefined: Self = StObject.set(x, "ThemeArn", js.undefined)
  }
}
