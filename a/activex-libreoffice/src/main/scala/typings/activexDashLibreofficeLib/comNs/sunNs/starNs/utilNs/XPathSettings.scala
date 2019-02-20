package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XPathSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** Specifies the directory that contains spreadsheet add-ins which use the old add-in API */
  var Addin: java.lang.String
  /** The settings of the AutoCorrect dialog. The value can be more than one path separated by a semicolon. */
  var AutoCorrect: java.lang.String
  /** The directory which contains the AutoText modules. The value can be more than one path separated by a semicolon. */
  var AutoText: java.lang.String
  /** Automatic backup copies of documents are stored here. */
  var Backup: java.lang.String
  var BasePathShareLayer: java.lang.String
  var BasePathUserLayer: java.lang.String
  /** The Basic files, used by the AutoPilots, can be found here. The value can be more than one path separated by a semicolon. */
  var Basic: java.lang.String
  /** This directory contains the icons for the toolbars. */
  var Bitmap: java.lang.String
  /** The configuration files are located here. This entry cannot be changed by the user in Office user interface. */
  var Config: java.lang.String
  /** The provided dictionaries are stored here. */
  var Dictionary: java.lang.String
  /** Path to save folder bookmarks */
  var Favorite: java.lang.String
  /** Specifies the directory where all the filters are stored. */
  var Filter: java.lang.String
  /** Specifies the directories which contains the Gallery database and multimedia files. The value can be more than one path separated by a semicolon. */
  var Gallery: java.lang.String
  /** This directory is displayed when the dialog for opening a graphic or for saving a new graphic is called. */
  var Graphic: java.lang.String
  /** The path to the Office help files. */
  var Help: java.lang.String
  /** The files that are necessary for the spell check are saved here. */
  var Linguistic: java.lang.String
  /** This is the path for the modules. */
  var Module: java.lang.String
  /**
    * This is the path to the palette files *.SOB to *.SOF containing user-defined colors and patterns. The value can be more than one path separated by a
    * semicolon.
    */
  var Palette: java.lang.String
  /** Plugins are saved in these directories. The value can be more than one path separated by a semicolon. */
  var Plugin: java.lang.String
  /** Mail, News files and other information (for example, about FTP Server) are stored here. */
  var Storage: java.lang.String
  /** The base url to the office temp-files */
  var Temp: java.lang.String
  /** The templates originate from these folders and sub-folders. The value can be more than one path separated by a semicolon. */
  var Template: java.lang.String
  /**
    * Global directories to look for user interface configuration files. The user interface configuration will be merged with user settings stored in the
    * directory specified by **UserConfig** . The value can be more than one path separated by a semicolon.
    */
  var UIConfig: java.lang.String
  /** Specifies the folder with the user settings. */
  var UserConfig: java.lang.String
  /**
    * The custom dictionaries are contained here.
    * @deprecated Deprecated
    */
  var UserDictionary: java.lang.String
  /** The path of the work folder can be modified according to the user's needs. The path specified here can be seen in the Open or Save dialog. */
  var Work: java.lang.String
}

