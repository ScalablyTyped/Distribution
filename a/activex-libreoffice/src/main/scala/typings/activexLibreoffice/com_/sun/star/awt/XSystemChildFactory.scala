package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a factory interface for creating system child windows. */
@js.native
trait XSystemChildFactory extends XInterface {
  
  /**
    * creates a system child window.
    * @param Parent a system-specific handle to a window.  You must check the machine ID and the process ID. ;  WIN32: HWND. ;  WIN16: HWND. ;   JAVA: global
    * @param ProcessId Ignored.
    * @param SystemType one constant out of the constant group {@link com.sun.star.lang.SystemDependent} .
    * @returns the created window.
    */
  def createSystemChild(Parent: js.Any, ProcessId: SeqEquiv[Double], SystemType: Double): XWindowPeer = js.native
}
object XSystemChildFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createSystemChild: (js.Any, SeqEquiv[Double], Double) => XWindowPeer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSystemChildFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createSystemChild = js.Any.fromFunction3(createSystemChild), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSystemChildFactory]
  }
  
  @scala.inline
  implicit class XSystemChildFactoryOps[Self <: XSystemChildFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateSystemChild(value: (js.Any, SeqEquiv[Double], Double) => XWindowPeer): Self = this.set("createSystemChild", js.Any.fromFunction3(value))
  }
}
