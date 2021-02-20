package typings.astTypes.buildersMod

import typings.astTypes.anon.Regex
import typings.astTypes.namedTypesMod.namedTypes.Literal
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiteralBuilder extends StObject {
  
  def apply(): Literal = js.native
  def apply(value: String): Literal = js.native
  def apply(value: Boolean): Literal = js.native
  def apply(value: Double): Literal = js.native
  def apply(value: RegExp): Literal = js.native
  
  def from(params: Regex): Literal = js.native
}
