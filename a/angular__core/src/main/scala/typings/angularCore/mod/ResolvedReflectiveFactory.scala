package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "ResolvedReflectiveFactory")
@js.native
open class ResolvedReflectiveFactory protected () extends StObject {
  def this(
    /**
    * Factory function which can return an instance of an object represented by a key.
    */
  factory: js.Function,
    /**
    * Arguments (dependencies) to the `factory` function.
    */
  dependencies: js.Array[ReflectiveDependency]
  ) = this()
  
  /**
    * Arguments (dependencies) to the `factory` function.
    */
  var dependencies: js.Array[ReflectiveDependency] = js.native
  
  /**
    * Factory function which can return an instance of an object represented by a key.
    */
  var factory: js.Function = js.native
}
