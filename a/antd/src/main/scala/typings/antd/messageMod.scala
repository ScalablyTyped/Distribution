package typings.antd

import typings.rcNotification.notificationMod.NotificationInstance
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("antd/lib/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/lib/message", JSImport.Default)
  @js.native
  val default: MessageApi = js.native
  
  inline def attachTypeApi(originalApi: js.Any, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachTypeApi")(originalApi.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getInstance(): NotificationInstance | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[NotificationInstance | Null]
  
  inline def getKeyThenIncreaseKey(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyThenIncreaseKey")().asInstanceOf[Double]
  
  trait ArgsProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: ReactNode
    
    var duration: Double | Null
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var key: js.UndefOr[String | Double] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var `type`: NoticeType
  }
  object ArgsProps {
    
    inline def apply(`type`: NoticeType): ArgsProps = {
      val __obj = js.Dynamic.literal(duration = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgsProps]
    }
    
    extension [Self <: ArgsProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationNull: Self = StObject.set(x, "duration", null)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: NoticeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ConfigContent = ReactNode | String
  
  type ConfigDuration = Double | js.Function0[Unit]
  
  type ConfigOnClose = js.Function0[Unit]
  
  trait ConfigOptions extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    var maxCount: js.UndefOr[Double] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setGetContainer(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    }
  }
  
  type JointContent = ConfigContent | ArgsProps
  
  @js.native
  trait MessageApi
    extends StObject
       with MessageInstance {
    
    def config(options: ConfigOptions): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(messageKey: Key): Unit = js.native
    
    def useMessage(): js.Tuple2[MessageInstance, ReactElement] = js.native
    
    def warn(content: JointContent): MessageType = js.native
    def warn(content: JointContent, duration: Unit, onClose: ConfigOnClose): MessageType = js.native
    def warn(content: JointContent, duration: ConfigDuration): MessageType = js.native
    def warn(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
  }
  
  @js.native
  trait MessageInstance extends StObject {
    
    def error(content: JointContent): MessageType = js.native
    def error(content: JointContent, duration: Unit, onClose: ConfigOnClose): MessageType = js.native
    def error(content: JointContent, duration: ConfigDuration): MessageType = js.native
    def error(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
    
    def info(content: JointContent): MessageType = js.native
    def info(content: JointContent, duration: Unit, onClose: ConfigOnClose): MessageType = js.native
    def info(content: JointContent, duration: ConfigDuration): MessageType = js.native
    def info(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
    
    def loading(content: JointContent): MessageType = js.native
    def loading(content: JointContent, duration: Unit, onClose: ConfigOnClose): MessageType = js.native
    def loading(content: JointContent, duration: ConfigDuration): MessageType = js.native
    def loading(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
    
    def open(args: ArgsProps): MessageType = js.native
    
    def success(content: JointContent): MessageType = js.native
    def success(content: JointContent, duration: Unit, onClose: ConfigOnClose): MessageType = js.native
    def success(content: JointContent, duration: ConfigDuration): MessageType = js.native
    def success(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
    
    def warning(content: JointContent): MessageType = js.native
    def warning(content: JointContent, duration: Unit, onClose: ConfigOnClose): MessageType = js.native
    def warning(content: JointContent, duration: ConfigDuration): MessageType = js.native
    def warning(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
  }
  
  @js.native
  trait MessageType extends StObject {
    
    def apply(): Unit = js.native
    
    var promise: js.Promise[Unit] = js.native
    
    def `then`(fill: ThenableArgument, reject: ThenableArgument): js.Promise[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.info
    - typings.antd.antdStrings.success
    - typings.antd.antdStrings.error
    - typings.antd.antdStrings.warning
    - typings.antd.antdStrings.loading
  */
  trait NoticeType extends StObject
  object NoticeType {
    
    inline def error: typings.antd.antdStrings.error = "error".asInstanceOf[typings.antd.antdStrings.error]
    
    inline def info: typings.antd.antdStrings.info = "info".asInstanceOf[typings.antd.antdStrings.info]
    
    inline def loading: typings.antd.antdStrings.loading = "loading".asInstanceOf[typings.antd.antdStrings.loading]
    
    inline def success: typings.antd.antdStrings.success = "success".asInstanceOf[typings.antd.antdStrings.success]
    
    inline def warning: typings.antd.antdStrings.warning = "warning".asInstanceOf[typings.antd.antdStrings.warning]
  }
  
  type ThenableArgument = js.Function1[/* val */ js.Any, Unit]
}
