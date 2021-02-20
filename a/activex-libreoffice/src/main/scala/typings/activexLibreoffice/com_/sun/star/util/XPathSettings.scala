package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
@js.native
trait XPathSettings extends XPropertySet {
  
  /** Specifies the directory that contains spreadsheet add-ins which use the old add-in API */
  var Addin: String = js.native
  
  /** The settings of the AutoCorrect dialog. The value can be more than one path separated by a semicolon. */
  var AutoCorrect: String = js.native
  
  /** The directory which contains the AutoText modules. The value can be more than one path separated by a semicolon. */
  var AutoText: String = js.native
  
  /** Automatic backup copies of documents are stored here. */
  var Backup: String = js.native
  
  var BasePathShareLayer: String = js.native
  
  var BasePathUserLayer: String = js.native
  
  /** The Basic files, used by the AutoPilots, can be found here. The value can be more than one path separated by a semicolon. */
  var Basic: String = js.native
  
  /** This directory contains the icons for the toolbars. */
  var Bitmap: String = js.native
  
  /** The configuration files are located here. This entry cannot be changed by the user in Office user interface. */
  var Config: String = js.native
  
  /** The provided dictionaries are stored here. */
  var Dictionary: String = js.native
  
  /** Path to save folder bookmarks */
  var Favorite: String = js.native
  
  /** Specifies the directory where all the filters are stored. */
  var Filter: String = js.native
  
  /** Specifies the directories which contains the Gallery database and multimedia files. The value can be more than one path separated by a semicolon. */
  var Gallery: String = js.native
  
  /** This directory is displayed when the dialog for opening a graphic or for saving a new graphic is called. */
  var Graphic: String = js.native
  
  /** The path to the Office help files. */
  var Help: String = js.native
  
  /** The files that are necessary for the spell check are saved here. */
  var Linguistic: String = js.native
  
  /** This is the path for the modules. */
  var Module: String = js.native
  
  /**
    * This is the path to the palette files *.SOB to *.SOF containing user-defined colors and patterns. The value can be more than one path separated by a
    * semicolon.
    */
  var Palette: String = js.native
  
  /** Plugins are saved in these directories. The value can be more than one path separated by a semicolon. */
  var Plugin: String = js.native
  
  /** Mail, News files and other information (for example, about FTP Server) are stored here. */
  var Storage: String = js.native
  
  /** The base url to the office temp-files */
  var Temp: String = js.native
  
  /** The templates originate from these folders and sub-folders. The value can be more than one path separated by a semicolon. */
  var Template: String = js.native
  
  /**
    * Global directories to look for user interface configuration files. The user interface configuration will be merged with user settings stored in the
    * directory specified by **UserConfig** . The value can be more than one path separated by a semicolon.
    */
  var UIConfig: String = js.native
  
  /** Specifies the folder with the user settings. */
  var UserConfig: String = js.native
  
  /**
    * The custom dictionaries are contained here.
    * @deprecated Deprecated
    */
  var UserDictionary: String = js.native
  
  /** The path of the work folder can be modified according to the user's needs. The path specified here can be seen in the Open or Save dialog. */
  var Work: String = js.native
}
object XPathSettings {
  
  @scala.inline
  def apply(
    Addin: String,
    AutoCorrect: String,
    AutoText: String,
    Backup: String,
    BasePathShareLayer: String,
    BasePathUserLayer: String,
    Basic: String,
    Bitmap: String,
    Config: String,
    Dictionary: String,
    Favorite: String,
    Filter: String,
    Gallery: String,
    Graphic: String,
    Help: String,
    Linguistic: String,
    Module: String,
    Palette: String,
    Plugin: String,
    PropertySetInfo: XPropertySetInfo,
    Storage: String,
    Temp: String,
    Template: String,
    UIConfig: String,
    UserConfig: String,
    UserDictionary: String,
    Work: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): XPathSettings = {
    val __obj = js.Dynamic.literal(Addin = Addin.asInstanceOf[js.Any], AutoCorrect = AutoCorrect.asInstanceOf[js.Any], AutoText = AutoText.asInstanceOf[js.Any], Backup = Backup.asInstanceOf[js.Any], BasePathShareLayer = BasePathShareLayer.asInstanceOf[js.Any], BasePathUserLayer = BasePathUserLayer.asInstanceOf[js.Any], Basic = Basic.asInstanceOf[js.Any], Bitmap = Bitmap.asInstanceOf[js.Any], Config = Config.asInstanceOf[js.Any], Dictionary = Dictionary.asInstanceOf[js.Any], Favorite = Favorite.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Gallery = Gallery.asInstanceOf[js.Any], Graphic = Graphic.asInstanceOf[js.Any], Help = Help.asInstanceOf[js.Any], Linguistic = Linguistic.asInstanceOf[js.Any], Module = Module.asInstanceOf[js.Any], Palette = Palette.asInstanceOf[js.Any], Plugin = Plugin.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Storage = Storage.asInstanceOf[js.Any], Temp = Temp.asInstanceOf[js.Any], Template = Template.asInstanceOf[js.Any], UIConfig = UIConfig.asInstanceOf[js.Any], UserConfig = UserConfig.asInstanceOf[js.Any], UserDictionary = UserDictionary.asInstanceOf[js.Any], Work = Work.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[XPathSettings]
  }
  
  @scala.inline
  implicit class XPathSettingsMutableBuilder[Self <: XPathSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddin(value: String): Self = StObject.set(x, "Addin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCorrect(value: String): Self = StObject.set(x, "AutoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoText(value: String): Self = StObject.set(x, "AutoText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackup(value: String): Self = StObject.set(x, "Backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePathShareLayer(value: String): Self = StObject.set(x, "BasePathShareLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePathUserLayer(value: String): Self = StObject.set(x, "BasePathUserLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasic(value: String): Self = StObject.set(x, "Basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitmap(value: String): Self = StObject.set(x, "Bitmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: String): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionary(value: String): Self = StObject.set(x, "Dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavorite(value: String): Self = StObject.set(x, "Favorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGallery(value: String): Self = StObject.set(x, "Gallery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphic(value: String): Self = StObject.set(x, "Graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp(value: String): Self = StObject.set(x, "Help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinguistic(value: String): Self = StObject.set(x, "Linguistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModule(value: String): Self = StObject.set(x, "Module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPalette(value: String): Self = StObject.set(x, "Palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugin(value: String): Self = StObject.set(x, "Plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: String): Self = StObject.set(x, "Storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemp(value: String): Self = StObject.set(x, "Temp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUIConfig(value: String): Self = StObject.set(x, "UIConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserConfig(value: String): Self = StObject.set(x, "UserConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDictionary(value: String): Self = StObject.set(x, "UserDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWork(value: String): Self = StObject.set(x, "Work", value.asInstanceOf[js.Any])
  }
}
