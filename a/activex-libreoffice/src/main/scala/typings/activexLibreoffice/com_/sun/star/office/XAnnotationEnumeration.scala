package typings.activexLibreoffice.com_.sun.star.office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An enumeration for a set of annotations. */
@js.native
trait XAnnotationEnumeration extends js.Object {
  
  /** tests whether this enumeration contains more elements. */
  def hasMoreElements(): Boolean = js.native
  
  /**
    * @returns the next element of this enumeration.
    * @throws NoSuchElementException if no more elements exist.
    */
  def nextElement(): XAnnotation = js.native
}
object XAnnotationEnumeration {
  
  @scala.inline
  def apply(hasMoreElements: () => Boolean, nextElement: () => XAnnotation): XAnnotationEnumeration = {
    val __obj = js.Dynamic.literal(hasMoreElements = js.Any.fromFunction0(hasMoreElements), nextElement = js.Any.fromFunction0(nextElement))
    __obj.asInstanceOf[XAnnotationEnumeration]
  }
  
  @scala.inline
  implicit class XAnnotationEnumerationOps[Self <: XAnnotationEnumeration] (val x: Self) extends AnyVal {
    
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
    def setHasMoreElements(value: () => Boolean): Self = this.set("hasMoreElements", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextElement(value: () => XAnnotation): Self = this.set("nextElement", js.Any.fromFunction0(value))
  }
}
