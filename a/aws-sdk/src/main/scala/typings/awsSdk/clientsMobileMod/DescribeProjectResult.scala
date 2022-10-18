package typings.awsSdk.clientsMobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectResult extends StObject {
  
  var details: js.UndefOr[ProjectDetails] = js.undefined
}
object DescribeProjectResult {
  
  inline def apply(): DescribeProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProjectResult]
  }
  
  extension [Self <: DescribeProjectResult](x: Self) {
    
    inline def setDetails(value: ProjectDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
