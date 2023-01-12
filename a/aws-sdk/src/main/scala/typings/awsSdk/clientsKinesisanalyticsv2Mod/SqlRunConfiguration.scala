package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlRunConfiguration extends StObject {
  
  /**
    * The input source ID. You can get this ID by calling the DescribeApplication operation. 
    */
  var InputId: Id
  
  /**
    * The point at which you want the application to start processing records from the streaming source. 
    */
  var InputStartingPositionConfiguration: typings.awsSdk.clientsKinesisanalyticsv2Mod.InputStartingPositionConfiguration
}
object SqlRunConfiguration {
  
  inline def apply(InputId: Id, InputStartingPositionConfiguration: InputStartingPositionConfiguration): SqlRunConfiguration = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any], InputStartingPositionConfiguration = InputStartingPositionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlRunConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlRunConfiguration] (val x: Self) extends AnyVal {
    
    inline def setInputId(value: Id): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
    
    inline def setInputStartingPositionConfiguration(value: InputStartingPositionConfiguration): Self = StObject.set(x, "InputStartingPositionConfiguration", value.asInstanceOf[js.Any])
  }
}
