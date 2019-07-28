package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsElementsLoc
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.SpreadElementKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.ArrayPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayPatternBuilder extends js.Object {
  def apply(elements: js.Array[PatternKind | SpreadElementKind | Null]): ArrayPattern = js.native
  def from(params: Anon_CommentsElementsLoc): ArrayPattern = js.native
}

