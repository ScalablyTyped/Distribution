package typings.activexLibreoffice.com_.sun.star

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object util {
  /**
    * describes a set of changes occurring as a batch transaction.
    * @see XChangesBatch
    * @see XChangesSet
    * @see ChangesEvent
    * @see ElementChange
    */
  type ChangesSet = typings.activexLibreoffice.LibreOffice.SeqEquiv[typings.activexLibreoffice.com_.sun.star.util.ElementChange]
  /**
    * this exception can be thrown to prevent the environment of any object from closing
    * @see XCloseListener
    */
  type CloseVetoException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  /**
    * describes an RGB color value with an optional alpha channel.
    *
    * The byte order is from high to low:  1. alpha channel 2. red 3. green 4. blue
    */
  type Color = scala.Double
  /** is thrown when an object's state does not allow to call requested functionality. */
  type InvalidStateException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  /**
    * Manage cancelable jobs
    * @see XJobManager
    */
  type JobManager = typings.activexLibreoffice.com_.sun.star.util.XJobManager
  /** This type is used for a language identifier number. */
  type Language = scala.Double
  /** is raised when attempt is made to unlock a lockable component which actually is not locked. */
  type NotLockedException = typings.activexLibreoffice.com_.sun.star.util.InvalidStateException
  /** indicates that a non-numeric string is to be converted to a number. */
  type NotNumericException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  /**
    * represents an object which can format numbers and strings.
    *
    * A {@link NumberFormatter} , if available, can be created by the global service manager.
    */
  type NumberFormatter = typings.activexLibreoffice.com_.sun.star.util.XNumberFormatter2
  /**
    * encapsulates access to the current office installation directory and office user data directory, provides functionality to create URLs containing
    * relocatable (not absolute) references to the current office installation directory and user data directory and vice versa.
    *
    * This functionality is useful when data containing references to the current office installation directory or user data directory must be made
    * persistent and re-read later. In many cases, storing the reference directly would destroy the relocatability of an office installation and the
    * possibility to share one office user data directory among parallel office installations.
    * @deprecated Deprecatedrather use the singleton theOfficeInstallationDirectories
    * @since OOo 2.0
    */
  type OfficeInstallationDirectories = typings.activexLibreoffice.com_.sun.star.util.XOfficeInstallationDirectories
  /**
    * A legacy (single-instance) service-variant of {@link thePathSettings} singleton.
    * @deprecated DeprecatedUse thePathSettings singleton instead.
    * @since OOo 1.1.2
    */
  type PathSettings = typings.activexLibreoffice.com_.sun.star.util.XPathSettings
  /**
    * A service to support the substitution and resubstitution of path variables.
    *
    * A path variable must be specified with the following syntax: "$("<variable-name>")". Path variables are not case sensitive and are always provided as
    * a UCB-compliant URLs (for example: "file:///c:/temp" or "file:///usr/install"). This is mandatory to support an optional remote file system. ;  There
    * is a set of variables that have pre-defined values:
    *
    * **$(inst) **: Installation path of the Office.
    *
    * **$(prog) **: Program path of the Office.
    *
    * **$(user) **: The user installation directory.
    *
    * **$(work) **: The work directory of the user. Under Windows this would be the "MyDocuments" subdirectory. Under Unix this would be the home-directory
    *
    * **$(home) **: The home directory of the user. Under Unix this would be the home- directory. Under Windows this would be the CSIDL_PERSONAL directory,
    * for example "Documents and Settings\<username>\Documents".
    *
    * **$(temp) **: The current temporary directory.
    *
    * **$(path) **: The value of PATH environment variable.
    *
    * **$(username) **: The username (login name) of the currently active user, excluding the domain name on Windows. (Available since LibreOffice 5.2)
    *
    * **$(langid) **: The language code used by the Office, like 0x0009=English, 0x0409=English US.
    *
    * **$(vlang) **: The language used by the Office as a string. Like "German" for a German Office.
    *
    *
    *
    * Attention: Most predefined variables describe an absolute path. The only exceptions are: $(username), $(langid) and $(vlang). Therefore the service
    * implementation should only substitute variables which are located at the start of a provided path string or are part of a multi-path. This special
    * service is not designed to be a text substiution but shall provide (a) valid substituted path(s).
    * @since OOo 1.1.2
    */
  type PathSubstitution = typings.activexLibreoffice.com_.sun.star.util.XStringSubstitution
  /**
    * gives access to the properties of a sort descriptor. The properties are given in a sequence of PropertyValue.
    *
    * The available properties are listed in the specific sort descriptor implementing this service.
    * @see XSortable
    * @see com.sun.star.table.TableSortDescriptor2
    * @see com.sun.star.text.TextSortDescriptor2
    * @since OOo 1.1.2
    */
  type SortDescriptor2 = js.Any
  /**
    * provides an interface for sorting.
    * @deprecated Deprecated
    * @since OOo 1.1.2
    */
  type Sortable = typings.activexLibreoffice.com_.sun.star.util.XSortable
  /**
    * search a string with a defined algorithm in another string.
    *
    * It is possible to search forward or backward in the string.
    */
  type TextSearch = typings.activexLibreoffice.com_.sun.star.util.XTextSearch
  /**
    * search a string with a defined algorithm in another string.
    *
    * It is possible to search forward or backward in the string.
    */
  type TextSearch2 = typings.activexLibreoffice.com_.sun.star.util.XTextSearch2
  /** helps to split up a string containing a {@link URL} into its structural parts and assembles the parts into a single string. */
  type URLTransformer = typings.activexLibreoffice.com_.sun.star.util.XURLTransformer
  /**
    * Abbreviate arbitrary URIs.
    *
    * An abbreviation implementation that is specialized to URIs.
    * @see XStringAbbreviation
    */
  type UriAbbreviation = typings.activexLibreoffice.com_.sun.star.util.XStringAbbreviation
  /**
    * thrown to indicate a general veto.
    * @since OOo 1.1.2
    */
  type VetoException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  /**
    * A service that has to deal with macrofied strings will preprocess those strings using the macro expander singleton. The macro expander singleton is
    * deployed with the application.
    *
    * This feature is currently used macrofying loader urls with macros defined in uno.ini/unorc bootstrap files. The component loader uses the macro
    * expander singleton to expand those macros. This is a flexible way preprocessing loader urls.
    * @see MacroExpander
    */
  type theMacroExpander = typings.activexLibreoffice.com_.sun.star.util.XMacroExpander
  /**
    * encapsulates access to the current office installation directory and office user data directory, provides functionality to create URLs containing
    * relocatable (not absolute) references to the current office installation directory and user data directory and vice versa.
    *
    * This functionality is useful when data containing references to the current office installation directory or user data directory must be made
    * persistent and re-read later. In many cases, storing the reference directly would destroy the relocatability of an office installation and the
    * possibility to share one office user data directory among parallel office installations.
    */
  type theOfficeInstallationDirectories = typings.activexLibreoffice.com_.sun.star.util.XOfficeInstallationDirectories
  /**
    * Supports read/write access and listener for the paths properties that the Office uses.
    *
    * The property names of the Office paths/directories are an exactly match to the configuration entries found in the file
    * (org/openoffice/Office/Common.xml). ;  This service supports the usage of path variables to define paths that a relative to other office or system
    * directories. See {@link PathSubstitution}
    *
    * Prior to LibreOffice 4.3, this singleton was only available as a (single-instance) {@link PathSettings} service.
    * @since LibreOffice 4.3
    */
  type thePathSettings = typings.activexLibreoffice.com_.sun.star.util.XPathSettings
}
