package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An optional interface that is implemented by resources that are relocatable to different anchors. */
trait XRelocatableResource extends js.Object {
  /**
    * Replace the current anchor of the called resource with the given one.
    * @param xNewAnchor The new anchor.
    * @returns Returns `TRUE` when the relocation was successful.
    */
  def relocateToAnchor(xNewAnchor: XResource): Boolean
}

object XRelocatableResource {
  @scala.inline
  def apply(relocateToAnchor: XResource => Boolean): XRelocatableResource = {
    val __obj = js.Dynamic.literal(relocateToAnchor = js.Any.fromFunction1(relocateToAnchor))
  
    __obj.asInstanceOf[XRelocatableResource]
  }
}

