package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleConfiguration extends StObject {
  
  /**
    * The start date for objects to import in the first flow run as an Unix/epoch timestamp in milliseconds or in ISO-8601 format.
    */
  var FirstExecutionFrom: js.UndefOr[NonBlankString] = js.undefined
  
  /**
    * The name of the object to pull from the data source.
    */
  var Object: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.Object] = js.undefined
  
  /**
    * How often the data should be pulled from data source.
    */
  var ScheduleExpression: NonBlankString
}
object ScheduleConfiguration {
  
  inline def apply(ScheduleExpression: NonBlankString): ScheduleConfiguration = {
    val __obj = js.Dynamic.literal(ScheduleExpression = ScheduleExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFirstExecutionFrom(value: NonBlankString): Self = StObject.set(x, "FirstExecutionFrom", value.asInstanceOf[js.Any])
    
    inline def setFirstExecutionFromUndefined: Self = StObject.set(x, "FirstExecutionFrom", js.undefined)
    
    inline def setObject(value: Object): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "Object", js.undefined)
    
    inline def setScheduleExpression(value: NonBlankString): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
  }
}
