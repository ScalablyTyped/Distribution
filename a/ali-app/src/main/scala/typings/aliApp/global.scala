package typings.aliApp

import typings.aliApp.anon.IsBuffer
import typings.aliApp.anon.IsConnected
import typings.aliApp.anon.Key
import typings.aliApp.anon.KeyString
import typings.aliApp.anon.PartialAlertOptions
import typings.aliApp.anon.PartialAppOptionsApp
import typings.aliApp.anon.PartialChooseCityOptions
import typings.aliApp.anon.PartialChooseImageOptions
import typings.aliApp.anon.PartialConfirmOptions
import typings.aliApp.anon.PartialCreateAnimationOpt
import typings.aliApp.anon.PartialDatePickerOptions
import typings.aliApp.anon.PartialGetLocationOptions
import typings.aliApp.anon.PartialOpenBluetoothAdapt
import typings.aliApp.anon.PartialPageOptionsPage
import typings.aliApp.anon.PartialSetNavigationBarOp
import typings.aliApp.anon.PartialToastOptions
import typings.aliApp.my.ActionSheetOptions
import typings.aliApp.my.AddCardAuthOptions
import typings.aliApp.my.Animation
import typings.aliApp.my.App
import typings.aliApp.my.BLEDeviceOptions
import typings.aliApp.my.BaseOptions
import typings.aliApp.my.BeaconServiceChangeOptions
import typings.aliApp.my.BeaconUpdateOptions
import typings.aliApp.my.BluetoothAdapterState
import typings.aliApp.my.ChooseAlipayContactOptions
import typings.aliApp.my.ChooseContactOptions
import typings.aliApp.my.ChooseLocationOptions
import typings.aliApp.my.ChoosePhoneContactOptions
import typings.aliApp.my.CloseBluetoothAdapterOptions
import typings.aliApp.my.CloseSocketOptions
import typings.aliApp.my.Component
import typings.aliApp.my.CompressImageOptions
import typings.aliApp.my.ConnectSocketOptions
import typings.aliApp.my.ConvasContext
import typings.aliApp.my.DownloadFileOptions
import typings.aliApp.my.GetAuthCodeOptions
import typings.aliApp.my.GetAuthUserInfoOptions
import typings.aliApp.my.GetBLEDeviceCharacteristicsOptions
import typings.aliApp.my.GetBLEDeviceServicesOptions
import typings.aliApp.my.GetBeaconsOptions
import typings.aliApp.my.GetBluetoothAdapterStateOptions
import typings.aliApp.my.GetBluetoothDevicesOptions
import typings.aliApp.my.GetClipboardOptions
import typings.aliApp.my.GetConnectedBluetoothDevicesOptions
import typings.aliApp.my.GetFileInfoOptions
import typings.aliApp.my.GetImageInfoOptions
import typings.aliApp.my.GetNetworkTypeOptions
import typings.aliApp.my.GetSavedFileInfoOptions
import typings.aliApp.my.GetSavedFileListOptions
import typings.aliApp.my.GetScreenBrightnessOptions
import typings.aliApp.my.GetServerTimeOptions
import typings.aliApp.my.GetStorageInfoOptions
import typings.aliApp.my.GetStorageOptions
import typings.aliApp.my.GetSystemInfoOptions
import typings.aliApp.my.HideLoadingOptions
import typings.aliApp.my.LoadingOptions
import typings.aliApp.my.MakePhoneCallOptions
import typings.aliApp.my.MapContext
import typings.aliApp.my.MultiLevelSelectOptions
import typings.aliApp.my.NavigateBackMiniProgramOptions
import typings.aliApp.my.NavigateBackOptions
import typings.aliApp.my.NavigateToMiniProgramOptions
import typings.aliApp.my.NavigateToOptions
import typings.aliApp.my.NotifyBLECharacteristicValueChangeOptions
import typings.aliApp.my.NotifyBLECharacteristicValueChangedOptions
import typings.aliApp.my.OnBLECharacteristicValueChangeOptions
import typings.aliApp.my.OnBLEConnectionStateChangedOptions
import typings.aliApp.my.OnBluetoothDeviceFoundOptions
import typings.aliApp.my.OpenCardDetailOptions
import typings.aliApp.my.OpenKBVoucherDetailOptions1
import typings.aliApp.my.OpenKBVoucherDetailOptions2
import typings.aliApp.my.OpenLocationOptions
import typings.aliApp.my.OpenMerchantCardList
import typings.aliApp.my.OpenMerchantTicketListOptions
import typings.aliApp.my.OpenMerchantVoucherListOptions
import typings.aliApp.my.OpenTicketDetailOptions1
import typings.aliApp.my.OpenTicketDetailOptions2
import typings.aliApp.my.OpenVoucherDetailOptions1
import typings.aliApp.my.OpenVoucherDetailOptions2
import typings.aliApp.my.Page
import typings.aliApp.my.PageScrollToOptions
import typings.aliApp.my.PaySignCenterOptions
import typings.aliApp.my.PreviewImageOptions
import typings.aliApp.my.PromptOptions
import typings.aliApp.my.ReLaunchOptions
import typings.aliApp.my.ReadBLECharacteristicValueOptions
import typings.aliApp.my.RedirectToOptions
import typings.aliApp.my.RemoveSavedFileOptions
import typings.aliApp.my.RemoveStorageOptions
import typings.aliApp.my.RequestOptions
import typings.aliApp.my.RsaOptions
import typings.aliApp.my.SaveFileOptions
import typings.aliApp.my.SaveImageOptions
import typings.aliApp.my.ScanOptions
import typings.aliApp.my.SelectorQuery
import typings.aliApp.my.SendSocketMessageOptions
import typings.aliApp.my.SetClipboardOptions
import typings.aliApp.my.SetKeepScreenOnOptions
import typings.aliApp.my.SetScreenBrightnessOptions
import typings.aliApp.my.SetStorageOptions
import typings.aliApp.my.StartBeaconDiscoveryOptions
import typings.aliApp.my.StartBluetoothDevicesDiscoveryOptions
import typings.aliApp.my.StartZMVerifyOptions
import typings.aliApp.my.StopBeaconDiscoveryOptions
import typings.aliApp.my.StopBluetoothDevicesDiscoveryOptions
import typings.aliApp.my.StorageInfo
import typings.aliApp.my.SwitchTabOptions
import typings.aliApp.my.SystemInfo
import typings.aliApp.my.TextRiskIdentificationOptions
import typings.aliApp.my.TradePayOptions
import typings.aliApp.my.UploadFileOptions
import typings.aliApp.my.WebViewContext
import typings.aliApp.my.WriteBLECharacteristicValueOptions
import typings.aliApp.my.ZMCreditBorrowOptions
import typings.aliApp.my.onMessageFun
import typings.aliApp.my.showAuthGuideOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("App")
  @js.native
  def App(app: PartialAppOptionsApp): Unit = js.native
  
  @JSGlobal("Behavior")
  @js.native
  def Behavior(): Component = js.native
  @JSGlobal("Behavior")
  @js.native
  def Behavior(options: js.Any): Component = js.native
  
  @JSGlobal("Component")
  @js.native
  def Component(): typings.aliApp.my.Component = js.native
  @JSGlobal("Component")
  @js.native
  def Component(options: js.Any): typings.aliApp.my.Component = js.native
  
  @JSGlobal("Page")
  @js.native
  def Page(options: PartialPageOptionsPage): Unit = js.native
  
  @JSGlobal("getApp")
  @js.native
  def getApp(): App = js.native
  
  @JSGlobal("getCurrentPages")
  @js.native
  def getCurrentPages(): js.Array[Page] = js.native
  
  // 界面
  // 开放接口
  // 多媒体
  // 缓存
  // 文件
  // 位置
  // 网络
  // 设备
  // 扫码
  // 蓝牙
  // iBeacon
  // 数据安全
  // 分享
  // 自定义分析
  object my {
    
    @JSGlobal("my")
    @js.native
    val ^ : js.Any = js.native
    
    //#endregion
    //#region 获取基础库版本号 https://docs.alipay.com/mini/api/sdk-version
    @JSGlobal("my.SDKVersion")
    @js.native
    val SDKVersion: String = js.native
    
    /**
      * 小程序唤起会员开卡授权页面，小程序接入会员卡[点此查看](https://docs.alipay.com/mini/introduce/card)
      */
    @JSGlobal("my.addCardAuth")
    @js.native
    def addCardAuth(options: AddCardAuthOptions): Unit = js.native
    
    @JSGlobal("my.alert")
    @js.native
    def alert(options: PartialAlertOptions): Unit = js.native
    
    //#region canIUse https://docs.alipay.com/mini/api/can-i-use
    /**
      * 判断当前小程序的 API、入参或返回值、组件、属性等在当前版本是否支持。
      * 参数使用 ${API}.${type}.${param}.${option} 或者 ${component}.${attribute}.${option} 方式来调用
      * - API 表示 api 名字
      * - type 取值 object/return/callback 表示 api 的判断类型
      * - param 表示参数的某一个属性名
      * - option 表示参数属性的具体属性值
      * - component 表示组件名称
      * - attribute 表示组件属性名
      * - option 表示组件属性值
      */
    @JSGlobal("my.canIUse")
    @js.native
    def canIUse(api: String): Boolean = js.native
    
    /**
      * 唤起支付宝通讯录，选择一个或者多个支付宝联系人。
      */
    @JSGlobal("my.chooseAlipayContact")
    @js.native
    def chooseAlipayContact(options: ChooseAlipayContactOptions): Unit = js.native
    
    /**
      * 打开城市选择列表
      *
      * 如果用户没有选择任何城市直接点击了返回，将不会触发回调函数。
      */
    @JSGlobal("my.chooseCity")
    @js.native
    def chooseCity(options: PartialChooseCityOptions): Unit = js.native
    
    /**
      * 唤起选人组件，默认只包含支付宝联系人，可以通过修改参数包含手机通讯录联系人或者双向通讯录联系人。
      */
    @JSGlobal("my.chooseContact")
    @js.native
    def chooseContact(options: ChooseContactOptions): Unit = js.native
    
    /**
      * 从本地相册选择图片或使用相机拍照。
      */
    @JSGlobal("my.chooseImage")
    @js.native
    def chooseImage(options: PartialChooseImageOptions): Unit = js.native
    
    /**
      * 使用支付宝内置地图选择地理位置。
      */
    @JSGlobal("my.chooseLocation")
    @js.native
    def chooseLocation(options: ChooseLocationOptions): Unit = js.native
    
    /**
      * 选择本地系统通信录中某个联系人的电话。
      */
    @JSGlobal("my.choosePhoneContact")
    @js.native
    def choosePhoneContact(options: ChoosePhoneContactOptions): Unit = js.native
    
    /**
      * 清除本地数据缓存。
      * 这是异步接口。
      */
    @JSGlobal("my.clearStorage")
    @js.native
    def clearStorage(): Unit = js.native
    
    /**
      * 同步清除本地数据缓存。
      * 这是同步接口。
      */
    @JSGlobal("my.clearStorageSync")
    @js.native
    def clearStorageSync(): Unit = js.native
    
    /**
      * 关闭本机蓝牙模块
      */
    @JSGlobal("my.closeBluetoothAdapter")
    @js.native
    def closeBluetoothAdapter(options: CloseBluetoothAdapterOptions): Unit = js.native
    
    /**
      * 监听WebSocket关闭。
      */
    @JSGlobal("my.closeSocket")
    @js.native
    def closeSocket(): Unit = js.native
    @JSGlobal("my.closeSocket")
    @js.native
    def closeSocket(options: CloseSocketOptions): Unit = js.native
    
    /**
      * 压缩图片。扫码体验：
      */
    @JSGlobal("my.compressImage")
    @js.native
    def compressImage(options: CompressImageOptions): Unit = js.native
    
    @JSGlobal("my.confirm")
    @js.native
    def confirm(options: PartialConfirmOptions): Unit = js.native
    
    /**
      * 连接低功耗蓝牙设备。
      */
    @JSGlobal("my.connectBLEDevice")
    @js.native
    def connectBLEDevice(options: BLEDeviceOptions): Unit = js.native
    
    /**
      * 创建一个 WebSocket 的连接；
      * 一个支付宝小程序同时只能保留一个 WebSocket 连接，如果当前已存在 WebSocket 连接，会自动关闭该连接，并重新创建一个新的 WebSocket 连接。
      */
    @JSGlobal("my.connectSocket")
    @js.native
    def connectSocket(options: ConnectSocketOptions): Unit = js.native
    
    /**
      * 创建动画实例 animation。调用实例的方法来描述动画，最后通过动画实例的export方法将动画数据导出并传递给组件的animation属性。
      *
      * 注意: export 方法每次调用后会清掉之前的动画操作
      */
    @JSGlobal("my.createAnimation")
    @js.native
    def createAnimation(options: PartialCreateAnimationOpt): Animation = js.native
    
    /**
      * 创建 canvas 绘图上下文
      *
      * 该绘图上下文只作用于对应 canvasId 的 <canvas/>
      */
    @JSGlobal("my.createCanvasContext")
    @js.native
    def createCanvasContext(canvasId: String): ConvasContext = js.native
    
    /**
      * 创建并返回一个 map 上下文对象 mapContext。
      *
      * @param mapId
      * @returns
      */
    @JSGlobal("my.createMapContext")
    @js.native
    def createMapContext(mapId: String): MapContext = js.native
    
    /**
      * 获取一个节点查询对象 SelectorQuery。
      *
      * @param page 可以指定 page 属性，默认为当前页面
      * @returns
      */
    @JSGlobal("my.createSelectorQuery")
    @js.native
    def createSelectorQuery(): SelectorQuery = js.native
    @JSGlobal("my.createSelectorQuery")
    @js.native
    def createSelectorQuery(page: js.Any): SelectorQuery = js.native
    
    /**
      * 创建并返回 web-view 上下文 webViewContext 对象。
      *
      * @param webviewId 要创建的web-view所对应的id属性
      */
    @JSGlobal("my.createWebViewContext")
    @js.native
    def createWebViewContext(webviewId: String): WebViewContext = js.native
    
    /**
      * 打开日期选择列表
      */
    @JSGlobal("my.datePicker")
    @js.native
    def datePicker(optiosn: PartialDatePickerOptions): Unit = js.native
    
    /**
      * 断开与低功耗蓝牙设备的连接。
      */
    @JSGlobal("my.disconnectBLEDevice")
    @js.native
    def disconnectBLEDevice(options: BLEDeviceOptions): Unit = js.native
    
    /**
      * 下载文件资源到本地。
      */
    @JSGlobal("my.downloadFile")
    @js.native
    def downloadFile(options: DownloadFileOptions): Unit = js.native
    
    /**
      * 获取授权码。
      * 详细用户授权接入参考 [指引](https://docs.alipay.com/mini/introduce/auth)。
      */
    @JSGlobal("my.getAuthCode")
    @js.native
    def getAuthCode(options: GetAuthCodeOptions): Unit = js.native
    
    /**
      * 客户端获取会员信息
      * 获取会员信息首先需要获取用户授权，详细会员信息获取参考[指引](https://docs.alipay.com/mini/introduce/auth)，采用 jsapi 调用的方式。
      */
    @JSGlobal("my.getAuthUserInfo")
    @js.native
    def getAuthUserInfo(options: GetAuthUserInfoOptions): Unit = js.native
    
    /**
      * 获取蓝牙设备所有 characteristic（特征值）
      */
    @JSGlobal("my.getBLEDeviceCharacteristics")
    @js.native
    def getBLEDeviceCharacteristics(options: GetBLEDeviceCharacteristicsOptions): Unit = js.native
    
    /**
      * 获取蓝牙设备所有 service（服务）
      */
    @JSGlobal("my.getBLEDeviceServices")
    @js.native
    def getBLEDeviceServices(options: GetBLEDeviceServicesOptions): Unit = js.native
    
    /**
      * 获取所有已搜索到的iBeacon设备
      */
    @JSGlobal("my.getBeacons")
    @js.native
    def getBeacons(options: GetBeaconsOptions): Unit = js.native
    
    /**
      * 获取本机蓝牙适配器状态
      */
    @JSGlobal("my.getBluetoothAdapterState")
    @js.native
    def getBluetoothAdapterState(options: GetBluetoothAdapterStateOptions): Unit = js.native
    
    /**
      * 获取所有已发现的蓝牙设备，包括已经和本机处于连接状态的设备。
      */
    @JSGlobal("my.getBluetoothDevices")
    @js.native
    def getBluetoothDevices(options: GetBluetoothDevicesOptions): Unit = js.native
    
    @JSGlobal("my.getClipboard")
    @js.native
    def getClipboard(options: GetClipboardOptions): Unit = js.native
    
    /**
      * 获取处于已连接状态的设备。
      */
    @JSGlobal("my.getConnectedBluetoothDevices")
    @js.native
    def getConnectedBluetoothDevices(options: GetConnectedBluetoothDevicesOptions): Unit = js.native
    
    /**
      *  获取文件信息
      * 基础库版本 1.4.0 开始支持，低版本需做兼容处理
      */
    @JSGlobal("my.getFileInfo")
    @js.native
    def getFileInfo(options: GetFileInfoOptions): Unit = js.native
    
    /**
      * 获取图片信息
      */
    @JSGlobal("my.getImageInfo")
    @js.native
    def getImageInfo(options: GetImageInfoOptions): Unit = js.native
    
    /**
      * 获取用户当前的地理位置信息
      */
    @JSGlobal("my.getLocation")
    @js.native
    def getLocation(options: PartialGetLocationOptions): Unit = js.native
    
    @JSGlobal("my.getNetworkType")
    @js.native
    def getNetworkType(options: GetNetworkTypeOptions): Unit = js.native
    
    /**
      * 获取保存的文件信息
      */
    @JSGlobal("my.getSavedFileInfo")
    @js.native
    def getSavedFileInfo(options: GetSavedFileInfoOptions): Unit = js.native
    
    @JSGlobal("my.getSavedFileList")
    @js.native
    def getSavedFileList(options: GetSavedFileListOptions): Unit = js.native
    
    /**
      * 获取屏幕亮度
      */
    @JSGlobal("my.getScreenBrightness")
    @js.native
    def getScreenBrightness(): Unit = js.native
    @JSGlobal("my.getScreenBrightness")
    @js.native
    def getScreenBrightness(options: GetScreenBrightnessOptions): Unit = js.native
    
    @JSGlobal("my.getServerTime")
    @js.native
    def getServerTime(options: GetServerTimeOptions): Unit = js.native
    
    /**
      * 获取缓存数据。
      * 这是异步接口。
      */
    @JSGlobal("my.getStorage")
    @js.native
    def getStorage(options: GetStorageOptions): Unit = js.native
    
    /**
      * 异步获取当前storage的相关信息
      */
    @JSGlobal("my.getStorageInfo")
    @js.native
    def getStorageInfo(options: GetStorageInfoOptions): Unit = js.native
    
    @JSGlobal("my.getStorageInfoSync")
    @js.native
    def getStorageInfoSync(): StorageInfo = js.native
    
    /**
      * 同步获取缓存数据。
      * 这是同步接口
      */
    @JSGlobal("my.getStorageSync")
    @js.native
    def getStorageSync(options: KeyString): js.Any = js.native
    
    @JSGlobal("my.getSystemInfo")
    @js.native
    def getSystemInfo(options: GetSystemInfoOptions): Unit = js.native
    
    @JSGlobal("my.getSystemInfoSync")
    @js.native
    def getSystemInfoSync(): SystemInfo = js.native
    
    //#endregion
    //#region 键盘 https://docs.alipay.com/mini/api/ui-hidekeyboard
    /**
      * 隐藏键盘
      *
      */
    @JSGlobal("my.hideKeyboard")
    @js.native
    def hideKeyboard(): Unit = js.native
    
    /**
      * 隐藏消息提示框
      */
    @JSGlobal("my.hideLoading")
    @js.native
    def hideLoading(): Unit = js.native
    @JSGlobal("my.hideLoading")
    @js.native
    def hideLoading(options: HideLoadingOptions): Unit = js.native
    
    /** 隐藏导航栏 loading。 */
    @JSGlobal("my.hideNavigationBarLoading")
    @js.native
    def hideNavigationBarLoading(): Unit = js.native
    
    /**
      * 隐藏分享按钮。
      */
    @JSGlobal("my.hideShareMenu")
    @js.native
    def hideShareMenu(): Unit = js.native
    @JSGlobal("my.hideShareMenu")
    @js.native
    def hideShareMenu(options: BaseOptions[_, _]): Unit = js.native
    
    @JSGlobal("my.hideToast")
    @js.native
    def hideToast(): Unit = js.native
    
    @JSGlobal("my.httpRequest")
    @js.native
    def httpRequest(options: RequestOptions): Unit = js.native
    
    /**
      * 拨打电话
      */
    @JSGlobal("my.makePhoneCall")
    @js.native
    def makePhoneCall(options: MakePhoneCallOptions): Unit = js.native
    
    @JSGlobal("my.multiLevelSelect")
    @js.native
    def multiLevelSelect(): Unit = js.native
    @JSGlobal("my.multiLevelSelect")
    @js.native
    def multiLevelSelect(options: MultiLevelSelectOptions): Unit = js.native
    
    /**
      * 关闭当前页面，返回上一级或多级页面。可通过 getCurrentPages 获取当前的页面栈信息，决定需要返回几层。
      */
    @JSGlobal("my.navigateBack")
    @js.native
    def navigateBack(): Unit = js.native
    @JSGlobal("my.navigateBack")
    @js.native
    def navigateBack(options: NavigateBackOptions): Unit = js.native
    
    /**
      * 跳转回上一个小程序，只有当另一个小程序跳转到当前小程序时才会能调用成功
      */
    @JSGlobal("my.navigateBackMiniProgram")
    @js.native
    def navigateBackMiniProgram(options: NavigateBackMiniProgramOptions): Unit = js.native
    
    /**
      * 保留当前页面，跳转到应用内的某个页面，使用wx.navigateBack可以返回到原页面。
      *
      * 注意：为了不让用户在使用小程序时造成困扰，
      * 我们规定页面路径只能是五层，请尽量避免多层级的交互方式。
      */
    @JSGlobal("my.navigateTo")
    @js.native
    def navigateTo(options: NavigateToOptions): Unit = js.native
    
    /**
      * 跳转到其他小程序。详细接入参考[指引](https://docs.alipay.com/mini/introduce/open-miniprogram)
      * @param options
      */
    @JSGlobal("my.navigateToMiniProgram")
    @js.native
    def navigateToMiniProgram(options: NavigateToMiniProgramOptions): Unit = js.native
    
    @JSGlobal("my.notifyBLECharacteristicValueChange")
    @js.native
    def notifyBLECharacteristicValueChange(optons: NotifyBLECharacteristicValueChangeOptions): Unit = js.native
    
    /**
      * 启用低功耗蓝牙设备特征值变化时的 notify 功能。注意：设备的特征值必须支持 notify/indicate 才可以成功调用，具体参照 characteristic 的 properties 属性 另外，必须先启用 notify 才能监听到设备 characteristicValueChange 事件。
      */
    @JSGlobal("my.notifyBLECharacteristicValueChanged")
    @js.native
    def notifyBLECharacteristicValueChanged(options: NotifyBLECharacteristicValueChangedOptions): Unit = js.native
    
    /**
      * 移除低功耗蓝牙设备的特征值变化事件的监听。
      */
    @JSGlobal("my.offBLECharacteristicValueChange")
    @js.native
    def offBLECharacteristicValueChange(): Unit = js.native
    @JSGlobal("my.offBLECharacteristicValueChange")
    @js.native
    def offBLECharacteristicValueChange(callback: js.Any): Unit = js.native
    
    /**
      * 移除低功耗蓝牙连接状态变化事件的监听。
      */
    @JSGlobal("my.offBLEConnectionStateChanged")
    @js.native
    def offBLEConnectionStateChanged(): Unit = js.native
    
    /**
      * 移除本机蓝牙状态变化的事件的监听。
      */
    @JSGlobal("my.offBluetoothAdapterStateChange")
    @js.native
    def offBluetoothAdapterStateChange(): Unit = js.native
    
    /**
      * 移除寻找到新的蓝牙设备事件的监听。
      */
    @JSGlobal("my.offBluetoothDeviceFound")
    @js.native
    def offBluetoothDeviceFound(): Unit = js.native
    @JSGlobal("my.offBluetoothDeviceFound")
    @js.native
    def offBluetoothDeviceFound(callback: js.Any): Unit = js.native
    
    /**
      * 取消网络状态变化的监听
      */
    @JSGlobal("my.offNetworkStatusChange")
    @js.native
    def offNetworkStatusChange(): Unit = js.native
    
    /**
      * 取消监听WebSocket关闭。
      */
    @JSGlobal("my.offSocketClose")
    @js.native
    def offSocketClose(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    /**
      * 取消监听WebSocket错误。
      */
    @JSGlobal("my.offSocketError")
    @js.native
    def offSocketError(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    @JSGlobal("my.offSocketMessage")
    @js.native
    def offSocketMessage(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    /**
      * 取消监听WebSocket连接打开事件。
      */
    @JSGlobal("my.offSocketOpen")
    @js.native
    def offSocketOpen(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * 取消监听截屏事件。一般需要与 my.onUserCaptureScreen 成对出现。
      */
    @JSGlobal("my.offUserCaptureScreen")
    @js.native
    def offUserCaptureScreen(): Unit = js.native
    
    /**
      * 监听低功耗蓝牙设备的特征值变化的事件。
      */
    @JSGlobal("my.onBLECharacteristicValueChange")
    @js.native
    def onBLECharacteristicValueChange(options: OnBLECharacteristicValueChangeOptions): Unit = js.native
    
    /**
      * 监听低功耗蓝牙连接的错误事件，包括设备丢失，连接异常断开等。
      */
    @JSGlobal("my.onBLEConnectionStateChanged")
    @js.native
    def onBLEConnectionStateChanged(options: OnBLEConnectionStateChangedOptions): Unit = js.native
    
    /**
      * 监听 iBeacon 服务的状态变化
      */
    @JSGlobal("my.onBeaconServiceChange")
    @js.native
    def onBeaconServiceChange(options: BeaconServiceChangeOptions): Unit = js.native
    
    /**
      * 监听 iBeacon 设备的更新事件
      */
    @JSGlobal("my.onBeaconUpdate")
    @js.native
    def onBeaconUpdate(options: BeaconUpdateOptions): Unit = js.native
    
    /**
      * 监听本机蓝牙状态变化的事件。
      */
    @JSGlobal("my.onBluetoothAdapterStateChange")
    @js.native
    def onBluetoothAdapterStateChange(callback: js.Function1[/* res */ BluetoothAdapterState, Unit]): Unit = js.native
    
    /**
      * 搜索到新的蓝牙设备时触发此事件。
      */
    @JSGlobal("my.onBluetoothDeviceFound")
    @js.native
    def onBluetoothDeviceFound(options: OnBluetoothDeviceFoundOptions): Unit = js.native
    
    @JSGlobal("my.onMessage")
    @js.native
    def onMessage: onMessageFun = js.native
    @scala.inline
    def onMessage_=(x: onMessageFun): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(x.asInstanceOf[js.Any])
    
    /**
      * 开始网络状态变化的监听
      */
    @JSGlobal("my.onNetworkStatusChange")
    @js.native
    def onNetworkStatusChange(callback: js.Function1[/* res */ IsConnected, Unit]): Unit = js.native
    
    /**
      * 监听WebSocket关闭。
      */
    @JSGlobal("my.onSocketClose")
    @js.native
    def onSocketClose(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * 监听WebSocket错误。
      */
    @JSGlobal("my.onSocketError")
    @js.native
    def onSocketError(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    /**
      * 监听WebSocket接受到服务器的消息事件。
      */
    @JSGlobal("my.onSocketMessage")
    @js.native
    def onSocketMessage(callback: js.Function1[/* res */ IsBuffer, Unit]): Unit = js.native
    
    /**
      * 监听WebSocket连接打开事件。
      */
    @JSGlobal("my.onSocketOpen")
    @js.native
    def onSocketOpen(callback: js.Function0[Unit]): Unit = js.native
    
    //#endregion
    //#region 用户截屏事件 https://docs.alipay.com/mini/api/user-capture-screen
    /**
      * 监听用户主动截屏事件，用户使用系统截屏按键截屏时触发此事件
      */
    @JSGlobal("my.onUserCaptureScreen")
    @js.native
    def onUserCaptureScreen(): Unit = js.native
    @JSGlobal("my.onUserCaptureScreen")
    @js.native
    def onUserCaptureScreen(callback: js.Function1[/* res */ js.Any, Unit]): Unit = js.native
    
    /**
      * 初始化小程序蓝牙模块，生效周期为调用 my.openBluetoothAdapter 至调用 my.closeBluetoothAdapter 或小程序被销毁为止。 在小程序蓝牙适配器模块生效期间，开发者可以正常调用下面的小程序API，并会收到蓝牙模块相关的 on 事件回调。
      */
    @JSGlobal("my.openBluetoothAdapter")
    @js.native
    def openBluetoothAdapter(options: PartialOpenBluetoothAdapt): Unit = js.native
    
    /**
      * 打开当前用户的某张卡的详情页
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      *
      * passId获取方式：
      * 1）通过alipass创建的卡
      * 调用alipay.pass.instance.add(支付宝pass新建卡券实例接口)接口，在出参“result”中可获取
      * 2）通过会员卡创建的卡
      * 调用alipay.marketing.card.query(会员卡查询)接口，在schema_url中可获取，具体参数为“p=xxx”，xxx即为passId。
      */
    @JSGlobal("my.openCardDetail")
    @js.native
    def openCardDetail(options: OpenCardDetailOptions): Unit = js.native
    
    //#endregion
    //#region 小程序二维码 https://docs.alipay.com/mini/api/openapi-qrcode
    // @see https://docs.alipay.com/mini/api/openapi-qrcode
    // @see https://docs.alipay.com/mini/introduce/qrcode
    //#endregion
    //#region 跳转支付宝卡包 https://docs.alipay.com/mini/api/card-voucher-ticket
    /**
      * 打开支付宝卡列表。
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      */
    @JSGlobal("my.openCardList")
    @js.native
    def openCardList(): Unit = js.native
    
    /**
      * 打开当前用户的某张券的详情页（口碑）
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      */
    @JSGlobal("my.openKBVoucherDetail")
    @js.native
    def openKBVoucherDetail(options: OpenKBVoucherDetailOptions1): Unit = js.native
    @JSGlobal("my.openKBVoucherDetail")
    @js.native
    def openKBVoucherDetail(options: OpenKBVoucherDetailOptions2): Unit = js.native
    
    /**
      * 使用微信内置地图查看位置
      */
    @JSGlobal("my.openLocation")
    @js.native
    def openLocation(options: OpenLocationOptions): Unit = js.native
    
    /**
      * 打开支付宝卡列表。
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      * @param options
      */
    @JSGlobal("my.openMerchantCardList")
    @js.native
    def openMerchantCardList(options: OpenMerchantCardList): Unit = js.native
    
    /**
      * 打开某个商户的票列表
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      */
    @JSGlobal("my.openMerchantTicketList")
    @js.native
    def openMerchantTicketList(options: OpenMerchantTicketListOptions): Unit = js.native
    
    /**
      * 打开当前用户的某个商户的券列表
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      */
    @JSGlobal("my.openMerchantVoucherList")
    @js.native
    def openMerchantVoucherList(options: OpenMerchantVoucherListOptions): Unit = js.native
    
    /**
      * 打开当前用户的某张票的详情页
      *
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      */
    @JSGlobal("my.openTicketDetail")
    @js.native
    def openTicketDetail(options: OpenTicketDetailOptions1): Unit = js.native
    @JSGlobal("my.openTicketDetail")
    @js.native
    def openTicketDetail(options: OpenTicketDetailOptions2): Unit = js.native
    
    /**
      * 打开支付宝票列表。
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      */
    @JSGlobal("my.openTicketList")
    @js.native
    def openTicketList(): Unit = js.native
    
    /**
      * 打开当前用户的某张券的详情页（非口碑）
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      */
    @JSGlobal("my.openVoucherDetail")
    @js.native
    def openVoucherDetail(options: OpenVoucherDetailOptions1): Unit = js.native
    @JSGlobal("my.openVoucherDetail")
    @js.native
    def openVoucherDetail(options: OpenVoucherDetailOptions2): Unit = js.native
    
    /**
      * 打开支付宝券列表
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      *
      * @param options
      */
    @JSGlobal("my.openVoucherList")
    @js.native
    def openVoucherList(): Unit = js.native
    
    /**
      * 滚动到页面的目标位置
      *
      * @param options
      */
    @JSGlobal("my.pageScrollTo")
    @js.native
    def pageScrollTo(options: PageScrollToOptions): Unit = js.native
    
    /**
      * 签约中心
      *
      * 返回码 | 含义
      * ------|------
      * 7000 | 协议签约成功
      * 7001 | 签约结果未知（有可能已经签约成功），请根据外部签约号查询签约状态
      * 7002 | 协议签约失败
      * 6001 | 用户中途取消
      * 6002 | 网络连接错误     * @param options
      */
    @JSGlobal("my.paySignCenter")
    @js.native
    def paySignCenter(options: PaySignCenterOptions): Unit = js.native
    
    @JSGlobal("my.postMessage")
    @js.native
    def postMessage(param: js.Any): Unit = js.native
    
    /**
      * 预览图片。
      */
    @JSGlobal("my.previewImage")
    @js.native
    def previewImage(options: PreviewImageOptions): Unit = js.native
    
    @JSGlobal("my.prompt")
    @js.native
    def prompt(options: PromptOptions): Unit = js.native
    
    /**
      * 关闭所有页面，打开到应用内的某个页面。
      */
    @JSGlobal("my.reLaunch")
    @js.native
    def reLaunch(): Unit = js.native
    @JSGlobal("my.reLaunch")
    @js.native
    def reLaunch(options: ReLaunchOptions): Unit = js.native
    
    /**
      * 读取低功耗蓝牙设备特征值中的数据。调用后在 my.onBLECharacteristicValueChange() 事件中接收数据返回。
      */
    @JSGlobal("my.readBLECharacteristicValue")
    @js.native
    def readBLECharacteristicValue(options: ReadBLECharacteristicValueOptions): Unit = js.native
    
    /**
      * 关闭当前页面，跳转到应用内的某个页面。
      */
    @JSGlobal("my.redirectTo")
    @js.native
    def redirectTo(options: RedirectToOptions): Unit = js.native
    
    /**
      * 删除某个保存的文件
      */
    @JSGlobal("my.removeSavedFile")
    @js.native
    def removeSavedFile(options: RemoveSavedFileOptions): Unit = js.native
    
    /**
      * 删除缓存数据。
      * 这是异步接口。
      */
    @JSGlobal("my.removeStorage")
    @js.native
    def removeStorage(options: RemoveStorageOptions): Unit = js.native
    
    /**
      * 同步删除缓存数据。
      * 这是同步接口。
      * @param key 缓存数据的key
      */
    @JSGlobal("my.removeStorageSync")
    @js.native
    def removeStorageSync(options: KeyString): Unit = js.native
    
    //#region 自定义分析 https://docs.alipay.com/mini/api/report
    /**
      * 自定义分析数据的上报接口。使用前需要在小程序管理后台的事件管理中新建事件，并配置好事件名和字段。
      *
      * @param eventName 自定义事件名，需申请
      * @param data 上报的数据
      */
    @JSGlobal("my.reportAnalytics")
    @js.native
    def reportAnalytics(eventName: String, data: js.Any): Unit = js.native
    
    /**
      * 非对称加密。
      */
    @JSGlobal("my.rsa")
    @js.native
    def rsa(options: RsaOptions): Unit = js.native
    
    /**
      * 保存文件到本地（本地文件大小总容量限制：10M）
      */
    @JSGlobal("my.saveFile")
    @js.native
    def saveFile(options: SaveFileOptions): Unit = js.native
    
    /**
      * 保存在线图片到手机相册。
      */
    @JSGlobal("my.saveImage")
    @js.native
    def saveImage(options: SaveImageOptions): Unit = js.native
    
    /**
      * 调起客户端扫码界面，扫码成功后返回对应的结果
      */
    @JSGlobal("my.scan")
    @js.native
    def scan(options: ScanOptions): Unit = js.native
    
    /**
      * 通过 WebSocket 连接发送数据，需要先使用 my.connectSocket 发起建连，并在 my.onSocketOpen 回调之后再发送数据。
      */
    @JSGlobal("my.sendSocketMessage")
    @js.native
    def sendSocketMessage(options: SendSocketMessageOptions): Unit = js.native
    
    @JSGlobal("my.setClipboard")
    @js.native
    def setClipboard(options: SetClipboardOptions): Unit = js.native
    
    /**
      * 设置是否保持常亮状态。
      * 仅在当前小程序生效，离开小程序后设置失效。
      */
    @JSGlobal("my.setKeepScreenOn")
    @js.native
    def setKeepScreenOn(): Unit = js.native
    @JSGlobal("my.setKeepScreenOn")
    @js.native
    def setKeepScreenOn(options: SetKeepScreenOnOptions): Unit = js.native
    
    /**
      * 动态设置当前页面的标题。
      */
    @JSGlobal("my.setNavigationBar")
    @js.native
    def setNavigationBar(options: PartialSetNavigationBarOp): Unit = js.native
    
    /**
      * 设置屏幕亮度
      */
    @JSGlobal("my.setScreenBrightness")
    @js.native
    def setScreenBrightness(options: SetScreenBrightnessOptions): Unit = js.native
    
    /**
      * 将数据存储在本地缓存中指定的 key 中，会覆盖掉原来该 key 对应的数据。
      * 这是异步接口。
      */
    @JSGlobal("my.setStorage")
    @js.native
    def setStorage(options: SetStorageOptions): Unit = js.native
    
    /**
      * 同步将数据存储在本地缓存中指定的 key 中。
      * 这是同步接口。
      *
      * @param key 本地缓存中的指定的 key
      * @param data 需要存储的内容
      */
    @JSGlobal("my.setStorageSync")
    @js.native
    def setStorageSync(options: Key): Unit = js.native
    
    /**
      * 显示操作菜单
      */
    @JSGlobal("my.showActionSheet")
    @js.native
    def showActionSheet(options: ActionSheetOptions): Unit = js.native
    
    @JSGlobal("my.showAuthGuide")
    @js.native
    def showAuthGuide(options: showAuthGuideOptions): Unit = js.native
    
    /**
      * 显示加载提示
      */
    @JSGlobal("my.showLoading")
    @js.native
    def showLoading(): Unit = js.native
    @JSGlobal("my.showLoading")
    @js.native
    def showLoading(options: LoadingOptions): Unit = js.native
    
    /**
      * 显示导航栏 loading
      */
    @JSGlobal("my.showNavigationBarLoading")
    @js.native
    def showNavigationBarLoading(): Unit = js.native
    
    /**
      * 显示消息提示框
      */
    @JSGlobal("my.showToast")
    @js.native
    def showToast(options: PartialToastOptions): Unit = js.native
    
    /**
      * 开始搜索附近的iBeacon设备
      */
    @JSGlobal("my.startBeaconDiscovery")
    @js.native
    def startBeaconDiscovery(options: StartBeaconDiscoveryOptions): Unit = js.native
    
    /**
      * 开始搜寻附近的蓝牙外围设备。搜索结果将在 my.onBluetoothDeviceFound 事件中返回。
      */
    @JSGlobal("my.startBluetoothDevicesDiscovery")
    @js.native
    def startBluetoothDevicesDiscovery(options: StartBluetoothDevicesDiscoveryOptions): Unit = js.native
    
    /**
      * 芝麻认证接口，调用此接口可以唤起芝麻认证页面并进行人脸身份验证。
      * 有关芝麻认证的产品和接入介绍，详见 [芝麻认证](https://docs.alipay.com/mini/introduce/zm-verify)。
      * 需要通过蚂蚁开发平台，调用certification.initialize接口进行[认证初始化](https://docs.alipay.com/zmxy/271/105914)。获得biz_no 后，方能通过以下接口激活芝麻认证小程序。
      */
    @JSGlobal("my.startZMVerify")
    @js.native
    def startZMVerify(options: StartZMVerifyOptions): Unit = js.native
    
    /**
      * 停止搜索附近的iBeacon设备
      */
    @JSGlobal("my.stopBeaconDiscovery")
    @js.native
    def stopBeaconDiscovery(options: StopBeaconDiscoveryOptions): Unit = js.native
    
    /**
      * 停止搜寻附近的蓝牙外围设备。请在确保找到需要连接的设备后调用该方法停止搜索。
      */
    @JSGlobal("my.stopBluetoothDevicesDiscovery")
    @js.native
    def stopBluetoothDevicesDiscovery(options: StopBluetoothDevicesDiscoveryOptions): Unit = js.native
    
    /**
      * 停止当前页面的下拉刷新。
      */
    @JSGlobal("my.stopPullDownRefresh")
    @js.native
    def stopPullDownRefresh(): Unit = js.native
    
    /**
      * 跳转到指定 tabBar 页面，并关闭其他所有非 tabBar 页面
      */
    @JSGlobal("my.switchTab")
    @js.native
    def switchTab(options: SwitchTabOptions): Unit = js.native
    
    /**
      * 文本风险识别， **支付宝客户端10.1.10及以上版本支持。**详细接入参考[指引](https://docs.alipay.com/mini/introduce/text-identification)
      */
    @JSGlobal("my.textRiskIdentification")
    @js.native
    def textRiskIdentification(options: TextRiskIdentificationOptions): Unit = js.native
    
    /**
      * 发起支付。
      * 详细接入支付方式参考[指引](https://docs.alipay.com/mini/introduce/pay)。
      * @param options
      */
    @JSGlobal("my.tradePay")
    @js.native
    def tradePay(options: TradePayOptions): Unit = js.native
    
    /**
      * 上传本地资源到开发者服务器。
      */
    @JSGlobal("my.uploadFile")
    @js.native
    def uploadFile(options: UploadFileOptions): Unit = js.native
    
    //#endregion
    //#region 震动 https://docs.alipay.com/mini/api/vibrate
    /**
      * 调用震动功能。
      */
    @JSGlobal("my.vibrate")
    @js.native
    def vibrate(): Unit = js.native
    @JSGlobal("my.vibrate")
    @js.native
    def vibrate(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 调用震动功能。
      */
    @JSGlobal("my.vibrateLong")
    @js.native
    def vibrateLong(): Unit = js.native
    @JSGlobal("my.vibrateLong")
    @js.native
    def vibrateLong(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 调用震动功能。
      */
    @JSGlobal("my.vibrateShort")
    @js.native
    def vibrateShort(): Unit = js.native
    @JSGlobal("my.vibrateShort")
    @js.native
    def vibrateShort(options: BaseOptions[_, _]): Unit = js.native
    
    //#endregion
    //#region 摇一摇 https://docs.alipay.com/mini/api/shake
    @JSGlobal("my.watchShake")
    @js.native
    def watchShake(options: BaseOptions[_, _]): Unit = js.native
    
    /**
      * 向低功耗蓝牙设备特征值中写入数据。
      */
    @JSGlobal("my.writeBLECharacteristicValue")
    @js.native
    def writeBLECharacteristicValue(options: WriteBLECharacteristicValueOptions): Unit = js.native
    
    @JSGlobal("my.zmCreditBorrow")
    @js.native
    def zmCreditBorrow(options: ZMCreditBorrowOptions): Unit = js.native
  }
}
