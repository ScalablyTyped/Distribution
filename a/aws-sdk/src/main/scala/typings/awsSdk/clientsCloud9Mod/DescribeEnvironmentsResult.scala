package typings.awsSdk.clientsCloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEnvironmentsResult extends StObject {
  
  /**
    * Information about the environments that are returned.
    */
  var environments: js.UndefOr[EnvironmentList] = js.undefined
}
object DescribeEnvironmentsResult {
  
  inline def apply(): DescribeEnvironmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEnvironmentsResult] (val x: Self) extends AnyVal {
    
    inline def setEnvironments(value: EnvironmentList): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    inline def setEnvironmentsVarargs(value: Environment*): Self = StObject.set(x, "environments", js.Array(value*))
  }
}
