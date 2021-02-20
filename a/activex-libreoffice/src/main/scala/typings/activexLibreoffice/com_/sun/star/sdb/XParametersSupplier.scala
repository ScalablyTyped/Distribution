package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the access to a container of parameters, typically used for a prepared statement. */
@js.native
trait XParametersSupplier extends XInterface {
  
  /**
    * returns the container of parameters.
    * @returns the parameters
    */
  val Parameters: XIndexAccess = js.native
  
  /**
    * returns the container of parameters.
    * @returns the parameters
    */
  def getParameters(): XIndexAccess = js.native
}
object XParametersSupplier {
  
  @scala.inline
  def apply(
    Parameters: XIndexAccess,
    acquire: () => Unit,
    getParameters: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XParametersSupplier = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getParameters = js.Any.fromFunction0(getParameters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XParametersSupplier]
  }
  
  @scala.inline
  implicit class XParametersSupplierMutableBuilder[Self <: XParametersSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetParameters(value: () => XIndexAccess): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParameters(value: XIndexAccess): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
  }
}
