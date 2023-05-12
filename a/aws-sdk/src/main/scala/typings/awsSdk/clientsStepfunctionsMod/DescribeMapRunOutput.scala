package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMapRunOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the execution in which the Map Run was started.
    */
  var executionArn: Arn
  
  /**
    * A JSON object that contains information about the total number of child workflow executions for the Map Run, and the count of child workflow executions for each status, such as failed and succeeded.
    */
  var executionCounts: MapRunExecutionCounts
  
  /**
    * A JSON object that contains information about the total number of items, and the item count for each processing status, such as pending and failed.
    */
  var itemCounts: MapRunItemCounts
  
  /**
    * The Amazon Resource Name (ARN) that identifies a Map Run.
    */
  var mapRunArn: LongArn
  
  /**
    * The maximum number of child workflow executions configured to run in parallel for the Map Run at the same time.
    */
  var maxConcurrency: MaxConcurrency
  
  /**
    * The date when the Map Run was started.
    */
  var startDate: js.Date
  
  /**
    * The current status of the Map Run.
    */
  var status: MapRunStatus
  
  /**
    * The date when the Map Run was stopped.
    */
  var stopDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of failed child workflow executions before the Map Run fails.
    */
  var toleratedFailureCount: ToleratedFailureCount
  
  /**
    * The maximum percentage of failed child workflow executions before the Map Run fails.
    */
  var toleratedFailurePercentage: ToleratedFailurePercentage
}
object DescribeMapRunOutput {
  
  inline def apply(
    executionArn: Arn,
    executionCounts: MapRunExecutionCounts,
    itemCounts: MapRunItemCounts,
    mapRunArn: LongArn,
    maxConcurrency: MaxConcurrency,
    startDate: js.Date,
    status: MapRunStatus,
    toleratedFailureCount: ToleratedFailureCount,
    toleratedFailurePercentage: ToleratedFailurePercentage
  ): DescribeMapRunOutput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any], executionCounts = executionCounts.asInstanceOf[js.Any], itemCounts = itemCounts.asInstanceOf[js.Any], mapRunArn = mapRunArn.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], toleratedFailureCount = toleratedFailureCount.asInstanceOf[js.Any], toleratedFailurePercentage = toleratedFailurePercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMapRunOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMapRunOutput] (val x: Self) extends AnyVal {
    
    inline def setExecutionArn(value: Arn): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionCounts(value: MapRunExecutionCounts): Self = StObject.set(x, "executionCounts", value.asInstanceOf[js.Any])
    
    inline def setItemCounts(value: MapRunItemCounts): Self = StObject.set(x, "itemCounts", value.asInstanceOf[js.Any])
    
    inline def setMapRunArn(value: LongArn): Self = StObject.set(x, "mapRunArn", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: MapRunStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStopDate(value: js.Date): Self = StObject.set(x, "stopDate", value.asInstanceOf[js.Any])
    
    inline def setStopDateUndefined: Self = StObject.set(x, "stopDate", js.undefined)
    
    inline def setToleratedFailureCount(value: ToleratedFailureCount): Self = StObject.set(x, "toleratedFailureCount", value.asInstanceOf[js.Any])
    
    inline def setToleratedFailurePercentage(value: ToleratedFailurePercentage): Self = StObject.set(x, "toleratedFailurePercentage", value.asInstanceOf[js.Any])
  }
}
