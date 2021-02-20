package typings.activexLibreoffice.com_.sun.star

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ui {
  
  /**
    * Multiplex events for context changes.
    *
    * A typical listener for context changes is the sidebar.
    */
  type ContextChangeEventMultiplexer = typings.activexLibreoffice.com_.sun.star.ui.XContextChangeEventMultiplexer
  
  /**
    * provides access to the global accelerator (aka shortcut) configuration set.
    * @since OOo 2.0
    */
  type GlobalAcceleratorConfiguration = typings.activexLibreoffice.com_.sun.star.ui.XAcceleratorConfiguration
  
  /** @since LibreOffice 4.1 */
  type ImageManager = typings.activexLibreoffice.com_.sun.star.ui.XImageManager
  
  /**
    * a service which provides information about the user interface command categories of a single module.
    *
    * Every OpenOffice.org module has an amount of commands that can be used by user interface elements. This service provides access to the user interface
    * commands that are part of a single OpenOffice.org module, like Writer or Calc.
    * @since OOo 2.0
    */
  type ModuleUICategoryDescription = typings.activexLibreoffice.com_.sun.star.container.XNameAccess
  
  /**
    * a service which provides information about the user interface commands of a single module.
    *
    * Every OpenOffice.org module has an amount of commands that can be used by user interface elements. This service provides access to the user interface
    * commands that are part of a single OpenOffice.org module, like Writer or Calc.
    * @since OOo 2.0
    */
  type ModuleUICommandDescription = typings.activexLibreoffice.com_.sun.star.container.XNameAccess
  
  /**
    * a service which provides window based information about user interface elements of a single application module.
    *
    * Every OpenOffice.org module has an amount of user interface elements that can be positioned, resized, closed and their style can be changed. This
    * service provides access to the window based information of available user interface elements which are part of a single OpenOffice.org module, like
    * Writer or Calc.
    * @since OOo 2.0
    */
  type ModuleWindowStateConfiguration = typings.activexLibreoffice.com_.sun.star.container.XNameContainer
  
  /**
    * A legacy (single-instance) service-variant of {@link theUICategoryDescription} singleton.
    * @deprecated DeprecatedUse theUICategoryDescription singleton instead.
    * @since OOo 2.0
    */
  type UICategoryDescription = typings.activexLibreoffice.com_.sun.star.container.XNameAccess
  
  /**
    * specifies a user interface configuration manager which controls all customizable user interface elements of an object.
    * @since OOo 2.0
    */
  type UIConfigurationManager = typings.activexLibreoffice.com_.sun.star.ui.XUIConfigurationManager2
  
  /**
    * specifies a user interface element factory that can create and initialize a user interface element type.
    *
    * It depends on the implementation which user interface element types can be created. It is also possible that a factory is only able to create one
    * special user interface element. User interface element factories must be registered at the single instance {@link UIElementFactoryManager} service to
    * provide access to itself.
    * @since OOo 2.0
    */
  type UIElementFactory = typings.activexLibreoffice.com_.sun.star.ui.XUIElementFactory
  
  /**
    * A legacy (single-instance) service-variant of {@link theUIElementFactoryManager} singleton.
    * @deprecated DeprecatedUse theUIElementFactoryManager singleton instead.
    * @since OOo 2.0
    */
  type UIElementFactoryManager = typings.activexLibreoffice.com_.sun.star.ui.XUIElementFactoryManager
  
  /**
    * specifies a factory which creates a window that is a container for user interface elements. Dependent on the provided arguments different window types
    * can be created. This container window must be capable of being integrated into another window (e.g. docking or floating windows).
    *
    * The specific type of the created window depends on the provided arguments.
    * @since OOo 3.1
    */
  type WindowContentFactory = typings.activexLibreoffice.com_.sun.star.lang.XSingleComponentFactory
  
  /**
    * A legacy (single-instance) service-variant of {@link theWindowContentFactoryManager} singleton.
    * @deprecated DeprecatedUse theWindowContentFactoryManager singleton instead.
    * @since LibreOffice 4.1
    */
  type WindowContentFactoryManager = typings.activexLibreoffice.com_.sun.star.lang.XSingleComponentFactory
  
  /**
    * A legacy (single-instance) service-variant of {@link theWindowStateConfiguration} singleton.
    * @deprecated DeprecatedUse theWindowStateConfiguration singleton instead.
    * @since OOo 2.0
    */
  type WindowStateConfiguration = typings.activexLibreoffice.com_.sun.star.container.XNameAccess
  
  /**
    * specifies a central user interface configuration provider which gives access to module based user interface configuration managers.
    *
    * Controls module based user interface configuration managers.
    *
    * There can only exist one user interface configuration manager for a module. A user interface configuration manager supports to get and set user
    * interface configuration data for configurable user interface elements.
    * @see ConfigurableUIElement
    * @see XUIConfigurationManager  Prior to LibreOffice 4.3, this singleton was only available as a (single-instance) ModuleUIConfigurationManagerSupplier
    * @since LibreOffice 4.3
    */
  type theModuleUIConfigurationManagerSupplier = typings.activexLibreoffice.com_.sun.star.ui.XModuleUIConfigurationManagerSupplier
  
  /**
    * a singleton which provides information about user interface command categories.
    *
    * OpenOffice.org has an amount of commands that can be used by user interface elements. Every command is member of a single category. Categories makes
    * it easier to handle to huge amount of commands provided by OpenOffice.org. This singleton is normally used by UI implementations which provides all
    * commands to a user.
    *
    * Provides access to user interface command categories of the installed modules.
    *
    * To access the user interface command categories of a module, a unique module specifier must be provided to {@link
    * com.sun.star.container.XNameAccess.getByName()} function. The module specifier can be retrieved from the {@link com.sun.star.frame.ModuleManager}
    * service. The interface provides references to com::sun:star:: {@link ui.ModuleUICommandDescription} .
    * @see com.sun.star.frame.ModuleManager Prior to LibreOffice 4.3, this singleton was only available as a (single-instance) {@link UICategoryDescription}
    * @since LibreOffice 4.3
    */
  type theUICategoryDescription = typings.activexLibreoffice.com_.sun.star.container.XNameAccess
  
  /**
    * specifies a user interface factory manager that controls all registered user interface element factories.
    *
    * Prior to LibreOffice 4.3, this singleton was only available as a (single-instance) {@link UIElementFactoryManager} service.
    * @since LibreOffice 4.3
    */
  type theUIElementFactoryManager = typings.activexLibreoffice.com_.sun.star.ui.XUIElementFactoryManager
  
  /**
    * This interface could be incomplete since I derived it from its sole place of use.
    *
    * Prior to LibreOffice 4.3, this singleton was only available as a (single-instance) {@link WindowContentFactoryManager} service.
    * @since LibreOffice 4.3
    */
  type theWindowContentFactoryManager = typings.activexLibreoffice.com_.sun.star.lang.XSingleComponentFactory
  
  /**
    * a singleton which provides window based information about user interface elements.
    *
    * OpenOffice.org has an amount of user interface elements that can be positioned, resized, closed and their style can be changed. This singleton
    * provides access to the window based information of available user interface elements which are part of OpenOffice.org modules, like Writer or Calc.
    *
    * Provides access to window based information about user interface elements of all installed application modules.
    *
    * To access the window based information of a module, a unique module specifier must be provided to {@link
    * com.sun.star.container.XNameAccess.getByName()} function. The module specifier can be retrieved from the {@link com.sun.star.frame.ModuleManager}
    * service. The interface provides references to a com::sun:star:: {@link ui.ModuleWindowStateConfiguration} .
    *
    * Prior to LibreOffice 4.3, this singleton was only available as a (single-instance) {@link WindowStateConfiguration} service.
    * @see com.sun.star.frame.ModuleManager
    * @since LibreOffice 4.3
    */
  type theWindowStateConfiguration = typings.activexLibreoffice.com_.sun.star.container.XNameAccess
}
