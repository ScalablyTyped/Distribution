package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionConfiguration extends StObject {
  
  /**
    * The Amazon S3 bucket event for which to invoke the Lambda function. For more information, see Supported Event Types in the Amazon S3 User Guide.
    */
  var Events: EventList
  
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
  
  var Id: js.UndefOr[NotificationId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function that Amazon S3 invokes when the specified event type occurs.
    */
  var LambdaFunctionArn: typings.awsSdk.clientsS3Mod.LambdaFunctionArn
}
object LambdaFunctionConfiguration {
  
  inline def apply(Events: EventList, LambdaFunctionArn: LambdaFunctionArn): LambdaFunctionConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], LambdaFunctionArn = LambdaFunctionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaFunctionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: EventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setFilter(value: NotificationConfigurationFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setId(value: NotificationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLambdaFunctionArn(value: LambdaFunctionArn): Self = StObject.set(x, "LambdaFunctionArn", value.asInstanceOf[js.Any])
  }
}
