package typings
package atAngularCompilerLib.srcConstantUnderscorePoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/constant_pool", "ConstantPool")
@js.native
class ConstantPool () extends js.Object {
  var _getLiteralFactory: js.Any = js.native
  var componentDefinitions: js.Any = js.native
  var definitionsOf: js.Any = js.native
  var directiveDefinitions: js.Any = js.native
  var freshName: js.Any = js.native
  var injectorDefinitions: js.Any = js.native
  var keyOf: js.Any = js.native
  var literalFactories: js.Any = js.native
  var literals: js.Any = js.native
  var nextNameIndex: js.Any = js.native
  var pipeDefinitions: js.Any = js.native
  var statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement] = js.native
  def getConstLiteral(literal: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def getConstLiteral(
    literal: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    forceShared: scala.Boolean
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def getDefinition(`type`: js.Any, kind: DefinitionKind, ctx: atAngularCompilerLib.srcUtilMod.OutputContext): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def getDefinition(
    `type`: js.Any,
    kind: DefinitionKind,
    ctx: atAngularCompilerLib.srcUtilMod.OutputContext,
    forceShared: scala.Boolean
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def getLiteralFactory(literal: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralArrayExpr): atAngularCompilerLib.Anon_LiteralFactoryArguments = js.native
  def getLiteralFactory(literal: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralMapExpr): atAngularCompilerLib.Anon_LiteralFactoryArguments = js.native
  def propertyNameOf(kind: DefinitionKind): java.lang.String = js.native
  /**
       * Produce a unique name.
       *
       * The name might be unique among different prefixes if any of the prefixes end in
       * a digit so the prefix should be a constant string (not based on user input) and
       * must not end in a digit.
       */
  def uniqueName(prefix: java.lang.String): java.lang.String = js.native
}

