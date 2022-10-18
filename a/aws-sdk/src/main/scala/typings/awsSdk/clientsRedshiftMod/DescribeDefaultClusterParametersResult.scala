package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDefaultClusterParametersResult extends StObject {
  
  var DefaultClusterParameters: js.UndefOr[typings.awsSdk.clientsRedshiftMod.DefaultClusterParameters] = js.undefined
}
object DescribeDefaultClusterParametersResult {
  
  inline def apply(): DescribeDefaultClusterParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDefaultClusterParametersResult]
  }
  
  extension [Self <: DescribeDefaultClusterParametersResult](x: Self) {
    
    inline def setDefaultClusterParameters(value: DefaultClusterParameters): Self = StObject.set(x, "DefaultClusterParameters", value.asInstanceOf[js.Any])
    
    inline def setDefaultClusterParametersUndefined: Self = StObject.set(x, "DefaultClusterParameters", js.undefined)
  }
}
