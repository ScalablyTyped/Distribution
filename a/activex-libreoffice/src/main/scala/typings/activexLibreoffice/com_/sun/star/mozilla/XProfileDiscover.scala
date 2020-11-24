package typings.activexLibreoffice.com_.sun.star.mozilla

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the interface used to list and get information for Mozilla/Thunderbird profiles
  * @see com.sun.star.mozilla.XProfileManager
  * @see com.sun.star.mozilla.MozillaBootstrap
  */
@js.native
trait XProfileDiscover extends XInterface {
  
  /**
    * attempts to get the default profile name for the given product.
    * @param product is the product name to get default profile.Currently support "Mozilla" and "Thunderbird".
    * @returns the default profile name for the given product.
    */
  def getDefaultProfile(product: MozillaProductType): String = js.native
  
  /**
    * attempts to get the profiles count.
    * @param product is the product name to get profiles count.Currently support "Mozilla" and "Thunderbird".
    * @returns the profiles count of selected product.
    */
  def getProfileCount(product: MozillaProductType): Double = js.native
  
  /**
    * return true if the given profile exists
    * @param product is the product name to get profile path.Currently support "Mozilla" and "Thunderbird".
    * @param profileName the profile name to check.
    * @returns whether given profile exists
    */
  def getProfileExists(product: MozillaProductType, profileName: String): Boolean = js.native
  
  /**
    * attempts to get the profile list for the given product.
    * @param product is the product name to get profile list.Currently support "Mozilla" and "Thunderbird".
    * @param list is a list of all profile of the given product.
    * @returns the profile count for the given product.
    */
  def getProfileList(product: MozillaProductType, list: js.Array[SeqEquiv[String]]): Double = js.native
  
  /**
    * attempts to get the full path for the given profile.
    * @param product is the product name to get profile path.Currently support "Mozilla" and "Thunderbird".
    * @param profileName the profile name to get full path.
    * @returns the full path of the given profile.
    */
  def getProfilePath(product: MozillaProductType, profileName: String): String = js.native
  
  /**
    * attempts to get whether profile is locked by other applications.
    * @param product is the product name to get profile path.Currently support "Mozilla" and "Thunderbird".
    * @param profileName the profile name to check.
    * @returns true is the given profile is locked.
    */
  def isProfileLocked(product: MozillaProductType, profileName: String): Boolean = js.native
}
object XProfileDiscover {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDefaultProfile: MozillaProductType => String,
    getProfileCount: MozillaProductType => Double,
    getProfileExists: (MozillaProductType, String) => Boolean,
    getProfileList: (MozillaProductType, js.Array[SeqEquiv[String]]) => Double,
    getProfilePath: (MozillaProductType, String) => String,
    isProfileLocked: (MozillaProductType, String) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XProfileDiscover = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDefaultProfile = js.Any.fromFunction1(getDefaultProfile), getProfileCount = js.Any.fromFunction1(getProfileCount), getProfileExists = js.Any.fromFunction2(getProfileExists), getProfileList = js.Any.fromFunction2(getProfileList), getProfilePath = js.Any.fromFunction2(getProfilePath), isProfileLocked = js.Any.fromFunction2(isProfileLocked), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XProfileDiscover]
  }
  
  @scala.inline
  implicit class XProfileDiscoverOps[Self <: XProfileDiscover] (val x: Self) extends AnyVal {
    
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
    def setGetDefaultProfile(value: MozillaProductType => String): Self = this.set("getDefaultProfile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProfileCount(value: MozillaProductType => Double): Self = this.set("getProfileCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProfileExists(value: (MozillaProductType, String) => Boolean): Self = this.set("getProfileExists", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetProfileList(value: (MozillaProductType, js.Array[SeqEquiv[String]]) => Double): Self = this.set("getProfileList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetProfilePath(value: (MozillaProductType, String) => String): Self = this.set("getProfilePath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsProfileLocked(value: (MozillaProductType, String) => Boolean): Self = this.set("isProfileLocked", js.Any.fromFunction2(value))
  }
}
