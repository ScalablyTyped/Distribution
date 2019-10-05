package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends Printable {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var `type`: String
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Node")
@js.native
object Node extends TopLevel[Type[Node]]

