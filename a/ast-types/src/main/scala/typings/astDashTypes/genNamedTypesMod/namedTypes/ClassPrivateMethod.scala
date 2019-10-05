package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesStrings.`private`
import typings.astDashTypes.astDashTypesStrings.`protected`
import typings.astDashTypes.astDashTypesStrings.constructor
import typings.astDashTypes.astDashTypesStrings.get
import typings.astDashTypes.astDashTypesStrings.method
import typings.astDashTypes.astDashTypesStrings.public
import typings.astDashTypes.astDashTypesStrings.set
import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.DecoratorKind
import typings.astDashTypes.genKindsMod.FunctionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.PrivateNameKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'body'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Function[P]} */ trait ClassPrivateMethod
  extends ASTNode
     with DeclarationKind
     with FunctionKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var `abstract`: js.UndefOr[Boolean | Null] = js.undefined
  var access: js.UndefOr[public | `private` | `protected` | Null] = js.undefined
  var accessibility: js.UndefOr[public | `private` | `protected` | Null] = js.undefined
  var body: BlockStatementKind
  var computed: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var key: PrivateNameKind
  var kind: js.UndefOr[get | set | method | constructor] = js.undefined
  var optional: js.UndefOr[Boolean | Null] = js.undefined
  var static: js.UndefOr[Boolean | Null] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.ClassPrivateMethod
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassPrivateMethod")
@js.native
object ClassPrivateMethod extends TopLevel[Type[ClassPrivateMethod]]

