package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by objects that can be linked to a {@link MasterPage} .
  * @see DrawPage
  */
@js.native
trait XMasterPageTarget extends XInterface {
  
  /** @returns the {@link MasterPage} linked to this object. */
  var MasterPage: XDrawPage = js.native
  
  /** @returns the {@link MasterPage} linked to this object. */
  def getMasterPage(): XDrawPage = js.native
  
  /**
    * links a {@link MasterPage} to this object.
    * @param xMasterPage the {@link MasterPage} that is linked to this object
    */
  def setMasterPage(xMasterPage: XDrawPage): Unit = js.native
}
object XMasterPageTarget {
  
  @scala.inline
  def apply(
    MasterPage: XDrawPage,
    acquire: () => Unit,
    getMasterPage: () => XDrawPage,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setMasterPage: XDrawPage => Unit
  ): XMasterPageTarget = {
    val __obj = js.Dynamic.literal(MasterPage = MasterPage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMasterPage = js.Any.fromFunction0(getMasterPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMasterPage = js.Any.fromFunction1(setMasterPage))
    __obj.asInstanceOf[XMasterPageTarget]
  }
  
  @scala.inline
  implicit class XMasterPageTargetMutableBuilder[Self <: XMasterPageTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMasterPage(value: () => XDrawPage): Self = StObject.set(x, "getMasterPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMasterPage(value: XDrawPage): Self = StObject.set(x, "MasterPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetMasterPage(value: XDrawPage => Unit): Self = StObject.set(x, "setMasterPage", js.Any.fromFunction1(value))
  }
}
