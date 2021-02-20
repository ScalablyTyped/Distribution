package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "UrlTree")
@js.native
class UrlTree () extends StObject {
  
  /** The fragment of the URL */
  var fragment: String | Null = js.native
  
  def queryParamMap: ParamMap = js.native
  
  /** The query params of the URL */
  var queryParams: Params = js.native
  
  /** The root segment group of the URL tree */
  var root: UrlSegmentGroup = js.native
}
