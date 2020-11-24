package typings.activexLibreoffice.com_.sun.star.drawing.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An optional interface that is implemented by resources that are relocatable to different anchors. */
@js.native
trait XRelocatableResource extends js.Object {
  
  /**
    * Replace the current anchor of the called resource with the given one.
    * @param xNewAnchor The new anchor.
    * @returns Returns `TRUE` when the relocation was successful.
    */
  def relocateToAnchor(xNewAnchor: XResource): Boolean = js.native
}
object XRelocatableResource {
  
  @scala.inline
  def apply(relocateToAnchor: XResource => Boolean): XRelocatableResource = {
    val __obj = js.Dynamic.literal(relocateToAnchor = js.Any.fromFunction1(relocateToAnchor))
    __obj.asInstanceOf[XRelocatableResource]
  }
  
  @scala.inline
  implicit class XRelocatableResourceOps[Self <: XRelocatableResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRelocateToAnchor(value: XResource => Boolean): Self = this.set("relocateToAnchor", js.Any.fromFunction1(value))
  }
}
