package typings
package atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/reflective_provider", "ResolvedReflectiveFactory")
@js.native
class ResolvedReflectiveFactory protected () extends js.Object {
  def this(/**
       * Factory function which can return an instance of an object represented by a key.
       */
  factory: js.Function, /**
       * Arguments (dependencies) to the `factory` function.
       */
  dependencies: js.Array[ReflectiveDependency]) = this()
  /**
       * Arguments (dependencies) to the `factory` function.
       */
  var dependencies: js.Array[ReflectiveDependency] = js.native
  /**
       * Factory function which can return an instance of an object represented by a key.
       */
  var factory: js.Function = js.native
}

