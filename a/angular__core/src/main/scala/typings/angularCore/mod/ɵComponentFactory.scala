package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for a factory that can create a component dynamically.
  * Instantiate a factory for a given type of component with `resolveComponentFactory()`.
  * Use the resulting `ComponentFactory.create()` method to create a component of that type.
  *
  * @see [Dynamic Components](guide/dynamic-component-loader)
  *
  * @publicApi
  *
  * @deprecated Angular no longer requires Component factories. Please use other APIs where
  *     Component class can be used directly.
  */
/* note: abstract class */ @JSImport("@angular/core", "\u0275ComponentFactory")
@js.native
open class ɵComponentFactory[C] () extends ComponentFactory[C]
