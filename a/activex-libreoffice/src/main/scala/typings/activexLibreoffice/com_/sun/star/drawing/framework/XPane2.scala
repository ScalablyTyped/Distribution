package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An extension of the {@link XPane} interface that adds support for a) showing and hiding the windows that internally belong to the pane and b) setting
  * the accessibility object. This is typically an optional interface.
  */
trait XPane2 extends StObject {
  
  /** Return the accessibility object that is currently associated with the windows that implement the pane. */
  var Accessible: XAccessible
  
  /** Return the accessibility object that is currently associated with the windows that implement the pane. */
  def getAccessible(): XAccessible
  
  /**
    * Return whether all windows that are used to implement the pane are visible.
    * @returns `TRUE` when all windows of the pane are visible.
    */
  def isVisible(): Boolean
  
  /**
    * Set the accessibility object for the pane. When there is more than one window used to implement the pane then the given accessibility object is
    * usually set at the topmost window. However, the details are implementation dependent.
    * @param xAccessible May be an empty reference.
    */
  def setAccessible(xAccessible: XAccessible): Unit
  
  /**
    * Hide or show the pane. If there is more than one window used to implement the pane then it is left to the implementation if one, some, or all windows
    * are hidden or shown as long as the pane becomes hidden or visible.
    * @param bIsVisible When `TRUE` then show the pane. Hide it otherwise.
    */
  def setVisible(bIsVisible: Boolean): Unit
}
object XPane2 {
  
  @scala.inline
  def apply(
    Accessible: XAccessible,
    getAccessible: () => XAccessible,
    isVisible: () => Boolean,
    setAccessible: XAccessible => Unit,
    setVisible: Boolean => Unit
  ): XPane2 = {
    val __obj = js.Dynamic.literal(Accessible = Accessible.asInstanceOf[js.Any], getAccessible = js.Any.fromFunction0(getAccessible), isVisible = js.Any.fromFunction0(isVisible), setAccessible = js.Any.fromFunction1(setAccessible), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[XPane2]
  }
  
  @scala.inline
  implicit class XPane2MutableBuilder[Self <: XPane2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessible(value: XAccessible): Self = StObject.set(x, "Accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAccessible(value: () => XAccessible): Self = StObject.set(x, "getAccessible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAccessible(value: XAccessible => Unit): Self = StObject.set(x, "setAccessible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
  }
}
