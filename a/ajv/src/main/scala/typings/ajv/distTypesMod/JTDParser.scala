package typings.ajv.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JTDParser[T] extends StObject {
  
  def apply(json: String): js.UndefOr[T] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[Double] = js.native
}
