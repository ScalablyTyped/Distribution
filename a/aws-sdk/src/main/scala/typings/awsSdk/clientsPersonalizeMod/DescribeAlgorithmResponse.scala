package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlgorithmResponse extends StObject {
  
  /**
    * A listing of the properties of the algorithm.
    */
  var algorithm: js.UndefOr[Algorithm] = js.undefined
}
object DescribeAlgorithmResponse {
  
  inline def apply(): DescribeAlgorithmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlgorithmResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAlgorithmResponse] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
  }
}
