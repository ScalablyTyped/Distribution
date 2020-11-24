package typings.activexLibreoffice.org_.freedesktop.PackageKit

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface used for modifying the package database.
  * @see https://git.gnome.org/browse/gnome-software/tree/src/org.freedesktop.PackageKit.xml for documentation of the corresponding D-Bus interface
  */
@js.native
trait XModify extends XInterface {
  
  /**
    * Installs sequence< string > packages to provide sequence< string > files.
    * @since LibreOffice 4.0
    */
  def InstallCatalogs(xid: Double, files: SeqEquiv[String], interaction: String): Unit = js.native
  
  /**
    * Installs fontconfig resources ( [in] usually fonts) from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallFontconfigResources(xid: Double, resources: SeqEquiv[String], interaction: String): Unit = js.native
  
  /**
    * Installs GStreamer resources ( [in] usually codecs) from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallGStreamerResources(xid: Double, resources: SeqEquiv[String], interaction: String): Unit = js.native
  
  /**
    * Installs mimetype handlers from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallMimeTypes(xid: Double, mimeTypes: SeqEquiv[String], interaction: String): Unit = js.native
  
  /**
    * Installs local package sequence< string > files or service packs.
    * @since LibreOffice 4.0
    */
  def InstallPackageFiles(xid: Double, files: SeqEquiv[String], interaction: String): Unit = js.native
  
  /**
    * Installs sequence< string > packages from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallPackageNames(xid: Double, packages: SeqEquiv[String], interaction: String): Unit = js.native
  
  /**
    * Installs printer drivers from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallPrinterDrivers(xid: Double, files: SeqEquiv[String], interaction: String): Unit = js.native
  
  /**
    * Installs sequence< string > packages to provide sequence< string > files.
    * @since LibreOffice 4.0
    */
  def InstallProvideFiles(xid: Double, files: SeqEquiv[String], interaction: String): Unit = js.native
  
  /**
    * Installs resources of a given type from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallResources(xid: Double, types: SeqEquiv[String], resources: SeqEquiv[String], interaction: String): Unit = js.native
  
  /**
    * Removes sequence< string > packages that provide the given local sequence< string > files.
    * @since LibreOffice 4.0
    */
  def RemovePackageByFiles(xid: Double, files: SeqEquiv[String], interaction: String): Unit = js.native
}
object XModify {
  
  @scala.inline
  def apply(
    InstallCatalogs: (Double, SeqEquiv[String], String) => Unit,
    InstallFontconfigResources: (Double, SeqEquiv[String], String) => Unit,
    InstallGStreamerResources: (Double, SeqEquiv[String], String) => Unit,
    InstallMimeTypes: (Double, SeqEquiv[String], String) => Unit,
    InstallPackageFiles: (Double, SeqEquiv[String], String) => Unit,
    InstallPackageNames: (Double, SeqEquiv[String], String) => Unit,
    InstallPrinterDrivers: (Double, SeqEquiv[String], String) => Unit,
    InstallProvideFiles: (Double, SeqEquiv[String], String) => Unit,
    InstallResources: (Double, SeqEquiv[String], SeqEquiv[String], String) => Unit,
    RemovePackageByFiles: (Double, SeqEquiv[String], String) => Unit,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XModify = {
    val __obj = js.Dynamic.literal(InstallCatalogs = js.Any.fromFunction3(InstallCatalogs), InstallFontconfigResources = js.Any.fromFunction3(InstallFontconfigResources), InstallGStreamerResources = js.Any.fromFunction3(InstallGStreamerResources), InstallMimeTypes = js.Any.fromFunction3(InstallMimeTypes), InstallPackageFiles = js.Any.fromFunction3(InstallPackageFiles), InstallPackageNames = js.Any.fromFunction3(InstallPackageNames), InstallPrinterDrivers = js.Any.fromFunction3(InstallPrinterDrivers), InstallProvideFiles = js.Any.fromFunction3(InstallProvideFiles), InstallResources = js.Any.fromFunction4(InstallResources), RemovePackageByFiles = js.Any.fromFunction3(RemovePackageByFiles), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XModify]
  }
  
  @scala.inline
  implicit class XModifyOps[Self <: XModify] (val x: Self) extends AnyVal {
    
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
    def setInstallCatalogs(value: (Double, SeqEquiv[String], String) => Unit): Self = this.set("InstallCatalogs", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInstallFontconfigResources(value: (Double, SeqEquiv[String], String) => Unit): Self = this.set("InstallFontconfigResources", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInstallGStreamerResources(value: (Double, SeqEquiv[String], String) => Unit): Self = this.set("InstallGStreamerResources", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInstallMimeTypes(value: (Double, SeqEquiv[String], String) => Unit): Self = this.set("InstallMimeTypes", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInstallPackageFiles(value: (Double, SeqEquiv[String], String) => Unit): Self = this.set("InstallPackageFiles", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInstallPackageNames(value: (Double, SeqEquiv[String], String) => Unit): Self = this.set("InstallPackageNames", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInstallPrinterDrivers(value: (Double, SeqEquiv[String], String) => Unit): Self = this.set("InstallPrinterDrivers", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInstallProvideFiles(value: (Double, SeqEquiv[String], String) => Unit): Self = this.set("InstallProvideFiles", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInstallResources(value: (Double, SeqEquiv[String], SeqEquiv[String], String) => Unit): Self = this.set("InstallResources", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRemovePackageByFiles(value: (Double, SeqEquiv[String], String) => Unit): Self = this.set("RemovePackageByFiles", js.Any.fromFunction3(value))
  }
}
