package typings.angularCompiler.r3FactoryMod

import typings.angularCompiler.angularCompilerStrings.invalid
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExternalReference
import typings.angularCompiler.render3UtilMod.R3Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3ConstructorFactoryMetadata extends R3FactoryMetadata {
  /**
    * Regardless of whether `fnOrClass` is a constructor function or a user-defined factory, it
    * may have 0 or more parameters, which will be injected according to the `R3DependencyMetadata`
    * for those parameters. If this is `null`, then the type's constructor is nonexistent and will
    * be inherited from `fnOrClass` which is interpreted as the current type. If this is `'invalid'`,
    * then one or more of the parameters wasn't resolvable and any attempt to use these deps will
    * result in a runtime error.
    */
  var deps: js.Array[R3DependencyMetadata] | invalid | Null = js.native
  /**
    * An expression for the function which will be used to inject dependencies. The API of this
    * function could be different, and other options control how it will be invoked.
    */
  var injectFn: ExternalReference = js.native
  /**
    * An expression representing the constructor type, intended for use within a class definition
    * itself.
    *
    * This can differ from the outer `type` if the class is being compiled by ngcc and is inside
    * an IIFE structure that uses a different name internally.
    */
  var internalType: Expression = js.native
  /**
    * String name of the type being generated (used to name the factory function).
    */
  var name: String = js.native
  /**
    * Type of the target being created by the factory.
    */
  var target: R3FactoryTarget = js.native
  /**
    * An expression representing the interface type being constructed.
    */
  var `type`: R3Reference = js.native
  /** Number of arguments for the `type`. */
  var typeArgumentCount: Double = js.native
}

object R3ConstructorFactoryMetadata {
  @scala.inline
  def apply(
    injectFn: ExternalReference,
    internalType: Expression,
    name: String,
    target: R3FactoryTarget,
    `type`: R3Reference,
    typeArgumentCount: Double
  ): R3ConstructorFactoryMetadata = {
    val __obj = js.Dynamic.literal(injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ConstructorFactoryMetadata]
  }
  @scala.inline
  implicit class R3ConstructorFactoryMetadataOps[Self <: R3ConstructorFactoryMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInjectFn(value: ExternalReference): Self = this.set("injectFn", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternalType(value: Expression): Self = this.set("internalType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: R3FactoryTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: R3Reference): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeArgumentCount(value: Double): Self = this.set("typeArgumentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsVarargs(value: R3DependencyMetadata*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[R3DependencyMetadata] | invalid): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsNull: Self = this.set("deps", null)
  }
  
}

