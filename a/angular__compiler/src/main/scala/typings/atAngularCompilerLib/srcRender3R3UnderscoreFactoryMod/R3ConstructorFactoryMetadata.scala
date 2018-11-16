package typings
package atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait R3ConstructorFactoryMetadata extends js.Object {
  /**
       * Regardless of whether `fnOrClass` is a constructor function or a user-defined factory, it
       * may have 0 or more parameters, which will be injected according to the `R3DependencyMetadata`
       * for those parameters. If this is `null`, then the type's constructor is nonexistent and will
       * be inherited from `fnOrClass` which is interpreted as the current type.
       */
  var deps: js.Array[R3DependencyMetadata] | scala.Null
  /**
       * An expression for the function which will be used to inject dependencies. The API of this
       * function could be different, and other options control how it will be invoked.
       */
  var injectFn: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference
  /**
       * String name of the type being generated (used to name the factory function).
       */
  var name: java.lang.String
  /**
       * An expression representing the function (or constructor) which will instantiate the requested
       * type.
       *
       * This could be a reference to a constructor type, or to a user-defined factory function. The
       * `useNew` property determines whether it will be called as a constructor or not.
       */
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
}

