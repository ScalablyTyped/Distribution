package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a factory interface for creating system child windows. */
trait XSystemChildFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a system child window.
    * @param Parent a system-specific handle to a window.  You must check the machine ID and the process ID. ;  WIN32: HWND. ;  WIN16: HWND. ;   JAVA: global
    * @param ProcessId Ignored.
    * @param SystemType one constant out of the constant group {@link com.sun.star.lang.SystemDependent} .
    * @returns the created window.
    */
  def createSystemChild(Parent: Any, ProcessId: SeqEquiv[Double], SystemType: Double): XWindowPeer
}
object XSystemChildFactory {
  
  inline def apply(
    acquire: () => Unit,
    createSystemChild: (Any, SeqEquiv[Double], Double) => XWindowPeer,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XSystemChildFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createSystemChild = js.Any.fromFunction3(createSystemChild), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSystemChildFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSystemChildFactory] (val x: Self) extends AnyVal {
    
    inline def setCreateSystemChild(value: (Any, SeqEquiv[Double], Double) => XWindowPeer): Self = StObject.set(x, "createSystemChild", js.Any.fromFunction3(value))
  }
}
