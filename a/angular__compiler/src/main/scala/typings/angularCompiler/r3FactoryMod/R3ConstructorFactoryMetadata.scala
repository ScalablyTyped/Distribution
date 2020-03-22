package typings.angularCompiler.r3FactoryMod

import typings.angularCompiler.angularCompilerStrings.invalid
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExternalReference
import typings.angularCompiler.render3UtilMod.R3Reference
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
    * An expression representing the constructor type, intended for use within a class definition
    * itself.
    *
    * This can differ from the outer `type` if the class is being compiled by ngcc and is inside
    * an IIFE structure that uses a different name internally.
    */
  var internalType: Expression
  /**
    * String name of the type being generated (used to name the factory function).
    */
  var name: String
  /**
    * Type of the target being created by the factory.
    */
  var target: R3FactoryTarget
  /**
    * An expression representing the interface type being constructed.
    */
  var `type`: R3Reference
  /** Number of arguments for the `type`. */
  var typeArgumentCount: Double
}

object R3ConstructorFactoryMetadata {
  @scala.inline
  def apply(
    injectFn: ExternalReference,
    internalType: Expression,
    name: String,
    target: R3FactoryTarget,
    `type`: R3Reference,
    typeArgumentCount: Double,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3ConstructorFactoryMetadata = {
    val __obj = js.Dynamic.literal(injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ConstructorFactoryMetadata]
  }
}

