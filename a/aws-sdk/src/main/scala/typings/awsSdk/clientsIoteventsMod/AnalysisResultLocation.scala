package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisResultLocation extends StObject {
  
  /**
    * A JsonPath expression that identifies the error field in your detector model.
    */
  var path: js.UndefOr[AnalysisResultLocationPath] = js.undefined
}
object AnalysisResultLocation {
  
  inline def apply(): AnalysisResultLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisResultLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisResultLocation] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AnalysisResultLocationPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
