package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSourceLocationRequest extends StObject {
  
  /**
    * The identifier for the source location you are working on.
    */
  var SourceLocationName: string
}
object DescribeSourceLocationRequest {
  
  inline def apply(SourceLocationName: string): DescribeSourceLocationRequest = {
    val __obj = js.Dynamic.literal(SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSourceLocationRequest]
  }
  
  extension [Self <: DescribeSourceLocationRequest](x: Self) {
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
  }
}
