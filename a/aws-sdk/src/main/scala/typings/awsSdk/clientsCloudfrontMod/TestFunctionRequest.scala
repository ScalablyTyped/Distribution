package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestFunctionRequest extends StObject {
  
  /**
    * The event object to test the function with. For more information about the structure of the event object, see Testing functions in the Amazon CloudFront Developer Guide.
    */
  var EventObject: FunctionEventObject
  
  /**
    * The current version (ETag value) of the function that you are testing, which you can get using DescribeFunction.
    */
  var IfMatch: String
  
  /**
    * The name of the function that you are testing.
    */
  var Name: String
  
  /**
    * The stage of the function that you are testing, either DEVELOPMENT or LIVE.
    */
  var Stage: js.UndefOr[FunctionStage] = js.undefined
}
object TestFunctionRequest {
  
  inline def apply(EventObject: FunctionEventObject, IfMatch: String, Name: String): TestFunctionRequest = {
    val __obj = js.Dynamic.literal(EventObject = EventObject.asInstanceOf[js.Any], IfMatch = IfMatch.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestFunctionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestFunctionRequest] (val x: Self) extends AnyVal {
    
    inline def setEventObject(value: FunctionEventObject): Self = StObject.set(x, "EventObject", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStage(value: FunctionStage): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "Stage", js.undefined)
  }
}
