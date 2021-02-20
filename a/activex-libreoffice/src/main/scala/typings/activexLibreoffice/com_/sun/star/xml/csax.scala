package typings.activexLibreoffice.com_.sun.star.xml

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csax {
  
  /**
    * A compressed XDocumentHandler interface.
    *
    * All methods in this interface have the same function with methods in the XDocumentHandler interface.
    *
    * Because there is no interface parameter in these methods, so using this interface to transfer SAX event is thought to have better performance than
    * using the XDocumentHandler interface, in case of when UNO C++/Java bridge is involved.
    */
  @js.native
  trait XCompressedDocumentHandler extends XInterface {
    
    def compressedCharacters(aChars: String): Unit = js.native
    
    def compressedEndDocument(): Unit = js.native
    
    def compressedEndElement(aName: String): Unit = js.native
    
    def compressedIgnorableWhitespace(aWhitespaces: String): Unit = js.native
    
    def compressedProcessingInstruction(aTarget: String, aData: String): Unit = js.native
    
    def compressedSetDocumentLocator(columnNumber: Double, lineNumber: Double, publicId: String, systemId: String): Unit = js.native
    
    def compressedStartDocument(): Unit = js.native
    
    def compressedStartElement(aName: String, aAttributes: SeqEquiv[XMLAttribute]): Unit = js.native
  }
  object XCompressedDocumentHandler {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      compressedCharacters: String => Unit,
      compressedEndDocument: () => Unit,
      compressedEndElement: String => Unit,
      compressedIgnorableWhitespace: String => Unit,
      compressedProcessingInstruction: (String, String) => Unit,
      compressedSetDocumentLocator: (Double, Double, String, String) => Unit,
      compressedStartDocument: () => Unit,
      compressedStartElement: (String, SeqEquiv[XMLAttribute]) => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XCompressedDocumentHandler = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compressedCharacters = js.Any.fromFunction1(compressedCharacters), compressedEndDocument = js.Any.fromFunction0(compressedEndDocument), compressedEndElement = js.Any.fromFunction1(compressedEndElement), compressedIgnorableWhitespace = js.Any.fromFunction1(compressedIgnorableWhitespace), compressedProcessingInstruction = js.Any.fromFunction2(compressedProcessingInstruction), compressedSetDocumentLocator = js.Any.fromFunction4(compressedSetDocumentLocator), compressedStartDocument = js.Any.fromFunction0(compressedStartDocument), compressedStartElement = js.Any.fromFunction2(compressedStartElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XCompressedDocumentHandler]
    }
    
    @scala.inline
    implicit class XCompressedDocumentHandlerMutableBuilder[Self <: XCompressedDocumentHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompressedCharacters(value: String => Unit): Self = StObject.set(x, "compressedCharacters", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCompressedEndDocument(value: () => Unit): Self = StObject.set(x, "compressedEndDocument", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompressedEndElement(value: String => Unit): Self = StObject.set(x, "compressedEndElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCompressedIgnorableWhitespace(value: String => Unit): Self = StObject.set(x, "compressedIgnorableWhitespace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCompressedProcessingInstruction(value: (String, String) => Unit): Self = StObject.set(x, "compressedProcessingInstruction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompressedSetDocumentLocator(value: (Double, Double, String, String) => Unit): Self = StObject.set(x, "compressedSetDocumentLocator", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCompressedStartDocument(value: () => Unit): Self = StObject.set(x, "compressedStartDocument", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompressedStartElement(value: (String, SeqEquiv[XMLAttribute]) => Unit): Self = StObject.set(x, "compressedStartElement", js.Any.fromFunction2(value))
    }
  }
  
  /** A struct to keep information of an element's attribute. */
  @js.native
  trait XMLAttribute extends StObject {
    
    /** the attribute name */
    var sName: String = js.native
    
    /** the attribute value */
    var sValue: String = js.native
  }
  object XMLAttribute {
    
    @scala.inline
    def apply(sName: String, sValue: String): XMLAttribute = {
      val __obj = js.Dynamic.literal(sName = sName.asInstanceOf[js.Any], sValue = sValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[XMLAttribute]
    }
    
    @scala.inline
    implicit class XMLAttributeMutableBuilder[Self <: XMLAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSName(value: String): Self = StObject.set(x, "sName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSValue(value: String): Self = StObject.set(x, "sValue", value.asInstanceOf[js.Any])
    }
  }
}
