package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * encapsulates access to the current office installation directory and office user data directory, provides functionality to create URLs containing
  * relocatable (not absolute) references to the current office installation directory and user data directory and vice versa.
  *
  * This functionality is useful when data containing references to the current office installation directory must be made persistent and re-read later.
  * In many cases, storing the reference directly would destroy the relocatability of an office installation.
  * @since OOo 2.0
  */
@js.native
trait XOfficeInstallationDirectories extends XInterface {
  
  /**
    * returns the absolute {@link URL} containing the directory of the current office installation (for example "file:///opt/LibreOffice")
    * @returns the absolute {@link URL} containing the directory of the current office installation.
    */
  val OfficeInstallationDirectoryURL: String = js.native
  
  /**
    * returns the absolute {@link URL} containing the directory where the current office installation expects its user data (for example
    * "file:///home/kso/.config/libreoffice/4")
    * @returns the absolute {@link URL} containing the directory of the current office user data.
    */
  val OfficeUserDataDirectoryURL: String = js.native
  
  /**
    * returns the absolute {@link URL} containing the directory of the current office installation (for example "file:///opt/LibreOffice")
    * @returns the absolute {@link URL} containing the directory of the current office installation.
    */
  def getOfficeInstallationDirectoryURL(): String = js.native
  
  /**
    * returns the absolute {@link URL} containing the directory where the current office installation expects its user data (for example
    * "file:///home/kso/.config/libreoffice/4")
    * @returns the absolute {@link URL} containing the directory of the current office user data.
    */
  def getOfficeUserDataDirectoryURL(): String = js.native
  
  /**
    * the counterpart of `makeRelocatableURL` .
    *
    * If the given {@link URL} contains a placeholder for an absolute reference to the current office installation directory or for the office user data
    * directory, that was created using `makeRelocatableURL` , the respective placeholder will be replaced by an absolute reference to the current office
    * installation directory or office user data directory.
    * @param URL The {@link URL} for that an absolute {@link URL} is requested. In case the {@link URL} does not contain the opaque relocation placeholder use
    * @returns The absolute {@link URL} .
    */
  def makeAbsoluteURL(URL: String): String = js.native
  
  /**
    * calculates a relocatable {@link URL} from the given {@link URL} .
    *
    * If the given {@link URL} contains an absolute reference to the current office installation directory or office user data directory, this method will
    * replace the absolute reference by an opaque placeholder string. `makeRelocatableURL` must be used in order to re-replace the placeholder by an
    * absolute reference.
    * @param URL The {@link URL} for that a relocatable {@link URL} is requested. In case the {@link URL} does not contain a reference to the current office i
    * @returns The relocatable {@link URL} .
    */
  def makeRelocatableURL(URL: String): String = js.native
}
object XOfficeInstallationDirectories {
  
  @scala.inline
  def apply(
    OfficeInstallationDirectoryURL: String,
    OfficeUserDataDirectoryURL: String,
    acquire: () => Unit,
    getOfficeInstallationDirectoryURL: () => String,
    getOfficeUserDataDirectoryURL: () => String,
    makeAbsoluteURL: String => String,
    makeRelocatableURL: String => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XOfficeInstallationDirectories = {
    val __obj = js.Dynamic.literal(OfficeInstallationDirectoryURL = OfficeInstallationDirectoryURL.asInstanceOf[js.Any], OfficeUserDataDirectoryURL = OfficeUserDataDirectoryURL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getOfficeInstallationDirectoryURL = js.Any.fromFunction0(getOfficeInstallationDirectoryURL), getOfficeUserDataDirectoryURL = js.Any.fromFunction0(getOfficeUserDataDirectoryURL), makeAbsoluteURL = js.Any.fromFunction1(makeAbsoluteURL), makeRelocatableURL = js.Any.fromFunction1(makeRelocatableURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XOfficeInstallationDirectories]
  }
  
  @scala.inline
  implicit class XOfficeInstallationDirectoriesOps[Self <: XOfficeInstallationDirectories] (val x: Self) extends AnyVal {
    
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
    def setOfficeInstallationDirectoryURL(value: String): Self = this.set("OfficeInstallationDirectoryURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeUserDataDirectoryURL(value: String): Self = this.set("OfficeUserDataDirectoryURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetOfficeInstallationDirectoryURL(value: () => String): Self = this.set("getOfficeInstallationDirectoryURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOfficeUserDataDirectoryURL(value: () => String): Self = this.set("getOfficeUserDataDirectoryURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMakeAbsoluteURL(value: String => String): Self = this.set("makeAbsoluteURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMakeRelocatableURL(value: String => String): Self = this.set("makeRelocatableURL", js.Any.fromFunction1(value))
  }
}
