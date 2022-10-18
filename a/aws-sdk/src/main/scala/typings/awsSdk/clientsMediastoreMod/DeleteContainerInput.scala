package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContainerInput extends StObject {
  
  /**
    * The name of the container to delete. 
    */
  var ContainerName: typings.awsSdk.clientsMediastoreMod.ContainerName
}
object DeleteContainerInput {
  
  inline def apply(ContainerName: ContainerName): DeleteContainerInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContainerInput]
  }
  
  extension [Self <: DeleteContainerInput](x: Self) {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
