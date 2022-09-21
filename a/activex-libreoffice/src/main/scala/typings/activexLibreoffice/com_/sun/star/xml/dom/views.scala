package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object views {
  
  trait XAbstractView
    extends StObject
       with XInterface {
    
    val Document: XDocumentView
    
    def getDocument(): XDocumentView
  }
  object XAbstractView {
    
    inline def apply(
      Document: XDocumentView,
      acquire: () => Unit,
      getDocument: () => XDocumentView,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XAbstractView = {
      val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDocument = js.Any.fromFunction0(getDocument), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XAbstractView]
    }
    
    extension [Self <: XAbstractView](x: Self) {
      
      inline def setDocument(value: XDocumentView): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
      
      inline def setGetDocument(value: () => XDocumentView): Self = StObject.set(x, "getDocument", js.Any.fromFunction0(value))
    }
  }
  
  trait XDocumentView
    extends StObject
       with XInterface {
    
    val DefaultView: XAbstractView
    
    def getDefaultView(): XAbstractView
  }
  object XDocumentView {
    
    inline def apply(
      DefaultView: XAbstractView,
      acquire: () => Unit,
      getDefaultView: () => XAbstractView,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XDocumentView = {
      val __obj = js.Dynamic.literal(DefaultView = DefaultView.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaultView = js.Any.fromFunction0(getDefaultView), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XDocumentView]
    }
    
    extension [Self <: XDocumentView](x: Self) {
      
      inline def setDefaultView(value: XAbstractView): Self = StObject.set(x, "DefaultView", value.asInstanceOf[js.Any])
      
      inline def setGetDefaultView(value: () => XAbstractView): Self = StObject.set(x, "getDefaultView", js.Any.fromFunction0(value))
    }
  }
}
