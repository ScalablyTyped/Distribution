package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XAsynchronousExecutableDialog
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XDialogClosedListener
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ui {
  
  /**
    * The {@link LicenseDialog} is used to display a license text.
    * @since OOo 2.0.4
    */
  trait LicenseDialog
    extends StObject
       with XExecutableDialog {
    
    /**
      * Create a GUI using the specific parent window and focus on the given context.
      * @param xParent parent window
      * @param extensionName the display name of the extension
      * @param licenseText text to be displayed
      */
    def create(xParent: XWindow, extensionName: String, licenseText: String): Unit
  }
  object LicenseDialog {
    
    inline def apply(
      acquire: () => Unit,
      create: (XWindow, String, String) => Unit,
      execute: () => Double,
      queryInterface: `type` => Any,
      release: () => Unit,
      setTitle: String => Unit
    ): LicenseDialog = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction3(create), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
      __obj.asInstanceOf[LicenseDialog]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LicenseDialog] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: (XWindow, String, String) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * The {@link PackageManagerDialog} is used to visually manage installed packages of the user and shared installation as well as currently open
    * documents.
    * @since OOo 2.0
    */
  trait PackageManagerDialog
    extends StObject
       with XAsynchronousExecutableDialog {
    
    /**
      * Create a GUI using the specific parent window and focus on the given context.
      * @param xParent parent window
      * @param focussedContext context to be focused
      */
    def create(xParent: XWindow, focussedContext: String): Unit
    
    /**
      * Create a GUI and pass the URL of the extension which shall be installed right away. This constructor is intended for the case when unopkg is run as
      * result of clicking an extension in a file browser, etc. The extensions will always be installed for the current user.
      * @param extensionURL URL of extension
      */
    def createAndInstall(extensionURL: String): Unit
    
    /** Create a default GUI. */
    def createDefault(): Unit
  }
  object PackageManagerDialog {
    
    inline def apply(
      acquire: () => Unit,
      create: (XWindow, String) => Unit,
      createAndInstall: String => Unit,
      createDefault: () => Unit,
      queryInterface: `type` => Any,
      release: () => Unit,
      setDialogTitle: String => Unit,
      startExecuteModal: XDialogClosedListener => Unit
    ): PackageManagerDialog = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction2(create), createAndInstall = js.Any.fromFunction1(createAndInstall), createDefault = js.Any.fromFunction0(createDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDialogTitle = js.Any.fromFunction1(setDialogTitle), startExecuteModal = js.Any.fromFunction1(startExecuteModal))
      __obj.asInstanceOf[PackageManagerDialog]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageManagerDialog] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: (XWindow, String) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setCreateAndInstall(value: String => Unit): Self = StObject.set(x, "createAndInstall", js.Any.fromFunction1(value))
      
      inline def setCreateDefault(value: () => Unit): Self = StObject.set(x, "createDefault", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * The {@link UpdateRequiredDialog} is used to show a list of extensions not compatible with this office version.
    * @since OOo 3.2
    */
  trait UpdateRequiredDialog
    extends StObject
       with XExecutableDialog {
    
    /** Create a GUI using the specific parent window and focus on the given context. */
    def create(): Unit
  }
  object UpdateRequiredDialog {
    
    inline def apply(
      acquire: () => Unit,
      create: () => Unit,
      execute: () => Double,
      queryInterface: `type` => Any,
      release: () => Unit,
      setTitle: String => Unit
    ): UpdateRequiredDialog = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction0(create), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
      __obj.asInstanceOf[UpdateRequiredDialog]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateRequiredDialog] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    }
  }
}
