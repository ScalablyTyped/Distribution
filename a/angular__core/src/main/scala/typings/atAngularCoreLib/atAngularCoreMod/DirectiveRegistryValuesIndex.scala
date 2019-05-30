package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DirectiveRegistryValuesIndex extends js.Object

/**
  * An enum that outlines the offset/position values for each directive entry and its data
  * that are housed inside of [DirectiveRegistryValues].
  */
@JSImport("@angular/core", "DirectiveRegistryValuesIndex")
@js.native
object DirectiveRegistryValuesIndex extends js.Object {
  @js.native
  sealed trait SinglePropValuesIndexOffset
    extends atAngularCoreLib.atAngularCoreMod.DirectiveRegistryValuesIndex
  
  @js.native
  sealed trait Size
    extends atAngularCoreLib.atAngularCoreMod.DirectiveRegistryValuesIndex
  
  @js.native
  sealed trait StyleSanitizerOffset
    extends atAngularCoreLib.atAngularCoreMod.DirectiveRegistryValuesIndex
  
}

