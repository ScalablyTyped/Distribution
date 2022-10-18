package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContainerOutput extends StObject {
  
  /**
    * The name of the queried container.
    */
  var Container: js.UndefOr[typings.awsSdk.clientsMediastoreMod.Container] = js.undefined
}
object DescribeContainerOutput {
  
  inline def apply(): DescribeContainerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContainerOutput]
  }
  
  extension [Self <: DescribeContainerOutput](x: Self) {
    
    inline def setContainer(value: Container): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "Container", js.undefined)
  }
}
