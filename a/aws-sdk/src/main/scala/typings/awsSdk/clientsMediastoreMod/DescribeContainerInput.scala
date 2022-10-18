package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContainerInput extends StObject {
  
  /**
    * The name of the container to query.
    */
  var ContainerName: js.UndefOr[typings.awsSdk.clientsMediastoreMod.ContainerName] = js.undefined
}
object DescribeContainerInput {
  
  inline def apply(): DescribeContainerInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContainerInput]
  }
  
  extension [Self <: DescribeContainerInput](x: Self) {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "ContainerName", js.undefined)
  }
}
