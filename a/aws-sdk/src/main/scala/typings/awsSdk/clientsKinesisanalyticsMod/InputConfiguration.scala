package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputConfiguration extends StObject {
  
  /**
    * Input source ID. You can get this ID by calling the DescribeApplication operation.
    */
  var Id: typings.awsSdk.clientsKinesisanalyticsMod.Id
  
  /**
    * Point at which you want the application to start processing records from the streaming source.
    */
  var InputStartingPositionConfiguration: typings.awsSdk.clientsKinesisanalyticsMod.InputStartingPositionConfiguration
}
object InputConfiguration {
  
  inline def apply(Id: Id, InputStartingPositionConfiguration: InputStartingPositionConfiguration): InputConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], InputStartingPositionConfiguration = InputStartingPositionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputConfiguration]
  }
  
  extension [Self <: InputConfiguration](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setInputStartingPositionConfiguration(value: InputStartingPositionConfiguration): Self = StObject.set(x, "InputStartingPositionConfiguration", value.asInstanceOf[js.Any])
  }
}
