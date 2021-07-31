package typings.angularRouter.mod

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "PreloadingStrategy")
@js.native
abstract class PreloadingStrategy () extends StObject {
  
  def preload(route: Route, fn: js.Function0[Observable_[js.Any]]): Observable_[js.Any] = js.native
}
