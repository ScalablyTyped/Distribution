package typings.angularRouter.mod

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/router", "PreloadingStrategy")
@js.native
open class PreloadingStrategy () extends StObject {
  
  def preload(route: Route, fn: js.Function0[Observable_[Any]]): Observable_[Any] = js.native
}
