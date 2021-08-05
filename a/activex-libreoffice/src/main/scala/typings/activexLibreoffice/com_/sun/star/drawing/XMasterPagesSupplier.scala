package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** must be supported to provide access to the {@link MasterPages} of a multi-page drawing-layer. */
trait XMasterPagesSupplier
  extends StObject
     with XInterface {
  
  /** @returns an indexed container with the service {@link MasterPages} . */
  val MasterPages: XDrawPages
  
  /** @returns an indexed container with the service {@link MasterPages} . */
  def getMasterPages(): XDrawPages
}
object XMasterPagesSupplier {
  
  inline def apply(
    MasterPages: XDrawPages,
    acquire: () => Unit,
    getMasterPages: () => XDrawPages,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMasterPagesSupplier = {
    val __obj = js.Dynamic.literal(MasterPages = MasterPages.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMasterPages = js.Any.fromFunction0(getMasterPages), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMasterPagesSupplier]
  }
  
  extension [Self <: XMasterPagesSupplier](x: Self) {
    
    inline def setGetMasterPages(value: () => XDrawPages): Self = StObject.set(x, "getMasterPages", js.Any.fromFunction0(value))
    
    inline def setMasterPages(value: XDrawPages): Self = StObject.set(x, "MasterPages", value.asInstanceOf[js.Any])
  }
}
