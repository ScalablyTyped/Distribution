package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by objects that can be linked to a {@link MasterPage} .
  * @see DrawPage
  */
trait XMasterPageTarget
  extends StObject
     with XInterface {
  
  /** @returns the {@link MasterPage} linked to this object. */
  var MasterPage: XDrawPage
  
  /** @returns the {@link MasterPage} linked to this object. */
  def getMasterPage(): XDrawPage
  
  /**
    * links a {@link MasterPage} to this object.
    * @param xMasterPage the {@link MasterPage} that is linked to this object
    */
  def setMasterPage(xMasterPage: XDrawPage): Unit
}
object XMasterPageTarget {
  
  inline def apply(
    MasterPage: XDrawPage,
    acquire: () => Unit,
    getMasterPage: () => XDrawPage,
    queryInterface: `type` => Any,
    release: () => Unit,
    setMasterPage: XDrawPage => Unit
  ): XMasterPageTarget = {
    val __obj = js.Dynamic.literal(MasterPage = MasterPage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMasterPage = js.Any.fromFunction0(getMasterPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMasterPage = js.Any.fromFunction1(setMasterPage))
    __obj.asInstanceOf[XMasterPageTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XMasterPageTarget] (val x: Self) extends AnyVal {
    
    inline def setGetMasterPage(value: () => XDrawPage): Self = StObject.set(x, "getMasterPage", js.Any.fromFunction0(value))
    
    inline def setMasterPage(value: XDrawPage): Self = StObject.set(x, "MasterPage", value.asInstanceOf[js.Any])
    
    inline def setSetMasterPage(value: XDrawPage => Unit): Self = StObject.set(x, "setMasterPage", js.Any.fromFunction1(value))
  }
}
