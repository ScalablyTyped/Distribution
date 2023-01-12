package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mozilla {
  
  /** Explains properties of a menu item */
  trait MenuMultipleChange extends StObject {
    
    /** unique ID of the group this menu item belongs to */
    var GroupID: Double
    
    /** unique ID of this menu item */
    var ID: Double
    
    /** sequence of bytes representing a possible image */
    var Image: SafeArray[Double]
    
    /** true if active, so clickable */
    var IsActive: Boolean
    
    /** true if checkable, so there can be a checkmark */
    var IsCheckable: Boolean
    
    /** true if there is a checkmark */
    var IsChecked: Boolean
    
    /** true if visible */
    var IsVisible: Boolean
    
    /** text of the menu item */
    var ItemText: String
    
    /** unique ID of the item directly above this menu item, used for fuzzy placement */
    var PreItemID: Double
  }
  object MenuMultipleChange {
    
    inline def apply(
      GroupID: Double,
      ID: Double,
      Image: SafeArray[Double],
      IsActive: Boolean,
      IsCheckable: Boolean,
      IsChecked: Boolean,
      IsVisible: Boolean,
      ItemText: String,
      PreItemID: Double
    ): MenuMultipleChange = {
      val __obj = js.Dynamic.literal(GroupID = GroupID.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], IsCheckable = IsCheckable.asInstanceOf[js.Any], IsChecked = IsChecked.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], ItemText = ItemText.asInstanceOf[js.Any], PreItemID = PreItemID.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuMultipleChange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuMultipleChange] (val x: Self) extends AnyVal {
      
      inline def setGroupID(value: Double): Self = StObject.set(x, "GroupID", value.asInstanceOf[js.Any])
      
      inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setImage(value: SafeArray[Double]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "IsActive", value.asInstanceOf[js.Any])
      
      inline def setIsCheckable(value: Boolean): Self = StObject.set(x, "IsCheckable", value.asInstanceOf[js.Any])
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "IsChecked", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "IsVisible", value.asInstanceOf[js.Any])
      
      inline def setItemText(value: String): Self = StObject.set(x, "ItemText", value.asInstanceOf[js.Any])
      
      inline def setPreItemID(value: Double): Self = StObject.set(x, "PreItemID", value.asInstanceOf[js.Any])
    }
  }
  
  /** Allows to execute dispatch for a menu item and handles listeners for changes in menu items. */
  type MenuProxy = XMenuProxy
  
  /** Listens for changes in menu items. */
  type MenuProxyListener = XMenuProxyListener
  
  /** Explains a change for a menu item */
  trait MenuSingleChange extends StObject {
    
    /** value of change */
    var Change: Any
    
    /** ID identifying the type of change in the any type change */
    var ChangeID: Double
    
    /** unique ID of this menu item */
    var ID: Double
  }
  object MenuSingleChange {
    
    inline def apply(Change: Any, ChangeID: Double, ID: Double): MenuSingleChange = {
      val __obj = js.Dynamic.literal(Change = Change.asInstanceOf[js.Any], ChangeID = ChangeID.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuSingleChange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuSingleChange] (val x: Self) extends AnyVal {
      
      inline def setChange(value: Any): Self = StObject.set(x, "Change", value.asInstanceOf[js.Any])
      
      inline def setChangeID(value: Double): Self = StObject.set(x, "ChangeID", value.asInstanceOf[js.Any])
      
      inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Allow to discover Mozilla/Thunderbird profiles Allow init Mozilla XPCOM using selected profile and switch profiles.
    * @see XMozillaBootstrap
    */
  type MozillaBootstrap = XMozillaBootstrap
  
  /** Mozilla Product Types */
  /* Rewritten from type alias, can be one of: 
    - typings.activexLibreoffice.activexLibreofficeInts.`0`
    - typings.activexLibreoffice.activexLibreofficeInts.`2`
    - typings.activexLibreoffice.activexLibreofficeInts.`1`
    - typings.activexLibreoffice.activexLibreofficeInts.`3`
  */
  trait MozillaProductType extends StObject
  object MozillaProductType {
    
    /** Any product */
    inline def Default: `0` = 0.asInstanceOf[`0`]
    
    /** Mozilla's next generation web browser. */
    inline def Firefox: `2` = 2.asInstanceOf[`2`]
    
    /** Mozilla browse and mail suite */
    inline def Mozilla: `1` = 1.asInstanceOf[`1`]
    
    /** Mozilla's next generation e-mail client. */
    inline def Thunderbird: `3` = 3.asInstanceOf[`3`]
  }
  
  /** Listener for closing of the corresponding session. */
  trait XCloseSessionListener
    extends StObject
       with XInterface {
    
    /**
      * Notifies a closesession listener that the corresponding session was logged out
      * @param sessionData [in]: the data identifying the session that was closed
      */
    def sessionClosed(sessionData: Any): Unit
  }
  object XCloseSessionListener {
    
    inline def apply(
      acquire: () => Unit,
      queryInterface: `type` => Any,
      release: () => Unit,
      sessionClosed: Any => Unit
    ): XCloseSessionListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), sessionClosed = js.Any.fromFunction1(sessionClosed))
      __obj.asInstanceOf[XCloseSessionListener]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XCloseSessionListener] (val x: Self) extends AnyVal {
      
      inline def setSessionClosed(value: Any => Unit): Self = StObject.set(x, "sessionClosed", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * is the interface to run Mozilla XPCOM code to run Mozilla XPCOM code in OOo,you should first implement this interface, then pass this object to
    * xProxyRunner->Run
    * @see XProxyRunner
    * @see XMozillaBootstrap
    */
  trait XCodeProxy
    extends StObject
       with XInterface {
    
    /** which Mozilla product this code is write for */
    val ProductType: MozillaProductType
    
    /** which Mozilla profile this code will use */
    val ProfileName: String
    
    /** which Mozilla product this code is write for */
    def getProductType(): MozillaProductType
    
    /** which Mozilla profile this code will use */
    def getProfileName(): String
    
    /** all Mozilla XPCOM code must be called in {@link run()} or functions called by {@link run()} */
    def run(): Double
  }
  object XCodeProxy {
    
    inline def apply(
      ProductType: MozillaProductType,
      ProfileName: String,
      acquire: () => Unit,
      getProductType: () => MozillaProductType,
      getProfileName: () => String,
      queryInterface: `type` => Any,
      release: () => Unit,
      run: () => Double
    ): XCodeProxy = {
      val __obj = js.Dynamic.literal(ProductType = ProductType.asInstanceOf[js.Any], ProfileName = ProfileName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getProductType = js.Any.fromFunction0(getProductType), getProfileName = js.Any.fromFunction0(getProfileName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[XCodeProxy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XCodeProxy] (val x: Self) extends AnyVal {
      
      inline def setGetProductType(value: () => MozillaProductType): Self = StObject.set(x, "getProductType", js.Any.fromFunction0(value))
      
      inline def setGetProfileName(value: () => String): Self = StObject.set(x, "getProfileName", js.Any.fromFunction0(value))
      
      inline def setProductType(value: MozillaProductType): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
      
      inline def setProfileName(value: String): Self = StObject.set(x, "ProfileName", value.asInstanceOf[js.Any])
      
      inline def setRun(value: () => Double): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    }
  }
  
  /** Allows to execute dispatch for a menu item and handles listeners for changes in menu items. */
  trait XMenuProxy
    extends StObject
       with XComponent {
    
    /**
      * Registers an event listener, which will be called when the menu changes
      * @param xListener [in]: the listener to be set
      */
    def addMenuProxyListener(xListener: XMenuProxyListener): Unit
    
    /**
      * Executes dispatch for the given menu id
      * @param ID [in]: the menu item
      */
    def executeMenuItem(ID: Double): Unit
    
    /**
      * Unregisters an event listener which was registered with {@link XMenuProxy.addMenuProxyListener()} .
      * @param xListener [in]: the listener to be removed
      */
    def removeMenuProxyListener(xListener: XMenuProxyListener): Unit
  }
  object XMenuProxy {
    
    inline def apply(
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addMenuProxyListener: XMenuProxyListener => Unit,
      dispose: () => Unit,
      executeMenuItem: Double => Unit,
      queryInterface: `type` => Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removeMenuProxyListener: XMenuProxyListener => Unit
    ): XMenuProxy = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addMenuProxyListener = js.Any.fromFunction1(addMenuProxyListener), dispose = js.Any.fromFunction0(dispose), executeMenuItem = js.Any.fromFunction1(executeMenuItem), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeMenuProxyListener = js.Any.fromFunction1(removeMenuProxyListener))
      __obj.asInstanceOf[XMenuProxy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XMenuProxy] (val x: Self) extends AnyVal {
      
      inline def setAddMenuProxyListener(value: XMenuProxyListener => Unit): Self = StObject.set(x, "addMenuProxyListener", js.Any.fromFunction1(value))
      
      inline def setExecuteMenuItem(value: Double => Unit): Self = StObject.set(x, "executeMenuItem", js.Any.fromFunction1(value))
      
      inline def setRemoveMenuProxyListener(value: XMenuProxyListener => Unit): Self = StObject.set(x, "removeMenuProxyListener", js.Any.fromFunction1(value))
    }
  }
  
  /** Listens for changes in menu items. */
  trait XMenuProxyListener
    extends StObject
       with XInterface {
    
    /** is called, if the content or graphical representation/state of the menu changes completely, for one or more menu items */
    def menuChangedMultiple(MenuMultipleChanges: SeqEquiv[MenuMultipleChange]): Unit
    
    /** is called, if the content or graphical representation/state of the menu changes, by one property for one or more menu items */
    def menuChangedSingle(MenuSingleChanges: SeqEquiv[MenuSingleChange]): Unit
    
    /**
      * is called, if one menu item designated by the ID, is deleted.
      * @param ID [in]: the menu item
      */
    def menuItemDeleted(ID: Double): Unit
  }
  object XMenuProxyListener {
    
    inline def apply(
      acquire: () => Unit,
      menuChangedMultiple: SeqEquiv[MenuMultipleChange] => Unit,
      menuChangedSingle: SeqEquiv[MenuSingleChange] => Unit,
      menuItemDeleted: Double => Unit,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XMenuProxyListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), menuChangedMultiple = js.Any.fromFunction1(menuChangedMultiple), menuChangedSingle = js.Any.fromFunction1(menuChangedSingle), menuItemDeleted = js.Any.fromFunction1(menuItemDeleted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XMenuProxyListener]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XMenuProxyListener] (val x: Self) extends AnyVal {
      
      inline def setMenuChangedMultiple(value: SeqEquiv[MenuMultipleChange] => Unit): Self = StObject.set(x, "menuChangedMultiple", js.Any.fromFunction1(value))
      
      inline def setMenuChangedSingle(value: SeqEquiv[MenuSingleChange] => Unit): Self = StObject.set(x, "menuChangedSingle", js.Any.fromFunction1(value))
      
      inline def setMenuItemDeleted(value: Double => Unit): Self = StObject.set(x, "menuItemDeleted", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * @see com.sun.star.mozilla.XProfileDiscover
    * @see com.sun.star.mozilla.XProfileManager
    * @see com.sun.star.mozilla.XProxyRunner
    * @see com.sun.star.mozilla.MozillaBootstrap
    */
  trait XMozillaBootstrap
    extends StObject
       with XProfileDiscover
       with XProfileManager
       with XProxyRunner
  object XMozillaBootstrap {
    
    inline def apply(
      CurrentProduct: MozillaProductType,
      CurrentProfile: String,
      Run: XCodeProxy => Double,
      acquire: () => Unit,
      bootupProfile: (MozillaProductType, String) => Double,
      getCurrentProduct: () => MozillaProductType,
      getCurrentProfile: () => String,
      getDefaultProfile: MozillaProductType => String,
      getProfileCount: MozillaProductType => Double,
      getProfileExists: (MozillaProductType, String) => Boolean,
      getProfileList: (MozillaProductType, js.Array[SeqEquiv[String]]) => Double,
      getProfilePath: (MozillaProductType, String) => String,
      isCurrentProfileLocked: () => Boolean,
      isProfileLocked: (MozillaProductType, String) => Boolean,
      queryInterface: `type` => Any,
      release: () => Unit,
      setCurrentProfile: (MozillaProductType, String) => String,
      shutdownProfile: () => Double
    ): XMozillaBootstrap = {
      val __obj = js.Dynamic.literal(CurrentProduct = CurrentProduct.asInstanceOf[js.Any], CurrentProfile = CurrentProfile.asInstanceOf[js.Any], Run = js.Any.fromFunction1(Run), acquire = js.Any.fromFunction0(acquire), bootupProfile = js.Any.fromFunction2(bootupProfile), getCurrentProduct = js.Any.fromFunction0(getCurrentProduct), getCurrentProfile = js.Any.fromFunction0(getCurrentProfile), getDefaultProfile = js.Any.fromFunction1(getDefaultProfile), getProfileCount = js.Any.fromFunction1(getProfileCount), getProfileExists = js.Any.fromFunction2(getProfileExists), getProfileList = js.Any.fromFunction2(getProfileList), getProfilePath = js.Any.fromFunction2(getProfilePath), isCurrentProfileLocked = js.Any.fromFunction0(isCurrentProfileLocked), isProfileLocked = js.Any.fromFunction2(isProfileLocked), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentProfile = js.Any.fromFunction2(setCurrentProfile), shutdownProfile = js.Any.fromFunction0(shutdownProfile))
      __obj.asInstanceOf[XMozillaBootstrap]
    }
  }
  
  /**
    * is the interface used to list and get information for Mozilla/Thunderbird profiles
    * @see com.sun.star.mozilla.XProfileManager
    * @see com.sun.star.mozilla.MozillaBootstrap
    */
  trait XProfileDiscover
    extends StObject
       with XInterface {
    
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
    
    inline def apply(
      acquire: () => Unit,
      getDefaultProfile: MozillaProductType => String,
      getProfileCount: MozillaProductType => Double,
      getProfileExists: (MozillaProductType, String) => Boolean,
      getProfileList: (MozillaProductType, js.Array[SeqEquiv[String]]) => Double,
      getProfilePath: (MozillaProductType, String) => String,
      isProfileLocked: (MozillaProductType, String) => Boolean,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XProfileDiscover = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDefaultProfile = js.Any.fromFunction1(getDefaultProfile), getProfileCount = js.Any.fromFunction1(getProfileCount), getProfileExists = js.Any.fromFunction2(getProfileExists), getProfileList = js.Any.fromFunction2(getProfileList), getProfilePath = js.Any.fromFunction2(getProfilePath), isProfileLocked = js.Any.fromFunction2(isProfileLocked), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XProfileDiscover]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XProfileDiscover] (val x: Self) extends AnyVal {
      
      inline def setGetDefaultProfile(value: MozillaProductType => String): Self = StObject.set(x, "getDefaultProfile", js.Any.fromFunction1(value))
      
      inline def setGetProfileCount(value: MozillaProductType => Double): Self = StObject.set(x, "getProfileCount", js.Any.fromFunction1(value))
      
      inline def setGetProfileExists(value: (MozillaProductType, String) => Boolean): Self = StObject.set(x, "getProfileExists", js.Any.fromFunction2(value))
      
      inline def setGetProfileList(value: (MozillaProductType, js.Array[SeqEquiv[String]]) => Double): Self = StObject.set(x, "getProfileList", js.Any.fromFunction2(value))
      
      inline def setGetProfilePath(value: (MozillaProductType, String) => String): Self = StObject.set(x, "getProfilePath", js.Any.fromFunction2(value))
      
      inline def setIsProfileLocked(value: (MozillaProductType, String) => Boolean): Self = StObject.set(x, "isProfileLocked", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * is the interface to boot up and switch Mozilla/Thunderbird profiles
    * @see com.sun.star.mozilla.MozillaProductType
    * @see com.sun.star.mozilla.XProfileDiscover
    * @see com.sun.star.mozilla.MozillaBootstrap
    */
  trait XProfileManager
    extends StObject
       with XInterface {
    
    /**
      * attempts to get the current product.
      * @returns the current used product.
      */
    val CurrentProduct: MozillaProductType
    
    /**
      * attempts to get the current profile name.
      * @returns the current used profile.
      */
    val CurrentProfile: String
    
    /**
      * attempts to init XPCOM runtime using given profile.
      * @param product is the product to start up.
      * @param profileName the profile name to be used.
      * @returns the current reference count for the given profile.
      */
    def bootupProfile(product: MozillaProductType, profileName: String): Double
    
    /**
      * attempts to get the current product.
      * @returns the current used product.
      */
    def getCurrentProduct(): MozillaProductType
    
    /**
      * attempts to get the current profile name.
      * @returns the current used profile.
      */
    def getCurrentProfile(): String
    
    /**
      * attempts to check whether the current profile locked or not
      * @returns return sal_True is current profile is locked
      */
    def isCurrentProfileLocked(): Boolean
    
    /**
      * attempts to set the current used profile name for the given product.
      * @param product is the product to be used.
      * @param profileName the profile name to be used.
      * @returns the current used profile name for the given product.
      */
    def setCurrentProfile(product: MozillaProductType, profileName: String): String
    
    /**
      * attempts to shutdown the current profile.
      * @returns the current reference count for the current profile.
      */
    def shutdownProfile(): Double
  }
  object XProfileManager {
    
    inline def apply(
      CurrentProduct: MozillaProductType,
      CurrentProfile: String,
      acquire: () => Unit,
      bootupProfile: (MozillaProductType, String) => Double,
      getCurrentProduct: () => MozillaProductType,
      getCurrentProfile: () => String,
      isCurrentProfileLocked: () => Boolean,
      queryInterface: `type` => Any,
      release: () => Unit,
      setCurrentProfile: (MozillaProductType, String) => String,
      shutdownProfile: () => Double
    ): XProfileManager = {
      val __obj = js.Dynamic.literal(CurrentProduct = CurrentProduct.asInstanceOf[js.Any], CurrentProfile = CurrentProfile.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), bootupProfile = js.Any.fromFunction2(bootupProfile), getCurrentProduct = js.Any.fromFunction0(getCurrentProduct), getCurrentProfile = js.Any.fromFunction0(getCurrentProfile), isCurrentProfileLocked = js.Any.fromFunction0(isCurrentProfileLocked), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentProfile = js.Any.fromFunction2(setCurrentProfile), shutdownProfile = js.Any.fromFunction0(shutdownProfile))
      __obj.asInstanceOf[XProfileManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XProfileManager] (val x: Self) extends AnyVal {
      
      inline def setBootupProfile(value: (MozillaProductType, String) => Double): Self = StObject.set(x, "bootupProfile", js.Any.fromFunction2(value))
      
      inline def setCurrentProduct(value: MozillaProductType): Self = StObject.set(x, "CurrentProduct", value.asInstanceOf[js.Any])
      
      inline def setCurrentProfile(value: String): Self = StObject.set(x, "CurrentProfile", value.asInstanceOf[js.Any])
      
      inline def setGetCurrentProduct(value: () => MozillaProductType): Self = StObject.set(x, "getCurrentProduct", js.Any.fromFunction0(value))
      
      inline def setGetCurrentProfile(value: () => String): Self = StObject.set(x, "getCurrentProfile", js.Any.fromFunction0(value))
      
      inline def setIsCurrentProfileLocked(value: () => Boolean): Self = StObject.set(x, "isCurrentProfileLocked", js.Any.fromFunction0(value))
      
      inline def setSetCurrentProfile(value: (MozillaProductType, String) => String): Self = StObject.set(x, "setCurrentProfile", js.Any.fromFunction2(value))
      
      inline def setShutdownProfile(value: () => Double): Self = StObject.set(x, "shutdownProfile", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * is the interface run Mozilla XPCOM code in a managed environment
    * @see com.sun.star.mozilla.XProfileDiscover
    * @see com.sun.star.mozilla.MozillaBootstrap
    */
  trait XProxyRunner
    extends StObject
       with XInterface {
    
    /**
      * attempts to Run XPCOM code in a managed environment
      * @param aCode is a com:sun:star:mozilla: {@link XCodeProxy} object to be run.
      * @returns the error code, is 0 when no error happened.
      */
    def Run(aCode: XCodeProxy): Double
  }
  object XProxyRunner {
    
    inline def apply(Run: XCodeProxy => Double, acquire: () => Unit, queryInterface: `type` => Any, release: () => Unit): XProxyRunner = {
      val __obj = js.Dynamic.literal(Run = js.Any.fromFunction1(Run), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XProxyRunner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XProxyRunner] (val x: Self) extends AnyVal {
      
      inline def setRun(value: XCodeProxy => Double): Self = StObject.set(x, "Run", js.Any.fromFunction1(value))
    }
  }
}
