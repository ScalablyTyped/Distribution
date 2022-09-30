package typings.angularForms.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal-only NgModule that works as a host for the `RadioControlRegistry` tree-shakable
  * provider. Note: the `InternalFormsSharedModule` can not be used here directly, since it's
  * declared *after* the `RadioControlRegistry` class and the `providedIn` doesn't support
  * `forwardRef` logic.
  */
trait RadioControlRegistryModule extends StObject
