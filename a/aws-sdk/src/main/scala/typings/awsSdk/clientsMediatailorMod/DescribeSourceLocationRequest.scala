package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSourceLocationRequest extends StObject {
  
  /**
    * The name of the source location.
    */
  var SourceLocationName: _String
}
object DescribeSourceLocationRequest {
  
  inline def apply(SourceLocationName: _String): DescribeSourceLocationRequest = {
    val __obj = js.Dynamic.literal(SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSourceLocationRequest]
  }
  
  extension [Self <: DescribeSourceLocationRequest](x: Self) {
    
    inline def setSourceLocationName(value: _String): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
  }
}
