package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.text.XText
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object office {
  
  /** @since LibreOffice 4.2 */
  trait Quickstart
    extends StObject
       with XFastPropertySet {
    
    /** The first two parameters are ignored */
    def createAndSetVeto(p1: Boolean, p2: Boolean, DisableVeto: Boolean): Unit
    
    def createAutoStart(bQuickstart: Boolean, bAutostart: Boolean): Unit
    
    def createDefault(): Unit
    
    def createStart(bQuickstart: Boolean): Unit
  }
  object Quickstart {
    
    inline def apply(
      acquire: () => Unit,
      createAndSetVeto: (Boolean, Boolean, Boolean) => Unit,
      createAutoStart: (Boolean, Boolean) => Unit,
      createDefault: () => Unit,
      createStart: Boolean => Unit,
      getFastPropertyValue: Double => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      setFastPropertyValue: (Double, js.Any) => Unit
    ): Quickstart = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAndSetVeto = js.Any.fromFunction3(createAndSetVeto), createAutoStart = js.Any.fromFunction2(createAutoStart), createDefault = js.Any.fromFunction0(createDefault), createStart = js.Any.fromFunction1(createStart), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFastPropertyValue = js.Any.fromFunction2(setFastPropertyValue))
      __obj.asInstanceOf[Quickstart]
    }
    
    extension [Self <: Quickstart](x: Self) {
      
      inline def setCreateAndSetVeto(value: (Boolean, Boolean, Boolean) => Unit): Self = StObject.set(x, "createAndSetVeto", js.Any.fromFunction3(value))
      
      inline def setCreateAutoStart(value: (Boolean, Boolean) => Unit): Self = StObject.set(x, "createAutoStart", js.Any.fromFunction2(value))
      
      inline def setCreateDefault(value: () => Unit): Self = StObject.set(x, "createDefault", js.Any.fromFunction0(value))
      
      inline def setCreateStart(value: Boolean => Unit): Self = StObject.set(x, "createStart", js.Any.fromFunction1(value))
    }
  }
  
  /** This interface gives access to an annotation inside a document. */
  trait XAnnotation
    extends StObject
       with XPropertySet
       with XComponent {
    
    /** a reference to the document content this annotation is anchored to. */
    var Anchor: js.Any
    
    /** stores the full name of the author who created this annotation. */
    var Author: String
    
    /** stores the date and time this annotation was last edited. */
    var DateTime: typings.activexLibreoffice.com_.sun.star.util.DateTime
    
    /** stores the initials of the author who created this annotation. */
    var Initials: String
    
    /**
      * this is an optional position that gives the user interface a hint where the annotation should be rendered. This could be an offset to the annotations
      * anchor.
      */
    var Position: RealPoint2D
    
    /** this is an optional size that gives the user interface a hint how large the annotation should be rendered. */
    var Size: RealSize2D
    
    /** gives access to the annotations text. */
    var TextRange: XText
  }
  object XAnnotation {
    
    inline def apply(
      Anchor: js.Any,
      Author: String,
      DateTime: DateTime,
      Initials: String,
      Position: RealPoint2D,
      PropertySetInfo: XPropertySetInfo,
      Size: RealSize2D,
      TextRange: XText,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      dispose: () => Unit,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): XAnnotation = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], DateTime = DateTime.asInstanceOf[js.Any], Initials = Initials.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[XAnnotation]
    }
    
    extension [Self <: XAnnotation](x: Self) {
      
      inline def setAnchor(value: js.Any): Self = StObject.set(x, "Anchor", value.asInstanceOf[js.Any])
      
      inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
      
      inline def setDateTime(value: DateTime): Self = StObject.set(x, "DateTime", value.asInstanceOf[js.Any])
      
      inline def setInitials(value: String): Self = StObject.set(x, "Initials", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: RealPoint2D): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
      
      inline def setSize(value: RealSize2D): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
      
      inline def setTextRange(value: XText): Self = StObject.set(x, "TextRange", value.asInstanceOf[js.Any])
    }
  }
  
  /** This interface gives access to the annotation for a document content. */
  trait XAnnotationAccess extends StObject {
    
    /** creates a new annotation and inserts it into the document content. */
    def createAndInsertAnnotation(): XAnnotation
    
    /** @returns a new enumeration object for this annotation container. It returns NULL if there are no objects in this container. */
    def createAnnotationEnumeration(): XAnnotationEnumeration
    
    /** removes the annotation from this document content. */
    def removeAnnotation(annotation: XAnnotation): Unit
  }
  object XAnnotationAccess {
    
    inline def apply(
      createAndInsertAnnotation: () => XAnnotation,
      createAnnotationEnumeration: () => XAnnotationEnumeration,
      removeAnnotation: XAnnotation => Unit
    ): XAnnotationAccess = {
      val __obj = js.Dynamic.literal(createAndInsertAnnotation = js.Any.fromFunction0(createAndInsertAnnotation), createAnnotationEnumeration = js.Any.fromFunction0(createAnnotationEnumeration), removeAnnotation = js.Any.fromFunction1(removeAnnotation))
      __obj.asInstanceOf[XAnnotationAccess]
    }
    
    extension [Self <: XAnnotationAccess](x: Self) {
      
      inline def setCreateAndInsertAnnotation(value: () => XAnnotation): Self = StObject.set(x, "createAndInsertAnnotation", js.Any.fromFunction0(value))
      
      inline def setCreateAnnotationEnumeration(value: () => XAnnotationEnumeration): Self = StObject.set(x, "createAnnotationEnumeration", js.Any.fromFunction0(value))
      
      inline def setRemoveAnnotation(value: XAnnotation => Unit): Self = StObject.set(x, "removeAnnotation", js.Any.fromFunction1(value))
    }
  }
  
  /** An enumeration for a set of annotations. */
  trait XAnnotationEnumeration extends StObject {
    
    /** tests whether this enumeration contains more elements. */
    def hasMoreElements(): Boolean
    
    /**
      * @returns the next element of this enumeration.
      * @throws NoSuchElementException if no more elements exist.
      */
    def nextElement(): XAnnotation
  }
  object XAnnotationEnumeration {
    
    inline def apply(hasMoreElements: () => Boolean, nextElement: () => XAnnotation): XAnnotationEnumeration = {
      val __obj = js.Dynamic.literal(hasMoreElements = js.Any.fromFunction0(hasMoreElements), nextElement = js.Any.fromFunction0(nextElement))
      __obj.asInstanceOf[XAnnotationEnumeration]
    }
    
    extension [Self <: XAnnotationEnumeration](x: Self) {
      
      inline def setHasMoreElements(value: () => Boolean): Self = StObject.set(x, "hasMoreElements", js.Any.fromFunction0(value))
      
      inline def setNextElement(value: () => XAnnotation): Self = StObject.set(x, "nextElement", js.Any.fromFunction0(value))
    }
  }
}
