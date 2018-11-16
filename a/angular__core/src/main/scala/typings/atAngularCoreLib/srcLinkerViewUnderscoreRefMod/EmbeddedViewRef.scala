package typings
package atAngularCoreLib.srcLinkerViewUnderscoreRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/linker/view_ref", "EmbeddedViewRef")
@js.native
abstract class EmbeddedViewRef[C] () extends ViewRef {
  /**
       * The context for this view, inherited from the anchor element.
       */
  val context: C = js.native
  /**
       * The root nodes for this embedded view.
       */
  val rootNodes: js.Array[_] = js.native
}

