package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** creates IDs which are unique within the container. */
@js.native
trait XUniqueIDFactory extends XInterface {
  
  def createUniqueID(): String = js.native
}
object XUniqueIDFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createUniqueID: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUniqueIDFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createUniqueID = js.Any.fromFunction0(createUniqueID), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUniqueIDFactory]
  }
  
  @scala.inline
  implicit class XUniqueIDFactoryMutableBuilder[Self <: XUniqueIDFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateUniqueID(value: () => String): Self = StObject.set(x, "createUniqueID", js.Any.fromFunction0(value))
  }
}
