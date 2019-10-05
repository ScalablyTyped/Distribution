package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.ProgramKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait File
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var name: js.UndefOr[String | Null] = js.undefined
  var program: ProgramKind
  var `type`: typings.astDashTypes.astDashTypesStrings.File
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.File")
@js.native
object File extends TopLevel[Type[File]]

