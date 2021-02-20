package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object views {
  
  @js.native
  trait XAbstractView extends XInterface {
    
    val Document: XDocumentView = js.native
    
    def getDocument(): XDocumentView = js.native
  }
  object XAbstractView {
    
    @scala.inline
    def apply(
      Document: XDocumentView,
      acquire: () => Unit,
      getDocument: () => XDocumentView,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XAbstractView = {
      val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDocument = js.Any.fromFunction0(getDocument), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XAbstractView]
    }
    
    @scala.inline
    implicit class XAbstractViewMutableBuilder[Self <: XAbstractView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocument(value: XDocumentView): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDocument(value: () => XDocumentView): Self = StObject.set(x, "getDocument", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait XDocumentView extends XInterface {
    
    val DefaultView: XAbstractView = js.native
    
    def getDefaultView(): XAbstractView = js.native
  }
  object XDocumentView {
    
    @scala.inline
    def apply(
      DefaultView: XAbstractView,
      acquire: () => Unit,
      getDefaultView: () => XAbstractView,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XDocumentView = {
      val __obj = js.Dynamic.literal(DefaultView = DefaultView.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaultView = js.Any.fromFunction0(getDefaultView), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XDocumentView]
    }
    
    @scala.inline
    implicit class XDocumentViewMutableBuilder[Self <: XDocumentView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultView(value: XAbstractView): Self = StObject.set(x, "DefaultView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDefaultView(value: () => XAbstractView): Self = StObject.set(x, "getDefaultView", js.Any.fromFunction0(value))
    }
  }
}
