package typings.activexDashLibreoffice.comNs.sunNs.starNs.mozillaNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface used to list and get information for Mozilla/Thunderbird profiles
  * @see com.sun.star.mozilla.XProfileManager
  * @see com.sun.star.mozilla.MozillaBootstrap
  */
trait XProfileDiscover extends XInterface {
  /**
    * attempts to get the default profile name for the given product.
    * @param product is the product name to get default profile.Currently support "Mozilla" and "Thunderbird".
    * @returns the default profile name for the given product.
    */
  def getDefaultProfile(product: MozillaProductType): String
  /**
    * attempts to get the profiles count.
    * @param product is the product name to get profiles count.Currently support "Mozilla" and "Thunderbird".
    * @returns the profiles count of selected product.
    */
  def getProfileCount(product: MozillaProductType): Double
  /**
    * return true if the given profile exists
    * @param product is the product name to get profile path.Currently support "Mozilla" and "Thunderbird".
    * @param profileName the profile name to check.
    * @returns whether given profile exists
    */
  def getProfileExists(product: MozillaProductType, profileName: String): Boolean
  /**
    * attempts to get the profile list for the given product.
    * @param product is the product name to get profile list.Currently support "Mozilla" and "Thunderbird".
    * @param list is a list of all profile of the given product.
    * @returns the profile count for the given product.
    */
  def getProfileList(product: MozillaProductType, list: js.Array[SeqEquiv[String]]): Double
  /**
    * attempts to get the full path for the given profile.
    * @param product is the product name to get profile path.Currently support "Mozilla" and "Thunderbird".
    * @param profileName the profile name to get full path.
    * @returns the full path of the given profile.
    */
  def getProfilePath(product: MozillaProductType, profileName: String): String
  /**
    * attempts to get whether profile is locked by other applications.
    * @param product is the product name to get profile path.Currently support "Mozilla" and "Thunderbird".
    * @param profileName the profile name to check.
    * @returns true is the given profile is locked.
    */
  def isProfileLocked(product: MozillaProductType, profileName: String): Boolean
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
}

