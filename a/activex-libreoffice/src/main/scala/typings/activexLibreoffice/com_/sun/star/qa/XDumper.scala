package typings.activexLibreoffice.com_.sun.star.qa

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Dumps the content into a string. This is an internal interface and should not be used outside of Libreoffice source code */
@js.native
trait XDumper extends XInterface {
  
  /**
    * dump the content into a string
    * @since LibreOffice 3.6
    */
  def dump(): String = js.native
}
object XDumper {
  
  @scala.inline
  def apply(acquire: () => Unit, dump: () => String, queryInterface: `type` => js.Any, release: () => Unit): XDumper = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dump = js.Any.fromFunction0(dump), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDumper]
  }
  
  @scala.inline
  implicit class XDumperOps[Self <: XDumper] (val x: Self) extends AnyVal {
    
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
    def setDump(value: () => String): Self = this.set("dump", js.Any.fromFunction0(value))
  }
}
