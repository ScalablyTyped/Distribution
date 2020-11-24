package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service provides the means for constructing new configurations.
  *
  * Most likely use is the {@link XConfigurationController.restoreConfiguration()} method.
  * @see XConfiguration for a description of the configuration.
  */
@js.native
trait Configuration extends XConfiguration {
  
  /**
    * Create an empty configuration.
    *
    * This should not be necessary very often. Changes to an existing configuration are more likely.
    */
  def create(): Unit = js.native
}
object Configuration {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addResource: XResourceId => Unit,
    create: () => Unit,
    createClone: () => XCloneable,
    getResources: (XResourceId, String, AnchorBindingMode) => SafeArray[XResourceId],
    hasResource: XResourceId => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeResource: XResourceId => Unit
  ): Configuration = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addResource = js.Any.fromFunction1(addResource), create = js.Any.fromFunction0(create), createClone = js.Any.fromFunction0(createClone), getResources = js.Any.fromFunction3(getResources), hasResource = js.Any.fromFunction1(hasResource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeResource = js.Any.fromFunction1(removeResource))
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: () => Unit): Self = this.set("create", js.Any.fromFunction0(value))
  }
}
