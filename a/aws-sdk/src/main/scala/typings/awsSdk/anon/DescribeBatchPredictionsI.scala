package typings.awsSdk.anon

import typings.awsSdk.machinelearningMod.BatchPredictionFilterVariable
import typings.awsSdk.machinelearningMod.ComparatorValue
import typings.awsSdk.machinelearningMod.PageLimit
import typings.awsSdk.machinelearningMod.SortOrder
import typings.awsSdk.machinelearningMod.StringType
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/machinelearning.DescribeBatchPredictionsInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeBatchPredictionsI extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The equal to operator. The BatchPrediction results will have FilterVariable values that exactly match the value specified with EQ.
    */
  var EQ: js.UndefOr[ComparatorValue] = js.undefined
  
  /**
    * Use one of the following variables to filter a list of BatchPrediction:   CreatedAt - Sets the search criteria to the BatchPrediction creation date.  Status - Sets the search criteria to the BatchPrediction status.  Name - Sets the search criteria to the contents of the BatchPrediction  Name.  IAMUser - Sets the search criteria to the user account that invoked the BatchPrediction creation.  MLModelId - Sets the search criteria to the MLModel used in the BatchPrediction.  DataSourceId - Sets the search criteria to the DataSource used in the BatchPrediction.  DataURI - Sets the search criteria to the data file(s) used in the BatchPrediction. The URL can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory. 
    */
  var FilterVariable: js.UndefOr[BatchPredictionFilterVariable] = js.undefined
  
  /**
    * The greater than or equal to operator. The BatchPrediction results will have FilterVariable values that are greater than or equal to the value specified with GE. 
    */
  var GE: js.UndefOr[ComparatorValue] = js.undefined
  
  /**
    * The greater than operator. The BatchPrediction results will have FilterVariable values that are greater than the value specified with GT.
    */
  var GT: js.UndefOr[ComparatorValue] = js.undefined
  
  /**
    * The less than or equal to operator. The BatchPrediction results will have FilterVariable values that are less than or equal to the value specified with LE.
    */
  var LE: js.UndefOr[ComparatorValue] = js.undefined
  
  /**
    * The less than operator. The BatchPrediction results will have FilterVariable values that are less than the value specified with LT.
    */
  var LT: js.UndefOr[ComparatorValue] = js.undefined
  
  /**
    * The number of pages of information to include in the result. The range of acceptable values is 1 through 100. The default value is 100.
    */
  var Limit: js.UndefOr[PageLimit] = js.undefined
  
  /**
    * The not equal to operator. The BatchPrediction results will have FilterVariable values not equal to the value specified with NE.
    */
  var NE: js.UndefOr[ComparatorValue] = js.undefined
  
  /**
    * An ID of the page in the paginated results.
    */
  var NextToken: js.UndefOr[StringType] = js.undefined
  
  /**
    * A string that is found at the beginning of a variable, such as Name or Id. For example, a Batch Prediction operation could have the Name 2014-09-09-HolidayGiftMailer. To search for this BatchPrediction, select Name for the FilterVariable and any of the following strings for the Prefix:   2014-09 2014-09-09 2014-09-09-Holiday 
    */
  var Prefix: js.UndefOr[ComparatorValue] = js.undefined
  
  /**
    * A two-value parameter that determines the sequence of the resulting list of MLModels.   asc - Arranges the list in ascending order (A-Z, 0-9).  dsc - Arranges the list in descending order (Z-A, 9-0).  Results are sorted by FilterVariable.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.machinelearningMod.SortOrder] = js.undefined
}
object DescribeBatchPredictionsI {
  
  inline def apply(): DescribeBatchPredictionsI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBatchPredictionsI]
  }
  
  extension [Self <: DescribeBatchPredictionsI](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setEQ(value: ComparatorValue): Self = StObject.set(x, "EQ", value.asInstanceOf[js.Any])
    
    inline def setEQUndefined: Self = StObject.set(x, "EQ", js.undefined)
    
    inline def setFilterVariable(value: BatchPredictionFilterVariable): Self = StObject.set(x, "FilterVariable", value.asInstanceOf[js.Any])
    
    inline def setFilterVariableUndefined: Self = StObject.set(x, "FilterVariable", js.undefined)
    
    inline def setGE(value: ComparatorValue): Self = StObject.set(x, "GE", value.asInstanceOf[js.Any])
    
    inline def setGEUndefined: Self = StObject.set(x, "GE", js.undefined)
    
    inline def setGT(value: ComparatorValue): Self = StObject.set(x, "GT", value.asInstanceOf[js.Any])
    
    inline def setGTUndefined: Self = StObject.set(x, "GT", js.undefined)
    
    inline def setLE(value: ComparatorValue): Self = StObject.set(x, "LE", value.asInstanceOf[js.Any])
    
    inline def setLEUndefined: Self = StObject.set(x, "LE", js.undefined)
    
    inline def setLT(value: ComparatorValue): Self = StObject.set(x, "LT", value.asInstanceOf[js.Any])
    
    inline def setLTUndefined: Self = StObject.set(x, "LT", js.undefined)
    
    inline def setLimit(value: PageLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNE(value: ComparatorValue): Self = StObject.set(x, "NE", value.asInstanceOf[js.Any])
    
    inline def setNEUndefined: Self = StObject.set(x, "NE", js.undefined)
    
    inline def setNextToken(value: StringType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPrefix(value: ComparatorValue): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
