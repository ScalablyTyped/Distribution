package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "EmbeddedViewRef")
@js.native
abstract class EmbeddedViewRef[C] () extends ViewRef {
  
  /**
    * The context for this view, inherited from the anchor element.
    */
  def context: C = js.native
  
  /**
    * The root nodes for this embedded view.
    */
  def rootNodes: js.Array[js.Any] = js.native
}
