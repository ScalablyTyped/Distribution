package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the parent of the object.
  *
  * This interface normally is only supported if the objects all have exactly one dedicated parent container.
  */
@js.native
trait XChild extends XInterface {
  
  /** grants access to the object containing this content. */
  var Parent: XInterface = js.native
  
  /** grants access to the object containing this content. */
  def getParent(): XInterface = js.native
  
  /**
    * sets the parent to this object.
    * @throws com::sun::star::lang::NoSupportException if the name of this object cannot be changed.
    */
  def setParent(Parent: XInterface): Unit = js.native
}
object XChild {
  
  @scala.inline
  def apply(
    Parent: XInterface,
    acquire: () => Unit,
    getParent: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setParent: XInterface => Unit
  ): XChild = {
    val __obj = js.Dynamic.literal(Parent = Parent.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[XChild]
  }
  
  @scala.inline
  implicit class XChildOps[Self <: XChild] (val x: Self) extends AnyVal {
    
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
    def setParent(value: XInterface): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetParent(value: () => XInterface): Self = this.set("getParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetParent(value: XInterface => Unit): Self = this.set("setParent", js.Any.fromFunction1(value))
  }
}
