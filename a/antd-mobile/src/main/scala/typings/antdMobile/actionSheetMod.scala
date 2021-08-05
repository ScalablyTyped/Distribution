package typings.antdMobile

import typings.antdMobile.badgeMod.BadgeProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionSheetMod {
  
  object default {
    
    @JSImport("antd-mobile/lib/action-sheet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
    
    inline def showActionSheetWithOptions(config: ActionSheetWithOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showActionSheetWithOptions")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def showActionSheetWithOptions(config: ActionSheetWithOptions, callback: ActionCallBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showActionSheetWithOptions")(config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showShareActionSheetWithOptions")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions, callback: ActionCallBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showShareActionSheetWithOptions")(config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type ActionCallBack = js.Function2[/* index */ Double, /* rowIndex */ js.UndefOr[Double], js.Thenable[js.Any] | Unit]
  
  trait ActionSheetOptions extends StObject {
    
    var cancelButtonIndex: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var destructiveButtonIndex: js.UndefOr[Double] = js.undefined
    
    var maskClosable: js.UndefOr[Boolean] = js.undefined
    
    var maskTransitionName: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
  }
  object ActionSheetOptions {
    
    inline def apply(): ActionSheetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionSheetOptions]
    }
    
    extension [Self <: ActionSheetOptions](x: Self) {
      
      inline def setCancelButtonIndex(value: Double): Self = StObject.set(x, "cancelButtonIndex", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonIndexUndefined: Self = StObject.set(x, "cancelButtonIndex", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDestructiveButtonIndex(value: Double): Self = StObject.set(x, "destructiveButtonIndex", value.asInstanceOf[js.Any])
      
      inline def setDestructiveButtonIndexUndefined: Self = StObject.set(x, "destructiveButtonIndex", js.undefined)
      
      inline def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      inline def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      inline def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      inline def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      inline def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    }
  }
  
  trait ActionSheetWithOptions
    extends StObject
       with ActionSheetOptions {
    
    var badges: js.UndefOr[js.Array[BadgesOption]] = js.undefined
    
    var options: js.Array[String]
  }
  object ActionSheetWithOptions {
    
    inline def apply(options: js.Array[String]): ActionSheetWithOptions = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionSheetWithOptions]
    }
    
    extension [Self <: ActionSheetWithOptions](x: Self) {
      
      inline def setBadges(value: js.Array[BadgesOption]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
      
      inline def setBadgesUndefined: Self = StObject.set(x, "badges", js.undefined)
      
      inline def setBadgesVarargs(value: BadgesOption*): Self = StObject.set(x, "badges", js.Array(value :_*))
      
      inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  trait BadgesOption
    extends StObject
       with BadgeProps {
    
    var index: Double
  }
  object BadgesOption {
    
    inline def apply(index: Double): BadgesOption = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgesOption]
    }
    
    extension [Self <: BadgesOption](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShareActionSheetWithOptions
    extends StObject
       with ActionSheetOptions {
    
    var badges: js.UndefOr[js.Array[BadgesOption]] = js.undefined
    
    var options: js.Array[js.Array[ShareOption] | ShareOption]
  }
  object ShareActionSheetWithOptions {
    
    inline def apply(options: js.Array[js.Array[ShareOption] | ShareOption]): ShareActionSheetWithOptions = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareActionSheetWithOptions]
    }
    
    extension [Self <: ShareActionSheetWithOptions](x: Self) {
      
      inline def setBadges(value: js.Array[BadgesOption]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
      
      inline def setBadgesUndefined: Self = StObject.set(x, "badges", js.undefined)
      
      inline def setBadgesVarargs(value: BadgesOption*): Self = StObject.set(x, "badges", js.Array(value :_*))
      
      inline def setOptions(value: js.Array[js.Array[ShareOption] | ShareOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: (js.Array[ShareOption] | ShareOption)*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  trait ShareOption extends StObject {
    
    var icon: ReactNode
    
    var title: String
  }
  object ShareOption {
    
    inline def apply(title: String): ShareOption = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareOption]
    }
    
    extension [Self <: ShareOption](x: Self) {
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
