package typings.activexLibreoffice.com_.sun.star.mozilla

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the interface to boot up and switch Mozilla/Thunderbird profiles
  * @see com.sun.star.mozilla.MozillaProductType
  * @see com.sun.star.mozilla.XProfileDiscover
  * @see com.sun.star.mozilla.MozillaBootstrap
  */
@js.native
trait XProfileManager extends XInterface {
  
  /**
    * attempts to get the current product.
    * @returns the current used product.
    */
  val CurrentProduct: MozillaProductType = js.native
  
  /**
    * attempts to get the current profile name.
    * @returns the current used profile.
    */
  val CurrentProfile: String = js.native
  
  /**
    * attempts to init XPCOM runtime using given profile.
    * @param product is the product to start up.
    * @param profileName the profile name to be used.
    * @returns the current reference count for the given profile.
    */
  def bootupProfile(product: MozillaProductType, profileName: String): Double = js.native
  
  /**
    * attempts to get the current product.
    * @returns the current used product.
    */
  def getCurrentProduct(): MozillaProductType = js.native
  
  /**
    * attempts to get the current profile name.
    * @returns the current used profile.
    */
  def getCurrentProfile(): String = js.native
  
  /**
    * attempts to check whether the current profile locked or not
    * @returns return sal_True is current profile is locked
    */
  def isCurrentProfileLocked(): Boolean = js.native
  
  /**
    * attempts to set the current used profile name for the given product.
    * @param product is the product to be used.
    * @param profileName the profile name to be used.
    * @returns the current used profile name for the given product.
    */
  def setCurrentProfile(product: MozillaProductType, profileName: String): String = js.native
  
  /**
    * attempts to shutdown the current profile.
    * @returns the current reference count for the current profile.
    */
  def shutdownProfile(): Double = js.native
}
object XProfileManager {
  
  @scala.inline
  def apply(
    CurrentProduct: MozillaProductType,
    CurrentProfile: String,
    acquire: () => Unit,
    bootupProfile: (MozillaProductType, String) => Double,
    getCurrentProduct: () => MozillaProductType,
    getCurrentProfile: () => String,
    isCurrentProfileLocked: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCurrentProfile: (MozillaProductType, String) => String,
    shutdownProfile: () => Double
  ): XProfileManager = {
    val __obj = js.Dynamic.literal(CurrentProduct = CurrentProduct.asInstanceOf[js.Any], CurrentProfile = CurrentProfile.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), bootupProfile = js.Any.fromFunction2(bootupProfile), getCurrentProduct = js.Any.fromFunction0(getCurrentProduct), getCurrentProfile = js.Any.fromFunction0(getCurrentProfile), isCurrentProfileLocked = js.Any.fromFunction0(isCurrentProfileLocked), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentProfile = js.Any.fromFunction2(setCurrentProfile), shutdownProfile = js.Any.fromFunction0(shutdownProfile))
    __obj.asInstanceOf[XProfileManager]
  }
  
  @scala.inline
  implicit class XProfileManagerOps[Self <: XProfileManager] (val x: Self) extends AnyVal {
    
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
    def setCurrentProduct(value: MozillaProductType): Self = this.set("CurrentProduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentProfile(value: String): Self = this.set("CurrentProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootupProfile(value: (MozillaProductType, String) => Double): Self = this.set("bootupProfile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCurrentProduct(value: () => MozillaProductType): Self = this.set("getCurrentProduct", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentProfile(value: () => String): Self = this.set("getCurrentProfile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCurrentProfileLocked(value: () => Boolean): Self = this.set("isCurrentProfileLocked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCurrentProfile(value: (MozillaProductType, String) => String): Self = this.set("setCurrentProfile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShutdownProfile(value: () => Double): Self = this.set("shutdownProfile", js.Any.fromFunction0(value))
  }
}
