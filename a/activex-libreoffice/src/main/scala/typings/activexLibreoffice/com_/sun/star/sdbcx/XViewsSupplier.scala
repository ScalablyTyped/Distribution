package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for access to a container of views, typically used for a database definition object. */
trait XViewsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of views.
    * @returns the views
    */
  val Views: XNameAccess
  
  /**
    * returns the container of views.
    * @returns the views
    */
  def getViews(): XNameAccess
}
object XViewsSupplier {
  
  inline def apply(
    Views: XNameAccess,
    acquire: () => Unit,
    getViews: () => XNameAccess,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XViewsSupplier = {
    val __obj = js.Dynamic.literal(Views = Views.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getViews = js.Any.fromFunction0(getViews), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XViewsSupplier]
  }
  
  extension [Self <: XViewsSupplier](x: Self) {
    
    inline def setGetViews(value: () => XNameAccess): Self = StObject.set(x, "getViews", js.Any.fromFunction0(value))
    
    inline def setViews(value: XNameAccess): Self = StObject.set(x, "Views", value.asInstanceOf[js.Any])
  }
}
