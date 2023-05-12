package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingConfiguration extends StObject {
  
  /**
    * The data type of the configuration.
    */
  var DataType: MessagingDataType
  
  /**
    * The ARN of the resource in the configuration. 
    */
  var ResourceArn: ChimeArn
}
object StreamingConfiguration {
  
  inline def apply(DataType: MessagingDataType, ResourceArn: ChimeArn): StreamingConfiguration = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDataType(value: MessagingDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ChimeArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
