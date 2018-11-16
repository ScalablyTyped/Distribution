package typings
package activexDashShdocvwLib.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SHDocVw.ShellUIHelper")
@js.native
class ShellUIHelper protected () extends js.Object {
  var `SHDocVw.ShellUIHelper_typekey`: ShellUIHelper = js.native
  def AddChannel(URL: java.lang.String): scala.Unit = js.native
  def AddDesktopComponent(URL: java.lang.String, Type: java.lang.String): scala.Unit = js.native
  def AddDesktopComponent(URL: java.lang.String, Type: java.lang.String, Left: js.Any): scala.Unit = js.native
  def AddDesktopComponent(URL: java.lang.String, Type: java.lang.String, Left: js.Any, Top: js.Any): scala.Unit = js.native
  def AddDesktopComponent(URL: java.lang.String, Type: java.lang.String, Left: js.Any, Top: js.Any, Width: js.Any): scala.Unit = js.native
  def AddDesktopComponent(
    URL: java.lang.String,
    Type: java.lang.String,
    Left: js.Any,
    Top: js.Any,
    Width: js.Any,
    Height: js.Any
  ): scala.Unit = js.native
  def AddFavorite(URL: java.lang.String): scala.Unit = js.native
  def AddFavorite(URL: java.lang.String, Title: js.Any): scala.Unit = js.native
  def AddSearchProvider(URL: java.lang.String): scala.Unit = js.native
  def AddService(URL: java.lang.String): scala.Unit = js.native
  def AddToFavoritesBar(URL: java.lang.String, Title: java.lang.String): scala.Unit = js.native
  def AddToFavoritesBar(URL: java.lang.String, Title: java.lang.String, Type: js.Any): scala.Unit = js.native
  def AutoCompleteAttach(): scala.Unit = js.native
  def AutoCompleteAttach(Reserved: js.Any): scala.Unit = js.native
  def AutoCompleteSaveForm(): scala.Unit = js.native
  def AutoCompleteSaveForm(Form: js.Any): scala.Unit = js.native
  def AutoScan(strSearch: java.lang.String, strFailureUrl: java.lang.String): scala.Unit = js.native
  def AutoScan(strSearch: java.lang.String, strFailureUrl: java.lang.String, pvarTargetFrame: js.Any): scala.Unit = js.native
  def BrandImageUri(): java.lang.String = js.native
  def BuildNewTabPage(): scala.Unit = js.native
  def ContentDiscoveryReset(): scala.Unit = js.native
  def CustomizeClearType(fSet: scala.Boolean): scala.Unit = js.native
  def CustomizeSettings(fSQM: scala.Boolean, fPhishing: scala.Boolean, bstrLocale: java.lang.String): scala.Unit = js.native
  def DefaultSearchProvider(): java.lang.String = js.native
  def DiagnoseConnection(): scala.Unit = js.native
  def EnableSuggestedSites(fEnable: scala.Boolean): scala.Unit = js.native
  def GetCVListData(): java.lang.String = js.native
  def GetCVListLocalData(): java.lang.String = js.native
  def GetEMIEListData(): java.lang.String = js.native
  def GetEMIEListLocalData(): java.lang.String = js.native
  def GetExperimentalFlag(bstrFlagString: java.lang.String): scala.Boolean = js.native
  def GetExperimentalValue(bstrValueString: java.lang.String): scala.Double = js.native
  def GetNeedIEAutoLaunchFlag(bstrUrl: java.lang.String): scala.Boolean = js.native
  def HasNeedIEAutoLaunchFlag(bstrUrl: java.lang.String): scala.Boolean = js.native
  def ImportExportFavorites(fImport: scala.Boolean, strImpExpPath: java.lang.String): scala.Unit = js.native
  def InPrivateFilteringEnabled(): scala.Boolean = js.native
  def IsSearchMigrated(): scala.Boolean = js.native
  def IsSearchProviderInstalled(URL: java.lang.String): scala.Double = js.native
  def IsServiceInstalled(URL: java.lang.String, Verb: java.lang.String): scala.Double = js.native
  def IsSubscribed(URL: java.lang.String): scala.Boolean = js.native
  def IsSuggestedSitesEnabled(): scala.Boolean = js.native
  def LaunchIE(bstrUrl: java.lang.String, automated: scala.Boolean): scala.Unit = js.native
  def LaunchInHVSI(bstrUrl: java.lang.String): scala.Unit = js.native
  def NavigateAndFind(URL: java.lang.String, strQuery: java.lang.String, varTargetFrame: js.Any): scala.Unit = js.native
  def NavigateToSuggestedSites(bstrRelativeUrl: java.lang.String): scala.Unit = js.native
  def OpenFavoritesPane(): scala.Unit = js.native
  def OpenFavoritesSettings(): scala.Unit = js.native
  def PhishingEnabled(): scala.Boolean = js.native
  def RefreshOfflineDesktop(): scala.Unit = js.native
  def ResetAllExperimentalFlagsAndValues(): scala.Unit = js.native
  def ResetFirstBootMode(): scala.Unit = js.native
  def ResetSafeMode(): scala.Unit = js.native
  def RunOnceHasShown(): scala.Boolean = js.native
  def RunOnceRequiredSettingsComplete(fComplete: scala.Boolean): scala.Unit = js.native
  def RunOnceShown(): scala.Unit = js.native
  def SearchGuideUrl(): java.lang.String = js.native
  def SetActivitiesVisible(fVisible: scala.Boolean): scala.Unit = js.native
  def SetExperimentalFlag(bstrFlagString: java.lang.String, vfFlag: scala.Boolean): scala.Unit = js.native
  def SetExperimentalValue(bstrValueString: java.lang.String, dwValue: scala.Double): scala.Unit = js.native
  def SetNeedIEAutoLaunchFlag(bstrUrl: java.lang.String, flag: scala.Boolean): scala.Unit = js.native
  def SetRecentlyClosedVisible(fVisible: scala.Boolean): scala.Unit = js.native
  def ShowBrowserUI(bstrName: java.lang.String, pvarIn: js.Any): js.Any = js.native
  def ShowInPrivateHelp(): scala.Unit = js.native
  def ShowTabsHelp(): scala.Unit = js.native
  def SkipRunOnce(): scala.Unit = js.native
  def SkipTabsWelcome(): scala.Unit = js.native
  def SqmEnabled(): scala.Boolean = js.native
  def msActiveXFilteringEnabled(): scala.Boolean = js.native
  def msAddSiteMode(): scala.Unit = js.native
  def msAddTrackingProtectionList(URL: java.lang.String, bstrFilterName: java.lang.String): scala.Unit = js.native
  def msChangeDefaultBrowser(fChange: scala.Boolean): scala.Unit = js.native
  def msClearTile(): scala.Unit = js.native
  def msDiagnoseConnectionUILess(): scala.Unit = js.native
  def msEnableTileNotificationQueue(fChange: scala.Boolean): scala.Unit = js.native
  def msEnableTileNotificationQueueForSquare150x150(fChange: scala.Boolean): scala.Unit = js.native
  def msEnableTileNotificationQueueForSquare310x310(fChange: scala.Boolean): scala.Unit = js.native
  def msEnableTileNotificationQueueForWide310x150(fChange: scala.Boolean): scala.Unit = js.native
  def msIsSiteMode(): scala.Boolean = js.native
  def msIsSiteModeFirstRun(fPreserveState: scala.Boolean): js.Any = js.native
  def msLaunchInternetOptions(): scala.Unit = js.native
  def msLaunchNetworkClientHelp(): scala.Unit = js.native
  def msPinnedSiteState(): js.Any = js.native
  def msProvisionNetworks(bstrProvisioningXml: java.lang.String): js.Any = js.native
  def msRemoveScheduledTileNotification(bstrNotificationId: java.lang.String): scala.Unit = js.native
  def msReportSafeUrl(): scala.Unit = js.native
  def msScheduledTileNotification(
    bstrNotificationXml: java.lang.String,
    bstrNotificationId: java.lang.String,
    bstrNotificationTag: java.lang.String
  ): scala.Unit = js.native
  def msScheduledTileNotification(
    bstrNotificationXml: java.lang.String,
    bstrNotificationId: java.lang.String,
    bstrNotificationTag: java.lang.String,
    startTime: js.Any
  ): scala.Unit = js.native
  def msScheduledTileNotification(
    bstrNotificationXml: java.lang.String,
    bstrNotificationId: java.lang.String,
    bstrNotificationTag: java.lang.String,
    startTime: js.Any,
    expirationTime: js.Any
  ): scala.Unit = js.native
  def msSiteModeActivate(): scala.Unit = js.native
  def msSiteModeAddButtonStyle(uiButtonID: js.Any, bstrIconURL: java.lang.String, bstrTooltip: java.lang.String): js.Any = js.native
  def msSiteModeAddJumpListItem(bstrName: java.lang.String, bstrActionUri: java.lang.String, bstrIconUri: java.lang.String): scala.Unit = js.native
  def msSiteModeAddJumpListItem(
    bstrName: java.lang.String,
    bstrActionUri: java.lang.String,
    bstrIconUri: java.lang.String,
    pvarWindowType: js.Any
  ): scala.Unit = js.native
  def msSiteModeAddThumbBarButton(bstrIconURL: java.lang.String, bstrTooltip: java.lang.String): js.Any = js.native
  def msSiteModeClearBadge(): scala.Unit = js.native
  def msSiteModeClearIconOverlay(): scala.Unit = js.native
  def msSiteModeClearJumpList(): scala.Unit = js.native
  def msSiteModeCreateJumpList(bstrHeader: java.lang.String): scala.Unit = js.native
  def msSiteModeRefreshBadge(): scala.Unit = js.native
  def msSiteModeSetIconOverlay(IconUrl: java.lang.String): scala.Unit = js.native
  def msSiteModeSetIconOverlay(IconUrl: java.lang.String, pvarDescription: js.Any): scala.Unit = js.native
  def msSiteModeShowButtonStyle(uiButtonID: js.Any, uiStyleID: js.Any): scala.Unit = js.native
  def msSiteModeShowJumpList(): scala.Unit = js.native
  def msSiteModeShowThumbBar(): scala.Unit = js.native
  def msSiteModeUpdateThumbBarButton(ButtonID: js.Any, fEnabled: scala.Boolean, fVisible: scala.Boolean): scala.Unit = js.native
  def msStartPeriodicBadgeUpdate(pollingUri: java.lang.String): scala.Unit = js.native
  def msStartPeriodicBadgeUpdate(pollingUri: java.lang.String, startTime: js.Any): scala.Unit = js.native
  def msStartPeriodicBadgeUpdate(pollingUri: java.lang.String, startTime: js.Any, uiUpdateRecurrence: js.Any): scala.Unit = js.native
  def msStartPeriodicTileUpdate(pollingUris: js.Any): scala.Unit = js.native
  def msStartPeriodicTileUpdate(pollingUris: js.Any, startTime: js.Any): scala.Unit = js.native
  def msStartPeriodicTileUpdate(pollingUris: js.Any, startTime: js.Any, uiUpdateRecurrence: js.Any): scala.Unit = js.native
  def msStartPeriodicTileUpdateBatch(pollingUris: js.Any): scala.Unit = js.native
  def msStartPeriodicTileUpdateBatch(pollingUris: js.Any, startTime: js.Any): scala.Unit = js.native
  def msStartPeriodicTileUpdateBatch(pollingUris: js.Any, startTime: js.Any, uiUpdateRecurrence: js.Any): scala.Unit = js.native
  def msStopPeriodicBadgeUpdate(): scala.Unit = js.native
  def msStopPeriodicTileUpdate(): scala.Unit = js.native
  def msTrackingProtectionEnabled(): scala.Boolean = js.native
}

