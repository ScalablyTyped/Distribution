package typings.activexLibreoffice.com_.sun.star.drawing.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An optional interface that is implemented by resources that are relocatable to different anchors. */
trait XRelocatableResource extends StObject {
  
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
  
  @scala.inline
  implicit class XRelocatableResourceMutableBuilder[Self <: XRelocatableResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelocateToAnchor(value: XResource => Boolean): Self = StObject.set(x, "relocateToAnchor", js.Any.fromFunction1(value))
  }
}
