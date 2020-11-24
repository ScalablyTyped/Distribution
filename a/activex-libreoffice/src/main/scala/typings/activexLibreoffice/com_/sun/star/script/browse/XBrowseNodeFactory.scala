package typings.activexLibreoffice.com_.sun.star.script.browse

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface provides a factory for obtaining objects implementing the {@link XBrowseNode} interface. */
@js.native
trait XBrowseNodeFactory extends XInterface {
  
  /**
    * a factory method for the creation of XBrowseNodes ( view ) {@link com.sun.star.script.browse.BrowseNodeFactoryViewTypes} specifies the type of view to
    * be returned
    * @returns an object implementing {@link com.sun.star.script.browse.XBrowseNode}
    */
  def createView(viewType: Double): XBrowseNode = js.native
}
object XBrowseNodeFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createView: Double => XBrowseNode,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBrowseNodeFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createView = js.Any.fromFunction1(createView), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBrowseNodeFactory]
  }
  
  @scala.inline
  implicit class XBrowseNodeFactoryOps[Self <: XBrowseNodeFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateView(value: Double => XBrowseNode): Self = this.set("createView", js.Any.fromFunction1(value))
  }
}
