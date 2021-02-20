package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.rcNotification.notificationMod.NotificationInstance
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod extends Shortcut {
  
  @JSImport("antd/lib/message", JSImport.Default)
  @js.native
  val default: MessageApi = js.native
  
  @JSImport("antd/lib/message", "attachTypeApi")
  @js.native
  def attachTypeApi(originalApi: js.Any, `type`: String): Unit = js.native
  
  @JSImport("antd/lib/message", "getInstance")
  @js.native
  def getInstance(): NotificationInstance | Null = js.native
  
  @JSImport("antd/lib/message", "getKeyThenIncreaseKey")
  @js.native
  def getKeyThenIncreaseKey(): Double = js.native
  
  @js.native
  trait ArgsProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var content: ReactNode = js.native
    
    var duration: Double | Null = js.native
    
    var icon: js.UndefOr[ReactNode] = js.native
    
    var key: js.UndefOr[String | Double] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var `type`: NoticeType = js.native
  }
  object ArgsProps {
    
    @scala.inline
    def apply(`type`: NoticeType): ArgsProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgsProps]
    }
    
    @scala.inline
    implicit class ArgsPropsMutableBuilder[Self <: ArgsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationNull: Self = StObject.set(x, "duration", null)
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: NoticeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ConfigContent = ReactNode | String
  
  type ConfigDuration = Double | js.Function0[Unit]
  
  type ConfigOnClose = js.Function0[Unit]
  
  @js.native
  trait ConfigOptions extends StObject {
    
    var duration: js.UndefOr[Double] = js.native
    
    var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    var maxCount: js.UndefOr[Double] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var top: js.UndefOr[Double] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setGetContainer(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    }
  }
  
  type JointContent = ConfigContent | ArgsProps
  
  @js.native
  trait MessageApi extends MessageInstance {
    
    def config(options: ConfigOptions): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(messageKey: Key): Unit = js.native
    
    def useMessage(): js.Tuple2[MessageInstance, ReactElement] = js.native
    
    def warn(content: JointContent): MessageType = js.native
    def warn(content: JointContent, duration: js.UndefOr[ConfigDuration], onClose: ConfigOnClose): MessageType = js.native
    def warn(content: JointContent, duration: ConfigDuration): MessageType = js.native
  }
  
  @js.native
  trait MessageInstance extends StObject {
    
    def error(content: JointContent): MessageType = js.native
    def error(content: JointContent, duration: js.UndefOr[ConfigDuration], onClose: ConfigOnClose): MessageType = js.native
    def error(content: JointContent, duration: ConfigDuration): MessageType = js.native
    
    def info(content: JointContent): MessageType = js.native
    def info(content: JointContent, duration: js.UndefOr[ConfigDuration], onClose: ConfigOnClose): MessageType = js.native
    def info(content: JointContent, duration: ConfigDuration): MessageType = js.native
    
    def loading(content: JointContent): MessageType = js.native
    def loading(content: JointContent, duration: js.UndefOr[ConfigDuration], onClose: ConfigOnClose): MessageType = js.native
    def loading(content: JointContent, duration: ConfigDuration): MessageType = js.native
    
    def open(args: ArgsProps): MessageType = js.native
    
    def success(content: JointContent): MessageType = js.native
    def success(content: JointContent, duration: js.UndefOr[ConfigDuration], onClose: ConfigOnClose): MessageType = js.native
    def success(content: JointContent, duration: ConfigDuration): MessageType = js.native
    
    def warning(content: JointContent): MessageType = js.native
    def warning(content: JointContent, duration: js.UndefOr[ConfigDuration], onClose: ConfigOnClose): MessageType = js.native
    def warning(content: JointContent, duration: ConfigDuration): MessageType = js.native
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
    
    @scala.inline
    def error: typings.antd.antdStrings.error = "error".asInstanceOf[typings.antd.antdStrings.error]
    
    @scala.inline
    def info: typings.antd.antdStrings.info = "info".asInstanceOf[typings.antd.antdStrings.info]
    
    @scala.inline
    def loading: typings.antd.antdStrings.loading = "loading".asInstanceOf[typings.antd.antdStrings.loading]
    
    @scala.inline
    def success: typings.antd.antdStrings.success = "success".asInstanceOf[typings.antd.antdStrings.success]
    
    @scala.inline
    def warning: typings.antd.antdStrings.warning = "warning".asInstanceOf[typings.antd.antdStrings.warning]
  }
  
  type ThenableArgument = js.Function1[/* val */ js.Any, Unit]
  
  type _To = MessageApi
  
  /* This means you don't have to write `default`, but can instead just say `messageMod.foo` */
  override def _to: MessageApi = default
}
