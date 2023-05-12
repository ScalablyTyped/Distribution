package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputDecorator
  extends StObject
     with Instantiable0[Any]
     with Instantiable1[/* hostPropertyName */ String, Any] {
  
  /**
    * Decorator that marks a class field as an output property and supplies configuration metadata.
    * The DOM property bound to the output property is automatically updated during change detection.
    *
    * @usageNotes
    *
    * You can supply an optional name to use in templates when the
    * component is instantiated, that maps to the
    * name of the bound property. By default, the original
    * name of the bound property is used for output binding.
    *
    * See `Input` decorator for an example of providing a binding name.
    *
    * @see [Input and Output properties](guide/inputs-outputs)
    *
    */
  def apply(): Any = js.native
  def apply(alias: String): Any = js.native
}
