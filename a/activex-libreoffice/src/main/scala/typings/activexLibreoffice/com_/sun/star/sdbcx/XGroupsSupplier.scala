package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for access to a container of groups, typically used for a database definition object. */
trait XGroupsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of groups.
    * @returns the groups
    */
  val Groups: XNameAccess
  
  /**
    * returns the container of groups.
    * @returns the groups
    */
  def getGroups(): XNameAccess
}
object XGroupsSupplier {
  
  inline def apply(
    Groups: XNameAccess,
    acquire: () => Unit,
    getGroups: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGroupsSupplier = {
    val __obj = js.Dynamic.literal(Groups = Groups.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGroups = js.Any.fromFunction0(getGroups), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGroupsSupplier]
  }
  
  extension [Self <: XGroupsSupplier](x: Self) {
    
    inline def setGetGroups(value: () => XNameAccess): Self = StObject.set(x, "getGroups", js.Any.fromFunction0(value))
    
    inline def setGroups(value: XNameAccess): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
  }
}
