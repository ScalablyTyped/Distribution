package typings.alipayjssdk

import typings.alipayjssdk.alipayjssdkStrings.NOTREACHABLE
import typings.alipayjssdk.alipayjssdkStrings.UNKNOWN
import typings.alipayjssdk.alipayjssdkStrings.WIFI
import typings.alipayjssdk.alipayjssdkStrings.WWAN
import typings.alipayjssdk.alipayjssdkStrings.`2G`
import typings.alipayjssdk.alipayjssdkStrings.`3G`
import typings.alipayjssdk.alipayjssdkStrings.`4G`
import typings.alipayjssdk.anon.Accuracy
import typings.alipayjssdk.anon.Allow
import typings.alipayjssdk.anon.AllowDuplicatesKey
import typings.alipayjssdk.anon.ApFilePath
import typings.alipayjssdk.anon.ApFilePaths
import typings.alipayjssdk.anon.Available
import typings.alipayjssdk.anon.BackgroundColor
import typings.alipayjssdk.anon.BizContext
import typings.alipayjssdk.anon.BizType
import typings.alipayjssdk.anon.ButtonText
import typings.alipayjssdk.anon.Camera
import typings.alipayjssdk.anon.CancelButtonText
import typings.alipayjssdk.anon.Characteristic
import typings.alipayjssdk.anon.CharacteristicId
import typings.alipayjssdk.anon.CharacteristicIdComplete
import typings.alipayjssdk.anon.Characteristics
import typings.alipayjssdk.anon.Cities
import typings.alipayjssdk.anon.City
import typings.alipayjssdk.anon.Code
import typings.alipayjssdk.anon.Complete
import typings.alipayjssdk.anon.CompleteCount
import typings.alipayjssdk.anon.CompleteData
import typings.alipayjssdk.anon.CompleteDeviceId
import typings.alipayjssdk.anon.CompleteItems
import typings.alipayjssdk.anon.Confirm
import typings.alipayjssdk.anon.Connected
import typings.alipayjssdk.anon.Contacts
import typings.alipayjssdk.anon.Content
import typings.alipayjssdk.anon.Count
import typings.alipayjssdk.anon.Cover
import typings.alipayjssdk.anon.Current
import typings.alipayjssdk.anon.CurrentDate
import typings.alipayjssdk.anon.CurrentPosition
import typings.alipayjssdk.anon.Data
import typings.alipayjssdk.anon.DataIAnyObject
import typings.alipayjssdk.anon.Date
import typings.alipayjssdk.anon.Delay
import typings.alipayjssdk.anon.DescriptorId
import typings.alipayjssdk.anon.DeviceId
import typings.alipayjssdk.anon.Devices
import typings.alipayjssdk.anon.DevicesBluetoothDeviceInfo
import typings.alipayjssdk.anon.Direction
import typings.alipayjssdk.anon.Discovering
import typings.alipayjssdk.anon.Index
import typings.alipayjssdk.anon.IndexNumber
import typings.alipayjssdk.anon.IsSupportBLE
import typings.alipayjssdk.anon.Items
import typings.alipayjssdk.anon.Keys
import typings.alipayjssdk.anon.Latitude
import typings.alipayjssdk.anon.Mobile
import typings.alipayjssdk.anon.OnClick
import typings.alipayjssdk.anon.Position
import typings.alipayjssdk.anon.RefreshAvailable
import typings.alipayjssdk.anon.ResultCode
import typings.alipayjssdk.anon.ServiceId
import typings.alipayjssdk.anon.Services
import typings.alipayjssdk.anon.ServicesArray
import typings.alipayjssdk.anon.Time
import typings.alipayjssdk.anon.Type
import typings.alipayjssdk.anon.Url
import typings.alipayjssdk.anon.X
import typings.alipayjssdk.anon.`0`
import typings.alipayjssdk.anon.`1`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AlipayJSSDK {
  
  /** 蓝牙设备信息 */
  trait BluetoothDeviceInfo extends StObject {
    
    /** 设备信号强度 */
    var RSSI: String
    
    /** 设备的广播内容 */
    var advertisData: String
    
    /** 设备 Id */
    var deviceId: String
    
    /** 值与 name 一致 */
    var deviceName: String
    
    /** 广播设备名称 */
    var localName: String
    
    /** 蓝牙设备名称，某些设备可能没有 */
    var name: js.UndefOr[String] = js.undefined
  }
  object BluetoothDeviceInfo {
    
    inline def apply(RSSI: String, advertisData: String, deviceId: String, deviceName: String, localName: String): BluetoothDeviceInfo = {
      val __obj = js.Dynamic.literal(RSSI = RSSI.asInstanceOf[js.Any], advertisData = advertisData.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any])
      __obj.asInstanceOf[BluetoothDeviceInfo]
    }
    
    extension [Self <: BluetoothDeviceInfo](x: Self) {
      
      inline def setAdvertisData(value: String): Self = StObject.set(x, "advertisData", value.asInstanceOf[js.Any])
      
      inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRSSI(value: String): Self = StObject.set(x, "RSSI", value.asInstanceOf[js.Any])
    }
  }
  
  /** 接口调用结束的回调 */
  type CompleteCallBack = js.Function1[/* obj */ Any, Unit]
  
  type IAnyObject = Record[String, Any]
  
  type IObjArray = js.Array[IAnyObject]
  
  type IStringObject = Record[String, String]
  
  /** 网络状态信息 */
  trait NetworkTypeResult extends StObject {
    
    /** 网络是否可用 */
    var networkAvailable: Boolean
    
    /** 网络类型值 UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN */
    var networkType: UNKNOWN | NOTREACHABLE | WIFI | `3G` | `2G` | `4G` | WWAN
  }
  object NetworkTypeResult {
    
    inline def apply(networkAvailable: Boolean, networkType: UNKNOWN | NOTREACHABLE | WIFI | `3G` | `2G` | `4G` | WWAN): NetworkTypeResult = {
      val __obj = js.Dynamic.literal(networkAvailable = networkAvailable.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkTypeResult]
    }
    
    extension [Self <: NetworkTypeResult](x: Self) {
      
      inline def setNetworkAvailable(value: Boolean): Self = StObject.set(x, "networkAvailable", value.asInstanceOf[js.Any])
      
      inline def setNetworkType(value: UNKNOWN | NOTREACHABLE | WIFI | `3G` | `2G` | `4G` | WWAN): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    }
  }
  
  type OnOffCallBack = js.Function1[/* obj */ Any, Unit]
  
  @js.native
  trait ap extends StObject {
    
    def alert(option: String): js.Promise[Any] = js.native
    /**
      * ===============================  窗口 ========================================================
      */
    /**
      * [ap.alert(OPTION | content)](https://myjsapi.alipay.com/alipayjsapi/ui/notice/alert.html)
      *
      * 显示 alert 警告框。可直接传入一个字符串作为 OPTION.content 参数。
      *
      * alert 不像window.alert，会不阻塞 JS 代码执行，即先后弹2个的话，最后看到的是后弹的那个。
      */
    def alert(option: ButtonText): js.Promise[Any] = js.native
    
    def allowPullDownRefresh(option: Boolean): js.Promise[Any] = js.native
    /**
      * [ap.allowPullDownRefresh(OPTION | allow)](https://myjsapi.alipay.com/alipayjsapi/ui/pulldown/allowPullDownRefresh.html)
      *
      * 下拉刷新开关。可直接传入一个布尔值作为 OPTION.allow 参数。
      */
    def allowPullDownRefresh(option: Allow): js.Promise[Any] = js.native
    
    /**
      * [ap.chooseAlipayContact()](https://myjsapi.alipay.com/alipayjsapi/ui/contact/chooseAlipayContact.html)
      *
      * 打开支付宝通讯录，选择一个或者多个支付宝联系人。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 10 | 没有权限; |
      * | 11 | 用户取消操作 |
      */
    def chooseAlipayContact(): js.Promise[Contacts] = js.native
    def chooseAlipayContact(option: Double): js.Promise[Contacts] = js.native
    def chooseAlipayContact(option: CompleteCount): js.Promise[Contacts] = js.native
    
    /**
      * [ap.chooseCity(OPTION)](https://myjsapi.alipay.com/alipayjsapi/ui/city/chooseCity.html)
      *
      * 打开城市选择列表。
      */
    def chooseCity(): js.Promise[City] = js.native
    def chooseCity(option: Cities): js.Promise[City] = js.native
    
    def chooseImage(option: Double): js.Promise[ApFilePaths] = js.native
    /**
      * =============================== 媒体 ========================================================
      */
    /**
      * [ap.chooseImage(OPTION | count)](https://myjsapi.alipay.com/alipayjsapi/media/image/chooseImage.html)
      *
      * 拍照或从手机相册中选择图片。可直接传入一个数字作为 OPTION.count 参数。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 10 | 用户取消操作 |
      * | 11 | 操作失败（权限不够） |
      */
    def chooseImage(option: Count): js.Promise[ApFilePaths] = js.native
    
    /**
      * [ap.choosePhoneContact()](https://myjsapi.alipay.com/alipayjsapi/ui/contact/choosePhoneContact.html)
      *
      * 选择系统通信录中某个联系人的电话。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 10 | 没有权限; |
      * | 11 | 用户取消操作(或设备未授权使用通讯录) |
      */
    def choosePhoneContact(): js.Promise[Mobile] = js.native
    
    /**
      * [ap.chooseVideo(OPTION | maxDuration)](https://myjsapi.alipay.com/alipayjsapi/media/video/chooseVideo.html)
      *
      * 录制或从手机相册中选择视频。可直接传入一个数字作为 OPTION.maxDuration 参数。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 10 | 用户取消操作 |
      * | 11 | 操作失败（权限不够） |
      * | 12 | 数据处理失败 |
      */
    def chooseVideo(): js.Promise[ApFilePath] = js.native
    def chooseVideo(option: Double): js.Promise[ApFilePath] = js.native
    def chooseVideo(option: Camera): js.Promise[ApFilePath] = js.native
    
    /**
      * [ap.closeBluetoothAdapter()](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/closeBluetoothAdapter.html)
      *
      * 关闭支付宝客户客户端蓝牙模块，该方法将断开所有已建立的蓝牙连接并释放系统资源。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 关闭失败 |
      */
    def closeBluetoothAdapter(): js.Promise[Any] = js.native
    
    /**
      * [ap.closeSocket()](https://myjsapi.alipay.com/alipayjsapi/network/webSocket/closeSocket.html)
      *
      * 关闭 WebSocket 连接
      */
    def closeSocket(): js.Promise[Any] = js.native
    
    def confirm(option: String): js.Promise[Confirm] = js.native
    /**
      * [ap.confirm(OPTION | content)](https://myjsapi.alipay.com/alipayjsapi/ui/notice/confirm.html)
      *
      * 显示 confirm 确认框。可直接传入一个字符串作为 OPTION.content 参数。
      *
      * `ap.confirm`和`ap.alert`一样，它也不是阻塞式的，即先后弹2个的话，最后看到的是后弹的那个。
      */
    def confirm(option: CancelButtonText): js.Promise[Confirm] = js.native
    
    def connectBLEDevice(option: String): js.Promise[Any] = js.native
    /**
      * [ap.connectBLEDevice(OPTION | deviceId)](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/connectBLEDevice.html)
      *
      * 连接低功耗蓝牙设备。可直接传入一个字符串作为 OPTION.deviceId。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 链接失败 |
      */
    def connectBLEDevice(option: DeviceId): js.Promise[Any] = js.native
    
    /**
      * =============================== 网络请求 ========================================================
      */
    /**
      * [ap.connectSocket(OPTION)](https://myjsapi.alipay.com/alipayjsapi/network/webSocket/connectSocket.html)
      *
      * 向指定服务器发起 WebSocket 连接请求。可直接传入一个字符串作为 OPTION.url 参数。
      *
      * | error | 说明 |
      * | - | - |
      * | 1 | Error Unknown. |
      * | 2 | Connect when already connected. |
      * | 3 | Empty URL. |
      * | 4 | Illegal URL format. |
      * | 5 | URL scheme not ws or wss |
      * | 6 | Timed out connecting to server. |
      * | 7 | Invalid server certificate. |
      * | 8 | Invalid Sec-WebSocket-Accept response. |
      * | 9 | Server specified Sec-WebSocket-Protocol that wasn’t requested. |
      * | 10 | Invalid State: Cannot send until connection is open. |
      * | 11 | Error writing to stream. |
      * | 12 | Unable to allocate memory to read from socket. |
      */
    def connectSocket(optios: Complete): js.Promise[Any] = js.native
    
    /**
      * [ap.datePicker(OPTION | formate)](https://myjsapi.alipay.com/alipayjsapi/ui/date/datePicker.html)
      *
      * 选择日期。可直接传入一个字符串作为 OPTION.formate 参数。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 11 | 用户取消操作 |
      */
    def datePicker(): js.Promise[Date] = js.native
    def datePicker(option: String): js.Promise[Date] = js.native
    def datePicker(option: CurrentDate): js.Promise[Date] = js.native
    
    def disconnectBLEDevice(option: String): js.Promise[Any] = js.native
    /**
      * [ap.disconnectBLEDevice(OPTION | deviceId)](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/disconnectBLEDevice.html)
      *
      * 断开与低功耗蓝牙设备的连接。可直接传入一个字符串作为 OPTION.deviceId。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 断开失败 |
      */
    def disconnectBLEDevice(option: DeviceId): js.Promise[Any] = js.native
    
    def getBLEDeviceCharacteristics(option: String): js.Promise[Characteristics] = js.native
    /**
      * [ap.getBLEDeviceCharacteristics(OPTION | deviceId)](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/getBLEDeviceCharacteristics.html)
      *
      * 获取蓝牙设备所有 characteristic（特征值）
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 获取失败 |
      */
    def getBLEDeviceCharacteristics(option: CompleteDeviceId): js.Promise[Characteristics] = js.native
    
    def getBLEDeviceServices(option: String): js.Promise[ServicesArray] = js.native
    /**
      * [ap.getBLEDeviceServices(OPTION | deviceId)](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/getBLEDeviceServices.html)
      *
      * 获取蓝牙设备所有 service（服务）。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 获取失败 |
      */
    def getBLEDeviceServices(option: DeviceId): js.Promise[ServicesArray] = js.native
    
    /**
      * [ap.getBackgroundAudioPlayerState()](https://myjsapi.alipay.com/alipayjsapi/media/audio/getBackgroundAudioPlayerState.html)
      *
      * 获取音乐播放的状态。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 失败时会有对应描述 |
      */
    def getBackgroundAudioPlayerState(): js.Promise[CurrentPosition] = js.native
    
    /**
      * [ap.getBluetoothAdapterState()](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/getBluetoothAdapterState.html)
      *
      * 获取本机蓝牙模块状态。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 获取失败 |
      */
    def getBluetoothAdapterState(): js.Promise[Available] = js.native
    
    /**
      * [ap.getBluetoothDevices(OPTION)](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/getBluetoothDevices.html)
      *
      * 获取所有已发现的蓝牙设备，包括已经和本机处于连接状态的设备。
      * ~~可直接传入一个数组作为 OPTION.services 参数。也可直接传入一个字符串作为 OPTION.services 的第一项。~~
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 获取失败 |
      */
    def getBluetoothDevices(): js.Promise[Devices] = js.native
    def getBluetoothDevices(option: Services): js.Promise[Devices] = js.native
    
    /**
      * [ap.getConnectedBluetoothDevices(OPTION)](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/getConnectedBluetoothDevices.html)
      *
      * 根据 service 的 uuid 获取处于已连接状态的设备。可直接传入一个数组作为 OPTION.services 参数。
      * ~~也可直接传入一个字符串作为 OPTION.services 的第一项。~~
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 获取失败 |
      */
    def getConnectedBluetoothDevices(): js.Promise[Devices] = js.native
    def getConnectedBluetoothDevices(option: Services): js.Promise[Devices] = js.native
    
    /**
      * =============================== 位置 ========================================================
      */
    /**
      * [ap.getLocation(OPTION)](https://myjsapi.alipay.com/alipayjsapi/location/get/getLocation.html)
      *
      * 获取当前的地理位置信息。
      *
      * 此接口使用的是高德坐标系, 如果获取到的高的坐标系用在其他地图会导致坐标偏移
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | GPS打开，但定位失败 |
      * | 13 | 获取地理位置信息失败 |
      * | 14 | 定位超时 |
      * | 15 | 网络错误 |
      * | 16 | GPS未打开或用户未授权 |
      *
      */
    def getLocation(): js.Promise[Accuracy] = js.native
    def getLocation(option: BizType): js.Promise[Accuracy] = js.native
    
    /**
      * ===============================  设备功能 ========================================================
      */
    /**
      * [ap.getNetworkType()](https://myjsapi.alipay.com/alipayjsapi/device/network/getNetworkType.html)
      *
      * 获取当前网络状态
      */
    def getNetworkType(): js.Promise[NetworkTypeResult] = js.native
    
    /**
      * [ap.getServerTime()](https://myjsapi.alipay.com/alipayjsapi/util/server/getServerTime.html)
      *
      * 获取当前服务器时间的毫秒数
      */
    def getServerTime(): js.Promise[Time] = js.native
    
    def getSessionData(optios: String): js.Promise[DataIAnyObject] = js.native
    def getSessionData(optios: js.Array[String]): js.Promise[DataIAnyObject] = js.native
    /**
      * [ap.getSessionData(OPTION | keys | key)](https://myjsapi.alipay.com/alipayjsapi/data/session/getSessionData.html)
      *
      * 读取会话级数据。可用于页面间传递数据
      * 可直接传入一个数组作为 OPTION.keys，或直接传入一个字符串，作为 OPTION.keys 数组中的某一个 key。
      */
    def getSessionData(optios: Keys): js.Promise[DataIAnyObject] = js.native
    
    /**
      * [ap.hideLoading()](https://myjsapi.alipay.com/alipayjsapi/ui/notice/hideLoading.html)
      *
      * 隐藏加载提示。
      */
    def hideLoading(): js.Promise[Any] = js.native
    
    /**
      * [ap.hideNavigationBarLoading()](https://myjsapi.alipay.com/alipayjsapi/ui/navigationbar/hideNavigationBarLoading.html)
      *
      * 隐藏导航栏加载图标。
      */
    def hideNavigationBarLoading(): js.Promise[Any] = js.native
    
    /**
      * [ap.hideOptionButton()](https://myjsapi.alipay.com/alipayjsapi/ui/navigationbar/hideOptionButton.html)
      *
      * 隐藏导航栏右侧按钮。
      */
    def hideOptionButton(): js.Promise[Any] = js.native
    
    /**
      * [ap.hideToast()](https://myjsapi.alipay.com/alipayjsapi/ui/notice/hideToast.html)
      *
      * 隐藏弱提示。
      */
    def hideToast(): js.Promise[Any] = js.native
    
    /**
      * [ap.notifyBLECharacteristicValueChange(OPTION)](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/notifyBLECharacteristicValueChange.html)
      *
      * 启用低功耗蓝牙设备特征值变化时的 notify 功能。注意：必须设备的特征值支持notify才可以成功调用，具体参照 characteristic 的 properties 属性 另外，必须先启用notify才能监听到设备 characteristicValueChange 事件。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 启动失败 |
      */
    def notifyBLECharacteristicValueChange(option: DescriptorId): js.Promise[Any] = js.native
    
    /**
      * [ap.offAccelerometerChange()](https://myjsapi.alipay.com/alipayjsapi/device/accelerometer/offAccelerometerChange.html)
      *
      * 移除重力感应变化事件的监听
      */
    def offAccelerometerChange(): js.Promise[Any] = js.native
    def offAccelerometerChange(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offAppPause()](https://myjsapi.alipay.com/alipayjsapi/navigation/appevent/offAppPause.html)
      *
      * 移除应用压后台事件的监听。
      */
    def offAppPause(): js.Promise[Any] = js.native
    def offAppPause(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offAppResume()](https://myjsapi.alipay.com/alipayjsapi/navigation/appevent/offAppResume.html)
      *
      * 移除应用从后台唤起事件的监听。
      */
    def offAppResume(): js.Promise[Any] = js.native
    def offAppResume(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offBLECharacteristicValueChange()](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/offBLECharacteristicValueChange.html)
      *
      * 移除低功耗蓝牙设备的特征值变化事件的监听。
      */
    def offBLECharacteristicValueChange(): js.Promise[Any] = js.native
    def offBLECharacteristicValueChange(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offBLEConnectionStateChanged()](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/offBLEConnectionStateChanged.html)
      *
      * 移除低功耗蓝牙连接的错误事件的监听。
      */
    def offBLEConnectionStateChanged(): js.Promise[Any] = js.native
    def offBLEConnectionStateChanged(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offBackgroundAudioPause()](https://myjsapi.alipay.com/alipayjsapi/media/audio/offBackgroundAudioPause.html)
      *
      * 移除音乐暂停事件的监听。
      */
    def offBackgroundAudioPause(): js.Promise[Any] = js.native
    def offBackgroundAudioPause(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offBackgroundAudioPlay()](https://myjsapi.alipay.com/alipayjsapi/media/audio/offBackgroundAudioPlay.html)
      *
      * 移除音乐播放事件的监听。
      */
    def offBackgroundAudioPlay(): js.Promise[Any] = js.native
    def offBackgroundAudioPlay(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offBackgroundAudioStop()](https://myjsapi.alipay.com/alipayjsapi/media/audio/offBackgroundAudioStop.html)
      *
      * 移除音乐停止事件的监听。
      */
    def offBackgroundAudioStop(): js.Promise[Any] = js.native
    def offBackgroundAudioStop(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offBluetoothAdapterStateChange()](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/offBluetoothAdapterStateChange.html)
      *
      * 移除本机蓝牙状态变化的事件的监听。
      */
    def offBluetoothAdapterStateChange(): js.Promise[Any] = js.native
    def offBluetoothAdapterStateChange(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offBluetoothDeviceFound()](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/offBluetoothDeviceFound.html)
      *
      * 移除寻找到新的蓝牙设备事件的监听。
      */
    def offBluetoothDeviceFound(): js.Promise[Any] = js.native
    def offBluetoothDeviceFound(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offCompassChange()](https://myjsapi.alipay.com/alipayjsapi/device/compass/offCompassChange.html)
      *
      * 移除罗盘数据变化事件的监听。
      */
    def offCompassChange(): js.Promise[Any] = js.native
    def offCompassChange(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offNetworkChange()](https://myjsapi.alipay.com/alipayjsapi/device/network/offNetworkChange.html)
      *
      * 移除网络环境发生变化事件的监听。
      */
    def offNetworkChange(): js.Promise[Any] = js.native
    def offNetworkChange(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offPagePause()](https://myjsapi.alipay.com/alipayjsapi/navigation/event/offPagePause.html)
      *
      * 移除 pagePause 事件的监听。
      */
    def offPagePause(): js.Promise[Any] = js.native
    def offPagePause(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offPageResume()](https://myjsapi.alipay.com/alipayjsapi/navigation/event/offPageResume.html)
      *
      * 移除 pageResume 事件的监听。
      */
    def offPageResume(): js.Promise[Any] = js.native
    def offPageResume(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offPause()](https://myjsapi.alipay.com/alipayjsapi/navigation/event/offPause.html)
      *
      * 移除 pause 事件的监听。
      */
    def offPause(): js.Promise[Any] = js.native
    def offPause(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offPullDownRefresh()](https://myjsapi.alipay.com/alipayjsapi/ui/pulldown/offPullDownRefresh.html)
      *
      * 移除页面下拉刷新事件的监听。
      */
    def offPullDownRefresh(): js.Promise[Any] = js.native
    def offPullDownRefresh(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offResume()](https://myjsapi.alipay.com/alipayjsapi/navigation/event/offResume.html)
      *
      * 移除 resume 事件的监听。
      */
    def offResume(): js.Promise[Any] = js.native
    def offResume(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.offSocketClose()](https://myjsapi.alipay.com/alipayjsapi/network/webSocket/offSocketClose.html)
      *
      * 移除 WebSocket 关闭事件监听。
      */
    def offSocketClose(): js.Promise[Any] = js.native
    
    /**
      * [ap.offSocketError()](https://myjsapi.alipay.com/alipayjsapi/network/webSocket/offSocketError.html)
      *
      * 移除 WebSocket 报错事件监听。
      */
    def offSocketError(): js.Promise[Any] = js.native
    
    /**
      * [ap.offSocketMessage()](https://myjsapi.alipay.com/alipayjsapi/network/webSocket/offSocketMessage.html)
      *
      * 移除 WebSocket 消息事件监听
      */
    def offSocketMessage(): js.Promise[Any] = js.native
    
    /**
      * [ap.offSocketOpen()](https://myjsapi.alipay.com/alipayjsapi/network/webSocket/offSocketOpen.html)
      *
      * 移除 WebSocket 打开事件监听。
      */
    def offSocketOpen(): js.Promise[Any] = js.native
    
    /**
      * [ap.offTitleClick()](https://myjsapi.alipay.com/alipayjsapi/ui/navigationbar/offTitleClick.html)
      *
      * 移除导航栏标题点击事件的监听。
      */
    def offTitleClick(): js.Promise[Any] = js.native
    def offTitleClick(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.onAccelerometerChange()](https://myjsapi.alipay.com/alipayjsapi/device/accelerometer/onAccelerometerChange.html)
      *
      * 监听重力感应变化
      */
    def onAccelerometerChange(): js.Promise[X] = js.native
    def onAccelerometerChange(callBack: OnOffCallBack): js.Promise[X] = js.native
    
    /**
      * [ap.onAppPause()](https://myjsapi.alipay.com/alipayjsapi/navigation/appevent/onAppPause.html)
      *
      * 监听应用压后台事件。
      */
    def onAppPause(): js.Promise[Any] = js.native
    def onAppPause(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.onAppResume()](https://myjsapi.alipay.com/alipayjsapi/navigation/appevent/onAppResume.html)
      *
      * 监听应用从后台唤起事件。
      */
    def onAppResume(): js.Promise[Any] = js.native
    def onAppResume(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.onBLECharacteristicValueChange()](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/onBLECharacteristicValueChange.html)
      *
      * 监听低功耗蓝牙设备的特征值变化的事件。
      */
    def onBLECharacteristicValueChange(): js.Promise[CharacteristicIdComplete] = js.native
    def onBLECharacteristicValueChange(callBack: OnOffCallBack): js.Promise[CharacteristicIdComplete] = js.native
    
    /**
      * [ap.onBLEConnectionStateChanged()](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/onBLEConnectionStateChanged.html)
      *
      * 监听低功耗蓝牙连接的错误事件，包括设备丢失，连接异常断开等等。
      */
    def onBLEConnectionStateChanged(): js.Promise[Connected] = js.native
    def onBLEConnectionStateChanged(callBack: OnOffCallBack): js.Promise[Connected] = js.native
    
    /**
      * [ap.onBackgroundAudioPause()](https://myjsapi.alipay.com/alipayjsapi/media/audio/onBackgroundAudioPause.html)
      *
      * 监听音乐暂停事件。
      */
    def onBackgroundAudioPause(): js.Promise[Any] = js.native
    def onBackgroundAudioPause(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.onBackgroundAudioPlay()](https://myjsapi.alipay.com/alipayjsapi/media/audio/onBackgroundAudioPlay.html)
      *
      * 监听音乐播放事件。
      */
    def onBackgroundAudioPlay(): js.Promise[Any] = js.native
    def onBackgroundAudioPlay(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.onBackgroundAudioStop()](https://myjsapi.alipay.com/alipayjsapi/media/audio/onBackgroundAudioStop.html)
      *
      * 监听音乐停止事件。
      */
    def onBackgroundAudioStop(): js.Promise[Any] = js.native
    def onBackgroundAudioStop(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.onBluetoothAdapterStateChange()](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/onBluetoothAdapterStateChange.html)
      *
      * 监听本机蓝牙状态变化的事件。
      */
    def onBluetoothAdapterStateChange(): js.Promise[Discovering] = js.native
    def onBluetoothAdapterStateChange(callBack: OnOffCallBack): js.Promise[Discovering] = js.native
    
    /**
      * [ap.onBluetoothDeviceFound()](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/onBluetoothDeviceFound.html)
      *
      * 搜索到新的蓝牙设备时触发此事件。
      */
    def onBluetoothDeviceFound(): js.Promise[DevicesBluetoothDeviceInfo] = js.native
    def onBluetoothDeviceFound(callBack: OnOffCallBack): js.Promise[DevicesBluetoothDeviceInfo] = js.native
    
    /**
      * [ap.onCompassChange()](https://myjsapi.alipay.com/alipayjsapi/device/compass/onCompassChange.html)
      *
      * 监听罗盘数据变化的事件。
      */
    def onCompassChange(): js.Promise[Direction] = js.native
    def onCompassChange(callBack: OnOffCallBack): js.Promise[Direction] = js.native
    
    /**
      * [ap.onNetworkChange()](https://myjsapi.alipay.com/alipayjsapi/device/network/onNetworkChange.html)
      *
      * 监听网络环境发生变化的事件
      *
      * 3G切换到4G时系统不会发出网络切换通知。 4G切到3G时，会先从4G跳到2G，然后再从2G跳3G，因此会通知两次
      */
    def onNetworkChange(): js.Promise[NetworkTypeResult] = js.native
    def onNetworkChange(callBack: OnOffCallBack): js.Promise[NetworkTypeResult] = js.native
    
    /**
      * [ap.onPagePause()](https://myjsapi.alipay.com/alipayjsapi/navigation/event/onPagePause.html)
      *
      * 当一个页面不可见时(仅指 pushWindow 到下个页面)，会触发此事件。
      */
    def onPagePause(): js.Promise[Any] = js.native
    def onPagePause(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.onPageResume()](https://myjsapi.alipay.com/alipayjsapi/navigation/event/onPageResume.html)
      *
      * 当一个页面重新可见时(仅指从下个页面回退)，会触发此事件。
      *
      *  如果这个页面通过 popWindow/popTo 到达时传递了 data 参数，此页可以获取到 data。
      */
    def onPageResume(): js.Promise[DataIAnyObject] = js.native
    def onPageResume(callBack: OnOffCallBack): js.Promise[DataIAnyObject] = js.native
    
    /**
      * [ap.onPause()](https://myjsapi.alipay.com/alipayjsapi/navigation/event/onPause.html)
      *
      * 当一个页面不可见时，会触发此事件。包括下面两种情况：
      *
      *  - 被压入后台和锁屏，触发 appPause 的同时会触发此事件
      *  - 通过 pushWindow 打开下个页面，当前页面触发 pagePause 的同时会触发此事件。
      */
    def onPause(): js.Promise[Any] = js.native
    def onPause(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.onPullDownRefresh()](https://myjsapi.alipay.com/alipayjsapi/ui/pulldown/onPullDownRefresh.html)
      *
      * 监听页面下拉事件。
      */
    def onPullDownRefresh(): js.Promise[RefreshAvailable] = js.native
    def onPullDownRefresh(callBack: OnOffCallBack): js.Promise[RefreshAvailable] = js.native
    
    /**
      * [ap.onResume()](https://myjsapi.alipay.com/alipayjsapi/navigation/event/onResume.html)
      *
      * 当一个页面重新可见时，会触发此事件，包括下列两种情况：
      *
      *  - 从后台被唤起和锁屏界面恢复，触发 appResume 的同时会触发此事件。
      *  - 通过 popWindow/popTo 从下个页面回退，触发 pageResume 的同时会触发此事件。
      *
      *  此外，如果这个页面是通过 popWindow/popTo 到达，且传递了 data 参数，此页可以获取到 data。
      */
    def onResume(): js.Promise[DataIAnyObject] = js.native
    def onResume(callBack: OnOffCallBack): js.Promise[DataIAnyObject] = js.native
    
    /**
      * [ap.onSocketClose()](https://myjsapi.alipay.com/alipayjsapi/network/webSocket/onSocketClose.html)
      *
      * 监听 WebSocket 关闭事件。
      */
    def onSocketClose(): js.Promise[Any] = js.native
    def onSocketClose(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * [ap.onSocketError()](https://myjsapi.alipay.com/alipayjsapi/network/webSocket/onSocketError.html)
      *
      * 监听 WebSocket 报错事件。
      */
    def onSocketError(): js.Promise[Any] = js.native
    
    /**
      * [ap.onSocketMessage()](https://myjsapi.alipay.com/alipayjsapi/network/webSocket/onSocketMessage.html)
      *
      * 监听 WebSocket 接受到服务器的消息事件。
      */
    def onSocketMessage(): js.Promise[`0`] = js.native
    
    /**
      * [ap.onSocketOpen()](https://myjsapi.alipay.com/alipayjsapi/network/webSocket/onSocketOpen.html)
      *
      * 监听 WebSocket 连接打开事件。
      */
    def onSocketOpen(): js.Promise[Any] = js.native
    
    /**
      * [ap.onTitleClick()](https://myjsapi.alipay.com/alipayjsapi/ui/navigationbar/onTitleClick.html)
      *
      * 监听导航栏标题点击事件。在点击文字时才触发，点击导航栏其他空白地方不会触发
      */
    def onTitleClick(): js.Promise[Any] = js.native
    def onTitleClick(callBack: OnOffCallBack): js.Promise[Any] = js.native
    
    /**
      * ===============================  蓝牙 =======================
      *
      * **[蓝牙模块相关错误码](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/errorCodes.html)**
      *
      * | 错误码 | 说明 | 解决方案 |
      * | - | - | - |
      * | 10000 | 未初始化蓝牙适配器 | 调用my.openBluetoothAdapter ｜
      * | 10001 | 当前蓝牙适配器不可用 | 检查当前设备是否支持BLE并开启蓝牙功能 ｜
      * | 10002 | 没有找到指定设备 | 检查deviceId是否错误，或者是否开启外设广播 ｜
      * | 10003 | 连接失败 | 检查deviceId是否错误，目标蓝牙外设是否开启广播 ｜
      * | 10004 | 没有找到指定服务 | 检查serviceId，确认目标外设是否拥有该服务 ｜
      * | 10005 | 没有找到指定特征值 | 检查characteristId是否正确、检查目标外设特定service下是否具备该特征 ｜
      * | 10006 | 当前连接已断开 | 连接断开，重新连接 ｜
      * | 10007 | 当前特征值不支持此操作 | 检查特征是否具备读\写\通知等功能 ｜
      * | 10008 | 其余所有系统上报的异常 | 其他未知错误，具体问题具体分析 ｜
      * | 10009 | Android 系统特有，系统版本低于 4.3 不支持BLE | 提示用户不支持 ｜
      * | 10010 | 没有找到指定描述符 | 检查serviceId、characteristId是否正确 ｜
      * | 10011 | 设备 id 不可用/为空 | 使用正确的deviceId ｜
      * | 10012 | 服务 id 不可用/为空 | 使用正确的serviceId ｜
      * | 10013 | 特征 id 不可用/为空 | 使用正确的characteristId ｜
      * | 10014 | 发送的数据为空或格式错误 | 检查写数据或者HEX转化是否错误 ｜
      * | 10015 | 操作超时 | 重新操作 ｜
      * | 10016 | 缺少参数 | 检查调用的参数，并重新操作 ｜
      * | 10017 | 写入特征值失败 | 写失败，检查外设特征是否支持写操作，是否断开连接 ｜
      * | 10018 | 读取特征值失败 | 读失败，检查外设特征是否支持读操作，是否断开连接 ｜
      */
    /**
      * [ap.openBluetoothAdapter()](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/openBluetoothAdapter.html)
      *
      * 初始化支付宝客户端的蓝牙模块。在调用支付宝蓝牙模块其它相关 API 之前，须调先调用此接口。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 蓝牙未打开 |
      * | 13 | 与系统蓝牙服务的链接暂时丢失 |
      * | 14 | 未授权支付宝使用蓝牙功能 |
      * | 15 | 未知错误 |
      */
    def openBluetoothAdapter(): js.Promise[IsSupportBLE] = js.native
    
    /**
      * [ap.openLocation(OPTION)](https://myjsapi.alipay.com/alipayjsapi/location/open/openLocation.html)
      *
      * 使用支付宝内置地图查看位置。
      *
      * 此接口使用的是高德坐标系，在使用导航功能时如果用户选择了高德之外的其他地图应用可能导致坐标偏移
      */
    def openLocation(option: Latitude): js.Promise[js.Object] = js.native
    
    /**
      * [ap.parseQueryString(queryString)](https://myjsapi.alipay.com/alipayjsapi/data/querystring/parseQueryString.html)
      *
      * 把 URL 中的 queryString 解析成一个对象。
      * @param queryString 可不填，默认解析window.location.search
      * @returns 默认{}, queryString 解析结果。可配合 ap.pushWindow 等的 data 参数一起使用
      */
    def parseQueryString(): IAnyObject = js.native
    def parseQueryString(queryString: String): IAnyObject = js.native
    
    /**
      * [ap.pauseBackgroundAudio()](https://myjsapi.alipay.com/alipayjsapi/media/audio/pauseBackgroundAudio.html)
      *
      * 暂停播放音乐。
      */
    def pauseBackgroundAudio(): js.Promise[Any] = js.native
    
    def playBackgroundAudio(option: js.Array[String]): js.Promise[Any] = js.native
    /**
      * [ap.playBackgroundAudio(OPTION)](https://myjsapi.alipay.com/alipayjsapi/media/audio/playBackgroundAudio.html)
      *
      * 开始播放音乐。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 失败时会有对应描述 |
      */
    def playBackgroundAudio(option: Cover): js.Promise[Any] = js.native
    
    def popTo(option: String): js.Promise[Any] = js.native
    def popTo(option: Double): js.Promise[Any] = js.native
    /**
      * [ap.popTo(OPTION | urlPattern | index)](https://myjsapi.alipay.com/alipayjsapi/navigation/window/popTo.html)
      *
      * 可以一次回退多级页面。可直接传入一个字符串作为 OPTION.urlPattern 参数，或直接传入一个整数作为 OPTION.index 参数。
      */
    def popTo(option: Index): js.Promise[Any] = js.native
    
    /**
      * [ap.popWindow(OPTION | data)](https://myjsapi.alipay.com/alipayjsapi/navigation/window/popWindow.html)
      *
      * 关闭当前页面。可直接传入一个对象作为 OPTION.data 参数。
      */
    def popWindow(): js.Promise[Any] = js.native
    def popWindow(option: `1`): js.Promise[Any] = js.native
    def popWindow(option: Record[String, String]): js.Promise[Any] = js.native
    
    def previewImage(option: js.Array[String]): js.Promise[js.Object] = js.native
    /**
      * [ap.previewImage(OPTION | urls)](https://myjsapi.alipay.com/alipayjsapi/media/image/previewImage.html)
      *
      * 预览图片。可直接传入一个图片链接数组作为 OPTION.urls 参数。
      */
    def previewImage(option: Current): js.Promise[js.Object] = js.native
    
    def pushWindow(option: String): js.Promise[Any] = js.native
    /**
      * ===============================  窗口 ========================================================
      */
    /**
      * [ap.pushWindow(OPTION | url)](https://myjsapi.alipay.com/alipayjsapi/navigation/window/pushWindow.html)
      *
      * 打开一个新的页面，自带转场动画。可直接传入一个字符串作为 OPTION.url 参数。
      */
    def pushWindow(option: Url): js.Promise[Any] = js.native
    
    /**
      * [ap.readBLECharacteristicValue(OPTION)](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/readBLECharacteristicValue.html)
      *
      * 读取低功耗蓝牙设备特征值中的数据。调用后在 `ap.onBLECharacteristicValueChange()` 事件中接收数据返回。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 读取数据失败 |
      */
    def readBLECharacteristicValue(option: ServiceId): js.Promise[Characteristic] = js.native
    
    def redirectTo(option: String): js.Promise[Any] = js.native
    /**
      * [ap.redirectTo(OPTION | url)](https://myjsapi.alipay.com/alipayjsapi/navigation/window/redirectTo.html)
      *
      * 替换当前页面，并且不会产生历史记录。可直接传入一个字符串作为 OPTION.url 参数。
      */
    def redirectTo(option: Url): js.Promise[Any] = js.native
    
    /**
      * [ap.scan(OPTION | type)](https://myjsapi.alipay.com/alipayjsapi/device/scan/scan.html)
      *
      * 扫码
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 10 | 用户取消 |
      * | 11 | 操作失败 |
      */
    def scan(): js.Promise[Code] = js.native
    def scan(option: Type): js.Promise[Code] = js.native
    
    def seekBackgroundAudio(option: Double): js.Promise[Any] = js.native
    /**
      * [ap.seekBackgroundAudio(OPTION | position)](https://myjsapi.alipay.com/alipayjsapi/media/audio/seekBackgroundAudio.html)
      *
      * 控制音乐播放进度。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 失败时会有对应描述 |
      */
    def seekBackgroundAudio(option: Position): js.Promise[Any] = js.native
    
    /**
      * [ap.sendSocketMessage(OPTION)](https://myjsapi.alipay.com/alipayjsapi/network/webSocket/sendSocketMessage.html)
      *
      * 通过 WebSocket 连接发送数据，需要先 ap.connectSocket，并在 ap.onSocketOpen 回调之后才能发送。
      */
    def sendSocketMessage(optios: Data): js.Promise[Any] = js.native
    
    def setNavigationBar(option: String): js.Promise[Any] = js.native
    /**
      * [ap.setNavigationBar(OPTION | title)](https://myjsapi.alipay.com/alipayjsapi/ui/navigationbar/setNavigationBar.html)
      *
      * 设置导航栏标题及样式。可直接传入一个字符串作为 OPTION.title 参数
      */
    def setNavigationBar(option: BackgroundColor): js.Promise[Any] = js.native
    
    /**
      * [ap.setOptionButton(OPTION)](https://myjsapi.alipay.com/alipayjsapi/ui/navigationbar/setOptionButton.html)
      *
      * 设置导航栏右侧按钮
      */
    def setOptionButton(option: OnClick): js.Promise[Any] = js.native
    
    /**
      * =============================== 数据 ========================================================
      */
    /**
      * [ap.setSessionData(OPTION)](https://myjsapi.alipay.com/alipayjsapi/data/session/setSessionData.html)
      *
      * 写入会话级数据。
      */
    def setSessionData(optios: CompleteData): js.Promise[js.Object] = js.native
    
    /**
      * [ap.showActionSheet(OPTION)](https://myjsapi.alipay.com/alipayjsapi/ui/notice/showActionSheet.html)
      *
      * 显示操作菜单。
      */
    def showActionSheet(option: Items): js.Promise[IndexNumber] = js.native
    
    def showLoading(option: String): js.Promise[Any] = js.native
    /**
      * [ap.showLoading(OPTION | content)](https://myjsapi.alipay.com/alipayjsapi/ui/notice/showLoading.html)
      *
      * 显示加载提示。可直接传入一个字符串作为 OPTION.content 参数。
      */
    def showLoading(option: Delay): js.Promise[Any] = js.native
    
    /**
      * [ap.showNavigationBarLoading()](https://myjsapi.alipay.com/alipayjsapi/ui/navigationbar/showNavigationBarLoading.html)
      *
      * 显示导航栏加载图标。
      */
    def showNavigationBarLoading(): js.Promise[Any] = js.native
    
    /**
      * [ap.showOptionButton()](https://myjsapi.alipay.com/alipayjsapi/ui/navigationbar/showOptionButton.html)
      *
      * 显示导航栏右侧按钮。
      */
    def showOptionButton(): js.Promise[Any] = js.native
    
    /**
      * [ap.showPopMenu(OPTION)](https://myjsapi.alipay.com/alipayjsapi/ui/navigationbar/showPopMenu.html)
      *
      * 显示导航栏右上角弹出的下拉菜单。可直接传入一个数组作为 OPTION.items 参数。
      */
    def showPopMenu(option: CompleteItems): js.Promise[IndexNumber] = js.native
    
    def showToast(option: String): js.Promise[Any] = js.native
    /**
      * [ap.showToast(OPTION | content)](https://myjsapi.alipay.com/alipayjsapi/ui/notice/showToast.html)
      *
      * 显示弱提示。可选择多少秒之后消失。可直接传入一个字符串作为 OPTION.content 参数。
      */
    def showToast(option: Content): js.Promise[Any] = js.native
    
    /**
      * [ap.startBluetoothDevicesDiscovery(OPTION)](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/startBluetoothDevicesDiscovery.html)
      *
      * 开始搜寻附近的蓝牙外围设备。搜索结果将在 bluetoothDeviceFound 事件中返回。
      *
      * ~~可直接传入一个数组作为 OPTION.services 参数。也可直接传入一个字符串作为 OPTION.services 的第一项。~~
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 开始搜索失败 |
      */
    def startBluetoothDevicesDiscovery(option: AllowDuplicatesKey): js.Promise[Any] = js.native
    
    /**
      * [ap.stopBackgroundAudio()](https://myjsapi.alipay.com/alipayjsapi/media/audio/stopBackgroundAudio.html)
      *
      * 停止播放音乐
      */
    def stopBackgroundAudio(): js.Promise[Any] = js.native
    
    /**
      * [ap.stopBluetoothDevicesDiscovery()](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/stopBluetoothDevicesDiscovery.html)
      *
      * 停止搜寻附近的蓝牙外围设备。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 停止搜索失败 |
      */
    def stopBluetoothDevicesDiscovery(): js.Promise[Any] = js.native
    
    def tradePay(option: String): js.Promise[ResultCode] = js.native
    /**
      * ===============================  窗口 ========================================================
      */
    /**
      * [ap.tradePay(OPTION | orderStr)](https://myjsapi.alipay.com/alipayjsapi/util/pay/tradePay.html)
      *
      * 发起支付
      *
      * 可直接传入一个字符串作为 OPTION.orderStr 参数
      * > 注：外部商户类APP支付orderStr字串拼接方式可参考 [这篇文档](https://opendocs.alipay.com/open/204/105465/)
      */
    def tradePay(option: BizContext): js.Promise[ResultCode] = js.native
    
    /**
      * [ap.watchShake()](https://myjsapi.alipay.com/alipayjsapi/device/shake/watchShake.html)
      *
      * 摇一摇功能。每次调用API，在摇一摇手机后触发回调，如需再次监听需要再次调用这个API。
      */
    def watchShake(): js.Promise[Any] = js.native
    
    /**
      * [ap.writeBLECharacteristicValue(OPTION)](https://myjsapi.alipay.com/alipayjsapi/device/bluetooth/writeBLECharacteristicValue.html)
      *
      * 向低功耗蓝牙设备特征值中写入数据。
      *
      * | 错误码 | 说明 |
      * | - | - |
      * | 12 | 写入数据失败 |
      */
    def writeBLECharacteristicValue(option: CharacteristicId): js.Promise[Any] = js.native
  }
}
