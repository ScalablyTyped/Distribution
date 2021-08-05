package typings.antd

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("antd/lib/notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/lib/notification", JSImport.Default)
  @js.native
  val default: NotificationApi = js.native
  
  inline def getInstance(cacheKey: String): js.Promise[typings.rcNotification.notificationMod.NotificationInstance | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(cacheKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.rcNotification.notificationMod.NotificationInstance | Null]]
  
  trait ArgsProps extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var btn: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var duration: js.UndefOr[Double | Null] = js.undefined
    
    var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var message: ReactNode
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placement: js.UndefOr[NotificationPlacement] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    val `type`: js.UndefOr[IconType] = js.undefined
  }
  object ArgsProps {
    
    inline def apply(): ArgsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgsProps]
    }
    
    extension [Self <: ArgsProps](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setBtn(value: ReactNode): Self = StObject.set(x, "btn", value.asInstanceOf[js.Any])
      
      inline def setBtnUndefined: Self = StObject.set(x, "btn", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationNull: Self = StObject.set(x, "duration", null)
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setGetContainer(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPlacement(value: NotificationPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setType(value: IconType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ConfigProps extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    var placement: js.UndefOr[NotificationPlacement] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object ConfigProps {
    
    inline def apply(): ConfigProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigProps]
    }
    
    extension [Self <: ConfigProps](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setGetContainer(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setPlacement(value: NotificationPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.success
    - typings.antd.antdStrings.info
    - typings.antd.antdStrings.error
    - typings.antd.antdStrings.warning
  */
  trait IconType extends StObject
  object IconType {
    
    inline def error: typings.antd.antdStrings.error = "error".asInstanceOf[typings.antd.antdStrings.error]
    
    inline def info: typings.antd.antdStrings.info = "info".asInstanceOf[typings.antd.antdStrings.info]
    
    inline def success: typings.antd.antdStrings.success = "success".asInstanceOf[typings.antd.antdStrings.success]
    
    inline def warning: typings.antd.antdStrings.warning = "warning".asInstanceOf[typings.antd.antdStrings.warning]
  }
  
  trait NotificationApi
    extends StObject
       with NotificationInstance {
    
    def close(key: String): Unit
    
    def config(options: ConfigProps): Unit
    
    def destroy(): Unit
    
    def useNotification(): js.Tuple2[NotificationInstance, ReactElement]
    
    def warn(args: ArgsProps): Unit
  }
  object NotificationApi {
    
    inline def apply(
      close: String => Unit,
      config: ConfigProps => Unit,
      destroy: () => Unit,
      error: ArgsProps => Unit,
      info: ArgsProps => Unit,
      open: ArgsProps => Unit,
      success: ArgsProps => Unit,
      useNotification: () => js.Tuple2[NotificationInstance, ReactElement],
      warn: ArgsProps => Unit,
      warning: ArgsProps => Unit
    ): NotificationApi = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), config = js.Any.fromFunction1(config), destroy = js.Any.fromFunction0(destroy), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), open = js.Any.fromFunction1(open), success = js.Any.fromFunction1(success), useNotification = js.Any.fromFunction0(useNotification), warn = js.Any.fromFunction1(warn), warning = js.Any.fromFunction1(warning))
      __obj.asInstanceOf[NotificationApi]
    }
    
    extension [Self <: NotificationApi](x: Self) {
      
      inline def setClose(value: String => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setConfig(value: ConfigProps => Unit): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setUseNotification(value: () => js.Tuple2[NotificationInstance, ReactElement]): Self = StObject.set(x, "useNotification", js.Any.fromFunction0(value))
      
      inline def setWarn(value: ArgsProps => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  trait NotificationInstance extends StObject {
    
    def error(args: ArgsProps): Unit
    
    def info(args: ArgsProps): Unit
    
    def open(args: ArgsProps): Unit
    
    def success(args: ArgsProps): Unit
    
    def warning(args: ArgsProps): Unit
  }
  object NotificationInstance {
    
    inline def apply(
      error: ArgsProps => Unit,
      info: ArgsProps => Unit,
      open: ArgsProps => Unit,
      success: ArgsProps => Unit,
      warning: ArgsProps => Unit
    ): NotificationInstance = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), open = js.Any.fromFunction1(open), success = js.Any.fromFunction1(success), warning = js.Any.fromFunction1(warning))
      __obj.asInstanceOf[NotificationInstance]
    }
    
    extension [Self <: NotificationInstance](x: Self) {
      
      inline def setError(value: ArgsProps => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: ArgsProps => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setOpen(value: ArgsProps => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setSuccess(value: ArgsProps => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      inline def setWarning(value: ArgsProps => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.topLeft
    - typings.antd.antdStrings.topRight
    - typings.antd.antdStrings.bottomLeft
    - typings.antd.antdStrings.bottomRight
  */
  trait NotificationPlacement extends StObject
  object NotificationPlacement {
    
    inline def bottomLeft: typings.antd.antdStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.antd.antdStrings.bottomLeft]
    
    inline def bottomRight: typings.antd.antdStrings.bottomRight = "bottomRight".asInstanceOf[typings.antd.antdStrings.bottomRight]
    
    inline def topLeft: typings.antd.antdStrings.topLeft = "topLeft".asInstanceOf[typings.antd.antdStrings.topLeft]
    
    inline def topRight: typings.antd.antdStrings.topRight = "topRight".asInstanceOf[typings.antd.antdStrings.topRight]
  }
}
