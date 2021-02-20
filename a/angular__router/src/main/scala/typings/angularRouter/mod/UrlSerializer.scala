package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "UrlSerializer")
@js.native
abstract class UrlSerializer () extends StObject {
  
  /** Parse a url into a `UrlTree` */
  def parse(url: String): UrlTree = js.native
  
  /** Converts a `UrlTree` into a url */
  def serialize(tree: UrlTree): String = js.native
}
