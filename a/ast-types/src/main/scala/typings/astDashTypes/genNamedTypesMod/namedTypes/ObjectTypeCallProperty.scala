package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.FunctionTypeAnnotationKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ObjectTypeCallProperty
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var static: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.ObjectTypeCallProperty
  var value: FunctionTypeAnnotationKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectTypeCallProperty")
@js.native
object ObjectTypeCallProperty extends TopLevel[Type[ObjectTypeCallProperty]]

