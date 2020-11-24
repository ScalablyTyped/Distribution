package typings.activexLibreoffice.com_.sun.star.office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface gives access to the annotation for a document content. */
@js.native
trait XAnnotationAccess extends js.Object {
  
  /** creates a new annotation and inserts it into the document content. */
  def createAndInsertAnnotation(): XAnnotation = js.native
  
  /** @returns a new enumeration object for this annotation container. It returns NULL if there are no objects in this container. */
  def createAnnotationEnumeration(): XAnnotationEnumeration = js.native
  
  /** removes the annotation from this document content. */
  def removeAnnotation(annotation: XAnnotation): Unit = js.native
}
object XAnnotationAccess {
  
  @scala.inline
  def apply(
    createAndInsertAnnotation: () => XAnnotation,
    createAnnotationEnumeration: () => XAnnotationEnumeration,
    removeAnnotation: XAnnotation => Unit
  ): XAnnotationAccess = {
    val __obj = js.Dynamic.literal(createAndInsertAnnotation = js.Any.fromFunction0(createAndInsertAnnotation), createAnnotationEnumeration = js.Any.fromFunction0(createAnnotationEnumeration), removeAnnotation = js.Any.fromFunction1(removeAnnotation))
    __obj.asInstanceOf[XAnnotationAccess]
  }
  
  @scala.inline
  implicit class XAnnotationAccessOps[Self <: XAnnotationAccess] (val x: Self) extends AnyVal {
    
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
    def setCreateAndInsertAnnotation(value: () => XAnnotation): Self = this.set("createAndInsertAnnotation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateAnnotationEnumeration(value: () => XAnnotationEnumeration): Self = this.set("createAnnotationEnumeration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAnnotation(value: XAnnotation => Unit): Self = this.set("removeAnnotation", js.Any.fromFunction1(value))
  }
}
