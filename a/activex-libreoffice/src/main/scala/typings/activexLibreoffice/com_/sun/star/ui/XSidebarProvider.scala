package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.frame.XFrame
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of the sidebar
  * @since LibreOffice 5.1
  */
trait XSidebarProvider
  extends StObject
     with XInterface {
  
  val Decks: XDecks
  
  /** Get the XFrame owner */
  val Frame: XFrame
  
  /** Returns the sidebar object */
  val Sidebar: XSidebar
  
  def getDecks(): XDecks
  
  /** Get the XFrame owner */
  def getFrame(): XFrame
  
  /** Returns the sidebar object */
  def getSidebar(): XSidebar
  
  /** Is the sidebar visible */
  def isVisible(): Boolean
  
  /**
    * Display the sidebar
    * @param bVisible the requested visible state
    */
  def setVisible(bVisible: Boolean): Unit
  
  /**
    * Decks container visibility
    * @param bVisible the requested visible state FALSE collapses the deck container horizontally. Then Only shows the deck TabBar selectorTRUE expands the de
    */
  def showDecks(bVisible: Boolean): Unit
}
object XSidebarProvider {
  
  inline def apply(
    Decks: XDecks,
    Frame: XFrame,
    Sidebar: XSidebar,
    acquire: () => Unit,
    getDecks: () => XDecks,
    getFrame: () => XFrame,
    getSidebar: () => XSidebar,
    isVisible: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    setVisible: Boolean => Unit,
    showDecks: Boolean => Unit
  ): XSidebarProvider = {
    val __obj = js.Dynamic.literal(Decks = Decks.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Sidebar = Sidebar.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDecks = js.Any.fromFunction0(getDecks), getFrame = js.Any.fromFunction0(getFrame), getSidebar = js.Any.fromFunction0(getSidebar), isVisible = js.Any.fromFunction0(isVisible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setVisible = js.Any.fromFunction1(setVisible), showDecks = js.Any.fromFunction1(showDecks))
    __obj.asInstanceOf[XSidebarProvider]
  }
  
  extension [Self <: XSidebarProvider](x: Self) {
    
    inline def setDecks(value: XDecks): Self = StObject.set(x, "Decks", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: XFrame): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    inline def setGetDecks(value: () => XDecks): Self = StObject.set(x, "getDecks", js.Any.fromFunction0(value))
    
    inline def setGetFrame(value: () => XFrame): Self = StObject.set(x, "getFrame", js.Any.fromFunction0(value))
    
    inline def setGetSidebar(value: () => XSidebar): Self = StObject.set(x, "getSidebar", js.Any.fromFunction0(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
    
    inline def setShowDecks(value: Boolean => Unit): Self = StObject.set(x, "showDecks", js.Any.fromFunction1(value))
    
    inline def setSidebar(value: XSidebar): Self = StObject.set(x, "Sidebar", value.asInstanceOf[js.Any])
  }
}
