package typings.activexDashLibreoffice.comNs.sunNs.starNs.officeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface gives access to the annotation for a document content. */
trait XAnnotationAccess extends js.Object {
  /** creates a new annotation and inserts it into the document content. */
  def createAndInsertAnnotation(): XAnnotation
  /** @returns a new enumeration object for this annotation container. It returns NULL if there are no objects in this container. */
  def createAnnotationEnumeration(): XAnnotationEnumeration
  /** removes the annotation from this document content. */
  def removeAnnotation(annotation: XAnnotation): Unit
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
}

