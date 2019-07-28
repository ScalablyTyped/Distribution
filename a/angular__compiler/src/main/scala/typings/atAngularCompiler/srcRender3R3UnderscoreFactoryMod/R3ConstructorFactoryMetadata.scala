package typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod

import typings.atAngularCompiler.atAngularCompilerStrings.invalid
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExternalReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3ConstructorFactoryMetadata extends R3FactoryMetadata {
  /**
    * Regardless of whether `fnOrClass` is a constructor function or a user-defined factory, it
    * may have 0 or more parameters, which will be injected according to the `R3DependencyMetadata`
    * for those parameters. If this is `null`, then the type's constructor is nonexistent and will
    * be inherited from `fnOrClass` which is interpreted as the current type. If this is `'invalid'`,
    * then one or more of the parameters wasn't resolvable and any attempt to use these deps will
    * result in a runtime error.
    */
  var deps: js.Array[R3DependencyMetadata] | invalid | Null
  /**
    * An expression for the function which will be used to inject dependencies. The API of this
    * function could be different, and other options control how it will be invoked.
    */
  var injectFn: ExternalReference
  /**
    * String name of the type being generated (used to name the factory function).
    */
  var name: String
  /**
    * An expression representing the function (or constructor) which will instantiate the requested
    * type.
    *
    * This could be a reference to a constructor type, or to a user-defined factory function. The
    * `useNew` property determines whether it will be called as a constructor or not.
    */
  var `type`: Expression
}

object R3ConstructorFactoryMetadata {
  @scala.inline
  def apply(
    injectFn: ExternalReference,
    name: String,
    `type`: Expression,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3ConstructorFactoryMetadata = {
    val __obj = js.Dynamic.literal(injectFn = injectFn, name = name)
    __obj.updateDynamic("type")(`type`)
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ConstructorFactoryMetadata]
  }
}

