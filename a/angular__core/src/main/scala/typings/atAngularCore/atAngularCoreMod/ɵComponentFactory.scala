package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class for a factory that can create a component dynamically.
  * Instantiate a factory for a given type of component with `resolveComponentFactory()`.
  * Use the resulting `ComponentFactory.create()` method to create a component of that type.
  *
  * @see [Dynamic Components](guide/dynamic-component-loader)
  *
  * @publicApi
  */
@JSImport("@angular/core", "ɵComponentFactory")
@js.native
abstract class ɵComponentFactory[C] () extends ComponentFactory[C]

