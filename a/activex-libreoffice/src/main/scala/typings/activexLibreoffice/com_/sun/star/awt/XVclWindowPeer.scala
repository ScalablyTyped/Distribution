package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the VCL window implementation.
  * @deprecated Deprecated
  */
trait XVclWindowPeer
  extends StObject
     with XWindowPeer {
  
  /** enables clipping of sibling windows. */
  def enableClipSiblings(bClip: Boolean): Unit
  
  /** returns the value of the property with the specified name. */
  def getProperty(PropertyName: String): js.Any
  
  /** returns the font, foreground and background color for the specified type. */
  def getStyles(
    nType: Double,
    Font: js.Array[FontDescriptor],
    ForegroundColor: js.Array[Color],
    BackgroundColor: js.Array[Color]
  ): Unit
  
  /** returns `TRUE` if the window peer is a child, `FALSE` otherwise. */
  def isChild(Peer: XWindowPeer): Boolean
  
  /** returns `TRUE` if the window peer is in design mode, `FALSE` otherwise. */
  def isDesignMode(): Boolean
  
  /** sets the control font. */
  def setControlFont(aFont: FontDescriptor): Unit
  
  /** sets the design mode for use in a design editor. */
  def setDesignMode(bOn: Boolean): Unit
  
  /** sets the foreground color. */
  def setForeground(Color: Color): Unit
  
  /** sets the value of the property with the specified name. */
  def setProperty(PropertyName: String, Value: js.Any): Unit
}
object XVclWindowPeer {
  
  inline def apply(
    Toolkit: XToolkit,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    enableClipSiblings: Boolean => Unit,
    getProperty: String => js.Any,
    getStyles: (Double, js.Array[FontDescriptor], js.Array[Color], js.Array[Color]) => Unit,
    getToolkit: () => XToolkit,
    invalidate: Double => Unit,
    invalidateRect: (Rectangle, Double) => Unit,
    isChild: XWindowPeer => Boolean,
    isDesignMode: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setBackground: Color => Unit,
    setControlFont: FontDescriptor => Unit,
    setDesignMode: Boolean => Unit,
    setForeground: Color => Unit,
    setPointer: XPointer => Unit,
    setProperty: (String, js.Any) => Unit
  ): XVclWindowPeer = {
    val __obj = js.Dynamic.literal(Toolkit = Toolkit.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), enableClipSiblings = js.Any.fromFunction1(enableClipSiblings), getProperty = js.Any.fromFunction1(getProperty), getStyles = js.Any.fromFunction4(getStyles), getToolkit = js.Any.fromFunction0(getToolkit), invalidate = js.Any.fromFunction1(invalidate), invalidateRect = js.Any.fromFunction2(invalidateRect), isChild = js.Any.fromFunction1(isChild), isDesignMode = js.Any.fromFunction0(isDesignMode), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setBackground = js.Any.fromFunction1(setBackground), setControlFont = js.Any.fromFunction1(setControlFont), setDesignMode = js.Any.fromFunction1(setDesignMode), setForeground = js.Any.fromFunction1(setForeground), setPointer = js.Any.fromFunction1(setPointer), setProperty = js.Any.fromFunction2(setProperty))
    __obj.asInstanceOf[XVclWindowPeer]
  }
  
  extension [Self <: XVclWindowPeer](x: Self) {
    
    inline def setEnableClipSiblings(value: Boolean => Unit): Self = StObject.set(x, "enableClipSiblings", js.Any.fromFunction1(value))
    
    inline def setGetProperty(value: String => js.Any): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
    
    inline def setGetStyles(value: (Double, js.Array[FontDescriptor], js.Array[Color], js.Array[Color]) => Unit): Self = StObject.set(x, "getStyles", js.Any.fromFunction4(value))
    
    inline def setIsChild(value: XWindowPeer => Boolean): Self = StObject.set(x, "isChild", js.Any.fromFunction1(value))
    
    inline def setIsDesignMode(value: () => Boolean): Self = StObject.set(x, "isDesignMode", js.Any.fromFunction0(value))
    
    inline def setSetControlFont(value: FontDescriptor => Unit): Self = StObject.set(x, "setControlFont", js.Any.fromFunction1(value))
    
    inline def setSetDesignMode(value: Boolean => Unit): Self = StObject.set(x, "setDesignMode", js.Any.fromFunction1(value))
    
    inline def setSetForeground(value: Color => Unit): Self = StObject.set(x, "setForeground", js.Any.fromFunction1(value))
    
    inline def setSetProperty(value: (String, js.Any) => Unit): Self = StObject.set(x, "setProperty", js.Any.fromFunction2(value))
  }
}
