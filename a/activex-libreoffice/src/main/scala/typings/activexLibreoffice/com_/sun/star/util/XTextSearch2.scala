package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables an object to search in its content. */
@js.native
trait XTextSearch2 extends XTextSearch {
  
  /** set the options for the forward or backward search. */
  def setOptions2(options: SearchOptions2): Unit = js.native
}
object XTextSearch2 {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    searchBackward: (String, Double, Double) => SearchResult,
    searchForward: (String, Double, Double) => SearchResult,
    setOptions: SearchOptions => Unit,
    setOptions2: SearchOptions2 => Unit
  ): XTextSearch2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), searchBackward = js.Any.fromFunction3(searchBackward), searchForward = js.Any.fromFunction3(searchForward), setOptions = js.Any.fromFunction1(setOptions), setOptions2 = js.Any.fromFunction1(setOptions2))
    __obj.asInstanceOf[XTextSearch2]
  }
  
  @scala.inline
  implicit class XTextSearch2Ops[Self <: XTextSearch2] (val x: Self) extends AnyVal {
    
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
    def setSetOptions2(value: SearchOptions2 => Unit): Self = this.set("setOptions2", js.Any.fromFunction1(value))
  }
}
