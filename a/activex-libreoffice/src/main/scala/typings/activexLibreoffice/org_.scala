package typings.activexLibreoffice

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object org_ {
  
  object freedesktop {
    
    object PackageKit {
      
      type SyncDbusSessionHelper = XSyncDbusSessionHelper
      
      /**
        * The interface used for modifying the package database.
        * @see https://git.gnome.org/browse/gnome-software/tree/src/org.freedesktop.PackageKit.xml for documentation of the corresponding D-Bus interface
        */
      trait XModify
        extends StObject
           with XInterface {
        
        /**
          * Installs sequence< string > packages to provide sequence< string > files.
          * @since LibreOffice 4.0
          */
        def InstallCatalogs(xid: Double, files: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs fontconfig resources ( [in] usually fonts) from a configured software source.
          * @since LibreOffice 4.0
          */
        def InstallFontconfigResources(xid: Double, resources: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs GStreamer resources ( [in] usually codecs) from a configured software source.
          * @since LibreOffice 4.0
          */
        def InstallGStreamerResources(xid: Double, resources: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs mimetype handlers from a configured software source.
          * @since LibreOffice 4.0
          */
        def InstallMimeTypes(xid: Double, mimeTypes: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs local package sequence< string > files or service packs.
          * @since LibreOffice 4.0
          */
        def InstallPackageFiles(xid: Double, files: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs sequence< string > packages from a configured software source.
          * @since LibreOffice 4.0
          */
        def InstallPackageNames(xid: Double, packages: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs printer drivers from a configured software source.
          * @since LibreOffice 4.0
          */
        def InstallPrinterDrivers(xid: Double, files: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs sequence< string > packages to provide sequence< string > files.
          * @since LibreOffice 4.0
          */
        def InstallProvideFiles(xid: Double, files: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs resources of a given type from a configured software source.
          * @since LibreOffice 4.0
          */
        def InstallResources(xid: Double, types: SeqEquiv[String], resources: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Removes sequence< string > packages that provide the given local sequence< string > files.
          * @since LibreOffice 4.0
          */
        def RemovePackageByFiles(xid: Double, files: SeqEquiv[String], interaction: String): Unit
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
        implicit class XModifyMutableBuilder[Self <: XModify] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setInstallCatalogs(value: (Double, SeqEquiv[String], String) => Unit): Self = StObject.set(x, "InstallCatalogs", js.Any.fromFunction3(value))
          
          @scala.inline
          def setInstallFontconfigResources(value: (Double, SeqEquiv[String], String) => Unit): Self = StObject.set(x, "InstallFontconfigResources", js.Any.fromFunction3(value))
          
          @scala.inline
          def setInstallGStreamerResources(value: (Double, SeqEquiv[String], String) => Unit): Self = StObject.set(x, "InstallGStreamerResources", js.Any.fromFunction3(value))
          
          @scala.inline
          def setInstallMimeTypes(value: (Double, SeqEquiv[String], String) => Unit): Self = StObject.set(x, "InstallMimeTypes", js.Any.fromFunction3(value))
          
          @scala.inline
          def setInstallPackageFiles(value: (Double, SeqEquiv[String], String) => Unit): Self = StObject.set(x, "InstallPackageFiles", js.Any.fromFunction3(value))
          
          @scala.inline
          def setInstallPackageNames(value: (Double, SeqEquiv[String], String) => Unit): Self = StObject.set(x, "InstallPackageNames", js.Any.fromFunction3(value))
          
          @scala.inline
          def setInstallPrinterDrivers(value: (Double, SeqEquiv[String], String) => Unit): Self = StObject.set(x, "InstallPrinterDrivers", js.Any.fromFunction3(value))
          
          @scala.inline
          def setInstallProvideFiles(value: (Double, SeqEquiv[String], String) => Unit): Self = StObject.set(x, "InstallProvideFiles", js.Any.fromFunction3(value))
          
          @scala.inline
          def setInstallResources(value: (Double, SeqEquiv[String], SeqEquiv[String], String) => Unit): Self = StObject.set(x, "InstallResources", js.Any.fromFunction4(value))
          
          @scala.inline
          def setRemovePackageByFiles(value: (Double, SeqEquiv[String], String) => Unit): Self = StObject.set(x, "RemovePackageByFiles", js.Any.fromFunction3(value))
        }
      }
      
      /**
        * The interface used for quering the package database.
        * @see https://git.gnome.org/browse/gnome-software/tree/src/org.freedesktop.PackageKit.xml for documentation of the corresponding D-Bus interface
        */
      trait XQuery
        extends StObject
           with XInterface {
        
        /**
          * Installs local package files or service packs.
          * @since LibreOffice 4.0
          */
        def IsInstalled(packageName: String, interaction: String, installed: js.Array[Boolean]): Unit
        
        /**
          * Installs packages to provide files.
          * @since LibreOffice 4.0
          */
        def SearchFile(fileName: String, interaction: String, installed: js.Array[Boolean], packageName: js.Array[String]): Unit
      }
      object XQuery {
        
        @scala.inline
        def apply(
          IsInstalled: (String, String, js.Array[Boolean]) => Unit,
          SearchFile: (String, String, js.Array[Boolean], js.Array[String]) => Unit,
          acquire: () => Unit,
          queryInterface: `type` => js.Any,
          release: () => Unit
        ): XQuery = {
          val __obj = js.Dynamic.literal(IsInstalled = js.Any.fromFunction3(IsInstalled), SearchFile = js.Any.fromFunction4(SearchFile), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
          __obj.asInstanceOf[XQuery]
        }
        
        @scala.inline
        implicit class XQueryMutableBuilder[Self <: XQuery] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setIsInstalled(value: (String, String, js.Array[Boolean]) => Unit): Self = StObject.set(x, "IsInstalled", js.Any.fromFunction3(value))
          
          @scala.inline
          def setSearchFile(value: (String, String, js.Array[Boolean], js.Array[String]) => Unit): Self = StObject.set(x, "SearchFile", js.Any.fromFunction4(value))
        }
      }
      
      trait XSyncDbusSessionHelper
        extends StObject
           with XModify
           with XQuery
      object XSyncDbusSessionHelper {
        
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
          IsInstalled: (String, String, js.Array[Boolean]) => Unit,
          RemovePackageByFiles: (Double, SeqEquiv[String], String) => Unit,
          SearchFile: (String, String, js.Array[Boolean], js.Array[String]) => Unit,
          acquire: () => Unit,
          queryInterface: `type` => js.Any,
          release: () => Unit
        ): XSyncDbusSessionHelper = {
          val __obj = js.Dynamic.literal(InstallCatalogs = js.Any.fromFunction3(InstallCatalogs), InstallFontconfigResources = js.Any.fromFunction3(InstallFontconfigResources), InstallGStreamerResources = js.Any.fromFunction3(InstallGStreamerResources), InstallMimeTypes = js.Any.fromFunction3(InstallMimeTypes), InstallPackageFiles = js.Any.fromFunction3(InstallPackageFiles), InstallPackageNames = js.Any.fromFunction3(InstallPackageNames), InstallPrinterDrivers = js.Any.fromFunction3(InstallPrinterDrivers), InstallProvideFiles = js.Any.fromFunction3(InstallProvideFiles), InstallResources = js.Any.fromFunction4(InstallResources), IsInstalled = js.Any.fromFunction3(IsInstalled), RemovePackageByFiles = js.Any.fromFunction3(RemovePackageByFiles), SearchFile = js.Any.fromFunction4(SearchFile), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
          __obj.asInstanceOf[XSyncDbusSessionHelper]
        }
      }
    }
  }
}
