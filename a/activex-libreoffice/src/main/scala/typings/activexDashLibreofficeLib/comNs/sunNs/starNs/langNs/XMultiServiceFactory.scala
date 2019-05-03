package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows creating instances specified by a string name. */
@js.native
trait XMultiServiceFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Provides the available names of the factory to be used to create instances.
    * @returns sequence of all names
    */
  val AvailableServiceNames: stdLib.SafeArray[java.lang.String] = js.native
  /**
    * Creates an instance classified by the specified name.
    * @param aServiceSpecifier classified name of instance
    * @returns instance
    */
  def createInstance(aServiceSpecifier: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface = js.native
  /**
    * Creates an instance classified by the specified name and passes the arguments to that instance.
    * @param ServiceSpecifier classified name of instance
    * @param Arguments arguments passed to the instance
    * @returns instance
    */
  def createInstanceWithArguments(ServiceSpecifier: java.lang.String, Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaraccessibilityAccessible(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTaccessibilityDOTAccessible,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.Accessible = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaraccessibilityAccessibleContext(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTaccessibilityDOTAccessibleContext,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.AccessibleContext = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaraccessibilityMSAAService(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTaccessibilityDOTMSAAService,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.MSAAService = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaranimationsAnimateColor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTAnimateColor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimateColor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaranimationsAnimateMotion(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTAnimateMotion,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimateMotion = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaranimationsAnimateSet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTAnimateSet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimateSet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaranimationsAudio(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTAudio,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.Audio = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaranimationsCommand(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTCommand,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.Command = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaranimationsIterateContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTIterateContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.IterateContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaranimationsParallelTimeContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTParallelTimeContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.ParallelTimeContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaranimationsSequenceTimeContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTSequenceTimeContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.SequenceTimeContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarauthSSOManagerFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTauthDOTSSOManagerFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.authNs.SSOManagerFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarauthSSOPasswordCache(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTauthDOTSSOPasswordCache,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.authNs.SSOPasswordCache = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleCheckBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleCheckBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleCheckBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleComboBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleComboBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleComboBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleDropDownComboBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleDropDownComboBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleDropDownComboBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleDropDownListBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleDropDownListBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleDropDownListBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleEdit(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleEdit,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleEdit = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleFixedText(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleFixedText,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleFixedText = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleIconChoiceControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleIconChoiceControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleIconChoiceControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleIconChoiceControlEntry(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleIconChoiceControlEntry,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleIconChoiceControlEntry = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleList(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleList,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleList = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleListBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleListBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleListBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleListBoxList(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleListBoxList,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleListBoxList = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleListItem(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleListItem,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleListItem = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleMenu(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleMenu,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleMenu = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleMenuBar(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleMenuBar,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleMenuBar = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleMenuItem(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleMenuItem,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleMenuItem = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleMenuSeparator(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleMenuSeparator,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleMenuSeparator = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessiblePopupMenu(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessiblePopupMenu,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessiblePopupMenu = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleRadioButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleRadioButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleRadioButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleScrollBar(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleScrollBar,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleScrollBar = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleStatusBar(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleStatusBar,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleStatusBar = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleStatusBarItem(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleStatusBarItem,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleStatusBarItem = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleTabBar(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTabBar,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTabBar = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleTabBarPage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTabBarPage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTabBarPage = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleTabBarPageList(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTabBarPageList,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTabBarPageList = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleTabControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTabControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTabControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleTabPage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTabPage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTabPage = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleTextField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTextField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTextField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleToolBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleToolBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleToolBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleToolBoxItem(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleToolBoxItem,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleToolBoxItem = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleTreeListBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTreeListBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTreeListBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleTreeListBoxEntry(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTreeListBoxEntry,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTreeListBoxEntry = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAccessibleWindow(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleWindow,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleWindow = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAnimatedImagesControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAnimatedImagesControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AnimatedImagesControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAnimatedImagesControlModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAnimatedImagesControlModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AnimatedImagesControlModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtAsyncCallback(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAsyncCallback,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AsyncCallback = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtContainerWindowProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTContainerWindowProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ContainerWindowProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtDialogProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTDialogProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.DialogProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtDialogProvider2(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTDialogProvider2,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.DialogProvider2 = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtMenuBar(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTMenuBar,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MenuBar = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtPointer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTPointer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Pointer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtPopupMenu(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTPopupMenu,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.PopupMenu = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtPrinterServer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTPrinterServer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.PrinterServer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtRoadmapItem(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTRoadmapItem,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.RoadmapItem = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtSpinningProgressControlModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTSpinningProgressControlModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.SpinningProgressControlModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtTabController(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTTabController,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.TabController = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtTabControllerModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTTabControllerModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.TabControllerModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtToolkit(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTToolkit,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Toolkit = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlButtonModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlButtonModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlButtonModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlCheckBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlCheckBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlCheckBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlCheckBoxModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlCheckBoxModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlCheckBoxModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlComboBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlComboBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlComboBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlComboBoxModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlComboBoxModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlComboBoxModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlContainerModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlContainerModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlContainerModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlCurrencyField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlCurrencyField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlCurrencyField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlCurrencyFieldModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlCurrencyFieldModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlCurrencyFieldModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlDateField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlDateField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlDateField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlDateFieldModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlDateFieldModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlDateFieldModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlDialog(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlDialog,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlDialog = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlDialogElement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlDialogElement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlDialogElement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlDialogModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlDialogModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlDialogModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlDialogModelProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlDialogModelProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlDialogModelProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlEdit(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlEdit,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlEdit = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlEditModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlEditModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlEditModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlFileControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFileControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFileControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlFileControlModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFileControlModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFileControlModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlFixedHyperlink(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFixedHyperlink,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFixedHyperlink = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlFixedHyperlinkModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFixedHyperlinkModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFixedHyperlinkModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlFixedLine(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFixedLine,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFixedLine = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlFixedLineModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFixedLineModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFixedLineModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlFixedText(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFixedText,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFixedText = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlFixedTextModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFixedTextModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFixedTextModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlFormattedField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFormattedField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFormattedField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlFormattedFieldModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFormattedFieldModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFormattedFieldModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlGroupBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlGroupBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlGroupBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlGroupBoxModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlGroupBoxModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlGroupBoxModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlImageControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlImageControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlImageControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlImageControlModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlImageControlModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlImageControlModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlListBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlListBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlListBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlListBoxModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlListBoxModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlListBoxModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlNumericField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlNumericField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlNumericField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlNumericFieldModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlNumericFieldModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlNumericFieldModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlPatternField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlPatternField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlPatternField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlPatternFieldModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlPatternFieldModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlPatternFieldModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlProgressBar(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlProgressBar,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlProgressBar = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlProgressBarModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlProgressBarModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlProgressBarModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlRadioButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlRadioButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlRadioButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlRadioButtonModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlRadioButtonModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlRadioButtonModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlRoadmap(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlRoadmap,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlRoadmap = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlRoadmapModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlRoadmapModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlRoadmapModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlScrollBar(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlScrollBar,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlScrollBar = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlScrollBarModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlScrollBarModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlScrollBarModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlSpinButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlSpinButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlSpinButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlSpinButtonModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlSpinButtonModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlSpinButtonModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlTimeField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlTimeField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlTimeField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtUnoControlTimeFieldModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlTimeFieldModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlTimeFieldModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtgridDefaultGridColumnModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTgridDOTDefaultGridColumnModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs.DefaultGridColumnModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtgridDefaultGridDataModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTgridDOTDefaultGridDataModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs.DefaultGridDataModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtgridGridColumn(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTgridDOTGridColumn,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs.GridColumn = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtgridSortableGridDataModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTgridDOTSortableGridDataModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs.SortableGridDataModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtgridUnoControlGrid(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTgridDOTUnoControlGrid,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs.UnoControlGrid = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawtgridUnoControlGridModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTgridDOTUnoControlGridModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs.UnoControlGridModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawttabUnoControlTabPage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtabDOTUnoControlTabPage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs.UnoControlTabPage = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawttabUnoControlTabPageContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtabDOTUnoControlTabPageContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs.UnoControlTabPageContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawttabUnoControlTabPageContainerModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtabDOTUnoControlTabPageContainerModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs.UnoControlTabPageContainerModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawttabUnoControlTabPageModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtabDOTUnoControlTabPageModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs.UnoControlTabPageModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawttreeMutableTreeDataModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtreeDOTMutableTreeDataModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs.MutableTreeDataModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawttreeMutableTreeNode(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtreeDOTMutableTreeNode,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs.MutableTreeNode = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawttreeTreeControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtreeDOTTreeControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs.TreeControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarawttreeTreeControlModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtreeDOTTreeControlModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs.TreeControlModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbeansIntrospection(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbeansDOTIntrospection,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Introspection = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbeansPropertyBag(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbeansDOTPropertyBag,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyBag = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbeansPropertySet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbeansDOTPropertySet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertySet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbridgeBridge(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTBridge,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.Bridge = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbridgeBridgeFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTBridgeFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.BridgeFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbridgeIiopBridge(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTIiopBridge,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.IiopBridge = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbridgeOleApplicationRegistration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTOleApplicationRegistration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.OleApplicationRegistration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbridgeOleBridgeSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTOleBridgeSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.OleBridgeSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbridgeOleBridgeSupplier2(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTOleBridgeSupplier2,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.OleBridgeSupplier2 = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbridgeOleBridgeSupplierVar1(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTOleBridgeSupplierVar1,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.OleBridgeSupplierVar1 = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbridgeOleObjectFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTOleObjectFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.OleObjectFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbridgeUnoUrlResolver(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTUnoUrlResolver,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.UnoUrlResolver = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbridgeUrpBridge(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTUrpBridge,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.UrpBridge = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbridgeoleautomationApplicationRegistration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOToleautomationDOTApplicationRegistration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.oleautomationNs.ApplicationRegistration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbridgeoleautomationBridgeSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOToleautomationDOTBridgeSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.oleautomationNs.BridgeSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarbridgeoleautomationFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOToleautomationDOTFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.oleautomationNs.Factory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2Axis(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTAxis,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.Axis = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2CandleStickChartType(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTCandleStickChartType,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CandleStickChartType = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2CartesianCoordinateSystem2d(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTCartesianCoordinateSystem2d,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CartesianCoordinateSystem2d = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2CartesianCoordinateSystem3d(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTCartesianCoordinateSystem3d,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CartesianCoordinateSystem3d = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2ChartDocument(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTChartDocument,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ChartDocument = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2ChartDocumentWrapper(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTChartDocumentWrapper,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ChartDocumentWrapper = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2ChartType(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTChartType,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ChartType = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2ChartTypeManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTChartTypeManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ChartTypeManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2ChartTypeTemplate(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTChartTypeTemplate,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ChartTypeTemplate = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2CoordinateSystem(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTCoordinateSystem,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CoordinateSystem = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2CoordinateSystemType(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTCoordinateSystemType,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CoordinateSystemType = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2DataPoint(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTDataPoint,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.DataPoint = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2DataPointProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTDataPointProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.DataPointProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2DataSeries(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTDataSeries,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.DataSeries = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2Diagram(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTDiagram,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.Diagram = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2ErrorBar(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTErrorBar,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ErrorBar = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2ExponentialRegressionCurve(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTExponentialRegressionCurve,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ExponentialRegressionCurve = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2ExponentialScaling(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTExponentialScaling,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ExponentialScaling = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2FormattedString(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTFormattedString,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.FormattedString = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2GridProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTGridProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.GridProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2Legend(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTLegend,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.Legend = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2LinearRegressionCurve(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTLinearRegressionCurve,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LinearRegressionCurve = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2LinearScaling(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTLinearScaling,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LinearScaling = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2LogarithmicRegressionCurve(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTLogarithmicRegressionCurve,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LogarithmicRegressionCurve = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2LogarithmicScaling(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTLogarithmicScaling,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LogarithmicScaling = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2LogicTargetModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTLogicTargetModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LogicTargetModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2MovingAverageRegressionCurve(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTMovingAverageRegressionCurve,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.MovingAverageRegressionCurve = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2PolarCoordinateSystem2d(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTPolarCoordinateSystem2d,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PolarCoordinateSystem2d = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2PolarCoordinateSystem3d(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTPolarCoordinateSystem3d,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PolarCoordinateSystem3d = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2PolynomialRegressionCurve(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTPolynomialRegressionCurve,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PolynomialRegressionCurve = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2PotentialRegressionCurve(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTPotentialRegressionCurve,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PotentialRegressionCurve = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2PowerScaling(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTPowerScaling,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PowerScaling = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2PropertyPool(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTPropertyPool,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PropertyPool = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2RegressionCurve(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTRegressionCurve,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.RegressionCurve = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2RegressionCurveEquation(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTRegressionCurveEquation,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.RegressionCurveEquation = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2RegressionEquation(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTRegressionEquation,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.RegressionEquation = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2Scaling(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTScaling,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.Scaling = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2StandardDiagramCreationParameters(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTStandardDiagramCreationParameters,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.StandardDiagramCreationParameters = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2Title(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTTitle,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.Title = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2dataDataFilter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTDataFilter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.DataFilter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2dataDataProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTDataProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.DataProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2dataDataSequence(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTDataSequence,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.DataSequence = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2dataDataSink(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTDataSink,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.DataSink = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2dataDataSource(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTDataSource,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.DataSource = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2dataDatabaseDataProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTDatabaseDataProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.DatabaseDataProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2dataLabeledDataSequence(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTLabeledDataSequence,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.LabeledDataSequence = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2dataRangeHighlightListener(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTRangeHighlightListener,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.RangeHighlightListener = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2dataRangeHighlighter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTRangeHighlighter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.RangeHighlighter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchart2dataTabularDataProviderArguments(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTTabularDataProviderArguments,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.TabularDataProviderArguments = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartAccessibleChartDocumentView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTAccessibleChartDocumentView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.AccessibleChartDocumentView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartAccessibleChartElement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTAccessibleChartElement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.AccessibleChartElement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartAreaDiagram(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTAreaDiagram,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.AreaDiagram = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartBarDiagram(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTBarDiagram,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.BarDiagram = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartBubbleDiagram(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTBubbleDiagram,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.BubbleDiagram = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChart3DBarProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChart3DBarProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.Chart3DBarProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartArea(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartArea,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartArea = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartAxis(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartAxis,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxis = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartAxisXSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartAxisXSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisXSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartAxisYSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartAxisYSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisYSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartAxisZSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartAxisZSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisZSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartData(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartData,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartData = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartDataArray(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartDataArray,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataArray = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartDataPointProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartDataPointProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataPointProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartDataRowProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartDataRowProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataRowProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartDocument(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartDocument,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDocument = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartGrid(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartGrid,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartGrid = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartLegend(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartLegend,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLegend = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartLine(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartLine,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLine = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartPieSegmentProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartPieSegmentProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartPieSegmentProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartStatistics(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartStatistics,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartStatistics = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartTableAddressSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartTableAddressSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartTableAddressSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartTitle(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartTitle,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartTitle = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartTwoAxisXSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartTwoAxisXSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartTwoAxisXSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartChartTwoAxisYSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartTwoAxisYSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartTwoAxisYSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartDiagram(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTDiagram,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.Diagram = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartDim3DDiagram(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTDim3DDiagram,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.Dim3DDiagram = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartDonutDiagram(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTDonutDiagram,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.DonutDiagram = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartFilledNetDiagram(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTFilledNetDiagram,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.FilledNetDiagram = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartLineDiagram(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTLineDiagram,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.LineDiagram = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartNetDiagram(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTNetDiagram,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.NetDiagram = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartPieDiagram(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTPieDiagram,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.PieDiagram = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartStackableDiagram(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTStackableDiagram,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.StackableDiagram = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartStockDiagram(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTStockDiagram,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.StockDiagram = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarchartXYDiagram(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTXYDiagram,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XYDiagram = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationAccessRootElement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTAccessRootElement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.AccessRootElement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationAdministrationProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTAdministrationProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.AdministrationProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationConfigurationAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTConfigurationAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.ConfigurationAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationConfigurationProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTConfigurationProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.ConfigurationProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationConfigurationRegistry(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTConfigurationRegistry,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.ConfigurationRegistry = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationConfigurationUpdateAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTConfigurationUpdateAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.ConfigurationUpdateAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationDefaultProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTDefaultProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.DefaultProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationGroupAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTGroupAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.GroupAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationGroupElement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTGroupElement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.GroupElement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationGroupUpdate(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTGroupUpdate,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.GroupUpdate = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationHierarchyAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTHierarchyAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.HierarchyAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationHierarchyElement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTHierarchyElement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.HierarchyElement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationPropertyHierarchy(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTPropertyHierarchy,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.PropertyHierarchy = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationReadOnlyAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTReadOnlyAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.ReadOnlyAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationReadWriteAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTReadWriteAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.ReadWriteAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationSetAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTSetAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.SetAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationSetElement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTSetElement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.SetElement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationSetUpdate(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTSetUpdate,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.SetUpdate = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationSimpleSetAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTSimpleSetAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.SimpleSetAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationSimpleSetUpdate(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTSimpleSetUpdate,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.SimpleSetUpdate = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationUpdateRootElement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTUpdateRootElement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.UpdateRootElement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendBackend(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTBackend,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.Backend = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendBackendAdapter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTBackendAdapter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.BackendAdapter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendCopyImporter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTCopyImporter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.CopyImporter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendDataImporter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTDataImporter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.DataImporter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendDefaultBackend(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTDefaultBackend,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.DefaultBackend = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendHierarchyBrowser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTHierarchyBrowser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.HierarchyBrowser = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendImporter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTImporter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.Importer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendInteractionHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTInteractionHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.InteractionHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendLayer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLayer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.Layer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendLayerDescriber(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLayerDescriber,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LayerDescriber = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendLayerFilter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLayerFilter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LayerFilter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendLayerUpdateMerger(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLayerUpdateMerger,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LayerUpdateMerger = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendLdapMultiLayerStratum(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLdapMultiLayerStratum,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LdapMultiLayerStratum = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendLdapSingleBackend(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLdapSingleBackend,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LdapSingleBackend = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendLdapSingleStratum(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLdapSingleStratum,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LdapSingleStratum = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendLocalDataImporter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLocalDataImporter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LocalDataImporter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendLocalHierarchyBrowser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLocalHierarchyBrowser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LocalHierarchyBrowser = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendLocalSchemaSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLocalSchemaSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LocalSchemaSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendLocalSingleBackend(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLocalSingleBackend,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LocalSingleBackend = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendLocalSingleStratum(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLocalSingleStratum,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LocalSingleStratum = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendMergeImporter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTMergeImporter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.MergeImporter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendMultiLayerStratum(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTMultiLayerStratum,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.MultiLayerStratum = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendMultiStratumBackend(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTMultiStratumBackend,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.MultiStratumBackend = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendOfflineBackend(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTOfflineBackend,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.OfflineBackend = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendOnlineBackend(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTOnlineBackend,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.OnlineBackend = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendPlatformBackend(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTPlatformBackend,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.PlatformBackend = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendSchema(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTSchema,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.Schema = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendSchemaSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTSchemaSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SchemaSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendSingleBackend(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTSingleBackend,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SingleBackend = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendSingleBackendAdapter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTSingleBackendAdapter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SingleBackendAdapter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendSingleLayerStratum(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTSingleLayerStratum,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SingleLayerStratum = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendSystemIntegration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTSystemIntegration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SystemIntegration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendUpdatableLayer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTUpdatableLayer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.UpdatableLayer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendxmlLayerParser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTxmlDOTLayerParser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.xmlNs.LayerParser = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendxmlLayerWriter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTxmlDOTLayerWriter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.xmlNs.LayerWriter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbackendxmlSchemaParser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTxmlDOTSchemaParser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.xmlNs.SchemaParser = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconfigurationbootstrapBootstrapContext(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbootstrapDOTBootstrapContext,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.bootstrapNs.BootstrapContext = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconnectionAcceptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconnectionDOTAcceptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.connectionNs.Acceptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarconnectionConnector(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconnectionDOTConnector,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.connectionNs.Connector = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarcontainerEnumerableMap(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTcontainerDOTEnumerableMap,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.EnumerableMap = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarcuiColorPicker(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTcuiDOTColorPicker,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.cuiNs.ColorPicker = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardatatransferDataFormatTranslator(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTDataFormatTranslator,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.DataFormatTranslator = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardatatransferMimeContentTypeFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTMimeContentTypeFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.MimeContentTypeFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardatatransferclipboardClipboardManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTclipboardDOTClipboardManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.ClipboardManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardatatransferclipboardGenericClipboard(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTclipboardDOTGenericClipboard,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.GenericClipboard = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardatatransferclipboardSystemClipboard(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTclipboardDOTSystemClipboard,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.SystemClipboard = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardatatransferdndOleDragSource(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTdndDOTOleDragSource,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.OleDragSource = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardatatransferdndOleDropTarget(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTdndDOTOleDropTarget,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.OleDropTarget = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardatatransferdndX11DragSource(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTdndDOTX11DragSource,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.X11DragSource = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardatatransferdndX11DropTarget(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTdndDOTX11DropTarget,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.X11DropTarget = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardeploymentPackageRegistryBackend(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdeploymentDOTPackageRegistryBackend,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.PackageRegistryBackend = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardeploymentUpdateInformationProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdeploymentDOTUpdateInformationProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.UpdateInformationProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardeploymenttestSmoketestCommandEnvironment(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdeploymentDOTtestDOTSmoketestCommandEnvironment,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.testNs.SmoketestCommandEnvironment = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardeploymentuiLicenseDialog(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdeploymentDOTuiDOTLicenseDialog,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.uiNs.LicenseDialog = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardeploymentuiPackageManagerDialog(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdeploymentDOTuiDOTPackageManagerDialog,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.uiNs.PackageManagerDialog = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardeploymentuiUpdateRequiredDialog(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdeploymentDOTuiDOTUpdateRequiredDialog,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.uiNs.UpdateRequiredDialog = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentDocumentProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTDocumentProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.DocumentProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentDocumentRevisionListPersistence(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTDocumentRevisionListPersistence,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.DocumentRevisionListPersistence = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentEventDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTEventDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.EventDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentEvents(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTEvents,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.Events = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentExportFilter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTExportFilter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.ExportFilter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentExtendedTypeDetection(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTExtendedTypeDetection,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.ExtendedTypeDetection = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentExtendedTypeDetectionFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTExtendedTypeDetectionFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.ExtendedTypeDetectionFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentFilterAdapter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTFilterAdapter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.FilterAdapter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentFilterConfigRefresh(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTFilterConfigRefresh,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.FilterConfigRefresh = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentFilterFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTFilterFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.FilterFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentGraphicObjectResolver(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTGraphicObjectResolver,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.GraphicObjectResolver = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentHeaderFooterSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTHeaderFooterSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.HeaderFooterSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentImportFilter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTImportFilter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.ImportFilter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentIndexedPropertyValues(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTIndexedPropertyValues,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.IndexedPropertyValues = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentLinkTarget(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTLinkTarget,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.LinkTarget = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentLinkTargets(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTLinkTargets,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.LinkTargets = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentMediaDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTMediaDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.MediaDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentNamedPropertyValues(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTNamedPropertyValues,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.NamedPropertyValues = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentOOXMLDocumentPropertiesImporter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTOOXMLDocumentPropertiesImporter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.OOXMLDocumentPropertiesImporter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentOfficeDocument(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTOfficeDocument,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.OfficeDocument = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentOleEmbeddedServerRegistration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTOleEmbeddedServerRegistration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.OleEmbeddedServerRegistration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentPDFDialog(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTPDFDialog,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.PDFDialog = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.Settings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentTypeDetection(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTTypeDetection,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.TypeDetection = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentXMLBasicExporter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTXMLBasicExporter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XMLBasicExporter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentXMLBasicImporter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTXMLBasicImporter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XMLBasicImporter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentXMLOasisBasicExporter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTXMLOasisBasicExporter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XMLOasisBasicExporter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardocumentXMLOasisBasicImporter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTXMLOasisBasicImporter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XMLOasisBasicImporter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingAccessibleDrawDocumentView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleDrawDocumentView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleDrawDocumentView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingAccessibleGraphControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleGraphControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleGraphControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingAccessibleGraphicShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleGraphicShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleGraphicShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingAccessibleImageBullet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleImageBullet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleImageBullet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingAccessibleOLEShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleOLEShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleOLEShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingAccessibleShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingAccessibleSlideView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleSlideView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleSlideView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingAccessibleSlideViewObject(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleSlideViewObject,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleSlideViewObject = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingAppletShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAppletShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AppletShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingBackground(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTBackground,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Background = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingBitmapTable(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTBitmapTable,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.BitmapTable = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingCaptionShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTCaptionShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CaptionShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingClosedBezierShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTClosedBezierShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ClosedBezierShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingColorTable(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTColorTable,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ColorTable = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingConnectorProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTConnectorProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectorProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingConnectorShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTConnectorShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectorShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingControlShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTControlShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ControlShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingCustomShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTCustomShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CustomShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingCustomShapeEngine(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTCustomShapeEngine,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CustomShapeEngine = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingDashTable(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDashTable,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DashTable = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingDefaults(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDefaults,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Defaults = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingDocumentSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDocumentSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DocumentSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingDrawPage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDrawPage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawPage = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingDrawPages(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDrawPages,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawPages = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingDrawingDocument(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDrawingDocument,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawingDocument = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingDrawingDocumentDrawView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDrawingDocumentDrawView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawingDocumentDrawView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingDrawingDocumentFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDrawingDocumentFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawingDocumentFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingEllipseShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTEllipseShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EllipseShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingEnhancedCustomShapeExtrusion(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTEnhancedCustomShapeExtrusion,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EnhancedCustomShapeExtrusion = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingEnhancedCustomShapeGeometry(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTEnhancedCustomShapeGeometry,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EnhancedCustomShapeGeometry = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingEnhancedCustomShapeHandle(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTEnhancedCustomShapeHandle,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EnhancedCustomShapeHandle = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingEnhancedCustomShapePath(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTEnhancedCustomShapePath,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EnhancedCustomShapePath = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingEnhancedCustomShapeTextPath(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTEnhancedCustomShapeTextPath,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EnhancedCustomShapeTextPath = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingFillProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTFillProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingGenericDrawPage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTGenericDrawPage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.GenericDrawPage = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingGenericDrawingDocument(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTGenericDrawingDocument,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.GenericDrawingDocument = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingGradientTable(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTGradientTable,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.GradientTable = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingGraphicExportFilter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTGraphicExportFilter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.GraphicExportFilter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingGraphicObjectShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTGraphicObjectShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.GraphicObjectShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingGroupShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTGroupShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.GroupShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingHatchTable(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTHatchTable,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HatchTable = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingLayer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTLayer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Layer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingLayerManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTLayerManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LayerManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingLineProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTLineProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingLineShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTLineShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingMarkerTable(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTMarkerTable,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MarkerTable = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingMasterPage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTMasterPage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MasterPage = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingMasterPages(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTMasterPages,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MasterPages = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingMeasureProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTMeasureProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingMeasureShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTMeasureShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingModuleDispatcher(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTModuleDispatcher,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ModuleDispatcher = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingOLE2Shape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTOLE2Shape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.OLE2Shape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingOpenBezierShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTOpenBezierShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.OpenBezierShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingPageShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTPageShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PageShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingPluginShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTPluginShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PluginShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingPolyLineShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTPolyLineShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyLineShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingPolyPolygonBezierDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTPolyPolygonBezierDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingPolyPolygonBezierShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTPolyPolygonBezierShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingPolyPolygonDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTPolyPolygonDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingPolyPolygonShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTPolyPolygonShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingRectangleShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTRectangleShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectangleShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingRotationDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTRotationDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RotationDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingShadowProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTShadowProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ShadowProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Shape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingShapeCollection(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTShapeCollection,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ShapeCollection = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingShapes(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTShapes,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Shapes = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingSlideRenderer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTSlideRenderer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.SlideRenderer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingSlideSorter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTSlideSorter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.SlideSorter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingText(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTText,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Text = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingTextProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTTextProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingTextShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTTextShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingTransparencyGradientTable(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTTransparencyGradientTable,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TransparencyGradientTable = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingframeworkBasicPaneFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTframeworkDOTBasicPaneFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.BasicPaneFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingframeworkBasicToolBarFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTframeworkDOTBasicToolBarFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.BasicToolBarFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingframeworkBasicViewFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTframeworkDOTBasicViewFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.BasicViewFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingframeworkConfiguration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTframeworkDOTConfiguration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.Configuration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingframeworkConfigurationController(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTframeworkDOTConfigurationController,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.ConfigurationController = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingframeworkModuleController(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTframeworkDOTModuleController,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.ModuleController = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstardrawingframeworkResourceId(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTframeworkDOTResourceId,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.ResourceId = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedBaseStorage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTBaseStorage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.BaseStorage = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedDocumentCloser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTDocumentCloser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.DocumentCloser = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedEmbeddedObjectCreator(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTEmbeddedObjectCreator,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbeddedObjectCreator = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedEmbeddedObjectDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTEmbeddedObjectDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbeddedObjectDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedFileSystemStorage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTFileSystemStorage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.FileSystemStorage = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedFileSystemStorageFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTFileSystemStorageFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.FileSystemStorageFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedHatchWindowFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTHatchWindowFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.HatchWindowFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedInstanceLocker(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTInstanceLocker,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.InstanceLocker = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedMSOLEObjectSystemCreator(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTMSOLEObjectSystemCreator,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.MSOLEObjectSystemCreator = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedOLEEmbeddedObjectFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTOLEEmbeddedObjectFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.OLEEmbeddedObjectFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedOLESimpleStorage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTOLESimpleStorage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.OLESimpleStorage = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedOOoEmbeddedObjectFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTOOoEmbeddedObjectFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.OOoEmbeddedObjectFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedStorage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTStorage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.Storage = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedStorageFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTStorageFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.StorageFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarembedStorageStream(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTStorageStream,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.StorageStream = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformControlFontDialog(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTControlFontDialog,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.ControlFontDialog = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformDataAwareControlModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTDataAwareControlModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataAwareControlModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformFormComponent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTFormComponent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormComponent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformFormComponents(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTFormComponents,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormComponents = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformFormControlModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTFormControlModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormControlModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformFormController(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTFormController,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormController = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformFormControllerDispatcher(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTFormControllerDispatcher,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormControllerDispatcher = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformForms(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTForms,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.Forms = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformPropertyBrowserController(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTPropertyBrowserController,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.PropertyBrowserController = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformTabOrderDialog(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTTabOrderDialog,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.TabOrderDialog = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformbindingBindableControlModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableControlModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableControlModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformbindingBindableDataAwareControlModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDataAwareControlModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDataAwareControlModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformbindingBindableDatabaseCheckBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseCheckBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseCheckBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformbindingBindableDatabaseComboBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseComboBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseComboBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformbindingBindableDatabaseDateField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseDateField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseDateField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformbindingBindableDatabaseFormattedField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseFormattedField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseFormattedField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformbindingBindableDatabaseListBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseListBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseListBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformbindingBindableDatabaseNumericField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseNumericField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseNumericField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformbindingBindableDatabaseRadioButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseRadioButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseRadioButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformbindingBindableDatabaseTextField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseTextField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseTextField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformbindingBindableDatabaseTimeField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseTimeField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseTimeField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformbindingBindableIntegerValueRange(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableIntegerValueRange,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableIntegerValueRange = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformbindingListEntrySource(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTListEntrySource,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.ListEntrySource = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformbindingValueBinding(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTValueBinding,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.ValueBinding = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentCheckBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTCheckBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.CheckBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentComboBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTComboBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.ComboBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentCommandButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTCommandButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.CommandButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentCurrencyField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTCurrencyField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.CurrencyField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentDataForm(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDataForm,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DataForm = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentDatabaseCheckBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseCheckBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseCheckBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentDatabaseComboBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseComboBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseComboBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentDatabaseCurrencyField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseCurrencyField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseCurrencyField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentDatabaseDateField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseDateField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseDateField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentDatabaseFormattedField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseFormattedField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseFormattedField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentDatabaseImageControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseImageControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseImageControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentDatabaseListBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseListBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseListBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentDatabaseNumericField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseNumericField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseNumericField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentDatabasePatternField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabasePatternField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabasePatternField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentDatabaseRadioButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseRadioButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseRadioButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentDatabaseTextField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseTextField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseTextField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentDatabaseTimeField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseTimeField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseTimeField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentDateField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDateField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DateField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentFileControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTFileControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.FileControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentFixedText(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTFixedText,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.FixedText = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentForm(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTForm,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.Form = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentFormattedField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTFormattedField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.FormattedField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentGridControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTGridControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.GridControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentGroupBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTGroupBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.GroupBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentHTMLForm(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTHTMLForm,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.HTMLForm = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentHiddenControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTHiddenControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.HiddenControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentImageButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTImageButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.ImageButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentListBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTListBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.ListBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentNavigationToolBar(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTNavigationToolBar,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.NavigationToolBar = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentNumericField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTNumericField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.NumericField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentPatternField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTPatternField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.PatternField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentRadioButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTRadioButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.RadioButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentRichTextControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTRichTextControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.RichTextControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentScrollBar(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTScrollBar,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.ScrollBar = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentSpinButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTSpinButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.SpinButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentSubmitButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTSubmitButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.SubmitButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentTextField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTTextField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.TextField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcomponentTimeField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTTimeField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.TimeField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolCheckBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTCheckBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.CheckBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolComboBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTComboBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.ComboBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolCommandButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTCommandButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.CommandButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolCurrencyField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTCurrencyField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.CurrencyField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolDateField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTDateField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.DateField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolFilterControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTFilterControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.FilterControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolFormattedField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTFormattedField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.FormattedField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolGridControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTGridControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.GridControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolGroupBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTGroupBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.GroupBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolImageButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTImageButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.ImageButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolImageControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTImageControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.ImageControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolInteractionGridControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTInteractionGridControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.InteractionGridControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolListBox(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTListBox,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.ListBox = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolNavigationToolBar(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTNavigationToolBar,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.NavigationToolBar = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolNumericField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTNumericField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.NumericField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolPatternField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTPatternField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.PatternField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolRadioButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTRadioButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.RadioButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolSubmitButton(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTSubmitButton,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.SubmitButton = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolTextField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTTextField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.TextField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformcontrolTimeField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTTimeField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.TimeField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarforminspectionButtonNavigationHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTButtonNavigationHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.ButtonNavigationHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarforminspectionCellBindingPropertyHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTCellBindingPropertyHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.CellBindingPropertyHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarforminspectionDefaultFormComponentInspectorModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTDefaultFormComponentInspectorModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.DefaultFormComponentInspectorModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarforminspectionEditPropertyHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTEditPropertyHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.EditPropertyHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarforminspectionEventHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTEventHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.EventHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarforminspectionFormComponentPropertyHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTFormComponentPropertyHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.FormComponentPropertyHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarforminspectionSubmissionPropertyHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTSubmissionPropertyHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.SubmissionPropertyHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarforminspectionXMLFormsPropertyHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTXMLFormsPropertyHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.XMLFormsPropertyHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarforminspectionXSDValidationPropertyHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTXSDValidationPropertyHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.XSDValidationPropertyHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformruntimeFormController(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTruntimeDOTFormController,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs.FormController = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformruntimeFormOperations(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTruntimeDOTFormOperations,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs.FormOperations = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformulaAccessibleFormulaText(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformulaDOTAccessibleFormulaText,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formulaNs.AccessibleFormulaText = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformulaAccessibleFormulaView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformulaDOTAccessibleFormulaView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formulaNs.AccessibleFormulaView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformulaFormulaProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformulaDOTFormulaProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formulaNs.FormulaProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformvalidationValidatableBindableControlModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTvalidationDOTValidatableBindableControlModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs.ValidatableBindableControlModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarformvalidationValidatableControlModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTvalidationDOTValidatableControlModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs.ValidatableControlModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeAppDispatchProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTAppDispatchProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.AppDispatchProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeAutoRecovery(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTAutoRecovery,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.AutoRecovery = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeBibliography(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTBibliography,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Bibliography = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeComponents(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTComponents,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Components = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeContentHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTContentHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.ContentHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeContentHandlerFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTContentHandlerFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.ContentHandlerFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeController(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTController,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Controller = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeDesktop(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDesktop,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Desktop = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeDesktopTask(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDesktopTask,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DesktopTask = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeDesktopTasks(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDesktopTasks,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DesktopTasks = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeDispatchHelper(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDispatchHelper,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchHelper = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeDispatchProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDispatchProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeDispatchRecorder(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDispatchRecorder,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchRecorder = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeDispatchRecorderSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDispatchRecorderSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchRecorderSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeDocumentTemplates(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDocumentTemplates,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DocumentTemplates = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeFrame(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTFrame,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Frame = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeFrameControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTFrameControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeFrameLoader(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTFrameLoader,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameLoader = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeFrameLoaderFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTFrameLoaderFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameLoaderFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeFramesContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTFramesContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FramesContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeGlobalEventBroadcaster(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTGlobalEventBroadcaster,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.GlobalEventBroadcaster = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeLayoutManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTLayoutManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.LayoutManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeMediaTypeDetectionHelper(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTMediaTypeDetectionHelper,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.MediaTypeDetectionHelper = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeModuleManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTModuleManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.ModuleManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeOfficeFrameLoader(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTOfficeFrameLoader,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.OfficeFrameLoader = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframePopupMenuController(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTPopupMenuController,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.PopupMenuController = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframePopupMenuControllerFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTPopupMenuControllerFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.PopupMenuControllerFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeProtocolHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTProtocolHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.ProtocolHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeSessionListener(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTSessionListener,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.SessionListener = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeSessionManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTSessionManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.SessionManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Settings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeStartModule(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTStartModule,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.StartModule = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeStatusbarController(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTStatusbarController,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.StatusbarController = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeStatusbarControllerFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTStatusbarControllerFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.StatusbarControllerFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeSynchronousFrameLoader(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTSynchronousFrameLoader,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.SynchronousFrameLoader = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeTask(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTTask,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Task = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeTaskCreator(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTTaskCreator,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.TaskCreator = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeTemplateAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTTemplateAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.TemplateAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeToolbarController(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTToolbarController,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.ToolbarController = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeToolbarControllerFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTToolbarControllerFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.ToolbarControllerFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeTransientDocumentsDocumentContentFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTTransientDocumentsDocumentContentFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.TransientDocumentsDocumentContentFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarframeUICommandDescription(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTUICommandDescription,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.UICommandDescription = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstargalleryGalleryItem(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgalleryDOTGalleryItem,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs.GalleryItem = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstargalleryGalleryTheme(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgalleryDOTGalleryTheme,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs.GalleryTheme = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstargalleryGalleryThemeProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgalleryDOTGalleryThemeProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs.GalleryThemeProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstargraphicGraphic(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTGraphic,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.Graphic = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstargraphicGraphicDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTGraphicDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstargraphicGraphicObject(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTGraphicObject,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicObject = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstargraphicGraphicProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTGraphicProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstargraphicGraphicRasterizer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTGraphicRasterizer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicRasterizer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstargraphicGraphicRendererVCL(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTGraphicRendererVCL,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicRendererVCL = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstargraphicMediaProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTMediaProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.MediaProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstargraphicPrimitive2DTools(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTPrimitive2DTools,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.Primitive2DTools = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstargraphicPrimitiveFactory2D(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTPrimitiveFactory2D,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.PrimitiveFactory2D = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstargraphicSvgTools(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTSvgTools,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.SvgTools = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstari18nBreakIterator(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTBreakIterator,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.BreakIterator = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstari18nChapterCollator(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTChapterCollator,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.ChapterCollator = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstari18nCharacterClassification(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTCharacterClassification,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.CharacterClassification = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstari18nCollator(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTCollator,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.Collator = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstari18nIndexEntrySupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTIndexEntrySupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.IndexEntrySupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstari18nInputSequenceChecker(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTInputSequenceChecker,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.InputSequenceChecker = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstari18nLocaleCalendar(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTLocaleCalendar,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.LocaleCalendar = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstari18nLocaleCalendar2(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTLocaleCalendar2,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.LocaleCalendar2 = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstari18nLocaleData(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTLocaleData,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.LocaleData = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstari18nNativeNumberSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTNativeNumberSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.NativeNumberSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstari18nNumberFormatMapper(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTNumberFormatMapper,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.NumberFormatMapper = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstari18nOrdinalSuffix(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTOrdinalSuffix,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.OrdinalSuffix = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstari18nTextConversion(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTTextConversion,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TextConversion = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstari18nTransliteration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTTransliteration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.Transliteration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarimageImageMap(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTimageDOTImageMap,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs.ImageMap = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarimageImageMapCircleObject(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTimageDOTImageMapCircleObject,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs.ImageMapCircleObject = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarimageImageMapObject(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTimageDOTImageMapObject,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs.ImageMapObject = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarimageImageMapPolygonObject(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTimageDOTImageMapPolygonObject,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs.ImageMapPolygonObject = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarimageImageMapRectangleObject(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTimageDOTImageMapRectangleObject,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs.ImageMapRectangleObject = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarinspectionDefaultHelpProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTinspectionDOTDefaultHelpProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.DefaultHelpProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarinspectionGenericPropertyHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTinspectionDOTGenericPropertyHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.GenericPropertyHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarinspectionObjectInspector(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTinspectionDOTObjectInspector,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.ObjectInspector = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarinspectionObjectInspectorModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTinspectionDOTObjectInspectorModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.ObjectInspectorModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarinspectionStringRepresentation(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTinspectionDOTStringRepresentation,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.StringRepresentation = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarioDataInputStream(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTDataInputStream,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.DataInputStream = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarioDataOutputStream(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTDataOutputStream,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.DataOutputStream = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarioMarkableInputStream(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTMarkableInputStream,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.MarkableInputStream = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarioMarkableOutputStream(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTMarkableOutputStream,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.MarkableOutputStream = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarioObjectInputStream(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTObjectInputStream,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.ObjectInputStream = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarioObjectOutputStream(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTObjectOutputStream,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.ObjectOutputStream = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarioPipe(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTPipe,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.Pipe = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarioPump(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTPump,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.Pump = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarioSequenceInputStream(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTSequenceInputStream,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.SequenceInputStream = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarioSequenceOutputStream(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTSequenceOutputStream,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.SequenceOutputStream = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarioTempFile(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTTempFile,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.TempFile = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarioTextInputStream(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTTextInputStream,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.TextInputStream = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarioTextOutputStream(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTTextOutputStream,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.TextOutputStream = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarjavaJavaVirtualMachine(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTjavaDOTJavaVirtualMachine,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.javaNs.JavaVirtualMachine = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlangMultiServiceFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlangDOTMultiServiceFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): MultiServiceFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlangRegistryServiceManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlangDOTRegistryServiceManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): RegistryServiceManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlangServiceManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlangDOTServiceManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): ServiceManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlinguistic2ConversionDictionary(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTConversionDictionary,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.ConversionDictionary = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlinguistic2ConversionDictionaryList(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTConversionDictionaryList,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.ConversionDictionaryList = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlinguistic2Dictionary(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTDictionary,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.Dictionary = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlinguistic2DictionaryList(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTDictionaryList,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryList = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlinguistic2HangulHanjaConversionDictionary(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTHangulHanjaConversionDictionary,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.HangulHanjaConversionDictionary = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlinguistic2Hyphenator(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTHyphenator,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.Hyphenator = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlinguistic2LanguageGuessing(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTLanguageGuessing,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.LanguageGuessing = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlinguistic2LinguProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTLinguProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.LinguProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlinguistic2LinguServiceManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTLinguServiceManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.LinguServiceManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlinguistic2Proofreader(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTProofreader,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.Proofreader = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlinguistic2ProofreadingIterator(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTProofreadingIterator,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.ProofreadingIterator = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlinguistic2SpellChecker(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTSpellChecker,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.SpellChecker = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarlinguistic2Thesaurus(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTThesaurus,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.Thesaurus = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarloaderDynamic(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloaderDOTDynamic,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loaderNs.Dynamic = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarloaderJava(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloaderDOTJava,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loaderNs.Java = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarloaderJava2(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloaderDOTJava2,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loaderNs.Java2 = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarloaderSharedLibrary(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloaderDOTSharedLibrary,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loaderNs.SharedLibrary = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarloggingConsoleHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloggingDOTConsoleHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.ConsoleHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarloggingCsvLogFormatter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloggingDOTCsvLogFormatter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.CsvLogFormatter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarloggingFileHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloggingDOTFileHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.FileHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarloggingPlainTextFormatter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloggingDOTPlainTextFormatter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.PlainTextFormatter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarloggingSimpleLogRing(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloggingDOTSimpleLogRing,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.SimpleLogRing = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarmailMailMessage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTmailDOTMailMessage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs.MailMessage = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarmailMailServiceProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTmailDOTMailServiceProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs.MailServiceProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarmediaManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTmediaDOTManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs.Manager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarmozillaMenuProxy(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTmozillaDOTMenuProxy,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs.MenuProxy = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarmozillaMenuProxyListener(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTmozillaDOTMenuProxyListener,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs.MenuProxyListener = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarmozillaMozillaBootstrap(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTmozillaDOTMozillaBootstrap,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs.MozillaBootstrap = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarofficeQuickstart(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTofficeDOTQuickstart,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.officeNs.Quickstart = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpackagesPackage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpackagesDOTPackage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.Package = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpackagesPackageFolder(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpackagesDOTPackageFolder,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.PackageFolder = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpackagesPackageFolderEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpackagesDOTPackageFolderEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.PackageFolderEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpackagesPackageStream(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpackagesDOTPackageStream,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.PackageStream = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpackagesmanifestManifestReader(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpackagesDOTmanifestDOTManifestReader,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.manifestNs.ManifestReader = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpackagesmanifestManifestWriter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpackagesDOTmanifestDOTManifestWriter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.manifestNs.ManifestWriter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpackageszipZipFileAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpackagesDOTzipDOTZipFileAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.zipNs.ZipFileAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationChartShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTChartShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ChartShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationCustomPresentation(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTCustomPresentation,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.CustomPresentation = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationCustomPresentationAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTCustomPresentationAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.CustomPresentationAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationDateTimeShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTDateTimeShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.DateTimeShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationDocumentSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTDocumentSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.DocumentSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationDrawPage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTDrawPage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.DrawPage = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationFooterShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTFooterShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.FooterShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationGraphicObjectShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTGraphicObjectShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.GraphicObjectShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationHandoutShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTHandoutShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.HandoutShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationHandoutView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTHandoutView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.HandoutView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationHeaderShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTHeaderShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.HeaderShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationNotesShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTNotesShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.NotesShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationNotesView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTNotesView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.NotesView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationOLE2Shape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTOLE2Shape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.OLE2Shape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationOutlineView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTOutlineView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.OutlineView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationOutlinerShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTOutlinerShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.OutlinerShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationPageShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTPageShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.PageShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationPresentation(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTPresentation,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.Presentation = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationPresentation2(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTPresentation2,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.Presentation2 = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationPresentationDocument(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTPresentationDocument,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.PresentationDocument = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationPresentationView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTPresentationView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.PresentationView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationPreviewView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTPreviewView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.PreviewView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.Shape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationSlideNumberShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTSlideNumberShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.SlideNumberShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationSlideShow(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTSlideShow,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.SlideShow = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationSlidesView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTSlidesView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.SlidesView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationSubtitleShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTSubtitleShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.SubtitleShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationTitleTextShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTTitleTextShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.TitleTextShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationTransitionFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTTransitionFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.TransitionFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationtextfieldDateTime(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTtextfieldDOTDateTime,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.textfieldNs.DateTime = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationtextfieldFooter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTtextfieldDOTFooter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.textfieldNs.Footer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarpresentationtextfieldHeader(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTtextfieldDOTHeader,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.textfieldNs.Header = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarrdfBlankNode(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrdfDOTBlankNode,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs.BlankNode = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarrdfLiteral(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrdfDOTLiteral,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs.Literal = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarrdfRepository(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrdfDOTRepository,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs.Repository = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarrdfURI(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrdfDOTURI,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs.URI = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreflectionCoreReflection(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreflectionDOTCoreReflection,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.CoreReflection = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreflectionProxyFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreflectionDOTProxyFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.ProxyFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreflectionTypeDescriptionManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreflectionDOTTypeDescriptionManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.TypeDescriptionManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreflectionTypeDescriptionProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreflectionDOTTypeDescriptionProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.TypeDescriptionProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarregistryDefaultRegistry(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTregistryDOTDefaultRegistry,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.DefaultRegistry = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarregistryImplementationRegistration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTregistryDOTImplementationRegistration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.ImplementationRegistration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarregistryNestedRegistry(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTregistryDOTNestedRegistry,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.NestedRegistry = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarregistrySimpleRegistry(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTregistryDOTSimpleRegistry,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.SimpleRegistry = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarrenderingBitmapCanvas(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrenderingDOTBitmapCanvas,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.BitmapCanvas = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarrenderingCanvas(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrenderingDOTCanvas,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.Canvas = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarrenderingCanvasFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrenderingDOTCanvasFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.CanvasFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarrenderingMtfRenderer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrenderingDOTMtfRenderer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.MtfRenderer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportFixedLine(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTFixedLine,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.FixedLine = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportFixedText(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTFixedText,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.FixedText = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportFormatCondition(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTFormatCondition,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.FormatCondition = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportFormattedField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTFormattedField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.FormattedField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportFunction(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTFunction,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.Function = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportGroup(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTGroup,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.Group = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportGroups(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTGroups,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.Groups = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportImageControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTImageControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ImageControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportReportControlFormat(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTReportControlFormat,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ReportControlFormat = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportReportControlModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTReportControlModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ReportControlModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportReportDefinition(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTReportDefinition,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ReportDefinition = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportReportEngine(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTReportEngine,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ReportEngine = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportSection(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTSection,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.Section = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.Shape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportinspectionDataProviderHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTinspectionDOTDataProviderHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.inspectionNs.DataProviderHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportinspectionDefaultComponentInspectorModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTinspectionDOTDefaultComponentInspectorModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.inspectionNs.DefaultComponentInspectorModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarreportinspectionReportComponentHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTinspectionDOTReportComponentHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.inspectionNs.ReportComponentHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarresourceStringResource(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTresourceDOTStringResource,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs.StringResource = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarresourceStringResourceWithLocation(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTresourceDOTStringResourceWithLocation,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs.StringResourceWithLocation = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarresourceStringResourceWithStorage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTresourceDOTStringResourceWithStorage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs.StringResourceWithStorage = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscannerScannerManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscannerDOTScannerManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs.ScannerManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptAllListenerAdapter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTAllListenerAdapter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.AllListenerAdapter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptConverter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTConverter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.Converter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptDocumentDialogLibraryContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTDocumentDialogLibraryContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.DocumentDialogLibraryContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptDocumentScriptLibraryContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTDocumentScriptLibraryContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.DocumentScriptLibraryContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptEngine(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTEngine,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.Engine = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptInvocation(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTInvocation,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.Invocation = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptInvocationAdapterFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTInvocationAdapterFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.InvocationAdapterFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptJavaScript(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTJavaScript,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.JavaScript = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptbrowseBrowseNode(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTbrowseDOTBrowseNode,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.BrowseNode = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptbrowseBrowseNodeFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTbrowseDOTBrowseNodeFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.BrowseNodeFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptproviderLanguageScriptProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTLanguageScriptProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.LanguageScriptProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptproviderMasterScriptProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTMasterScriptProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.MasterScriptProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptproviderMasterScriptProviderFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTMasterScriptProviderFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.MasterScriptProviderFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptproviderScriptProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTScriptProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptproviderScriptProviderForBasic(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTScriptProviderForBasic,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptProviderForBasic = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptproviderScriptProviderForBeanShell(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTScriptProviderForBeanShell,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptProviderForBeanShell = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptproviderScriptProviderForJava(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTScriptProviderForJava,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptProviderForJava = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptproviderScriptProviderForJavaScript(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTScriptProviderForJavaScript,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptProviderForJavaScript = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptproviderScriptURIHelper(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTScriptURIHelper,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptURIHelper = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptvbaVBAEventProcessor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTvbaDOTVBAEventProcessor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs.VBAEventProcessor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptvbaVBAMacroResolver(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTvbaDOTVBAMacroResolver,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs.VBAMacroResolver = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptvbaVBASpreadsheetEventProcessor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTvbaDOTVBASpreadsheetEventProcessor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs.VBASpreadsheetEventProcessor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarscriptvbaVBATextEventProcessor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTvbaDOTVBATextEventProcessor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs.VBATextEventProcessor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbCallableStatement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTCallableStatement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.CallableStatement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbColumn(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTColumn,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.Column = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbColumnDescriptorControl(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTColumnDescriptorControl,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ColumnDescriptorControl = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbColumnDescriptorControlModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTColumnDescriptorControlModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ColumnDescriptorControlModel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbColumnSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTColumnSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ColumnSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbCommandDefinition(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTCommandDefinition,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.CommandDefinition = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbConnection(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTConnection,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.Connection = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbContentLoader(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTContentLoader,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ContentLoader = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDataAccessDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDataAccessDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DataAccessDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDataColumn(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDataColumn,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DataColumn = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDataSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDataSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DataSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDataSource(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDataSource,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DataSource = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDataSourceBrowser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDataSourceBrowser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DataSourceBrowser = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDatabaseAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDatabaseAccessConnection(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseAccessConnection,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseAccessConnection = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDatabaseAccessContext(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseAccessContext,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseAccessContext = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDatabaseAccessDataSource(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseAccessDataSource,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseAccessDataSource = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDatabaseContext(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseContext,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseContext = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDatabaseDocument(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseDocument,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseDocument = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDatabaseEnvironment(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseEnvironment,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseEnvironment = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDatabaseInteractionHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseInteractionHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseInteractionHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDatasourceAdministrationDialog(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatasourceAdministrationDialog,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatasourceAdministrationDialog = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDefinitionContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDefinitionContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DefinitionContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDefinitionContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDefinitionContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DefinitionContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDocument(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDocument,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.Document = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDocumentContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDocumentContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DocumentContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDocumentDataSource(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDocumentDataSource,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DocumentDataSource = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbDocumentDefinition(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDocumentDefinition,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DocumentDefinition = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbErrorMessageDialog(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTErrorMessageDialog,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ErrorMessageDialog = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbFilterDialog(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTFilterDialog,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.FilterDialog = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbForms(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTForms,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.Forms = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbInteractionHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTInteractionHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.InteractionHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbOfficeDatabaseDocument(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTOfficeDatabaseDocument,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.OfficeDatabaseDocument = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbOrderColumn(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTOrderColumn,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.OrderColumn = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbOrderDialog(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTOrderDialog,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.OrderDialog = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbPreparedStatement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTPreparedStatement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.PreparedStatement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbQuery(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTQuery,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.Query = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbQueryDefinition(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTQueryDefinition,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.QueryDefinition = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbQueryDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTQueryDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.QueryDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbQueryDesign(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTQueryDesign,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.QueryDesign = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbRelationDesign(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTRelationDesign,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.RelationDesign = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbReportDesign(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTReportDesign,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ReportDesign = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbReports(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTReports,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.Reports = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbResultColumn(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTResultColumn,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ResultColumn = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbResultSet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTResultSet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ResultSet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbRowSet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTRowSet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.RowSet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbSQLQueryComposer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTSQLQueryComposer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.SQLQueryComposer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbSingleSelectQueryAnalyzer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTSingleSelectQueryAnalyzer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.SingleSelectQueryAnalyzer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbSingleSelectQueryComposer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTSingleSelectQueryComposer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.SingleSelectQueryComposer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbTable(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTTable,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.Table = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbTableDefinition(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTTableDefinition,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.TableDefinition = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbTableDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTTableDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.TableDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbTableDesign(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTTableDesign,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.TableDesign = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbTextConnectionSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTTextConnectionSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.TextConnectionSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbapplicationCopyTableWizard(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTapplicationDOTCopyTableWizard,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.CopyTableWizard = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbapplicationDefaultViewController(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTapplicationDOTDefaultViewController,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.DefaultViewController = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbapplicationMacroMigrationWizard(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTapplicationDOTMacroMigrationWizard,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.MacroMigrationWizard = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcCallableStatement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTCallableStatement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.CallableStatement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcConnection(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTConnection,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.Connection = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcConnectionPool(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTConnectionPool,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ConnectionPool = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcConnectionProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTConnectionProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ConnectionProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcDBASEConnectionProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTDBASEConnectionProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.DBASEConnectionProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcDriver(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTDriver,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.Driver = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcDriverManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTDriverManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.DriverManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcFILEConnectionProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTFILEConnectionProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.FILEConnectionProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcFLATConnectionProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTFLATConnectionProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.FLATConnectionProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcJDBCConnectionProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTJDBCConnectionProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.JDBCConnectionProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcODBCConnectionProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTODBCConnectionProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ODBCConnectionProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcPreparedStatement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTPreparedStatement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.PreparedStatement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcResultSet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTResultSet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ResultSet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcRowSet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTRowSet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.RowSet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcStatement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTStatement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.Statement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxColumn(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTColumn,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Column = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxColumnDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTColumnDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.ColumnDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Container = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxDatabaseDefinition(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTDatabaseDefinition,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.DatabaseDefinition = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Descriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxDriver(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTDriver,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Driver = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxGroup(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTGroup,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Group = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxGroupDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTGroupDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.GroupDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxIndex(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTIndex,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Index = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxIndexColumn(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTIndexColumn,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.IndexColumn = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxIndexColumnDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTIndexColumnDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.IndexColumnDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxIndexDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTIndexDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.IndexDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxKey(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTKey,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Key = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxKeyColumn(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTKeyColumn,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.KeyColumn = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxKeyColumnDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTKeyColumnDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.KeyColumnDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxKeyDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTKeyDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.KeyDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxPreparedStatement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTPreparedStatement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.PreparedStatement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxReferenceColumn(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTReferenceColumn,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.ReferenceColumn = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxResultSet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTResultSet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.ResultSet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxStatement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTStatement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Statement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxTable(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTTable,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Table = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxTableDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTTableDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.TableDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxUser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTUser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.User = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxUserDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTUserDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.UserDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.View = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbcxViewDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTViewDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.ViewDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsdbtoolsConnectionTools(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTtoolsDOTConnectionTools,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.toolsNs.ConnectionTools = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsecurityAccessController(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsecurityDOTAccessController,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.AccessController = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsecurityCertificateContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsecurityDOTCertificateContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.CertificateContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsecurityDocumentDigitalSignatures(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsecurityDOTDocumentDigitalSignatures,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.DocumentDigitalSignatures = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsecurityPolicy(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsecurityDOTPolicy,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.Policy = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsecuritySerialNumberAdapter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsecurityDOTSerialNumberAdapter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.SerialNumberAdapter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsetupUpdateCheck(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsetupDOTUpdateCheck,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.setupNs.UpdateCheck = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsetupUpdateCheckConfig(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsetupDOTUpdateCheckConfig,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.setupNs.UpdateCheckConfig = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetAccessibleCell(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessibleCell,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessibleCell = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetAccessibleCsvCell(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessibleCsvCell,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessibleCsvCell = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetAccessibleCsvRuler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessibleCsvRuler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessibleCsvRuler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetAccessibleCsvTable(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessibleCsvTable,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessibleCsvTable = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetAccessiblePageHeaderFooterAreasView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessiblePageHeaderFooterAreasView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessiblePageHeaderFooterAreasView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetAccessibleSpreadsheet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessibleSpreadsheet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessibleSpreadsheet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetAccessibleSpreadsheetDocumentView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessibleSpreadsheetDocumentView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessibleSpreadsheetDocumentView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetAccessibleSpreadsheetPageView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessibleSpreadsheetPageView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessibleSpreadsheetPageView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetAddIn(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAddIn,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AddIn = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetCellAnnotation(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellAnnotation,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellAnnotation = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetCellAnnotationShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellAnnotationShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellAnnotationShape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetCellAnnotations(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellAnnotations,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellAnnotations = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetCellAnnotationsEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellAnnotationsEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellAnnotationsEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetCellAreaLink(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellAreaLink,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellAreaLink = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetCellAreaLinks(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellAreaLinks,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellAreaLinks = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetCellAreaLinksEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellAreaLinksEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellAreaLinksEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetCellFormatRanges(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellFormatRanges,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellFormatRanges = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetCellFormatRangesEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellFormatRangesEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellFormatRangesEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetCells(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCells,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Cells = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetCellsEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellsEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellsEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetColorScale(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTColorScale,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ColorScale = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetConditionFormatEntry(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTConditionFormatEntry,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionFormatEntry = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetConditionalFormat(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTConditionalFormat,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionalFormat = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetConsolidationDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTConsolidationDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConsolidationDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDDELink(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDDELink,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DDELink = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDDELinks(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDDELinks,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DDELinks = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDDELinksEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDDELinksEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DDELinksEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataBar(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataBar,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataBar = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotFieldGroup(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotFieldGroup,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldGroup = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotFieldGroupEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotFieldGroupEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldGroupEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotFieldGroupItem(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotFieldGroupItem,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldGroupItem = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotFieldGroups(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotFieldGroups,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldGroups = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotFieldGroupsEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotFieldGroupsEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldGroupsEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotFields(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotFields,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFields = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotFieldsEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotFieldsEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldsEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotItem(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotItem,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotItem = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotItems(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotItems,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotItems = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotItemsEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotItemsEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotItemsEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotSource(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSource,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSource = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotSourceDimension(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceDimension,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceDimension = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotSourceDimensions(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceDimensions,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceDimensions = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotSourceHierarchies(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceHierarchies,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceHierarchies = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotSourceHierarchy(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceHierarchy,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceHierarchy = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotSourceLevel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceLevel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceLevel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotSourceLevels(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceLevels,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceLevels = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotSourceMember(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceMember,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceMember = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotSourceMembers(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceMembers,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceMembers = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotTable(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotTable,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotTable = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotTables(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotTables,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotTables = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDataPilotTablesEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotTablesEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotTablesEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDatabaseImportDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDatabaseImportDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DatabaseImportDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDatabaseRange(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDatabaseRange,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DatabaseRange = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDatabaseRanges(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDatabaseRanges,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DatabaseRanges = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDatabaseRangesEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDatabaseRangesEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DatabaseRangesEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDateCondition(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDateCondition,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DateCondition = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetDocumentSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDocumentSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DocumentSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetExternalDocLink(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTExternalDocLink,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ExternalDocLink = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetExternalDocLinks(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTExternalDocLinks,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ExternalDocLinks = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetExternalSheetCache(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTExternalSheetCache,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ExternalSheetCache = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetFilterFormulaParser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTFilterFormulaParser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterFormulaParser = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetFormulaOpCodeMapper(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTFormulaOpCodeMapper,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaOpCodeMapper = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetFormulaParser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTFormulaParser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaParser = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetFunctionAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTFunctionAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FunctionAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetFunctionDescription(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTFunctionDescription,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FunctionDescription = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetFunctionDescriptionEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTFunctionDescriptionEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FunctionDescriptionEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetFunctionDescriptions(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTFunctionDescriptions,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FunctionDescriptions = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetGlobalSheetSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTGlobalSheetSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GlobalSheetSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetHeaderFooterContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTHeaderFooterContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.HeaderFooterContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetIconSet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTIconSet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.IconSet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetLabelRange(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTLabelRange,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.LabelRange = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetLabelRanges(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTLabelRanges,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.LabelRanges = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetLabelRangesEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTLabelRangesEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.LabelRangesEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetNamedRange(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTNamedRange,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.NamedRange = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetNamedRanges(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTNamedRanges,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.NamedRanges = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetNamedRangesEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTNamedRangesEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.NamedRangesEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetRangeSelectionArguments(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTRangeSelectionArguments,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.RangeSelectionArguments = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetRecentFunctions(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTRecentFunctions,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.RecentFunctions = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetScenario(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTScenario,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Scenario = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetScenarios(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTScenarios,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Scenarios = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetScenariosEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTScenariosEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ScenariosEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Shape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSheetCell(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetCell,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetCell = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSheetCellCursor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetCellCursor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetCellCursor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSheetCellRange(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetCellRange,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetCellRange = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSheetCellRanges(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetCellRanges,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetCellRanges = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSheetCellRangesEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetCellRangesEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetCellRangesEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSheetFilterDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetFilterDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetFilterDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSheetLink(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetLink,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetLink = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSheetLinks(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetLinks,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetLinks = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSheetLinksEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetLinksEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetLinksEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSheetRangesQuery(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetRangesQuery,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetRangesQuery = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSheetSortDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetSortDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetSortDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSheetSortDescriptor2(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetSortDescriptor2,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetSortDescriptor2 = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSolver(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSolver,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Solver = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSpreadsheet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Spreadsheet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSpreadsheetDocument(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetDocument,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetDocument = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSpreadsheetDocumentSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetDocumentSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetDocumentSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSpreadsheetDrawPage(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetDrawPage,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetDrawPage = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSpreadsheetView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSpreadsheetViewPane(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetViewPane,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetViewPane = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSpreadsheetViewPanesEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetViewPanesEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetViewPanesEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSpreadsheetViewSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetViewSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetViewSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSpreadsheets(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheets,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Spreadsheets = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSpreadsheetsEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetsEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetsEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSubTotalDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSubTotalDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SubTotalDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSubTotalField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSubTotalField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SubTotalField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetSubTotalFieldsEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSubTotalFieldsEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SubTotalFieldsEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetTableAutoFormat(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableAutoFormat,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableAutoFormat = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetTableAutoFormatEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableAutoFormatEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableAutoFormatEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetTableAutoFormatField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableAutoFormatField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableAutoFormatField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetTableAutoFormats(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableAutoFormats,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableAutoFormats = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetTableAutoFormatsEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableAutoFormatsEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableAutoFormatsEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetTableCellStyle(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableCellStyle,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableCellStyle = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetTableConditionalEntry(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableConditionalEntry,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableConditionalEntry = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetTableConditionalEntryEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableConditionalEntryEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableConditionalEntryEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetTableConditionalFormat(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableConditionalFormat,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableConditionalFormat = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetTablePageStyle(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTablePageStyle,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TablePageStyle = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetTableValidation(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableValidation,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableValidation = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetUniqueCellFormatRanges(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTUniqueCellFormatRanges,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.UniqueCellFormatRanges = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetUniqueCellFormatRangesEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTUniqueCellFormatRangesEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.UniqueCellFormatRangesEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsheetVolatileResult(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTVolatileResult,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.VolatileResult = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsmarttagsSmartTagAction(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsmarttagsDOTSmartTagAction,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.smarttagsNs.SmartTagAction = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsmarttagsSmartTagRecognizer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsmarttagsDOTSmartTagRecognizer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.smarttagsNs.SmartTagRecognizer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleCellStyle(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTCellStyle,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CellStyle = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleCharacterProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTCharacterProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleCharacterPropertiesAsian(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTCharacterPropertiesAsian,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleCharacterPropertiesComplex(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTCharacterPropertiesComplex,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleCharacterStyle(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTCharacterStyle,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterStyle = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleNumberingAlignment(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTNumberingAlignment,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.NumberingAlignment = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleNumberingLevel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTNumberingLevel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.NumberingLevel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleNumberingRule(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTNumberingRule,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.NumberingRule = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstylePageProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTPageProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.PageProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstylePageStyle(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTPageStyle,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.PageStyle = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleParagraphProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTParagraphProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleParagraphPropertiesAsian(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTParagraphPropertiesAsian,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesAsian = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleParagraphPropertiesComplex(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTParagraphPropertiesComplex,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesComplex = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleParagraphStyle(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTParagraphStyle,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphStyle = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleStyle(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTStyle,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.Style = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleStyleFamilies(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTStyleFamilies,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.StyleFamilies = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarstyleStyleFamily(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTStyleFamily,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.StyleFamily = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsystemSimpleCommandMail(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsystemDOTSimpleCommandMail,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SimpleCommandMail = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsystemSimpleSystemMail(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsystemDOTSimpleSystemMail,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SimpleSystemMail = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarsystemSystemShellExecute(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsystemDOTSystemShellExecute,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SystemShellExecute = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableAccessibleCellView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTAccessibleCellView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.AccessibleCellView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableAccessibleTableView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTAccessibleTableView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.AccessibleTableView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableCell(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTCell,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.Cell = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableCellCursor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTCellCursor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellCursor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableCellProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTCellProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableCellRange(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTCellRange,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRange = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableCellRangeListSource(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTCellRangeListSource,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeListSource = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableCellValueBinding(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTCellValueBinding,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellValueBinding = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableListPositionCellBinding(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTListPositionCellBinding,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ListPositionCellBinding = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableTableChart(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableChart,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableChart = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableTableCharts(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableCharts,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableCharts = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableTableChartsEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableChartsEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableChartsEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableTableColumn(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableColumn,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableColumn = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableTableColumns(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableColumns,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableColumns = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableTableColumnsEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableColumnsEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableColumnsEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableTableRow(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableRow,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableRow = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableTableRows(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableRows,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableRows = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableTableRowsEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableRowsEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableRowsEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableTableSortDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableSortDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableSortDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartableTableSortDescriptor2(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableSortDescriptor2,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableSortDescriptor2 = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartaskAsyncJob(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTAsyncJob,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.AsyncJob = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartaskInteractionHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTInteractionHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartaskInteractionRequestStringResolver(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTInteractionRequestStringResolver,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionRequestStringResolver = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartaskJob(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTJob,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.Job = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartaskJobExecutor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTJobExecutor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.JobExecutor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartaskPasswordContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTPasswordContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.PasswordContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartaskPasswordContainerInteractionHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTPasswordContainerInteractionHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.PasswordContainerInteractionHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartaskStatusIndicatorFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTStatusIndicatorFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.StatusIndicatorFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextAccessibleEndnoteView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleEndnoteView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleEndnoteView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextAccessibleFootnoteView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleFootnoteView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleFootnoteView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextAccessibleHeaderFooterView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleHeaderFooterView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleHeaderFooterView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextAccessiblePageView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessiblePageView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessiblePageView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextAccessibleParagraphView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleParagraphView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleParagraphView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextAccessibleTextDocumentPageView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleTextDocumentPageView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleTextDocumentPageView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextAccessibleTextDocumentView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleTextDocumentView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleTextDocumentView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextAccessibleTextEmbeddedObject(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleTextEmbeddedObject,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleTextEmbeddedObject = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextAccessibleTextFrameView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleTextFrameView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleTextFrameView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextAccessibleTextGraphicObject(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleTextGraphicObject,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleTextGraphicObject = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextAutoTextContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAutoTextContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AutoTextContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextAutoTextEntry(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAutoTextEntry,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AutoTextEntry = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextAutoTextGroup(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAutoTextGroup,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AutoTextGroup = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextBaseFrame(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTBaseFrame,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.BaseFrame = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextBaseFrameProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTBaseFrameProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.BaseFrameProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextBaseIndex(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTBaseIndex,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.BaseIndex = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextBaseIndexMark(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTBaseIndexMark,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.BaseIndexMark = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextBibliography(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTBibliography,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Bibliography = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextBookmark(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTBookmark,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Bookmark = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextBookmarks(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTBookmarks,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Bookmarks = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextCell(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTCell,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Cell = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextCellProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTCellProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.CellProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextCellRange(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTCellRange,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.CellRange = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextChainedTextFrame(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTChainedTextFrame,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ChainedTextFrame = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextChapterNumberingRule(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTChapterNumberingRule,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ChapterNumberingRule = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextContentIndex(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTContentIndex,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ContentIndex = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextContentIndexMark(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTContentIndexMark,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ContentIndexMark = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextDefaultNumberingProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDefaultNumberingProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DefaultNumberingProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextDefaults(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDefaults,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Defaults = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextDependentTextField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDependentTextField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DependentTextField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextDocumentIndex(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDocumentIndex,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DocumentIndex = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextDocumentIndexLevelFormat(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDocumentIndexLevelFormat,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DocumentIndexLevelFormat = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextDocumentIndexMark(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDocumentIndexMark,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DocumentIndexMark = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextDocumentIndexMarkAsian(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDocumentIndexMarkAsian,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DocumentIndexMarkAsian = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextDocumentIndexParagraphStyles(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDocumentIndexParagraphStyles,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DocumentIndexParagraphStyles = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextDocumentIndexes(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDocumentIndexes,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DocumentIndexes = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextDocumentSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDocumentSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DocumentSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextEndnote(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTEndnote,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Endnote = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextEndnoteSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTEndnoteSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.EndnoteSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextFootnote(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTFootnote,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Footnote = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextFootnoteSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTFootnoteSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FootnoteSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextFootnotes(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTFootnotes,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Footnotes = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextGenericTextDocument(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTGenericTextDocument,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.GenericTextDocument = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextGlobalDocument(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTGlobalDocument,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.GlobalDocument = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextGlobalSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTGlobalSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.GlobalSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextIllustrationsIndex(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTIllustrationsIndex,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.IllustrationsIndex = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextInContentMetadata(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTInContentMetadata,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.InContentMetadata = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextLineNumberingProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTLineNumberingProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.LineNumberingProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextMailMerge(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTMailMerge,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.MailMerge = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextModuleDispatcher(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTModuleDispatcher,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ModuleDispatcher = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextNumberingLevel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTNumberingLevel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.NumberingLevel = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextNumberingRules(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTNumberingRules,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.NumberingRules = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextNumberingStyle(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTNumberingStyle,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.NumberingStyle = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextObjectIndex(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTObjectIndex,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ObjectIndex = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextPageFootnoteInfo(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTPageFootnoteInfo,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PageFootnoteInfo = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextPagePrintSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTPagePrintSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PagePrintSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextParagraph(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTParagraph,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Paragraph = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextParagraphEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTParagraphEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ParagraphEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextPrintSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTPrintSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PrintSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextRedlinePortion(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTRedlinePortion,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.RedlinePortion = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextReferenceMark(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTReferenceMark,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ReferenceMark = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextReferenceMarks(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTReferenceMarks,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ReferenceMarks = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextShape(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTShape,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Shape = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTableColumns(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTableColumns,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TableColumns = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTableIndex(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTableIndex,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TableIndex = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTableRows(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTableRows,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TableRows = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextText(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTText,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Text = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextColumns(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextColumns,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextColumns = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextContentCollection(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextContentCollection,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentCollection = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextCursor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextCursor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextCursor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextDocument(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextDocument,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextDocument = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextDocumentView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextDocumentView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextDocumentView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextEmbeddedObject(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextEmbeddedObject,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextEmbeddedObject = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextEmbeddedObjects(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextEmbeddedObjects,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextEmbeddedObjects = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextFieldEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextFieldEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFieldEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextFieldMaster(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextFieldMaster,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFieldMaster = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextFieldMasters(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextFieldMasters,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFieldMasters = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextFields(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextFields,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFields = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextFrame(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextFrame,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFrame = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextFrames(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextFrames,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFrames = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextGraphicObject(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextGraphicObject,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextGraphicObject = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextGraphicObjects(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextGraphicObjects,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextGraphicObjects = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextLayoutCursor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextLayoutCursor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextLayoutCursor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextPageStyle(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextPageStyle,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextPageStyle = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextPortion(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextPortion,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextPortion = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextPortionEnumeration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextPortionEnumeration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextPortionEnumeration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextRange(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextRange,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextRange = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextRangeContentProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextRangeContentProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextRangeContentProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextRanges(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextRanges,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextRanges = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextSection(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextSection,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextSection = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextSections(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextSections,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextSections = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextSortDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextSortDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextSortDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextSortDescriptor2(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextSortDescriptor2,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextSortDescriptor2 = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextSortable(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextSortable,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextSortable = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextTable(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextTable,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextTable = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextTableCursor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextTableCursor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextTableCursor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextTableRow(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextTableRow,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextTableRow = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextTables(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextTables,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextTables = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextTextViewCursor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextViewCursor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextViewCursor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextUserDefinedIndex(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTUserDefinedIndex,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.UserDefinedIndex = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextUserIndex(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTUserIndex,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.UserIndex = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextUserIndexMark(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTUserIndexMark,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.UserIndexMark = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextViewSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTViewSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ViewSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextWebDocument(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTWebDocument,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WebDocument = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextfieldmasterBibliography(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTfieldmasterDOTBibliography,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs.Bibliography = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextfieldmasterDDE(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTfieldmasterDOTDDE,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs.DDE = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextfieldmasterDatabase(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTfieldmasterDOTDatabase,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs.Database = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextfieldmasterSetExpression(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTfieldmasterDOTSetExpression,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs.SetExpression = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartextfieldmasterUser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTfieldmasterDOTUser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs.User = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldAnnotation(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTAnnotation,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Annotation = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldAuthor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTAuthor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Author = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldBibliography(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTBibliography,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Bibliography = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldChapter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTChapter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Chapter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldCharacterCount(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTCharacterCount,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.CharacterCount = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldCombinedCharacters(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTCombinedCharacters,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.CombinedCharacters = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldConditionalText(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTConditionalText,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.ConditionalText = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldDDE(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDDE,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.DDE = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldDatabase(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDatabase,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Database = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldDatabaseName(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDatabaseName,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.DatabaseName = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldDatabaseNextSet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDatabaseNextSet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.DatabaseNextSet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldDatabaseNumberOfSet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDatabaseNumberOfSet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.DatabaseNumberOfSet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldDatabaseSetNumber(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDatabaseSetNumber,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.DatabaseSetNumber = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldDateTime(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDateTime,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.DateTime = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldDropDown(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDropDown,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.DropDown = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldEmbeddedObjectCount(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTEmbeddedObjectCount,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.EmbeddedObjectCount = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldExtendedUser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTExtendedUser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.ExtendedUser = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldFileName(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTFileName,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.FileName = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldGetExpression(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTGetExpression,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.GetExpression = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldGetReference(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTGetReference,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.GetReference = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldGraphicObjectCount(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTGraphicObjectCount,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.GraphicObjectCount = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldHiddenParagraph(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTHiddenParagraph,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.HiddenParagraph = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldHiddenText(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTHiddenText,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.HiddenText = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldInput(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTInput,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Input = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldInputUser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTInputUser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.InputUser = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldJumpEdit(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTJumpEdit,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.JumpEdit = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldMacro(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTMacro,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Macro = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldMetadataField(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTMetadataField,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.MetadataField = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldPageCount(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTPageCount,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.PageCount = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldPageNumber(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTPageNumber,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.PageNumber = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldParagraphCount(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTParagraphCount,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.ParagraphCount = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldReferencePageGet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTReferencePageGet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.ReferencePageGet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldReferencePageSet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTReferencePageSet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.ReferencePageSet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldScript(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTScript,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Script = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldSetExpression(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTSetExpression,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.SetExpression = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldTableCount(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTTableCount,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.TableCount = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldTableFormula(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTTableFormula,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.TableFormula = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldTemplateName(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTTemplateName,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.TemplateName = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldURL(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTURL,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.URL = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldUser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTUser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.User = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfieldWordCount(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTWordCount,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.WordCount = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfielddocinfoChangeAuthor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTChangeAuthor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.ChangeAuthor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfielddocinfoChangeDateTime(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTChangeDateTime,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.ChangeDateTime = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfielddocinfoCreateAuthor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTCreateAuthor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.CreateAuthor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfielddocinfoCreateDateTime(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTCreateDateTime,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.CreateDateTime = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfielddocinfoCustom(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTCustom,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.Custom = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfielddocinfoDescription(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTDescription,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.Description = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfielddocinfoEditTime(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTEditTime,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.EditTime = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfielddocinfoKeywords(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTKeywords,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.Keywords = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfielddocinfoPrintAuthor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTPrintAuthor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.PrintAuthor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfielddocinfoPrintDateTime(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTPrintDateTime,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.PrintDateTime = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfielddocinfoRevision(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTRevision,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.Revision = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfielddocinfoSubject(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTSubject,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.Subject = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstartexttextfielddocinfoTitle(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTTitle,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.Title = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbAnyCompareFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTAnyCompareFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.AnyCompareFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbCachedContentResultSet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedContentResultSet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedContentResultSet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbCachedContentResultSetFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedContentResultSetFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedContentResultSetFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbCachedContentResultSetStub(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedContentResultSetStub,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedContentResultSetStub = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbCachedContentResultSetStubFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedContentResultSetStubFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedContentResultSetStubFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbCachedDynamicResultSet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedDynamicResultSet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedDynamicResultSet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbCachedDynamicResultSetFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedDynamicResultSetFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedDynamicResultSetFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbCachedDynamicResultSetStub(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedDynamicResultSetStub,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedDynamicResultSetStub = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbCachedDynamicResultSetStubFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedDynamicResultSetStubFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedDynamicResultSetStubFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbCmisContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCmisContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CmisContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbCommandEnvironment(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCommandEnvironment,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CommandEnvironment = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.Content = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbContentProviderProxy(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTContentProviderProxy,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentProviderProxy = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbContentProviderProxyFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTContentProviderProxyFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentProviderProxyFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbContentResultSet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTContentResultSet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentResultSet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbContentTransmitter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTContentTransmitter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentTransmitter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbDefaultHierarchyDataSource(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTDefaultHierarchyDataSource,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.DefaultHierarchyDataSource = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbDynamicResultSet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTDynamicResultSet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.DynamicResultSet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbExpandContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTExpandContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ExpandContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbFTPContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTFTPContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FTPContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbFTPContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTFTPContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FTPContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbFileContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTFileContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FileContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbFileContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTFileContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FileContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbGIOContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTGIOContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.GIOContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbGnomeVFSContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTGnomeVFSContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.GnomeVFSContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbGnomeVFSDocumentContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTGnomeVFSDocumentContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.GnomeVFSDocumentContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbGnomeVFSFolderContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTGnomeVFSFolderContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.GnomeVFSFolderContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbHelpContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHelpContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HelpContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbHelpContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHelpContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HelpContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbHierarchyContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHierarchyContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HierarchyContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbHierarchyDataReadAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHierarchyDataReadAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HierarchyDataReadAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbHierarchyDataReadWriteAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHierarchyDataReadWriteAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HierarchyDataReadWriteAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbHierarchyDataSource(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHierarchyDataSource,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HierarchyDataSource = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbHierarchyFolderContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHierarchyFolderContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HierarchyFolderContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbHierarchyLinkContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHierarchyLinkContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HierarchyLinkContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbHierarchyRootFolderContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHierarchyRootFolderContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HierarchyRootFolderContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbODMAContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTODMAContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ODMAContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbODMAContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTODMAContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ODMAContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbPackageContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTPackageContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PackageContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbPackageFolderContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTPackageFolderContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PackageFolderContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbPackageStreamContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTPackageStreamContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PackageStreamContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbPersistentPropertySet(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTPersistentPropertySet,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PersistentPropertySet = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbPropertiesManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTPropertiesManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PropertiesManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbPropertySetRegistry(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTPropertySetRegistry,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PropertySetRegistry = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbRemoteAccessContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTRemoteAccessContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RemoteAccessContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbRemoteContentProviderAcceptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTRemoteContentProviderAcceptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RemoteContentProviderAcceptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbRemoteProxyContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTRemoteProxyContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RemoteProxyContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbSimpleFileAccess(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTSimpleFileAccess,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.SimpleFileAccess = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbSortedDynamicResultSetFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTSortedDynamicResultSetFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.SortedDynamicResultSetFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbStore(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTStore,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.Store = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbTransientDocumentsContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTTransientDocumentsContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.TransientDocumentsContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbTransientDocumentsDocumentContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTTransientDocumentsDocumentContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.TransientDocumentsDocumentContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbTransientDocumentsFolderContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTTransientDocumentsFolderContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.TransientDocumentsFolderContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbTransientDocumentsRootContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTTransientDocumentsRootContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.TransientDocumentsRootContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbTransientDocumentsStreamContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTTransientDocumentsStreamContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.TransientDocumentsStreamContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbUniversalContentBroker(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTUniversalContentBroker,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.UniversalContentBroker = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbWebDAVContentProvider(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTWebDAVContentProvider,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVContentProvider = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbWebDAVDocumentContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTWebDAVDocumentContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVDocumentContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarucbWebDAVFolderContent(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTWebDAVFolderContent,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVFolderContent = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiActionTrigger(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTActionTrigger,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ActionTrigger = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiActionTriggerContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTActionTriggerContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ActionTriggerContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiActionTriggerSeparator(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTActionTriggerSeparator,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ActionTriggerSeparator = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiAddressBookSourceDialog(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTAddressBookSourceDialog,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.AddressBookSourceDialog = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiConfigurableUIElement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTConfigurableUIElement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ConfigurableUIElement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiDocumentAcceleratorConfiguration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTDocumentAcceleratorConfiguration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.DocumentAcceleratorConfiguration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiGlobalAcceleratorConfiguration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTGlobalAcceleratorConfiguration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.GlobalAcceleratorConfiguration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiImageManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTImageManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ImageManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiItemDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTItemDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ItemDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiModuleAcceleratorConfiguration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTModuleAcceleratorConfiguration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ModuleAcceleratorConfiguration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiModuleUICategoryDescription(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTModuleUICategoryDescription,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ModuleUICategoryDescription = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiModuleUICommandDescription(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTModuleUICommandDescription,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ModuleUICommandDescription = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiModuleUIConfigurationManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTModuleUIConfigurationManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ModuleUIConfigurationManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiModuleWindowStateConfiguration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTModuleWindowStateConfiguration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ModuleWindowStateConfiguration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiUICategoryDescription(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTUICategoryDescription,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.UICategoryDescription = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiUIConfigurationManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTUIConfigurationManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.UIConfigurationManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiUIElement(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTUIElement,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.UIElement = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiUIElementFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTUIElementFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.UIElementFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiUIElementFactoryManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTUIElementFactoryManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.UIElementFactoryManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiUIElementSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTUIElementSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.UIElementSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiWindowContentFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTWindowContentFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.WindowContentFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiWindowContentFactoryManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTWindowContentFactoryManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.WindowContentFactoryManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruiWindowStateConfiguration(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTWindowStateConfiguration,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.WindowStateConfiguration = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruidialogsAddressBookSourcePilot(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTdialogsDOTAddressBookSourcePilot,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.AddressBookSourcePilot = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruidialogsFilePicker(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTdialogsDOTFilePicker,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.FilePicker = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruidialogsFilterOptionsDialog(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTdialogsDOTFilterOptionsDialog,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.FilterOptionsDialog = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruidialogsFolderPicker(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTdialogsDOTFolderPicker,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.FolderPicker = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruidialogsWizard(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTdialogsDOTWizard,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.Wizard = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruidialogsXSLTFilterDialog(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTdialogsDOTXSLTFilterDialog,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.XSLTFilterDialog = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruitestUITest(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTtestDOTUITest,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.testNs.UITest = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarunoNamingService(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTunoDOTNamingService,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.NamingService = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruriExternalUriReferenceTranslator(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuriDOTExternalUriReferenceTranslator,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs.ExternalUriReferenceTranslator = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruriUriReferenceFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuriDOTUriReferenceFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs.UriReferenceFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruriUriSchemeParser_vndDOTsunDOTstarDOTexpand(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuriDOTUriSchemeParser_vndDOTsunDOTstarDOTexpand,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs.UriSchemeParser_vndDOTsunDOTstarDOTexpand = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruriUriSchemeParser_vndDOTsunDOTstarDOTscript(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuriDOTUriSchemeParser_vndDOTsunDOTstarDOTscript,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs.UriSchemeParser_vndDOTsunDOTstarDOTscript = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstaruriVndSunStarPkgUrlReferenceFactory(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuriDOTVndSunStarPkgUrlReferenceFactory,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs.VndSunStarPkgUrlReferenceFactory = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilBootstrapMacroExpander(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTBootstrapMacroExpander,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.BootstrapMacroExpander = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilJobManager(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTJobManager,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.JobManager = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilMacroExpander(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTMacroExpander,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.MacroExpander = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilNumberFormatProperties(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTNumberFormatProperties,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.NumberFormatProperties = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilNumberFormatSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTNumberFormatSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.NumberFormatSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilNumberFormats(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTNumberFormats,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.NumberFormats = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilNumberFormatsSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTNumberFormatsSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.NumberFormatsSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilNumberFormatter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTNumberFormatter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.NumberFormatter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilOfficeInstallationDirectories(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTOfficeInstallationDirectories,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.OfficeInstallationDirectories = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilPathSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTPathSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.PathSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilPathSubstitution(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTPathSubstitution,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.PathSubstitution = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilReplaceDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTReplaceDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ReplaceDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilSearchDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTSearchDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SearchDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilSortDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTSortDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilSortDescriptor2(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTSortDescriptor2,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortDescriptor2 = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilSortable(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTSortable,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Sortable = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilTextSearch(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTTextSearch,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.TextSearch = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilTextSearch2(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTTextSearch2,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.TextSearch2 = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilURLTransformer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTURLTransformer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URLTransformer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarutilUriAbbreviation(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTUriAbbreviation,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.UriAbbreviation = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarviewOfficeDocumentView(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTviewDOTOfficeDocumentView,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.OfficeDocumentView = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarviewPrintOptions(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTviewDOTPrintOptions,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PrintOptions = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarviewPrintSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTviewDOTPrintSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PrintSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarviewPrinterDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTviewDOTPrinterDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PrinterDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarviewRenderDescriptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTviewDOTRenderDescriptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.RenderDescriptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarviewRenderOptions(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTviewDOTRenderOptions,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.RenderOptions = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarviewViewSettings(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTviewDOTViewSettings,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.ViewSettings = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxformsBinding(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxformsDOTBinding,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs.Binding = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxformsModel(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxformsDOTModel,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs.Model = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxformsXForms(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxformsDOTXForms,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs.XForms = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlAttributeContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTAttributeContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.AttributeContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlExportFilter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTExportFilter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.ExportFilter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlImportFilter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTImportFilter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.ImportFilter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlNamespaceContainer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTNamespaceContainer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.NamespaceContainer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlParaUserDefinedAttributesSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTParaUserDefinedAttributesSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.ParaUserDefinedAttributesSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlTextUserDefinedAttributesSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTTextUserDefinedAttributesSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.TextUserDefinedAttributesSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlUserDefinedAttributesSupplier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTUserDefinedAttributesSupplier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlXMLExportFilter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTXMLExportFilter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.XMLExportFilter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlXMLImportFilter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTXMLImportFilter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.XMLImportFilter = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlcryptoNSSInitializer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTNSSInitializer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.NSSInitializer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlcryptoSEInitializer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTSEInitializer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SEInitializer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlcryptoSecurityEnvironment(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTSecurityEnvironment,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityEnvironment = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlcryptoXMLEncryption(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTXMLEncryption,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.XMLEncryption = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlcryptoXMLEncryptionTemplate(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTXMLEncryptionTemplate,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.XMLEncryptionTemplate = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlcryptoXMLSecurityContext(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTXMLSecurityContext,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.XMLSecurityContext = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlcryptoXMLSignature(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTXMLSignature,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.XMLSignature = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlcryptoXMLSignatureTemplate(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTXMLSignatureTemplate,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.XMLSignatureTemplate = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlcryptosaxDecryptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTsaxDOTDecryptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.Decryptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlcryptosaxEncryptor(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTsaxDOTEncryptor,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.Encryptor = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlcryptosaxSAXEventKeeper(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTsaxDOTSAXEventKeeper,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.SAXEventKeeper = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlcryptosaxSignatureCreator(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTsaxDOTSignatureCreator,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.SignatureCreator = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlcryptosaxSignatureVerifier(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTsaxDOTSignatureVerifier,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.SignatureVerifier = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmldomDocumentBuilder(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTdomDOTDocumentBuilder,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.DocumentBuilder = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmldomSAXDocumentBuilder(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTdomDOTSAXDocumentBuilder,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.SAXDocumentBuilder = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlinputSaxDocumentHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTinputDOTSaxDocumentHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.inputNs.SaxDocumentHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlsaxFastParser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTsaxDOTFastParser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.FastParser = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlsaxFastShapeContextHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTsaxDOTFastShapeContextHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.FastShapeContextHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlsaxFastTokenHandler(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTsaxDOTFastTokenHandler,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.FastTokenHandler = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlsaxParser(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTsaxDOTParser,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.Parser = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlsaxWriter(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTsaxDOTWriter,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.Writer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlwrapperXMLDocumentWrapper(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTwrapperDOTXMLDocumentWrapper,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XMLDocumentWrapper = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlwrapperXMLElementWrapper(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTwrapperDOTXMLElementWrapper,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XMLElementWrapper = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlxpathXPathAPI(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTxpathDOTXPathAPI,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.xpathNs.XPathAPI = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlxpathXPathExtension(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTxpathDOTXPathExtension,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.xpathNs.XPathExtension = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlxsltXSLT2Transformer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTxsltDOTXSLT2Transformer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.xsltNs.XSLT2Transformer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxmlxsltXSLTTransformer(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTxsltDOTXSLTTransformer,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.xsltNs.XSLTTransformer = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxsdBoolean(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTBoolean,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.Boolean = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxsdDate(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTDate,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.Date = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxsdDateTime(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTDateTime,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.DateTime = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxsdDay(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTDay,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.Day = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxsdDecimal(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTDecimal,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.Decimal = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxsdMonth(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTMonth,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.Month = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxsdString(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTString,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.String = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxsdTime(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTTime,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.Time = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_comsunstarxsdYear(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTYear,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.Year = js.native
  @JSName("createInstanceWithArguments")
  def createInstanceWithArguments_orgfreedesktopPackageKitSyncDbusSessionHelper(
    ServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.orgDOTfreedesktopDOTPackageKitDOTSyncDbusSessionHelper,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashLibreofficeLib.orgNs.freedesktopNs.PackageKitNs.SyncDbusSessionHelper = js.native
  @JSName("createInstance")
  def createInstance_comsunstaraccessibilityAccessible(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTaccessibilityDOTAccessible
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.Accessible = js.native
  @JSName("createInstance")
  def createInstance_comsunstaraccessibilityAccessibleContext(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTaccessibilityDOTAccessibleContext
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.AccessibleContext = js.native
  @JSName("createInstance")
  def createInstance_comsunstaraccessibilityMSAAService(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTaccessibilityDOTMSAAService
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.MSAAService = js.native
  @JSName("createInstance")
  def createInstance_comsunstaranimationsAnimateColor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTAnimateColor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimateColor = js.native
  @JSName("createInstance")
  def createInstance_comsunstaranimationsAnimateMotion(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTAnimateMotion
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimateMotion = js.native
  @JSName("createInstance")
  def createInstance_comsunstaranimationsAnimateSet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTAnimateSet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimateSet = js.native
  @JSName("createInstance")
  def createInstance_comsunstaranimationsAudio(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTAudio
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.Audio = js.native
  @JSName("createInstance")
  def createInstance_comsunstaranimationsCommand(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTCommand
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.Command = js.native
  @JSName("createInstance")
  def createInstance_comsunstaranimationsIterateContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTIterateContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.IterateContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstaranimationsParallelTimeContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTParallelTimeContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.ParallelTimeContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstaranimationsSequenceTimeContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTanimationsDOTSequenceTimeContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.SequenceTimeContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarauthSSOManagerFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTauthDOTSSOManagerFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.authNs.SSOManagerFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarauthSSOPasswordCache(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTauthDOTSSOPasswordCache
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.authNs.SSOPasswordCache = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleCheckBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleCheckBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleCheckBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleComboBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleComboBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleComboBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleDropDownComboBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleDropDownComboBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleDropDownComboBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleDropDownListBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleDropDownListBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleDropDownListBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleEdit(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleEdit
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleEdit = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleFixedText(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleFixedText
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleFixedText = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleIconChoiceControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleIconChoiceControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleIconChoiceControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleIconChoiceControlEntry(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleIconChoiceControlEntry
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleIconChoiceControlEntry = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleList(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleList
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleList = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleListBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleListBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleListBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleListBoxList(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleListBoxList
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleListBoxList = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleListItem(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleListItem
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleListItem = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleMenu(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleMenu
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleMenu = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleMenuBar(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleMenuBar
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleMenuBar = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleMenuItem(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleMenuItem
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleMenuItem = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleMenuSeparator(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleMenuSeparator
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleMenuSeparator = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessiblePopupMenu(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessiblePopupMenu
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessiblePopupMenu = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleRadioButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleRadioButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleRadioButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleScrollBar(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleScrollBar
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleScrollBar = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleStatusBar(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleStatusBar
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleStatusBar = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleStatusBarItem(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleStatusBarItem
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleStatusBarItem = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleTabBar(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTabBar
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTabBar = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleTabBarPage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTabBarPage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTabBarPage = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleTabBarPageList(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTabBarPageList
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTabBarPageList = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleTabControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTabControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTabControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleTabPage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTabPage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTabPage = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleTextField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTextField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTextField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleToolBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleToolBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleToolBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleToolBoxItem(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleToolBoxItem
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleToolBoxItem = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleTreeListBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTreeListBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTreeListBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleTreeListBoxEntry(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleTreeListBoxEntry
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleTreeListBoxEntry = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAccessibleWindow(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAccessibleWindow
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AccessibleWindow = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAnimatedImagesControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAnimatedImagesControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AnimatedImagesControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAnimatedImagesControlModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAnimatedImagesControlModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AnimatedImagesControlModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtAsyncCallback(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTAsyncCallback
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.AsyncCallback = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtContainerWindowProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTContainerWindowProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ContainerWindowProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtDialogProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTDialogProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.DialogProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtDialogProvider2(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTDialogProvider2
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.DialogProvider2 = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtMenuBar(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTMenuBar
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MenuBar = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtPointer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTPointer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Pointer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtPopupMenu(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTPopupMenu
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.PopupMenu = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtPrinterServer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTPrinterServer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.PrinterServer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtRoadmapItem(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTRoadmapItem
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.RoadmapItem = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtSpinningProgressControlModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTSpinningProgressControlModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.SpinningProgressControlModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtTabController(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTTabController
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.TabController = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtTabControllerModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTTabControllerModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.TabControllerModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtToolkit(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTToolkit
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Toolkit = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlButtonModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlButtonModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlButtonModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlCheckBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlCheckBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlCheckBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlCheckBoxModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlCheckBoxModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlCheckBoxModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlComboBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlComboBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlComboBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlComboBoxModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlComboBoxModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlComboBoxModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlContainerModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlContainerModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlContainerModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlCurrencyField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlCurrencyField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlCurrencyField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlCurrencyFieldModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlCurrencyFieldModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlCurrencyFieldModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlDateField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlDateField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlDateField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlDateFieldModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlDateFieldModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlDateFieldModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlDialog(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlDialog
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlDialog = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlDialogElement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlDialogElement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlDialogElement = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlDialogModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlDialogModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlDialogModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlDialogModelProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlDialogModelProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlDialogModelProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlEdit(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlEdit
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlEdit = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlEditModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlEditModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlEditModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlFileControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFileControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFileControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlFileControlModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFileControlModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFileControlModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlFixedHyperlink(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFixedHyperlink
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFixedHyperlink = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlFixedHyperlinkModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFixedHyperlinkModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFixedHyperlinkModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlFixedLine(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFixedLine
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFixedLine = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlFixedLineModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFixedLineModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFixedLineModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlFixedText(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFixedText
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFixedText = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlFixedTextModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFixedTextModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFixedTextModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlFormattedField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFormattedField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFormattedField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlFormattedFieldModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlFormattedFieldModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlFormattedFieldModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlGroupBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlGroupBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlGroupBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlGroupBoxModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlGroupBoxModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlGroupBoxModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlImageControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlImageControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlImageControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlImageControlModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlImageControlModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlImageControlModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlListBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlListBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlListBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlListBoxModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlListBoxModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlListBoxModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlNumericField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlNumericField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlNumericField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlNumericFieldModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlNumericFieldModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlNumericFieldModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlPatternField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlPatternField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlPatternField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlPatternFieldModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlPatternFieldModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlPatternFieldModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlProgressBar(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlProgressBar
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlProgressBar = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlProgressBarModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlProgressBarModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlProgressBarModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlRadioButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlRadioButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlRadioButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlRadioButtonModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlRadioButtonModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlRadioButtonModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlRoadmap(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlRoadmap
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlRoadmap = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlRoadmapModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlRoadmapModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlRoadmapModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlScrollBar(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlScrollBar
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlScrollBar = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlScrollBarModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlScrollBarModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlScrollBarModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlSpinButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlSpinButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlSpinButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlSpinButtonModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlSpinButtonModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlSpinButtonModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlTimeField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlTimeField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlTimeField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtUnoControlTimeFieldModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTUnoControlTimeFieldModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlTimeFieldModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtgridDefaultGridColumnModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTgridDOTDefaultGridColumnModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs.DefaultGridColumnModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtgridDefaultGridDataModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTgridDOTDefaultGridDataModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs.DefaultGridDataModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtgridGridColumn(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTgridDOTGridColumn
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs.GridColumn = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtgridSortableGridDataModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTgridDOTSortableGridDataModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs.SortableGridDataModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtgridUnoControlGrid(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTgridDOTUnoControlGrid
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs.UnoControlGrid = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawtgridUnoControlGridModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTgridDOTUnoControlGridModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs.UnoControlGridModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawttabUnoControlTabPage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtabDOTUnoControlTabPage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs.UnoControlTabPage = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawttabUnoControlTabPageContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtabDOTUnoControlTabPageContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs.UnoControlTabPageContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawttabUnoControlTabPageContainerModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtabDOTUnoControlTabPageContainerModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs.UnoControlTabPageContainerModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawttabUnoControlTabPageModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtabDOTUnoControlTabPageModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs.UnoControlTabPageModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawttreeMutableTreeDataModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtreeDOTMutableTreeDataModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs.MutableTreeDataModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawttreeMutableTreeNode(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtreeDOTMutableTreeNode
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs.MutableTreeNode = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawttreeTreeControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtreeDOTTreeControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs.TreeControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarawttreeTreeControlModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTawtDOTtreeDOTTreeControlModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs.TreeControlModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbeansIntrospection(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbeansDOTIntrospection
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Introspection = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbeansPropertyBag(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbeansDOTPropertyBag
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyBag = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbeansPropertySet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbeansDOTPropertySet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertySet = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbridgeBridge(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTBridge
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.Bridge = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbridgeBridgeFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTBridgeFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.BridgeFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbridgeIiopBridge(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTIiopBridge
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.IiopBridge = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbridgeOleApplicationRegistration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTOleApplicationRegistration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.OleApplicationRegistration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbridgeOleBridgeSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTOleBridgeSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.OleBridgeSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbridgeOleBridgeSupplier2(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTOleBridgeSupplier2
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.OleBridgeSupplier2 = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbridgeOleBridgeSupplierVar1(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTOleBridgeSupplierVar1
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.OleBridgeSupplierVar1 = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbridgeOleObjectFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTOleObjectFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.OleObjectFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbridgeUnoUrlResolver(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTUnoUrlResolver
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.UnoUrlResolver = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbridgeUrpBridge(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOTUrpBridge
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.UrpBridge = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbridgeoleautomationApplicationRegistration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOToleautomationDOTApplicationRegistration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.oleautomationNs.ApplicationRegistration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbridgeoleautomationBridgeSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOToleautomationDOTBridgeSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.oleautomationNs.BridgeSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarbridgeoleautomationFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTbridgeDOToleautomationDOTFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.oleautomationNs.Factory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2Axis(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTAxis
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.Axis = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2CandleStickChartType(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTCandleStickChartType
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CandleStickChartType = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2CartesianCoordinateSystem2d(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTCartesianCoordinateSystem2d
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CartesianCoordinateSystem2d = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2CartesianCoordinateSystem3d(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTCartesianCoordinateSystem3d
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CartesianCoordinateSystem3d = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2ChartDocument(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTChartDocument
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ChartDocument = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2ChartDocumentWrapper(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTChartDocumentWrapper
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ChartDocumentWrapper = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2ChartType(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTChartType
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ChartType = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2ChartTypeManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTChartTypeManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ChartTypeManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2ChartTypeTemplate(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTChartTypeTemplate
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ChartTypeTemplate = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2CoordinateSystem(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTCoordinateSystem
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CoordinateSystem = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2CoordinateSystemType(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTCoordinateSystemType
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CoordinateSystemType = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2DataPoint(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTDataPoint
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.DataPoint = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2DataPointProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTDataPointProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.DataPointProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2DataSeries(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTDataSeries
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.DataSeries = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2Diagram(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTDiagram
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.Diagram = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2ErrorBar(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTErrorBar
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ErrorBar = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2ExponentialRegressionCurve(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTExponentialRegressionCurve
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ExponentialRegressionCurve = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2ExponentialScaling(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTExponentialScaling
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ExponentialScaling = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2FormattedString(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTFormattedString
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.FormattedString = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2GridProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTGridProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.GridProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2Legend(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTLegend
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.Legend = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2LinearRegressionCurve(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTLinearRegressionCurve
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LinearRegressionCurve = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2LinearScaling(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTLinearScaling
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LinearScaling = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2LogarithmicRegressionCurve(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTLogarithmicRegressionCurve
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LogarithmicRegressionCurve = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2LogarithmicScaling(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTLogarithmicScaling
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LogarithmicScaling = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2LogicTargetModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTLogicTargetModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LogicTargetModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2MovingAverageRegressionCurve(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTMovingAverageRegressionCurve
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.MovingAverageRegressionCurve = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2PolarCoordinateSystem2d(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTPolarCoordinateSystem2d
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PolarCoordinateSystem2d = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2PolarCoordinateSystem3d(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTPolarCoordinateSystem3d
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PolarCoordinateSystem3d = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2PolynomialRegressionCurve(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTPolynomialRegressionCurve
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PolynomialRegressionCurve = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2PotentialRegressionCurve(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTPotentialRegressionCurve
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PotentialRegressionCurve = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2PowerScaling(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTPowerScaling
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PowerScaling = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2PropertyPool(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTPropertyPool
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PropertyPool = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2RegressionCurve(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTRegressionCurve
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.RegressionCurve = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2RegressionCurveEquation(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTRegressionCurveEquation
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.RegressionCurveEquation = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2RegressionEquation(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTRegressionEquation
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.RegressionEquation = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2Scaling(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTScaling
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.Scaling = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2StandardDiagramCreationParameters(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTStandardDiagramCreationParameters
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.StandardDiagramCreationParameters = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2Title(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTTitle
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.Title = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2dataDataFilter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTDataFilter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.DataFilter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2dataDataProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTDataProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.DataProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2dataDataSequence(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTDataSequence
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.DataSequence = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2dataDataSink(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTDataSink
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.DataSink = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2dataDataSource(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTDataSource
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.DataSource = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2dataDatabaseDataProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTDatabaseDataProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.DatabaseDataProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2dataLabeledDataSequence(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTLabeledDataSequence
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.LabeledDataSequence = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2dataRangeHighlightListener(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTRangeHighlightListener
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.RangeHighlightListener = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2dataRangeHighlighter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTRangeHighlighter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.RangeHighlighter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchart2dataTabularDataProviderArguments(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchart2DOTdataDOTTabularDataProviderArguments
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.TabularDataProviderArguments = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartAccessibleChartDocumentView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTAccessibleChartDocumentView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.AccessibleChartDocumentView = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartAccessibleChartElement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTAccessibleChartElement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.AccessibleChartElement = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartAreaDiagram(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTAreaDiagram
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.AreaDiagram = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartBarDiagram(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTBarDiagram
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.BarDiagram = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartBubbleDiagram(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTBubbleDiagram
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.BubbleDiagram = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChart3DBarProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChart3DBarProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.Chart3DBarProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartArea(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartArea
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartArea = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartAxis(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartAxis
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxis = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartAxisXSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartAxisXSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisXSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartAxisYSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartAxisYSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisYSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartAxisZSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartAxisZSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisZSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartData(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartData
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartData = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartDataArray(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartDataArray
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataArray = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartDataPointProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartDataPointProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataPointProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartDataRowProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartDataRowProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataRowProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartDocument(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartDocument
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDocument = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartGrid(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartGrid
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartGrid = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartLegend(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartLegend
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLegend = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartLine(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartLine
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLine = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartPieSegmentProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartPieSegmentProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartPieSegmentProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartStatistics(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartStatistics
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartStatistics = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartTableAddressSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartTableAddressSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartTableAddressSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartTitle(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartTitle
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartTitle = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartTwoAxisXSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartTwoAxisXSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartTwoAxisXSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartChartTwoAxisYSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTChartTwoAxisYSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartTwoAxisYSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartDiagram(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTDiagram
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.Diagram = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartDim3DDiagram(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTDim3DDiagram
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.Dim3DDiagram = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartDonutDiagram(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTDonutDiagram
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.DonutDiagram = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartFilledNetDiagram(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTFilledNetDiagram
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.FilledNetDiagram = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartLineDiagram(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTLineDiagram
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.LineDiagram = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartNetDiagram(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTNetDiagram
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.NetDiagram = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartPieDiagram(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTPieDiagram
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.PieDiagram = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartStackableDiagram(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTStackableDiagram
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.StackableDiagram = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartStockDiagram(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTStockDiagram
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.StockDiagram = js.native
  @JSName("createInstance")
  def createInstance_comsunstarchartXYDiagram(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTchartDOTXYDiagram
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XYDiagram = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationAccessRootElement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTAccessRootElement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.AccessRootElement = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationAdministrationProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTAdministrationProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.AdministrationProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationConfigurationAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTConfigurationAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.ConfigurationAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationConfigurationProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTConfigurationProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.ConfigurationProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationConfigurationRegistry(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTConfigurationRegistry
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.ConfigurationRegistry = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationConfigurationUpdateAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTConfigurationUpdateAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.ConfigurationUpdateAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationDefaultProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTDefaultProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.DefaultProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationGroupAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTGroupAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.GroupAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationGroupElement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTGroupElement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.GroupElement = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationGroupUpdate(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTGroupUpdate
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.GroupUpdate = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationHierarchyAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTHierarchyAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.HierarchyAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationHierarchyElement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTHierarchyElement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.HierarchyElement = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationPropertyHierarchy(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTPropertyHierarchy
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.PropertyHierarchy = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationReadOnlyAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTReadOnlyAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.ReadOnlyAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationReadWriteAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTReadWriteAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.ReadWriteAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationSetAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTSetAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.SetAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationSetElement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTSetElement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.SetElement = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationSetUpdate(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTSetUpdate
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.SetUpdate = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationSimpleSetAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTSimpleSetAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.SimpleSetAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationSimpleSetUpdate(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTSimpleSetUpdate
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.SimpleSetUpdate = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationUpdateRootElement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTUpdateRootElement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.UpdateRootElement = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendBackend(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTBackend
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.Backend = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendBackendAdapter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTBackendAdapter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.BackendAdapter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendCopyImporter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTCopyImporter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.CopyImporter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendDataImporter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTDataImporter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.DataImporter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendDefaultBackend(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTDefaultBackend
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.DefaultBackend = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendHierarchyBrowser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTHierarchyBrowser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.HierarchyBrowser = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendImporter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTImporter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.Importer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendInteractionHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTInteractionHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.InteractionHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendLayer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLayer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.Layer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendLayerDescriber(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLayerDescriber
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LayerDescriber = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendLayerFilter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLayerFilter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LayerFilter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendLayerUpdateMerger(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLayerUpdateMerger
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LayerUpdateMerger = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendLdapMultiLayerStratum(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLdapMultiLayerStratum
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LdapMultiLayerStratum = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendLdapSingleBackend(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLdapSingleBackend
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LdapSingleBackend = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendLdapSingleStratum(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLdapSingleStratum
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LdapSingleStratum = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendLocalDataImporter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLocalDataImporter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LocalDataImporter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendLocalHierarchyBrowser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLocalHierarchyBrowser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LocalHierarchyBrowser = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendLocalSchemaSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLocalSchemaSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LocalSchemaSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendLocalSingleBackend(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLocalSingleBackend
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LocalSingleBackend = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendLocalSingleStratum(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTLocalSingleStratum
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.LocalSingleStratum = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendMergeImporter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTMergeImporter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.MergeImporter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendMultiLayerStratum(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTMultiLayerStratum
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.MultiLayerStratum = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendMultiStratumBackend(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTMultiStratumBackend
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.MultiStratumBackend = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendOfflineBackend(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTOfflineBackend
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.OfflineBackend = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendOnlineBackend(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTOnlineBackend
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.OnlineBackend = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendPlatformBackend(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTPlatformBackend
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.PlatformBackend = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendSchema(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTSchema
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.Schema = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendSchemaSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTSchemaSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SchemaSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendSingleBackend(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTSingleBackend
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SingleBackend = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendSingleBackendAdapter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTSingleBackendAdapter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SingleBackendAdapter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendSingleLayerStratum(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTSingleLayerStratum
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SingleLayerStratum = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendSystemIntegration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTSystemIntegration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.SystemIntegration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendUpdatableLayer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTUpdatableLayer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.UpdatableLayer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendxmlLayerParser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTxmlDOTLayerParser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.xmlNs.LayerParser = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendxmlLayerWriter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTxmlDOTLayerWriter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.xmlNs.LayerWriter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbackendxmlSchemaParser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbackendDOTxmlDOTSchemaParser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs.xmlNs.SchemaParser = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconfigurationbootstrapBootstrapContext(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconfigurationDOTbootstrapDOTBootstrapContext
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.bootstrapNs.BootstrapContext = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconnectionAcceptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconnectionDOTAcceptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.connectionNs.Acceptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarconnectionConnector(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTconnectionDOTConnector
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.connectionNs.Connector = js.native
  @JSName("createInstance")
  def createInstance_comsunstarcontainerEnumerableMap(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTcontainerDOTEnumerableMap
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.EnumerableMap = js.native
  @JSName("createInstance")
  def createInstance_comsunstarcuiColorPicker(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTcuiDOTColorPicker
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.cuiNs.ColorPicker = js.native
  @JSName("createInstance")
  def createInstance_comsunstardatatransferDataFormatTranslator(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTDataFormatTranslator
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.DataFormatTranslator = js.native
  @JSName("createInstance")
  def createInstance_comsunstardatatransferMimeContentTypeFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTMimeContentTypeFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.MimeContentTypeFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstardatatransferclipboardClipboardManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTclipboardDOTClipboardManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.ClipboardManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstardatatransferclipboardGenericClipboard(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTclipboardDOTGenericClipboard
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.GenericClipboard = js.native
  @JSName("createInstance")
  def createInstance_comsunstardatatransferclipboardSystemClipboard(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTclipboardDOTSystemClipboard
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.SystemClipboard = js.native
  @JSName("createInstance")
  def createInstance_comsunstardatatransferdndOleDragSource(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTdndDOTOleDragSource
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.OleDragSource = js.native
  @JSName("createInstance")
  def createInstance_comsunstardatatransferdndOleDropTarget(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTdndDOTOleDropTarget
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.OleDropTarget = js.native
  @JSName("createInstance")
  def createInstance_comsunstardatatransferdndX11DragSource(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTdndDOTX11DragSource
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.X11DragSource = js.native
  @JSName("createInstance")
  def createInstance_comsunstardatatransferdndX11DropTarget(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdatatransferDOTdndDOTX11DropTarget
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.X11DropTarget = js.native
  @JSName("createInstance")
  def createInstance_comsunstardeploymentPackageRegistryBackend(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdeploymentDOTPackageRegistryBackend
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.PackageRegistryBackend = js.native
  @JSName("createInstance")
  def createInstance_comsunstardeploymentUpdateInformationProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdeploymentDOTUpdateInformationProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.UpdateInformationProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstardeploymenttestSmoketestCommandEnvironment(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdeploymentDOTtestDOTSmoketestCommandEnvironment
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.testNs.SmoketestCommandEnvironment = js.native
  @JSName("createInstance")
  def createInstance_comsunstardeploymentuiLicenseDialog(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdeploymentDOTuiDOTLicenseDialog
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.uiNs.LicenseDialog = js.native
  @JSName("createInstance")
  def createInstance_comsunstardeploymentuiPackageManagerDialog(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdeploymentDOTuiDOTPackageManagerDialog
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.uiNs.PackageManagerDialog = js.native
  @JSName("createInstance")
  def createInstance_comsunstardeploymentuiUpdateRequiredDialog(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdeploymentDOTuiDOTUpdateRequiredDialog
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.uiNs.UpdateRequiredDialog = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentDocumentProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTDocumentProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.DocumentProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentDocumentRevisionListPersistence(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTDocumentRevisionListPersistence
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.DocumentRevisionListPersistence = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentEventDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTEventDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.EventDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentEvents(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTEvents
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.Events = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentExportFilter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTExportFilter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.ExportFilter = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentExtendedTypeDetection(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTExtendedTypeDetection
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.ExtendedTypeDetection = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentExtendedTypeDetectionFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTExtendedTypeDetectionFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.ExtendedTypeDetectionFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentFilterAdapter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTFilterAdapter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.FilterAdapter = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentFilterConfigRefresh(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTFilterConfigRefresh
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.FilterConfigRefresh = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentFilterFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTFilterFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.FilterFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentGraphicObjectResolver(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTGraphicObjectResolver
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.GraphicObjectResolver = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentHeaderFooterSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTHeaderFooterSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.HeaderFooterSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentImportFilter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTImportFilter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.ImportFilter = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentIndexedPropertyValues(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTIndexedPropertyValues
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.IndexedPropertyValues = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentLinkTarget(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTLinkTarget
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.LinkTarget = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentLinkTargets(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTLinkTargets
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.LinkTargets = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentMediaDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTMediaDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.MediaDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentNamedPropertyValues(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTNamedPropertyValues
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.NamedPropertyValues = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentOOXMLDocumentPropertiesImporter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTOOXMLDocumentPropertiesImporter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.OOXMLDocumentPropertiesImporter = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentOfficeDocument(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTOfficeDocument
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.OfficeDocument = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentOleEmbeddedServerRegistration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTOleEmbeddedServerRegistration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.OleEmbeddedServerRegistration = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentPDFDialog(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTPDFDialog
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.PDFDialog = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.Settings = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentTypeDetection(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTTypeDetection
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.TypeDetection = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentXMLBasicExporter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTXMLBasicExporter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XMLBasicExporter = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentXMLBasicImporter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTXMLBasicImporter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XMLBasicImporter = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentXMLOasisBasicExporter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTXMLOasisBasicExporter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XMLOasisBasicExporter = js.native
  @JSName("createInstance")
  def createInstance_comsunstardocumentXMLOasisBasicImporter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdocumentDOTXMLOasisBasicImporter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XMLOasisBasicImporter = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingAccessibleDrawDocumentView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleDrawDocumentView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleDrawDocumentView = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingAccessibleGraphControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleGraphControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleGraphControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingAccessibleGraphicShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleGraphicShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleGraphicShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingAccessibleImageBullet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleImageBullet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleImageBullet = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingAccessibleOLEShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleOLEShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleOLEShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingAccessibleShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingAccessibleSlideView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleSlideView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleSlideView = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingAccessibleSlideViewObject(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAccessibleSlideViewObject
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AccessibleSlideViewObject = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingAppletShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTAppletShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.AppletShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingBackground(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTBackground
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Background = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingBitmapTable(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTBitmapTable
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.BitmapTable = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingCaptionShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTCaptionShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CaptionShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingClosedBezierShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTClosedBezierShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ClosedBezierShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingColorTable(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTColorTable
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ColorTable = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingConnectorProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTConnectorProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectorProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingConnectorShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTConnectorShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectorShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingControlShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTControlShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ControlShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingCustomShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTCustomShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CustomShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingCustomShapeEngine(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTCustomShapeEngine
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.CustomShapeEngine = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingDashTable(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDashTable
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DashTable = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingDefaults(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDefaults
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Defaults = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingDocumentSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDocumentSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DocumentSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingDrawPage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDrawPage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawPage = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingDrawPages(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDrawPages
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawPages = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingDrawingDocument(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDrawingDocument
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawingDocument = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingDrawingDocumentDrawView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDrawingDocumentDrawView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawingDocumentDrawView = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingDrawingDocumentFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTDrawingDocumentFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawingDocumentFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingEllipseShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTEllipseShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EllipseShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingEnhancedCustomShapeExtrusion(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTEnhancedCustomShapeExtrusion
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EnhancedCustomShapeExtrusion = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingEnhancedCustomShapeGeometry(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTEnhancedCustomShapeGeometry
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EnhancedCustomShapeGeometry = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingEnhancedCustomShapeHandle(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTEnhancedCustomShapeHandle
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EnhancedCustomShapeHandle = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingEnhancedCustomShapePath(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTEnhancedCustomShapePath
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EnhancedCustomShapePath = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingEnhancedCustomShapeTextPath(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTEnhancedCustomShapeTextPath
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EnhancedCustomShapeTextPath = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingFillProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTFillProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingGenericDrawPage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTGenericDrawPage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.GenericDrawPage = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingGenericDrawingDocument(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTGenericDrawingDocument
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.GenericDrawingDocument = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingGradientTable(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTGradientTable
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.GradientTable = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingGraphicExportFilter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTGraphicExportFilter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.GraphicExportFilter = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingGraphicObjectShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTGraphicObjectShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.GraphicObjectShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingGroupShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTGroupShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.GroupShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingHatchTable(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTHatchTable
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HatchTable = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingLayer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTLayer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Layer = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingLayerManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTLayerManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LayerManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingLineProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTLineProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingLineShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTLineShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingMarkerTable(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTMarkerTable
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MarkerTable = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingMasterPage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTMasterPage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MasterPage = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingMasterPages(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTMasterPages
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MasterPages = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingMeasureProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTMeasureProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingMeasureShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTMeasureShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingModuleDispatcher(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTModuleDispatcher
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ModuleDispatcher = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingOLE2Shape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTOLE2Shape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.OLE2Shape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingOpenBezierShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTOpenBezierShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.OpenBezierShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingPageShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTPageShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PageShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingPluginShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTPluginShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PluginShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingPolyLineShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTPolyLineShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyLineShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingPolyPolygonBezierDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTPolyPolygonBezierDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingPolyPolygonBezierShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTPolyPolygonBezierShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingPolyPolygonDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTPolyPolygonDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingPolyPolygonShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTPolyPolygonShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingRectangleShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTRectangleShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectangleShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingRotationDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTRotationDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RotationDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingShadowProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTShadowProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ShadowProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Shape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingShapeCollection(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTShapeCollection
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ShapeCollection = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingShapes(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTShapes
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Shapes = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingSlideRenderer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTSlideRenderer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.SlideRenderer = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingSlideSorter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTSlideSorter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.SlideSorter = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingText(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTText
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Text = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingTextProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTTextProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingTextShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTTextShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingTransparencyGradientTable(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTTransparencyGradientTable
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TransparencyGradientTable = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingframeworkBasicPaneFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTframeworkDOTBasicPaneFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.BasicPaneFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingframeworkBasicToolBarFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTframeworkDOTBasicToolBarFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.BasicToolBarFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingframeworkBasicViewFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTframeworkDOTBasicViewFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.BasicViewFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingframeworkConfiguration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTframeworkDOTConfiguration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.Configuration = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingframeworkConfigurationController(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTframeworkDOTConfigurationController
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.ConfigurationController = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingframeworkModuleController(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTframeworkDOTModuleController
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.ModuleController = js.native
  @JSName("createInstance")
  def createInstance_comsunstardrawingframeworkResourceId(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTdrawingDOTframeworkDOTResourceId
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.ResourceId = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedBaseStorage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTBaseStorage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.BaseStorage = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedDocumentCloser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTDocumentCloser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.DocumentCloser = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedEmbeddedObjectCreator(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTEmbeddedObjectCreator
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbeddedObjectCreator = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedEmbeddedObjectDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTEmbeddedObjectDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbeddedObjectDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedFileSystemStorage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTFileSystemStorage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.FileSystemStorage = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedFileSystemStorageFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTFileSystemStorageFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.FileSystemStorageFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedHatchWindowFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTHatchWindowFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.HatchWindowFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedInstanceLocker(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTInstanceLocker
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.InstanceLocker = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedMSOLEObjectSystemCreator(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTMSOLEObjectSystemCreator
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.MSOLEObjectSystemCreator = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedOLEEmbeddedObjectFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTOLEEmbeddedObjectFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.OLEEmbeddedObjectFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedOLESimpleStorage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTOLESimpleStorage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.OLESimpleStorage = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedOOoEmbeddedObjectFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTOOoEmbeddedObjectFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.OOoEmbeddedObjectFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedStorage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTStorage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.Storage = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedStorageFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTStorageFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.StorageFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarembedStorageStream(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTembedDOTStorageStream
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.StorageStream = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformControlFontDialog(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTControlFontDialog
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.ControlFontDialog = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformDataAwareControlModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTDataAwareControlModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataAwareControlModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformFormComponent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTFormComponent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormComponent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformFormComponents(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTFormComponents
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormComponents = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformFormControlModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTFormControlModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormControlModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformFormController(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTFormController
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormController = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformFormControllerDispatcher(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTFormControllerDispatcher
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormControllerDispatcher = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformForms(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTForms
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.Forms = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformPropertyBrowserController(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTPropertyBrowserController
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.PropertyBrowserController = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformTabOrderDialog(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTTabOrderDialog
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.TabOrderDialog = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformbindingBindableControlModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableControlModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableControlModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformbindingBindableDataAwareControlModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDataAwareControlModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDataAwareControlModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformbindingBindableDatabaseCheckBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseCheckBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseCheckBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformbindingBindableDatabaseComboBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseComboBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseComboBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformbindingBindableDatabaseDateField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseDateField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseDateField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformbindingBindableDatabaseFormattedField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseFormattedField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseFormattedField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformbindingBindableDatabaseListBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseListBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseListBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformbindingBindableDatabaseNumericField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseNumericField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseNumericField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformbindingBindableDatabaseRadioButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseRadioButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseRadioButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformbindingBindableDatabaseTextField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseTextField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseTextField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformbindingBindableDatabaseTimeField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableDatabaseTimeField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDatabaseTimeField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformbindingBindableIntegerValueRange(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTBindableIntegerValueRange
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableIntegerValueRange = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformbindingListEntrySource(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTListEntrySource
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.ListEntrySource = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformbindingValueBinding(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTbindingDOTValueBinding
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.ValueBinding = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentCheckBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTCheckBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.CheckBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentComboBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTComboBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.ComboBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentCommandButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTCommandButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.CommandButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentCurrencyField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTCurrencyField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.CurrencyField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentDataForm(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDataForm
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DataForm = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentDatabaseCheckBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseCheckBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseCheckBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentDatabaseComboBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseComboBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseComboBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentDatabaseCurrencyField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseCurrencyField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseCurrencyField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentDatabaseDateField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseDateField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseDateField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentDatabaseFormattedField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseFormattedField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseFormattedField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentDatabaseImageControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseImageControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseImageControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentDatabaseListBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseListBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseListBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentDatabaseNumericField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseNumericField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseNumericField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentDatabasePatternField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabasePatternField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabasePatternField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentDatabaseRadioButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseRadioButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseRadioButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentDatabaseTextField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseTextField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseTextField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentDatabaseTimeField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDatabaseTimeField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseTimeField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentDateField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTDateField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DateField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentFileControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTFileControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.FileControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentFixedText(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTFixedText
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.FixedText = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentForm(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTForm
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.Form = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentFormattedField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTFormattedField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.FormattedField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentGridControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTGridControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.GridControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentGroupBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTGroupBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.GroupBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentHTMLForm(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTHTMLForm
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.HTMLForm = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentHiddenControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTHiddenControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.HiddenControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentImageButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTImageButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.ImageButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentListBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTListBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.ListBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentNavigationToolBar(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTNavigationToolBar
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.NavigationToolBar = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentNumericField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTNumericField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.NumericField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentPatternField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTPatternField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.PatternField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentRadioButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTRadioButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.RadioButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentRichTextControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTRichTextControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.RichTextControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentScrollBar(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTScrollBar
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.ScrollBar = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentSpinButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTSpinButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.SpinButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentSubmitButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTSubmitButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.SubmitButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentTextField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTTextField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.TextField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcomponentTimeField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcomponentDOTTimeField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.TimeField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolCheckBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTCheckBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.CheckBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolComboBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTComboBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.ComboBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolCommandButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTCommandButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.CommandButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolCurrencyField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTCurrencyField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.CurrencyField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolDateField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTDateField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.DateField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolFilterControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTFilterControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.FilterControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolFormattedField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTFormattedField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.FormattedField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolGridControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTGridControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.GridControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolGroupBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTGroupBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.GroupBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolImageButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTImageButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.ImageButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolImageControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTImageControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.ImageControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolInteractionGridControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTInteractionGridControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.InteractionGridControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolListBox(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTListBox
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.ListBox = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolNavigationToolBar(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTNavigationToolBar
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.NavigationToolBar = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolNumericField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTNumericField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.NumericField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolPatternField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTPatternField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.PatternField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolRadioButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTRadioButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.RadioButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolSubmitButton(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTSubmitButton
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.SubmitButton = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolTextField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTTextField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.TextField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformcontrolTimeField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTcontrolDOTTimeField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs.TimeField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarforminspectionButtonNavigationHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTButtonNavigationHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.ButtonNavigationHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarforminspectionCellBindingPropertyHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTCellBindingPropertyHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.CellBindingPropertyHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarforminspectionDefaultFormComponentInspectorModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTDefaultFormComponentInspectorModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.DefaultFormComponentInspectorModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarforminspectionEditPropertyHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTEditPropertyHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.EditPropertyHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarforminspectionEventHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTEventHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.EventHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarforminspectionFormComponentPropertyHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTFormComponentPropertyHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.FormComponentPropertyHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarforminspectionSubmissionPropertyHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTSubmissionPropertyHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.SubmissionPropertyHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarforminspectionXMLFormsPropertyHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTXMLFormsPropertyHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.XMLFormsPropertyHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarforminspectionXSDValidationPropertyHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTinspectionDOTXSDValidationPropertyHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.inspectionNs.XSDValidationPropertyHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformruntimeFormController(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTruntimeDOTFormController
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs.FormController = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformruntimeFormOperations(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTruntimeDOTFormOperations
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs.FormOperations = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformulaAccessibleFormulaText(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformulaDOTAccessibleFormulaText
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formulaNs.AccessibleFormulaText = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformulaAccessibleFormulaView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformulaDOTAccessibleFormulaView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formulaNs.AccessibleFormulaView = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformulaFormulaProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformulaDOTFormulaProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formulaNs.FormulaProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformvalidationValidatableBindableControlModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTvalidationDOTValidatableBindableControlModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs.ValidatableBindableControlModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarformvalidationValidatableControlModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTformDOTvalidationDOTValidatableControlModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs.ValidatableControlModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeAppDispatchProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTAppDispatchProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.AppDispatchProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeAutoRecovery(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTAutoRecovery
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.AutoRecovery = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeBibliography(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTBibliography
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Bibliography = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeComponents(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTComponents
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Components = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeContentHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTContentHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.ContentHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeContentHandlerFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTContentHandlerFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.ContentHandlerFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeController(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTController
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Controller = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeDesktop(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDesktop
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Desktop = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeDesktopTask(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDesktopTask
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DesktopTask = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeDesktopTasks(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDesktopTasks
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DesktopTasks = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeDispatchHelper(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDispatchHelper
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchHelper = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeDispatchProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDispatchProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeDispatchRecorder(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDispatchRecorder
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchRecorder = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeDispatchRecorderSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDispatchRecorderSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchRecorderSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeDocumentTemplates(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTDocumentTemplates
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DocumentTemplates = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeFrame(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTFrame
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Frame = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeFrameControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTFrameControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeFrameLoader(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTFrameLoader
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameLoader = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeFrameLoaderFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTFrameLoaderFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameLoaderFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeFramesContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTFramesContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FramesContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeGlobalEventBroadcaster(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTGlobalEventBroadcaster
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.GlobalEventBroadcaster = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeLayoutManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTLayoutManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.LayoutManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeMediaTypeDetectionHelper(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTMediaTypeDetectionHelper
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.MediaTypeDetectionHelper = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeModuleManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTModuleManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.ModuleManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeOfficeFrameLoader(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTOfficeFrameLoader
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.OfficeFrameLoader = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframePopupMenuController(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTPopupMenuController
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.PopupMenuController = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframePopupMenuControllerFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTPopupMenuControllerFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.PopupMenuControllerFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeProtocolHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTProtocolHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.ProtocolHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeSessionListener(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTSessionListener
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.SessionListener = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeSessionManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTSessionManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.SessionManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Settings = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeStartModule(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTStartModule
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.StartModule = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeStatusbarController(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTStatusbarController
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.StatusbarController = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeStatusbarControllerFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTStatusbarControllerFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.StatusbarControllerFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeSynchronousFrameLoader(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTSynchronousFrameLoader
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.SynchronousFrameLoader = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeTask(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTTask
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Task = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeTaskCreator(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTTaskCreator
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.TaskCreator = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeTemplateAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTTemplateAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.TemplateAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeToolbarController(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTToolbarController
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.ToolbarController = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeToolbarControllerFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTToolbarControllerFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.ToolbarControllerFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeTransientDocumentsDocumentContentFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTTransientDocumentsDocumentContentFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.TransientDocumentsDocumentContentFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarframeUICommandDescription(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTframeDOTUICommandDescription
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.UICommandDescription = js.native
  @JSName("createInstance")
  def createInstance_comsunstargalleryGalleryItem(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgalleryDOTGalleryItem
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs.GalleryItem = js.native
  @JSName("createInstance")
  def createInstance_comsunstargalleryGalleryTheme(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgalleryDOTGalleryTheme
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs.GalleryTheme = js.native
  @JSName("createInstance")
  def createInstance_comsunstargalleryGalleryThemeProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgalleryDOTGalleryThemeProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs.GalleryThemeProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstargraphicGraphic(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTGraphic
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.Graphic = js.native
  @JSName("createInstance")
  def createInstance_comsunstargraphicGraphicDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTGraphicDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstargraphicGraphicObject(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTGraphicObject
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicObject = js.native
  @JSName("createInstance")
  def createInstance_comsunstargraphicGraphicProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTGraphicProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstargraphicGraphicRasterizer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTGraphicRasterizer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicRasterizer = js.native
  @JSName("createInstance")
  def createInstance_comsunstargraphicGraphicRendererVCL(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTGraphicRendererVCL
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicRendererVCL = js.native
  @JSName("createInstance")
  def createInstance_comsunstargraphicMediaProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTMediaProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.MediaProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstargraphicPrimitive2DTools(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTPrimitive2DTools
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.Primitive2DTools = js.native
  @JSName("createInstance")
  def createInstance_comsunstargraphicPrimitiveFactory2D(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTPrimitiveFactory2D
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.PrimitiveFactory2D = js.native
  @JSName("createInstance")
  def createInstance_comsunstargraphicSvgTools(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTgraphicDOTSvgTools
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.SvgTools = js.native
  @JSName("createInstance")
  def createInstance_comsunstari18nBreakIterator(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTBreakIterator
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.BreakIterator = js.native
  @JSName("createInstance")
  def createInstance_comsunstari18nChapterCollator(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTChapterCollator
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.ChapterCollator = js.native
  @JSName("createInstance")
  def createInstance_comsunstari18nCharacterClassification(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTCharacterClassification
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.CharacterClassification = js.native
  @JSName("createInstance")
  def createInstance_comsunstari18nCollator(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTCollator
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.Collator = js.native
  @JSName("createInstance")
  def createInstance_comsunstari18nIndexEntrySupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTIndexEntrySupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.IndexEntrySupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstari18nInputSequenceChecker(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTInputSequenceChecker
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.InputSequenceChecker = js.native
  @JSName("createInstance")
  def createInstance_comsunstari18nLocaleCalendar(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTLocaleCalendar
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.LocaleCalendar = js.native
  @JSName("createInstance")
  def createInstance_comsunstari18nLocaleCalendar2(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTLocaleCalendar2
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.LocaleCalendar2 = js.native
  @JSName("createInstance")
  def createInstance_comsunstari18nLocaleData(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTLocaleData
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.LocaleData = js.native
  @JSName("createInstance")
  def createInstance_comsunstari18nNativeNumberSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTNativeNumberSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.NativeNumberSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstari18nNumberFormatMapper(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTNumberFormatMapper
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.NumberFormatMapper = js.native
  @JSName("createInstance")
  def createInstance_comsunstari18nOrdinalSuffix(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTOrdinalSuffix
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.OrdinalSuffix = js.native
  @JSName("createInstance")
  def createInstance_comsunstari18nTextConversion(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTTextConversion
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TextConversion = js.native
  @JSName("createInstance")
  def createInstance_comsunstari18nTransliteration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTi18nDOTTransliteration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.Transliteration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarimageImageMap(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTimageDOTImageMap
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs.ImageMap = js.native
  @JSName("createInstance")
  def createInstance_comsunstarimageImageMapCircleObject(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTimageDOTImageMapCircleObject
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs.ImageMapCircleObject = js.native
  @JSName("createInstance")
  def createInstance_comsunstarimageImageMapObject(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTimageDOTImageMapObject
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs.ImageMapObject = js.native
  @JSName("createInstance")
  def createInstance_comsunstarimageImageMapPolygonObject(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTimageDOTImageMapPolygonObject
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs.ImageMapPolygonObject = js.native
  @JSName("createInstance")
  def createInstance_comsunstarimageImageMapRectangleObject(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTimageDOTImageMapRectangleObject
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs.ImageMapRectangleObject = js.native
  @JSName("createInstance")
  def createInstance_comsunstarinspectionDefaultHelpProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTinspectionDOTDefaultHelpProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.DefaultHelpProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarinspectionGenericPropertyHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTinspectionDOTGenericPropertyHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.GenericPropertyHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarinspectionObjectInspector(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTinspectionDOTObjectInspector
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.ObjectInspector = js.native
  @JSName("createInstance")
  def createInstance_comsunstarinspectionObjectInspectorModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTinspectionDOTObjectInspectorModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.ObjectInspectorModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarinspectionStringRepresentation(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTinspectionDOTStringRepresentation
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.StringRepresentation = js.native
  @JSName("createInstance")
  def createInstance_comsunstarioDataInputStream(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTDataInputStream
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.DataInputStream = js.native
  @JSName("createInstance")
  def createInstance_comsunstarioDataOutputStream(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTDataOutputStream
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.DataOutputStream = js.native
  @JSName("createInstance")
  def createInstance_comsunstarioMarkableInputStream(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTMarkableInputStream
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.MarkableInputStream = js.native
  @JSName("createInstance")
  def createInstance_comsunstarioMarkableOutputStream(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTMarkableOutputStream
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.MarkableOutputStream = js.native
  @JSName("createInstance")
  def createInstance_comsunstarioObjectInputStream(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTObjectInputStream
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.ObjectInputStream = js.native
  @JSName("createInstance")
  def createInstance_comsunstarioObjectOutputStream(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTObjectOutputStream
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.ObjectOutputStream = js.native
  @JSName("createInstance")
  def createInstance_comsunstarioPipe(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTPipe
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.Pipe = js.native
  @JSName("createInstance")
  def createInstance_comsunstarioPump(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTPump
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.Pump = js.native
  @JSName("createInstance")
  def createInstance_comsunstarioSequenceInputStream(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTSequenceInputStream
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.SequenceInputStream = js.native
  @JSName("createInstance")
  def createInstance_comsunstarioSequenceOutputStream(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTSequenceOutputStream
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.SequenceOutputStream = js.native
  @JSName("createInstance")
  def createInstance_comsunstarioTempFile(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTTempFile
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.TempFile = js.native
  @JSName("createInstance")
  def createInstance_comsunstarioTextInputStream(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTTextInputStream
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.TextInputStream = js.native
  @JSName("createInstance")
  def createInstance_comsunstarioTextOutputStream(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTioDOTTextOutputStream
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.TextOutputStream = js.native
  @JSName("createInstance")
  def createInstance_comsunstarjavaJavaVirtualMachine(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTjavaDOTJavaVirtualMachine
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.javaNs.JavaVirtualMachine = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlangMultiServiceFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlangDOTMultiServiceFactory
  ): MultiServiceFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlangRegistryServiceManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlangDOTRegistryServiceManager
  ): RegistryServiceManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlangServiceManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlangDOTServiceManager
  ): ServiceManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlinguistic2ConversionDictionary(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTConversionDictionary
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.ConversionDictionary = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlinguistic2ConversionDictionaryList(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTConversionDictionaryList
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.ConversionDictionaryList = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlinguistic2Dictionary(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTDictionary
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.Dictionary = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlinguistic2DictionaryList(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTDictionaryList
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryList = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlinguistic2HangulHanjaConversionDictionary(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTHangulHanjaConversionDictionary
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.HangulHanjaConversionDictionary = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlinguistic2Hyphenator(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTHyphenator
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.Hyphenator = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlinguistic2LanguageGuessing(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTLanguageGuessing
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.LanguageGuessing = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlinguistic2LinguProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTLinguProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.LinguProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlinguistic2LinguServiceManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTLinguServiceManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.LinguServiceManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlinguistic2Proofreader(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTProofreader
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.Proofreader = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlinguistic2ProofreadingIterator(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTProofreadingIterator
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.ProofreadingIterator = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlinguistic2SpellChecker(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTSpellChecker
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.SpellChecker = js.native
  @JSName("createInstance")
  def createInstance_comsunstarlinguistic2Thesaurus(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTlinguistic2DOTThesaurus
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.Thesaurus = js.native
  @JSName("createInstance")
  def createInstance_comsunstarloaderDynamic(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloaderDOTDynamic
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loaderNs.Dynamic = js.native
  @JSName("createInstance")
  def createInstance_comsunstarloaderJava(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloaderDOTJava
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loaderNs.Java = js.native
  @JSName("createInstance")
  def createInstance_comsunstarloaderJava2(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloaderDOTJava2
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loaderNs.Java2 = js.native
  @JSName("createInstance")
  def createInstance_comsunstarloaderSharedLibrary(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloaderDOTSharedLibrary
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loaderNs.SharedLibrary = js.native
  @JSName("createInstance")
  def createInstance_comsunstarloggingConsoleHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloggingDOTConsoleHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.ConsoleHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarloggingCsvLogFormatter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloggingDOTCsvLogFormatter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.CsvLogFormatter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarloggingFileHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloggingDOTFileHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.FileHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarloggingPlainTextFormatter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloggingDOTPlainTextFormatter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.PlainTextFormatter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarloggingSimpleLogRing(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTloggingDOTSimpleLogRing
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs.SimpleLogRing = js.native
  @JSName("createInstance")
  def createInstance_comsunstarmailMailMessage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTmailDOTMailMessage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs.MailMessage = js.native
  @JSName("createInstance")
  def createInstance_comsunstarmailMailServiceProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTmailDOTMailServiceProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs.MailServiceProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarmediaManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTmediaDOTManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs.Manager = js.native
  @JSName("createInstance")
  def createInstance_comsunstarmozillaMenuProxy(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTmozillaDOTMenuProxy
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs.MenuProxy = js.native
  @JSName("createInstance")
  def createInstance_comsunstarmozillaMenuProxyListener(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTmozillaDOTMenuProxyListener
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs.MenuProxyListener = js.native
  @JSName("createInstance")
  def createInstance_comsunstarmozillaMozillaBootstrap(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTmozillaDOTMozillaBootstrap
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs.MozillaBootstrap = js.native
  @JSName("createInstance")
  def createInstance_comsunstarofficeQuickstart(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTofficeDOTQuickstart
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.officeNs.Quickstart = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpackagesPackage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpackagesDOTPackage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.Package = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpackagesPackageFolder(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpackagesDOTPackageFolder
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.PackageFolder = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpackagesPackageFolderEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpackagesDOTPackageFolderEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.PackageFolderEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpackagesPackageStream(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpackagesDOTPackageStream
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.PackageStream = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpackagesmanifestManifestReader(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpackagesDOTmanifestDOTManifestReader
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.manifestNs.ManifestReader = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpackagesmanifestManifestWriter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpackagesDOTmanifestDOTManifestWriter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.manifestNs.ManifestWriter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpackageszipZipFileAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpackagesDOTzipDOTZipFileAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.zipNs.ZipFileAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationChartShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTChartShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ChartShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationCustomPresentation(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTCustomPresentation
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.CustomPresentation = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationCustomPresentationAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTCustomPresentationAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.CustomPresentationAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationDateTimeShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTDateTimeShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.DateTimeShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationDocumentSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTDocumentSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.DocumentSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationDrawPage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTDrawPage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.DrawPage = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationFooterShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTFooterShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.FooterShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationGraphicObjectShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTGraphicObjectShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.GraphicObjectShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationHandoutShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTHandoutShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.HandoutShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationHandoutView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTHandoutView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.HandoutView = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationHeaderShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTHeaderShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.HeaderShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationNotesShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTNotesShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.NotesShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationNotesView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTNotesView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.NotesView = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationOLE2Shape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTOLE2Shape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.OLE2Shape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationOutlineView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTOutlineView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.OutlineView = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationOutlinerShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTOutlinerShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.OutlinerShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationPageShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTPageShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.PageShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationPresentation(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTPresentation
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.Presentation = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationPresentation2(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTPresentation2
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.Presentation2 = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationPresentationDocument(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTPresentationDocument
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.PresentationDocument = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationPresentationView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTPresentationView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.PresentationView = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationPreviewView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTPreviewView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.PreviewView = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.Shape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationSlideNumberShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTSlideNumberShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.SlideNumberShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationSlideShow(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTSlideShow
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.SlideShow = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationSlidesView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTSlidesView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.SlidesView = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationSubtitleShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTSubtitleShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.SubtitleShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationTitleTextShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTTitleTextShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.TitleTextShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationTransitionFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTTransitionFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.TransitionFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationtextfieldDateTime(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTtextfieldDOTDateTime
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.textfieldNs.DateTime = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationtextfieldFooter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTtextfieldDOTFooter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.textfieldNs.Footer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarpresentationtextfieldHeader(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTpresentationDOTtextfieldDOTHeader
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.textfieldNs.Header = js.native
  @JSName("createInstance")
  def createInstance_comsunstarrdfBlankNode(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrdfDOTBlankNode
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs.BlankNode = js.native
  @JSName("createInstance")
  def createInstance_comsunstarrdfLiteral(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrdfDOTLiteral
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs.Literal = js.native
  @JSName("createInstance")
  def createInstance_comsunstarrdfRepository(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrdfDOTRepository
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs.Repository = js.native
  @JSName("createInstance")
  def createInstance_comsunstarrdfURI(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrdfDOTURI
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs.URI = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreflectionCoreReflection(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreflectionDOTCoreReflection
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.CoreReflection = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreflectionProxyFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreflectionDOTProxyFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.ProxyFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreflectionTypeDescriptionManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreflectionDOTTypeDescriptionManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.TypeDescriptionManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreflectionTypeDescriptionProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreflectionDOTTypeDescriptionProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.TypeDescriptionProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarregistryDefaultRegistry(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTregistryDOTDefaultRegistry
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.DefaultRegistry = js.native
  @JSName("createInstance")
  def createInstance_comsunstarregistryImplementationRegistration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTregistryDOTImplementationRegistration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.ImplementationRegistration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarregistryNestedRegistry(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTregistryDOTNestedRegistry
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.NestedRegistry = js.native
  @JSName("createInstance")
  def createInstance_comsunstarregistrySimpleRegistry(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTregistryDOTSimpleRegistry
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.SimpleRegistry = js.native
  @JSName("createInstance")
  def createInstance_comsunstarrenderingBitmapCanvas(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrenderingDOTBitmapCanvas
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.BitmapCanvas = js.native
  @JSName("createInstance")
  def createInstance_comsunstarrenderingCanvas(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrenderingDOTCanvas
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.Canvas = js.native
  @JSName("createInstance")
  def createInstance_comsunstarrenderingCanvasFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrenderingDOTCanvasFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.CanvasFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarrenderingMtfRenderer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTrenderingDOTMtfRenderer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.MtfRenderer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportFixedLine(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTFixedLine
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.FixedLine = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportFixedText(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTFixedText
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.FixedText = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportFormatCondition(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTFormatCondition
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.FormatCondition = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportFormattedField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTFormattedField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.FormattedField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportFunction(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTFunction
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.Function = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportGroup(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTGroup
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.Group = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportGroups(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTGroups
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.Groups = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportImageControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTImageControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ImageControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportReportControlFormat(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTReportControlFormat
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ReportControlFormat = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportReportControlModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTReportControlModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ReportControlModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportReportDefinition(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTReportDefinition
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ReportDefinition = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportReportEngine(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTReportEngine
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ReportEngine = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportSection(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTSection
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.Section = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.Shape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportinspectionDataProviderHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTinspectionDOTDataProviderHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.inspectionNs.DataProviderHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportinspectionDefaultComponentInspectorModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTinspectionDOTDefaultComponentInspectorModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.inspectionNs.DefaultComponentInspectorModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarreportinspectionReportComponentHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTreportDOTinspectionDOTReportComponentHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.inspectionNs.ReportComponentHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarresourceStringResource(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTresourceDOTStringResource
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs.StringResource = js.native
  @JSName("createInstance")
  def createInstance_comsunstarresourceStringResourceWithLocation(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTresourceDOTStringResourceWithLocation
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs.StringResourceWithLocation = js.native
  @JSName("createInstance")
  def createInstance_comsunstarresourceStringResourceWithStorage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTresourceDOTStringResourceWithStorage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs.StringResourceWithStorage = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscannerScannerManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscannerDOTScannerManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs.ScannerManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptAllListenerAdapter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTAllListenerAdapter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.AllListenerAdapter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptConverter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTConverter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.Converter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptDocumentDialogLibraryContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTDocumentDialogLibraryContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.DocumentDialogLibraryContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptDocumentScriptLibraryContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTDocumentScriptLibraryContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.DocumentScriptLibraryContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptEngine(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTEngine
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.Engine = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptInvocation(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTInvocation
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.Invocation = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptInvocationAdapterFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTInvocationAdapterFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.InvocationAdapterFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptJavaScript(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTJavaScript
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.JavaScript = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptbrowseBrowseNode(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTbrowseDOTBrowseNode
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.BrowseNode = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptbrowseBrowseNodeFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTbrowseDOTBrowseNodeFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.BrowseNodeFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptproviderLanguageScriptProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTLanguageScriptProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.LanguageScriptProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptproviderMasterScriptProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTMasterScriptProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.MasterScriptProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptproviderMasterScriptProviderFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTMasterScriptProviderFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.MasterScriptProviderFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptproviderScriptProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTScriptProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptproviderScriptProviderForBasic(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTScriptProviderForBasic
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptProviderForBasic = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptproviderScriptProviderForBeanShell(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTScriptProviderForBeanShell
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptProviderForBeanShell = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptproviderScriptProviderForJava(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTScriptProviderForJava
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptProviderForJava = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptproviderScriptProviderForJavaScript(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTScriptProviderForJavaScript
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptProviderForJavaScript = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptproviderScriptURIHelper(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTproviderDOTScriptURIHelper
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptURIHelper = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptvbaVBAEventProcessor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTvbaDOTVBAEventProcessor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs.VBAEventProcessor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptvbaVBAMacroResolver(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTvbaDOTVBAMacroResolver
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs.VBAMacroResolver = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptvbaVBASpreadsheetEventProcessor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTvbaDOTVBASpreadsheetEventProcessor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs.VBASpreadsheetEventProcessor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarscriptvbaVBATextEventProcessor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTscriptDOTvbaDOTVBATextEventProcessor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs.VBATextEventProcessor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbCallableStatement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTCallableStatement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.CallableStatement = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbColumn(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTColumn
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.Column = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbColumnDescriptorControl(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTColumnDescriptorControl
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ColumnDescriptorControl = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbColumnDescriptorControlModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTColumnDescriptorControlModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ColumnDescriptorControlModel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbColumnSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTColumnSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ColumnSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbCommandDefinition(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTCommandDefinition
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.CommandDefinition = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbConnection(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTConnection
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.Connection = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbContentLoader(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTContentLoader
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ContentLoader = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDataAccessDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDataAccessDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DataAccessDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDataColumn(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDataColumn
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DataColumn = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDataSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDataSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DataSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDataSource(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDataSource
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DataSource = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDataSourceBrowser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDataSourceBrowser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DataSourceBrowser = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDatabaseAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDatabaseAccessConnection(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseAccessConnection
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseAccessConnection = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDatabaseAccessContext(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseAccessContext
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseAccessContext = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDatabaseAccessDataSource(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseAccessDataSource
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseAccessDataSource = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDatabaseContext(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseContext
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseContext = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDatabaseDocument(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseDocument
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseDocument = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDatabaseEnvironment(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseEnvironment
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseEnvironment = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDatabaseInteractionHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatabaseInteractionHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatabaseInteractionHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDatasourceAdministrationDialog(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDatasourceAdministrationDialog
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DatasourceAdministrationDialog = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDefinitionContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDefinitionContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DefinitionContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDefinitionContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDefinitionContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DefinitionContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDocument(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDocument
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.Document = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDocumentContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDocumentContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DocumentContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDocumentDataSource(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDocumentDataSource
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DocumentDataSource = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbDocumentDefinition(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTDocumentDefinition
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DocumentDefinition = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbErrorMessageDialog(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTErrorMessageDialog
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ErrorMessageDialog = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbFilterDialog(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTFilterDialog
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.FilterDialog = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbForms(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTForms
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.Forms = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbInteractionHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTInteractionHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.InteractionHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbOfficeDatabaseDocument(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTOfficeDatabaseDocument
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.OfficeDatabaseDocument = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbOrderColumn(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTOrderColumn
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.OrderColumn = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbOrderDialog(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTOrderDialog
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.OrderDialog = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbPreparedStatement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTPreparedStatement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.PreparedStatement = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbQuery(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTQuery
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.Query = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbQueryDefinition(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTQueryDefinition
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.QueryDefinition = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbQueryDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTQueryDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.QueryDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbQueryDesign(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTQueryDesign
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.QueryDesign = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbRelationDesign(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTRelationDesign
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.RelationDesign = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbReportDesign(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTReportDesign
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ReportDesign = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbReports(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTReports
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.Reports = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbResultColumn(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTResultColumn
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ResultColumn = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbResultSet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTResultSet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.ResultSet = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbRowSet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTRowSet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.RowSet = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbSQLQueryComposer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTSQLQueryComposer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.SQLQueryComposer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbSingleSelectQueryAnalyzer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTSingleSelectQueryAnalyzer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.SingleSelectQueryAnalyzer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbSingleSelectQueryComposer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTSingleSelectQueryComposer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.SingleSelectQueryComposer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbTable(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTTable
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.Table = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbTableDefinition(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTTableDefinition
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.TableDefinition = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbTableDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTTableDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.TableDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbTableDesign(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTTableDesign
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.TableDesign = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbTextConnectionSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTTextConnectionSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.TextConnectionSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbapplicationCopyTableWizard(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTapplicationDOTCopyTableWizard
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.CopyTableWizard = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbapplicationDefaultViewController(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTapplicationDOTDefaultViewController
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.DefaultViewController = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbapplicationMacroMigrationWizard(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTapplicationDOTMacroMigrationWizard
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.MacroMigrationWizard = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcCallableStatement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTCallableStatement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.CallableStatement = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcConnection(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTConnection
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.Connection = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcConnectionPool(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTConnectionPool
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ConnectionPool = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcConnectionProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTConnectionProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ConnectionProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcDBASEConnectionProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTDBASEConnectionProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.DBASEConnectionProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcDriver(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTDriver
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.Driver = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcDriverManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTDriverManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.DriverManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcFILEConnectionProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTFILEConnectionProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.FILEConnectionProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcFLATConnectionProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTFLATConnectionProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.FLATConnectionProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcJDBCConnectionProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTJDBCConnectionProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.JDBCConnectionProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcODBCConnectionProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTODBCConnectionProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ODBCConnectionProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcPreparedStatement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTPreparedStatement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.PreparedStatement = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcResultSet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTResultSet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ResultSet = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcRowSet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTRowSet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.RowSet = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcStatement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcDOTStatement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.Statement = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxColumn(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTColumn
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Column = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxColumnDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTColumnDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.ColumnDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Container = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxDatabaseDefinition(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTDatabaseDefinition
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.DatabaseDefinition = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Descriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxDriver(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTDriver
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Driver = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxGroup(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTGroup
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Group = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxGroupDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTGroupDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.GroupDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxIndex(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTIndex
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Index = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxIndexColumn(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTIndexColumn
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.IndexColumn = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxIndexColumnDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTIndexColumnDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.IndexColumnDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxIndexDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTIndexDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.IndexDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxKey(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTKey
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Key = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxKeyColumn(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTKeyColumn
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.KeyColumn = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxKeyColumnDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTKeyColumnDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.KeyColumnDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxKeyDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTKeyDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.KeyDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxPreparedStatement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTPreparedStatement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.PreparedStatement = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxReferenceColumn(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTReferenceColumn
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.ReferenceColumn = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxResultSet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTResultSet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.ResultSet = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxStatement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTStatement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Statement = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxTable(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTTable
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Table = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxTableDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTTableDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.TableDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxUser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTUser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.User = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxUserDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTUserDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.UserDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.View = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbcxViewDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbcxDOTViewDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.ViewDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsdbtoolsConnectionTools(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsdbDOTtoolsDOTConnectionTools
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.toolsNs.ConnectionTools = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsecurityAccessController(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsecurityDOTAccessController
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.AccessController = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsecurityCertificateContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsecurityDOTCertificateContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.CertificateContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsecurityDocumentDigitalSignatures(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsecurityDOTDocumentDigitalSignatures
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.DocumentDigitalSignatures = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsecurityPolicy(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsecurityDOTPolicy
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.Policy = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsecuritySerialNumberAdapter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsecurityDOTSerialNumberAdapter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.SerialNumberAdapter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsetupUpdateCheck(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsetupDOTUpdateCheck
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.setupNs.UpdateCheck = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsetupUpdateCheckConfig(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsetupDOTUpdateCheckConfig
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.setupNs.UpdateCheckConfig = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetAccessibleCell(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessibleCell
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessibleCell = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetAccessibleCsvCell(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessibleCsvCell
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessibleCsvCell = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetAccessibleCsvRuler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessibleCsvRuler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessibleCsvRuler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetAccessibleCsvTable(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessibleCsvTable
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessibleCsvTable = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetAccessiblePageHeaderFooterAreasView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessiblePageHeaderFooterAreasView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessiblePageHeaderFooterAreasView = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetAccessibleSpreadsheet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessibleSpreadsheet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessibleSpreadsheet = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetAccessibleSpreadsheetDocumentView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessibleSpreadsheetDocumentView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessibleSpreadsheetDocumentView = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetAccessibleSpreadsheetPageView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAccessibleSpreadsheetPageView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AccessibleSpreadsheetPageView = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetAddIn(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTAddIn
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.AddIn = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetCellAnnotation(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellAnnotation
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellAnnotation = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetCellAnnotationShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellAnnotationShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellAnnotationShape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetCellAnnotations(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellAnnotations
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellAnnotations = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetCellAnnotationsEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellAnnotationsEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellAnnotationsEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetCellAreaLink(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellAreaLink
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellAreaLink = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetCellAreaLinks(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellAreaLinks
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellAreaLinks = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetCellAreaLinksEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellAreaLinksEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellAreaLinksEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetCellFormatRanges(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellFormatRanges
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellFormatRanges = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetCellFormatRangesEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellFormatRangesEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellFormatRangesEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetCells(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCells
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Cells = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetCellsEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTCellsEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellsEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetColorScale(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTColorScale
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ColorScale = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetConditionFormatEntry(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTConditionFormatEntry
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionFormatEntry = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetConditionalFormat(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTConditionalFormat
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionalFormat = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetConsolidationDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTConsolidationDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConsolidationDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDDELink(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDDELink
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DDELink = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDDELinks(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDDELinks
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DDELinks = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDDELinksEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDDELinksEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DDELinksEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataBar(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataBar
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataBar = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotFieldGroup(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotFieldGroup
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldGroup = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotFieldGroupEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotFieldGroupEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldGroupEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotFieldGroupItem(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotFieldGroupItem
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldGroupItem = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotFieldGroups(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotFieldGroups
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldGroups = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotFieldGroupsEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotFieldGroupsEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldGroupsEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotFields(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotFields
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFields = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotFieldsEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotFieldsEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldsEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotItem(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotItem
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotItem = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotItems(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotItems
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotItems = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotItemsEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotItemsEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotItemsEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotSource(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSource
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSource = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotSourceDimension(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceDimension
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceDimension = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotSourceDimensions(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceDimensions
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceDimensions = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotSourceHierarchies(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceHierarchies
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceHierarchies = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotSourceHierarchy(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceHierarchy
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceHierarchy = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotSourceLevel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceLevel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceLevel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotSourceLevels(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceLevels
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceLevels = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotSourceMember(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceMember
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceMember = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotSourceMembers(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotSourceMembers
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotSourceMembers = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotTable(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotTable
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotTable = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotTables(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotTables
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotTables = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDataPilotTablesEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDataPilotTablesEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotTablesEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDatabaseImportDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDatabaseImportDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DatabaseImportDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDatabaseRange(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDatabaseRange
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DatabaseRange = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDatabaseRanges(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDatabaseRanges
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DatabaseRanges = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDatabaseRangesEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDatabaseRangesEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DatabaseRangesEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDateCondition(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDateCondition
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DateCondition = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetDocumentSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTDocumentSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DocumentSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetExternalDocLink(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTExternalDocLink
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ExternalDocLink = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetExternalDocLinks(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTExternalDocLinks
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ExternalDocLinks = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetExternalSheetCache(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTExternalSheetCache
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ExternalSheetCache = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetFilterFormulaParser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTFilterFormulaParser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterFormulaParser = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetFormulaOpCodeMapper(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTFormulaOpCodeMapper
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaOpCodeMapper = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetFormulaParser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTFormulaParser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaParser = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetFunctionAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTFunctionAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FunctionAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetFunctionDescription(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTFunctionDescription
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FunctionDescription = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetFunctionDescriptionEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTFunctionDescriptionEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FunctionDescriptionEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetFunctionDescriptions(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTFunctionDescriptions
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FunctionDescriptions = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetGlobalSheetSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTGlobalSheetSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GlobalSheetSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetHeaderFooterContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTHeaderFooterContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.HeaderFooterContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetIconSet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTIconSet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.IconSet = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetLabelRange(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTLabelRange
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.LabelRange = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetLabelRanges(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTLabelRanges
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.LabelRanges = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetLabelRangesEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTLabelRangesEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.LabelRangesEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetNamedRange(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTNamedRange
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.NamedRange = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetNamedRanges(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTNamedRanges
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.NamedRanges = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetNamedRangesEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTNamedRangesEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.NamedRangesEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetRangeSelectionArguments(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTRangeSelectionArguments
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.RangeSelectionArguments = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetRecentFunctions(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTRecentFunctions
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.RecentFunctions = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetScenario(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTScenario
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Scenario = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetScenarios(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTScenarios
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Scenarios = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetScenariosEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTScenariosEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ScenariosEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Shape = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSheetCell(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetCell
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetCell = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSheetCellCursor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetCellCursor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetCellCursor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSheetCellRange(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetCellRange
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetCellRange = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSheetCellRanges(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetCellRanges
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetCellRanges = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSheetCellRangesEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetCellRangesEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetCellRangesEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSheetFilterDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetFilterDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetFilterDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSheetLink(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetLink
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetLink = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSheetLinks(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetLinks
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetLinks = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSheetLinksEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetLinksEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetLinksEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSheetRangesQuery(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetRangesQuery
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetRangesQuery = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSheetSortDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetSortDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetSortDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSheetSortDescriptor2(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSheetSortDescriptor2
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetSortDescriptor2 = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSolver(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSolver
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Solver = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSpreadsheet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Spreadsheet = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSpreadsheetDocument(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetDocument
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetDocument = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSpreadsheetDocumentSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetDocumentSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetDocumentSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSpreadsheetDrawPage(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetDrawPage
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetDrawPage = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSpreadsheetView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetView = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSpreadsheetViewPane(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetViewPane
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetViewPane = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSpreadsheetViewPanesEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetViewPanesEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetViewPanesEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSpreadsheetViewSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetViewSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetViewSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSpreadsheets(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheets
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Spreadsheets = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSpreadsheetsEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSpreadsheetsEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetsEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSubTotalDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSubTotalDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SubTotalDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSubTotalField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSubTotalField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SubTotalField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetSubTotalFieldsEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTSubTotalFieldsEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SubTotalFieldsEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetTableAutoFormat(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableAutoFormat
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableAutoFormat = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetTableAutoFormatEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableAutoFormatEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableAutoFormatEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetTableAutoFormatField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableAutoFormatField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableAutoFormatField = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetTableAutoFormats(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableAutoFormats
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableAutoFormats = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetTableAutoFormatsEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableAutoFormatsEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableAutoFormatsEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetTableCellStyle(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableCellStyle
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableCellStyle = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetTableConditionalEntry(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableConditionalEntry
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableConditionalEntry = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetTableConditionalEntryEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableConditionalEntryEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableConditionalEntryEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetTableConditionalFormat(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableConditionalFormat
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableConditionalFormat = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetTablePageStyle(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTablePageStyle
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TablePageStyle = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetTableValidation(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTTableValidation
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableValidation = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetUniqueCellFormatRanges(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTUniqueCellFormatRanges
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.UniqueCellFormatRanges = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetUniqueCellFormatRangesEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTUniqueCellFormatRangesEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.UniqueCellFormatRangesEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsheetVolatileResult(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsheetDOTVolatileResult
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.VolatileResult = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsmarttagsSmartTagAction(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsmarttagsDOTSmartTagAction
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.smarttagsNs.SmartTagAction = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsmarttagsSmartTagRecognizer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsmarttagsDOTSmartTagRecognizer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.smarttagsNs.SmartTagRecognizer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleCellStyle(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTCellStyle
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CellStyle = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleCharacterProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTCharacterProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleCharacterPropertiesAsian(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTCharacterPropertiesAsian
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleCharacterPropertiesComplex(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTCharacterPropertiesComplex
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleCharacterStyle(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTCharacterStyle
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterStyle = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleNumberingAlignment(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTNumberingAlignment
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.NumberingAlignment = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleNumberingLevel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTNumberingLevel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.NumberingLevel = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleNumberingRule(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTNumberingRule
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.NumberingRule = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstylePageProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTPageProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.PageProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstylePageStyle(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTPageStyle
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.PageStyle = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleParagraphProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTParagraphProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleParagraphPropertiesAsian(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTParagraphPropertiesAsian
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesAsian = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleParagraphPropertiesComplex(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTParagraphPropertiesComplex
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesComplex = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleParagraphStyle(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTParagraphStyle
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphStyle = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleStyle(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTStyle
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.Style = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleStyleFamilies(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTStyleFamilies
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.StyleFamilies = js.native
  @JSName("createInstance")
  def createInstance_comsunstarstyleStyleFamily(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTstyleDOTStyleFamily
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.StyleFamily = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsystemSimpleCommandMail(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsystemDOTSimpleCommandMail
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SimpleCommandMail = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsystemSimpleSystemMail(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsystemDOTSimpleSystemMail
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SimpleSystemMail = js.native
  @JSName("createInstance")
  def createInstance_comsunstarsystemSystemShellExecute(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTsystemDOTSystemShellExecute
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs.SystemShellExecute = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableAccessibleCellView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTAccessibleCellView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.AccessibleCellView = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableAccessibleTableView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTAccessibleTableView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.AccessibleTableView = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableCell(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTCell
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.Cell = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableCellCursor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTCellCursor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellCursor = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableCellProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTCellProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableCellRange(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTCellRange
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRange = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableCellRangeListSource(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTCellRangeListSource
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeListSource = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableCellValueBinding(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTCellValueBinding
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellValueBinding = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableListPositionCellBinding(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTListPositionCellBinding
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ListPositionCellBinding = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableTableChart(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableChart
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableChart = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableTableCharts(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableCharts
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableCharts = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableTableChartsEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableChartsEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableChartsEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableTableColumn(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableColumn
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableColumn = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableTableColumns(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableColumns
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableColumns = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableTableColumnsEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableColumnsEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableColumnsEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableTableRow(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableRow
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableRow = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableTableRows(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableRows
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableRows = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableTableRowsEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableRowsEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableRowsEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableTableSortDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableSortDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableSortDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstartableTableSortDescriptor2(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtableDOTTableSortDescriptor2
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableSortDescriptor2 = js.native
  @JSName("createInstance")
  def createInstance_comsunstartaskAsyncJob(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTAsyncJob
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.AsyncJob = js.native
  @JSName("createInstance")
  def createInstance_comsunstartaskInteractionHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTInteractionHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstartaskInteractionRequestStringResolver(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTInteractionRequestStringResolver
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionRequestStringResolver = js.native
  @JSName("createInstance")
  def createInstance_comsunstartaskJob(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTJob
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.Job = js.native
  @JSName("createInstance")
  def createInstance_comsunstartaskJobExecutor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTJobExecutor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.JobExecutor = js.native
  @JSName("createInstance")
  def createInstance_comsunstartaskPasswordContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTPasswordContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.PasswordContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstartaskPasswordContainerInteractionHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTPasswordContainerInteractionHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.PasswordContainerInteractionHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstartaskStatusIndicatorFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtaskDOTStatusIndicatorFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.StatusIndicatorFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextAccessibleEndnoteView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleEndnoteView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleEndnoteView = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextAccessibleFootnoteView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleFootnoteView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleFootnoteView = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextAccessibleHeaderFooterView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleHeaderFooterView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleHeaderFooterView = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextAccessiblePageView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessiblePageView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessiblePageView = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextAccessibleParagraphView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleParagraphView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleParagraphView = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextAccessibleTextDocumentPageView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleTextDocumentPageView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleTextDocumentPageView = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextAccessibleTextDocumentView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleTextDocumentView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleTextDocumentView = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextAccessibleTextEmbeddedObject(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleTextEmbeddedObject
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleTextEmbeddedObject = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextAccessibleTextFrameView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleTextFrameView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleTextFrameView = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextAccessibleTextGraphicObject(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAccessibleTextGraphicObject
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AccessibleTextGraphicObject = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextAutoTextContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAutoTextContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AutoTextContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextAutoTextEntry(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAutoTextEntry
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AutoTextEntry = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextAutoTextGroup(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTAutoTextGroup
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.AutoTextGroup = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextBaseFrame(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTBaseFrame
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.BaseFrame = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextBaseFrameProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTBaseFrameProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.BaseFrameProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextBaseIndex(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTBaseIndex
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.BaseIndex = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextBaseIndexMark(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTBaseIndexMark
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.BaseIndexMark = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextBibliography(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTBibliography
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Bibliography = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextBookmark(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTBookmark
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Bookmark = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextBookmarks(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTBookmarks
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Bookmarks = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextCell(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTCell
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Cell = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextCellProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTCellProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.CellProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextCellRange(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTCellRange
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.CellRange = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextChainedTextFrame(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTChainedTextFrame
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ChainedTextFrame = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextChapterNumberingRule(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTChapterNumberingRule
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ChapterNumberingRule = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextContentIndex(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTContentIndex
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ContentIndex = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextContentIndexMark(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTContentIndexMark
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ContentIndexMark = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextDefaultNumberingProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDefaultNumberingProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DefaultNumberingProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextDefaults(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDefaults
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Defaults = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextDependentTextField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDependentTextField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DependentTextField = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextDocumentIndex(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDocumentIndex
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DocumentIndex = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextDocumentIndexLevelFormat(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDocumentIndexLevelFormat
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DocumentIndexLevelFormat = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextDocumentIndexMark(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDocumentIndexMark
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DocumentIndexMark = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextDocumentIndexMarkAsian(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDocumentIndexMarkAsian
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DocumentIndexMarkAsian = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextDocumentIndexParagraphStyles(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDocumentIndexParagraphStyles
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DocumentIndexParagraphStyles = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextDocumentIndexes(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDocumentIndexes
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DocumentIndexes = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextDocumentSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTDocumentSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DocumentSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextEndnote(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTEndnote
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Endnote = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextEndnoteSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTEndnoteSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.EndnoteSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextFootnote(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTFootnote
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Footnote = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextFootnoteSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTFootnoteSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.FootnoteSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextFootnotes(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTFootnotes
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Footnotes = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextGenericTextDocument(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTGenericTextDocument
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.GenericTextDocument = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextGlobalDocument(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTGlobalDocument
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.GlobalDocument = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextGlobalSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTGlobalSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.GlobalSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextIllustrationsIndex(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTIllustrationsIndex
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.IllustrationsIndex = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextInContentMetadata(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTInContentMetadata
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.InContentMetadata = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextLineNumberingProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTLineNumberingProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.LineNumberingProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextMailMerge(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTMailMerge
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.MailMerge = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextModuleDispatcher(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTModuleDispatcher
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ModuleDispatcher = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextNumberingLevel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTNumberingLevel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.NumberingLevel = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextNumberingRules(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTNumberingRules
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.NumberingRules = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextNumberingStyle(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTNumberingStyle
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.NumberingStyle = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextObjectIndex(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTObjectIndex
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ObjectIndex = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextPageFootnoteInfo(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTPageFootnoteInfo
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PageFootnoteInfo = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextPagePrintSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTPagePrintSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PagePrintSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextParagraph(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTParagraph
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Paragraph = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextParagraphEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTParagraphEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ParagraphEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextPrintSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTPrintSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PrintSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextRedlinePortion(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTRedlinePortion
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.RedlinePortion = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextReferenceMark(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTReferenceMark
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ReferenceMark = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextReferenceMarks(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTReferenceMarks
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ReferenceMarks = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextShape(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTShape
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Shape = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTableColumns(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTableColumns
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TableColumns = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTableIndex(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTableIndex
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TableIndex = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTableRows(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTableRows
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TableRows = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextText(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTText
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Text = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextColumns(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextColumns
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextColumns = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextContentCollection(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextContentCollection
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextContentCollection = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextCursor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextCursor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextCursor = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextDocument(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextDocument
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextDocument = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextDocumentView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextDocumentView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextDocumentView = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextEmbeddedObject(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextEmbeddedObject
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextEmbeddedObject = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextEmbeddedObjects(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextEmbeddedObjects
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextEmbeddedObjects = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextFieldEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextFieldEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFieldEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextFieldMaster(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextFieldMaster
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFieldMaster = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextFieldMasters(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextFieldMasters
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFieldMasters = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextFields(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextFields
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFields = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextFrame(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextFrame
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFrame = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextFrames(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextFrames
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFrames = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextGraphicObject(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextGraphicObject
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextGraphicObject = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextGraphicObjects(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextGraphicObjects
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextGraphicObjects = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextLayoutCursor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextLayoutCursor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextLayoutCursor = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextPageStyle(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextPageStyle
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextPageStyle = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextPortion(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextPortion
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextPortion = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextPortionEnumeration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextPortionEnumeration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextPortionEnumeration = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextRange(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextRange
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextRange = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextRangeContentProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextRangeContentProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextRangeContentProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextRanges(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextRanges
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextRanges = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextSection(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextSection
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextSection = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextSections(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextSections
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextSections = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextSortDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextSortDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextSortDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextSortDescriptor2(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextSortDescriptor2
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextSortDescriptor2 = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextSortable(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextSortable
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextSortable = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextTable(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextTable
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextTable = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextTableCursor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextTableCursor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextTableCursor = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextTableRow(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextTableRow
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextTableRow = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextTables(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextTables
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextTables = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextTextViewCursor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTTextViewCursor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextViewCursor = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextUserDefinedIndex(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTUserDefinedIndex
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.UserDefinedIndex = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextUserIndex(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTUserIndex
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.UserIndex = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextUserIndexMark(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTUserIndexMark
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.UserIndexMark = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextViewSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTViewSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.ViewSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextWebDocument(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTWebDocument
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WebDocument = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextfieldmasterBibliography(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTfieldmasterDOTBibliography
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs.Bibliography = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextfieldmasterDDE(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTfieldmasterDOTDDE
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs.DDE = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextfieldmasterDatabase(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTfieldmasterDOTDatabase
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs.Database = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextfieldmasterSetExpression(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTfieldmasterDOTSetExpression
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs.SetExpression = js.native
  @JSName("createInstance")
  def createInstance_comsunstartextfieldmasterUser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTfieldmasterDOTUser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs.User = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldAnnotation(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTAnnotation
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Annotation = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldAuthor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTAuthor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Author = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldBibliography(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTBibliography
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Bibliography = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldChapter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTChapter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Chapter = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldCharacterCount(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTCharacterCount
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.CharacterCount = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldCombinedCharacters(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTCombinedCharacters
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.CombinedCharacters = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldConditionalText(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTConditionalText
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.ConditionalText = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldDDE(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDDE
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.DDE = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldDatabase(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDatabase
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Database = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldDatabaseName(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDatabaseName
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.DatabaseName = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldDatabaseNextSet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDatabaseNextSet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.DatabaseNextSet = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldDatabaseNumberOfSet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDatabaseNumberOfSet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.DatabaseNumberOfSet = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldDatabaseSetNumber(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDatabaseSetNumber
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.DatabaseSetNumber = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldDateTime(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDateTime
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.DateTime = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldDropDown(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTDropDown
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.DropDown = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldEmbeddedObjectCount(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTEmbeddedObjectCount
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.EmbeddedObjectCount = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldExtendedUser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTExtendedUser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.ExtendedUser = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldFileName(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTFileName
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.FileName = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldGetExpression(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTGetExpression
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.GetExpression = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldGetReference(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTGetReference
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.GetReference = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldGraphicObjectCount(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTGraphicObjectCount
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.GraphicObjectCount = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldHiddenParagraph(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTHiddenParagraph
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.HiddenParagraph = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldHiddenText(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTHiddenText
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.HiddenText = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldInput(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTInput
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Input = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldInputUser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTInputUser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.InputUser = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldJumpEdit(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTJumpEdit
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.JumpEdit = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldMacro(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTMacro
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Macro = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldMetadataField(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTMetadataField
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.MetadataField = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldPageCount(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTPageCount
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.PageCount = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldPageNumber(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTPageNumber
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.PageNumber = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldParagraphCount(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTParagraphCount
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.ParagraphCount = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldReferencePageGet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTReferencePageGet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.ReferencePageGet = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldReferencePageSet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTReferencePageSet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.ReferencePageSet = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldScript(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTScript
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.Script = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldSetExpression(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTSetExpression
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.SetExpression = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldTableCount(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTTableCount
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.TableCount = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldTableFormula(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTTableFormula
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.TableFormula = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldTemplateName(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTTemplateName
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.TemplateName = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldURL(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTURL
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.URL = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldUser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTUser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.User = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfieldWordCount(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTWordCount
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.WordCount = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfielddocinfoChangeAuthor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTChangeAuthor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.ChangeAuthor = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfielddocinfoChangeDateTime(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTChangeDateTime
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.ChangeDateTime = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfielddocinfoCreateAuthor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTCreateAuthor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.CreateAuthor = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfielddocinfoCreateDateTime(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTCreateDateTime
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.CreateDateTime = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfielddocinfoCustom(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTCustom
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.Custom = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfielddocinfoDescription(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTDescription
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.Description = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfielddocinfoEditTime(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTEditTime
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.EditTime = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfielddocinfoKeywords(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTKeywords
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.Keywords = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfielddocinfoPrintAuthor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTPrintAuthor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.PrintAuthor = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfielddocinfoPrintDateTime(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTPrintDateTime
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.PrintDateTime = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfielddocinfoRevision(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTRevision
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.Revision = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfielddocinfoSubject(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTSubject
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.Subject = js.native
  @JSName("createInstance")
  def createInstance_comsunstartexttextfielddocinfoTitle(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTtextDOTtextfieldDOTdocinfoDOTTitle
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs.Title = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbAnyCompareFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTAnyCompareFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.AnyCompareFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbCachedContentResultSet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedContentResultSet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedContentResultSet = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbCachedContentResultSetFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedContentResultSetFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedContentResultSetFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbCachedContentResultSetStub(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedContentResultSetStub
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedContentResultSetStub = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbCachedContentResultSetStubFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedContentResultSetStubFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedContentResultSetStubFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbCachedDynamicResultSet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedDynamicResultSet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedDynamicResultSet = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbCachedDynamicResultSetFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedDynamicResultSetFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedDynamicResultSetFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbCachedDynamicResultSetStub(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedDynamicResultSetStub
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedDynamicResultSetStub = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbCachedDynamicResultSetStubFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCachedDynamicResultSetStubFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CachedDynamicResultSetStubFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbCmisContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCmisContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CmisContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbCommandEnvironment(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTCommandEnvironment
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.CommandEnvironment = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.Content = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbContentProviderProxy(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTContentProviderProxy
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentProviderProxy = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbContentProviderProxyFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTContentProviderProxyFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentProviderProxyFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbContentResultSet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTContentResultSet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentResultSet = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbContentTransmitter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTContentTransmitter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentTransmitter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbDefaultHierarchyDataSource(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTDefaultHierarchyDataSource
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.DefaultHierarchyDataSource = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbDynamicResultSet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTDynamicResultSet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.DynamicResultSet = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbExpandContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTExpandContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ExpandContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbFTPContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTFTPContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FTPContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbFTPContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTFTPContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FTPContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbFileContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTFileContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FileContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbFileContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTFileContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FileContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbGIOContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTGIOContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.GIOContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbGnomeVFSContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTGnomeVFSContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.GnomeVFSContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbGnomeVFSDocumentContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTGnomeVFSDocumentContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.GnomeVFSDocumentContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbGnomeVFSFolderContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTGnomeVFSFolderContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.GnomeVFSFolderContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbHelpContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHelpContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HelpContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbHelpContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHelpContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HelpContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbHierarchyContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHierarchyContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HierarchyContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbHierarchyDataReadAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHierarchyDataReadAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HierarchyDataReadAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbHierarchyDataReadWriteAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHierarchyDataReadWriteAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HierarchyDataReadWriteAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbHierarchyDataSource(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHierarchyDataSource
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HierarchyDataSource = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbHierarchyFolderContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHierarchyFolderContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HierarchyFolderContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbHierarchyLinkContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHierarchyLinkContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HierarchyLinkContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbHierarchyRootFolderContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTHierarchyRootFolderContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.HierarchyRootFolderContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbODMAContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTODMAContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ODMAContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbODMAContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTODMAContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ODMAContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbPackageContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTPackageContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PackageContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbPackageFolderContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTPackageFolderContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PackageFolderContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbPackageStreamContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTPackageStreamContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PackageStreamContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbPersistentPropertySet(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTPersistentPropertySet
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PersistentPropertySet = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbPropertiesManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTPropertiesManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PropertiesManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbPropertySetRegistry(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTPropertySetRegistry
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.PropertySetRegistry = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbRemoteAccessContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTRemoteAccessContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RemoteAccessContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbRemoteContentProviderAcceptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTRemoteContentProviderAcceptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RemoteContentProviderAcceptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbRemoteProxyContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTRemoteProxyContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RemoteProxyContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbSimpleFileAccess(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTSimpleFileAccess
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.SimpleFileAccess = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbSortedDynamicResultSetFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTSortedDynamicResultSetFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.SortedDynamicResultSetFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbStore(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTStore
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.Store = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbTransientDocumentsContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTTransientDocumentsContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.TransientDocumentsContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbTransientDocumentsDocumentContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTTransientDocumentsDocumentContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.TransientDocumentsDocumentContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbTransientDocumentsFolderContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTTransientDocumentsFolderContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.TransientDocumentsFolderContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbTransientDocumentsRootContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTTransientDocumentsRootContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.TransientDocumentsRootContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbTransientDocumentsStreamContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTTransientDocumentsStreamContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.TransientDocumentsStreamContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbUniversalContentBroker(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTUniversalContentBroker
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.UniversalContentBroker = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbWebDAVContentProvider(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTWebDAVContentProvider
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVContentProvider = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbWebDAVDocumentContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTWebDAVDocumentContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVDocumentContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstarucbWebDAVFolderContent(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTucbDOTWebDAVFolderContent
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.WebDAVFolderContent = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiActionTrigger(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTActionTrigger
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ActionTrigger = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiActionTriggerContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTActionTriggerContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ActionTriggerContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiActionTriggerSeparator(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTActionTriggerSeparator
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ActionTriggerSeparator = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiAddressBookSourceDialog(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTAddressBookSourceDialog
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.AddressBookSourceDialog = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiConfigurableUIElement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTConfigurableUIElement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ConfigurableUIElement = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiDocumentAcceleratorConfiguration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTDocumentAcceleratorConfiguration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.DocumentAcceleratorConfiguration = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiGlobalAcceleratorConfiguration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTGlobalAcceleratorConfiguration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.GlobalAcceleratorConfiguration = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiImageManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTImageManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ImageManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiItemDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTItemDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ItemDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiModuleAcceleratorConfiguration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTModuleAcceleratorConfiguration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ModuleAcceleratorConfiguration = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiModuleUICategoryDescription(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTModuleUICategoryDescription
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ModuleUICategoryDescription = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiModuleUICommandDescription(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTModuleUICommandDescription
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ModuleUICommandDescription = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiModuleUIConfigurationManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTModuleUIConfigurationManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ModuleUIConfigurationManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiModuleWindowStateConfiguration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTModuleWindowStateConfiguration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ModuleWindowStateConfiguration = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiUICategoryDescription(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTUICategoryDescription
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.UICategoryDescription = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiUIConfigurationManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTUIConfigurationManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.UIConfigurationManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiUIElement(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTUIElement
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.UIElement = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiUIElementFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTUIElementFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.UIElementFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiUIElementFactoryManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTUIElementFactoryManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.UIElementFactoryManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiUIElementSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTUIElementSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.UIElementSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiWindowContentFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTWindowContentFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.WindowContentFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiWindowContentFactoryManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTWindowContentFactoryManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.WindowContentFactoryManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruiWindowStateConfiguration(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTWindowStateConfiguration
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.WindowStateConfiguration = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruidialogsAddressBookSourcePilot(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTdialogsDOTAddressBookSourcePilot
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.AddressBookSourcePilot = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruidialogsFilePicker(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTdialogsDOTFilePicker
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.FilePicker = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruidialogsFilterOptionsDialog(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTdialogsDOTFilterOptionsDialog
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.FilterOptionsDialog = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruidialogsFolderPicker(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTdialogsDOTFolderPicker
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.FolderPicker = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruidialogsWizard(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTdialogsDOTWizard
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.Wizard = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruidialogsXSLTFilterDialog(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTdialogsDOTXSLTFilterDialog
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.XSLTFilterDialog = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruitestUITest(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuiDOTtestDOTUITest
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.testNs.UITest = js.native
  @JSName("createInstance")
  def createInstance_comsunstarunoNamingService(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTunoDOTNamingService
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.NamingService = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruriExternalUriReferenceTranslator(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuriDOTExternalUriReferenceTranslator
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs.ExternalUriReferenceTranslator = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruriUriReferenceFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuriDOTUriReferenceFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs.UriReferenceFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruriUriSchemeParser_vndDOTsunDOTstarDOTexpand(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuriDOTUriSchemeParser_vndDOTsunDOTstarDOTexpand
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs.UriSchemeParser_vndDOTsunDOTstarDOTexpand = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruriUriSchemeParser_vndDOTsunDOTstarDOTscript(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuriDOTUriSchemeParser_vndDOTsunDOTstarDOTscript
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs.UriSchemeParser_vndDOTsunDOTstarDOTscript = js.native
  @JSName("createInstance")
  def createInstance_comsunstaruriVndSunStarPkgUrlReferenceFactory(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTuriDOTVndSunStarPkgUrlReferenceFactory
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs.VndSunStarPkgUrlReferenceFactory = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilBootstrapMacroExpander(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTBootstrapMacroExpander
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.BootstrapMacroExpander = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilJobManager(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTJobManager
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.JobManager = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilMacroExpander(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTMacroExpander
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.MacroExpander = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilNumberFormatProperties(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTNumberFormatProperties
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.NumberFormatProperties = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilNumberFormatSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTNumberFormatSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.NumberFormatSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilNumberFormats(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTNumberFormats
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.NumberFormats = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilNumberFormatsSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTNumberFormatsSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.NumberFormatsSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilNumberFormatter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTNumberFormatter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.NumberFormatter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilOfficeInstallationDirectories(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTOfficeInstallationDirectories
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.OfficeInstallationDirectories = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilPathSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTPathSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.PathSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilPathSubstitution(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTPathSubstitution
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.PathSubstitution = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilReplaceDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTReplaceDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ReplaceDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilSearchDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTSearchDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SearchDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilSortDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTSortDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilSortDescriptor2(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTSortDescriptor2
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortDescriptor2 = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilSortable(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTSortable
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Sortable = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilTextSearch(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTTextSearch
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.TextSearch = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilTextSearch2(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTTextSearch2
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.TextSearch2 = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilURLTransformer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTURLTransformer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URLTransformer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarutilUriAbbreviation(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTutilDOTUriAbbreviation
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.UriAbbreviation = js.native
  @JSName("createInstance")
  def createInstance_comsunstarviewOfficeDocumentView(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTviewDOTOfficeDocumentView
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.OfficeDocumentView = js.native
  @JSName("createInstance")
  def createInstance_comsunstarviewPrintOptions(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTviewDOTPrintOptions
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PrintOptions = js.native
  @JSName("createInstance")
  def createInstance_comsunstarviewPrintSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTviewDOTPrintSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PrintSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstarviewPrinterDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTviewDOTPrinterDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PrinterDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarviewRenderDescriptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTviewDOTRenderDescriptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.RenderDescriptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarviewRenderOptions(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTviewDOTRenderOptions
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.RenderOptions = js.native
  @JSName("createInstance")
  def createInstance_comsunstarviewViewSettings(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTviewDOTViewSettings
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.ViewSettings = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxformsBinding(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxformsDOTBinding
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs.Binding = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxformsModel(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxformsDOTModel
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs.Model = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxformsXForms(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxformsDOTXForms
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs.XForms = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlAttributeContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTAttributeContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.AttributeContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlExportFilter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTExportFilter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.ExportFilter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlImportFilter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTImportFilter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.ImportFilter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlNamespaceContainer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTNamespaceContainer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.NamespaceContainer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlParaUserDefinedAttributesSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTParaUserDefinedAttributesSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.ParaUserDefinedAttributesSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlTextUserDefinedAttributesSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTTextUserDefinedAttributesSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.TextUserDefinedAttributesSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlUserDefinedAttributesSupplier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTUserDefinedAttributesSupplier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlXMLExportFilter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTXMLExportFilter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.XMLExportFilter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlXMLImportFilter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTXMLImportFilter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.XMLImportFilter = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlcryptoNSSInitializer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTNSSInitializer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.NSSInitializer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlcryptoSEInitializer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTSEInitializer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SEInitializer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlcryptoSecurityEnvironment(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTSecurityEnvironment
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityEnvironment = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlcryptoXMLEncryption(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTXMLEncryption
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.XMLEncryption = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlcryptoXMLEncryptionTemplate(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTXMLEncryptionTemplate
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.XMLEncryptionTemplate = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlcryptoXMLSecurityContext(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTXMLSecurityContext
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.XMLSecurityContext = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlcryptoXMLSignature(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTXMLSignature
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.XMLSignature = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlcryptoXMLSignatureTemplate(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTXMLSignatureTemplate
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.XMLSignatureTemplate = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlcryptosaxDecryptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTsaxDOTDecryptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.Decryptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlcryptosaxEncryptor(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTsaxDOTEncryptor
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.Encryptor = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlcryptosaxSAXEventKeeper(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTsaxDOTSAXEventKeeper
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.SAXEventKeeper = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlcryptosaxSignatureCreator(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTsaxDOTSignatureCreator
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.SignatureCreator = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlcryptosaxSignatureVerifier(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTcryptoDOTsaxDOTSignatureVerifier
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs.SignatureVerifier = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmldomDocumentBuilder(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTdomDOTDocumentBuilder
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.DocumentBuilder = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmldomSAXDocumentBuilder(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTdomDOTSAXDocumentBuilder
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.SAXDocumentBuilder = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlinputSaxDocumentHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTinputDOTSaxDocumentHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.inputNs.SaxDocumentHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlsaxFastParser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTsaxDOTFastParser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.FastParser = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlsaxFastShapeContextHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTsaxDOTFastShapeContextHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.FastShapeContextHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlsaxFastTokenHandler(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTsaxDOTFastTokenHandler
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.FastTokenHandler = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlsaxParser(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTsaxDOTParser
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.Parser = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlsaxWriter(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTsaxDOTWriter
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.Writer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlwrapperXMLDocumentWrapper(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTwrapperDOTXMLDocumentWrapper
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XMLDocumentWrapper = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlwrapperXMLElementWrapper(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTwrapperDOTXMLElementWrapper
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs.XMLElementWrapper = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlxpathXPathAPI(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTxpathDOTXPathAPI
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.xpathNs.XPathAPI = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlxpathXPathExtension(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTxpathDOTXPathExtension
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.xpathNs.XPathExtension = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlxsltXSLT2Transformer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTxsltDOTXSLT2Transformer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.xsltNs.XSLT2Transformer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxmlxsltXSLTTransformer(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxmlDOTxsltDOTXSLTTransformer
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.xsltNs.XSLTTransformer = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxsdBoolean(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTBoolean
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.Boolean = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxsdDate(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTDate
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.Date = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxsdDateTime(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTDateTime
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.DateTime = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxsdDay(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTDay
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.Day = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxsdDecimal(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTDecimal
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.Decimal = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxsdMonth(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTMonth
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.Month = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxsdString(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTString
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.String = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxsdTime(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTTime
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.Time = js.native
  @JSName("createInstance")
  def createInstance_comsunstarxsdYear(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.comDOTsunDOTstarDOTxsdDOTYear
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.Year = js.native
  @JSName("createInstance")
  def createInstance_orgfreedesktopPackageKitSyncDbusSessionHelper(
    aServiceSpecifier: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.orgDOTfreedesktopDOTPackageKitDOTSyncDbusSessionHelper
  ): activexDashLibreofficeLib.orgNs.freedesktopNs.PackageKitNs.SyncDbusSessionHelper = js.native
  /**
    * Provides the available names of the factory to be used to create instances.
    * @returns sequence of all names
    */
  def getAvailableServiceNames(): stdLib.SafeArray[java.lang.String] = js.native
}

