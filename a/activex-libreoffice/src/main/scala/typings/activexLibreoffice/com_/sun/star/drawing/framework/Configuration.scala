package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service provides the means for constructing new configurations.
  *
  * Most likely use is the {@link XConfigurationController.restoreConfiguration()} method.
  * @see XConfiguration for a description of the configuration.
  */
trait Configuration
  extends StObject
     with XConfiguration {
  
  /**
    * Create an empty configuration.
    *
    * This should not be necessary very often. Changes to an existing configuration are more likely.
    */
  def create(): Unit
}
object Configuration {
  
  inline def apply(
    acquire: () => Unit,
    addResource: XResourceId => Unit,
    create: () => Unit,
    createClone: () => XCloneable,
    getResources: (XResourceId, String, AnchorBindingMode) => SafeArray[XResourceId],
    hasResource: XResourceId => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeResource: XResourceId => Unit
  ): Configuration = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addResource = js.Any.fromFunction1(addResource), create = js.Any.fromFunction0(create), createClone = js.Any.fromFunction0(createClone), getResources = js.Any.fromFunction3(getResources), hasResource = js.Any.fromFunction1(hasResource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeResource = js.Any.fromFunction1(removeResource))
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}
