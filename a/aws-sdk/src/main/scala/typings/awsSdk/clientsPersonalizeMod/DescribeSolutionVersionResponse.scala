package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSolutionVersionResponse extends StObject {
  
  /**
    * The solution version.
    */
  var solutionVersion: js.UndefOr[SolutionVersion] = js.undefined
}
object DescribeSolutionVersionResponse {
  
  inline def apply(): DescribeSolutionVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSolutionVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSolutionVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setSolutionVersion(value: SolutionVersion): Self = StObject.set(x, "solutionVersion", value.asInstanceOf[js.Any])
    
    inline def setSolutionVersionUndefined: Self = StObject.set(x, "solutionVersion", js.undefined)
  }
}
