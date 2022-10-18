package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAccessLoggingInput extends StObject {
  
  /**
    * The name of the container that you want to start access logging on.
    */
  var ContainerName: typings.awsSdk.clientsMediastoreMod.ContainerName
}
object StartAccessLoggingInput {
  
  inline def apply(ContainerName: ContainerName): StartAccessLoggingInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAccessLoggingInput]
  }
  
  extension [Self <: StartAccessLoggingInput](x: Self) {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
