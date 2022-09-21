package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** creates an {@link XAnyCompare} instance. */
trait XAnyCompareFactory
  extends StObject
     with XInterface {
  
  /**
    * creates an {@link XAnyCompare} instance.
    * @param PropertyName is the name of a property
    * @returns a compare interface
    */
  def createAnyCompareByName(PropertyName: String): XAnyCompare
}
object XAnyCompareFactory {
  
  inline def apply(
    acquire: () => Unit,
    createAnyCompareByName: String => XAnyCompare,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XAnyCompareFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAnyCompareByName = js.Any.fromFunction1(createAnyCompareByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAnyCompareFactory]
  }
  
  extension [Self <: XAnyCompareFactory](x: Self) {
    
    inline def setCreateAnyCompareByName(value: String => XAnyCompare): Self = StObject.set(x, "createAnyCompareByName", js.Any.fromFunction1(value))
  }
}
