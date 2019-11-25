package typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod

import typings.atAngularCompiler.atAngularCompilerStrings.invalid
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExternalReference
import typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3FactoryDelegateType.Class
import typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3FactoryDelegateType.Factory
import typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3FactoryDelegateType.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3ConstructorFactoryMetadata
  - typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3DelegatedFactoryMetadata
  - typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3DelegatedFnOrClassMetadata
  - typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3ExpressionFactoryMetadata
*/
trait R3FactoryMetadata extends js.Object

object R3FactoryMetadata {
  @scala.inline
  def R3ConstructorFactoryMetadata(
    injectFn: ExternalReference,
    name: String,
    `type`: Expression,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3FactoryMetadata = {
    val __obj = js.Dynamic.literal(injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3FactoryMetadata]
  }
  @scala.inline
  def R3DelegatedFactoryMetadata(
    delegate: Expression,
    delegateType: Factory,
    injectFn: ExternalReference,
    name: String,
    `type`: Expression,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3FactoryMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3FactoryMetadata]
  }
  @scala.inline
  def R3DelegatedFnOrClassMetadata(
    delegate: Expression,
    delegateDeps: js.Array[R3DependencyMetadata],
    delegateType: Class | Function,
    injectFn: ExternalReference,
    name: String,
    `type`: Expression,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3FactoryMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateDeps = delegateDeps.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3FactoryMetadata]
  }
  @scala.inline
  def R3ExpressionFactoryMetadata(
    expression: Expression,
    injectFn: ExternalReference,
    name: String,
    `type`: Expression,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3FactoryMetadata = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3FactoryMetadata]
  }
}

