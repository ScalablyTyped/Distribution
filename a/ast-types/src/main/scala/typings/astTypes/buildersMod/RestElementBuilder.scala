package typings.astTypes.buildersMod

import typings.astTypes.anon.TypeAnnotation
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.namedTypesMod.namedTypes.RestElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestElementBuilder extends js.Object {
  
  def apply(argument: PatternKind): RestElement = js.native
  
  def from(params: TypeAnnotation): RestElement = js.native
}
