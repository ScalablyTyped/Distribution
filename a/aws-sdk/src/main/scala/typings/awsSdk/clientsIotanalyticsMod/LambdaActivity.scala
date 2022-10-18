package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaActivity extends StObject {
  
  /**
    * The number of messages passed to the Lambda function for processing. The Lambda function must be able to process all of these messages within five minutes, which is the maximum timeout duration for Lambda functions.
    */
  var batchSize: ActivityBatchSize
  
  /**
    * The name of the Lambda function that is run on the message.
    */
  var lambdaName: LambdaName
  
  /**
    * The name of the lambda activity.
    */
  var name: ActivityName
  
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
}
object LambdaActivity {
  
  inline def apply(batchSize: ActivityBatchSize, lambdaName: LambdaName, name: ActivityName): LambdaActivity = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], lambdaName = lambdaName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaActivity]
  }
  
  extension [Self <: LambdaActivity](x: Self) {
    
    inline def setBatchSize(value: ActivityBatchSize): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setLambdaName(value: LambdaName): Self = StObject.set(x, "lambdaName", value.asInstanceOf[js.Any])
    
    inline def setName(value: ActivityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNext(value: ActivityName): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
