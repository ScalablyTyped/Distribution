package typings.angularCore.testingTestingMod

import typings.angularCore.anon.InstantiableC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/testing/testing", "\u0275MetadataOverrider")
@js.native
class ɵMetadataOverrider () extends js.Object {
  
  var _references: js.Any = js.native
  
  /**
    * Creates a new instance for the given metadata class
    * based on an old instance and overrides.
    */
  def overrideMetadata[C /* <: T */, T](metadataClass: InstantiableC[T, C], oldMetadata: C, `override`: MetadataOverride[T]): C = js.native
}
