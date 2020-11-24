package typings.activexLibreoffice.com_.sun.star.uno

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Backwards-compatibility remainder of a removed library unloading feature.
  * @deprecated DeprecatedDo not use.
  */
@js.native
trait XUnloadingPreference extends XInterface {
  
  def releaseOnNotification(): Boolean = js.native
}
object XUnloadingPreference {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    releaseOnNotification: () => Boolean
  ): XUnloadingPreference = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), releaseOnNotification = js.Any.fromFunction0(releaseOnNotification))
    __obj.asInstanceOf[XUnloadingPreference]
  }
  
  @scala.inline
  implicit class XUnloadingPreferenceOps[Self <: XUnloadingPreference] (val x: Self) extends AnyVal {
    
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
    def setReleaseOnNotification(value: () => Boolean): Self = this.set("releaseOnNotification", js.Any.fromFunction0(value))
  }
}
