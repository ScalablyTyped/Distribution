package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * enables access to the panes in a view.
  * @deprecated Deprecated
  */
@js.native
trait XViewPanesSupplier extends XInterface {
  
  /** returns the collection of panes in the view. */
  val ViewPanes: XIndexAccess = js.native
  
  /** returns the collection of panes in the view. */
  def getViewPanes(): XIndexAccess = js.native
}
object XViewPanesSupplier {
  
  @scala.inline
  def apply(
    ViewPanes: XIndexAccess,
    acquire: () => Unit,
    getViewPanes: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XViewPanesSupplier = {
    val __obj = js.Dynamic.literal(ViewPanes = ViewPanes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getViewPanes = js.Any.fromFunction0(getViewPanes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XViewPanesSupplier]
  }
  
  @scala.inline
  implicit class XViewPanesSupplierMutableBuilder[Self <: XViewPanesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetViewPanes(value: () => XIndexAccess): Self = StObject.set(x, "getViewPanes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setViewPanes(value: XIndexAccess): Self = StObject.set(x, "ViewPanes", value.asInstanceOf[js.Any])
  }
}
