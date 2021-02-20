package typings.antdMobile

import typings.antdMobile.badgeMod.BadgeProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionSheetMod {
  
  object default {
    
    @JSImport("antd-mobile/lib/action-sheet", "default.close")
    @js.native
    def close(): Unit = js.native
    
    @JSImport("antd-mobile/lib/action-sheet", "default.showActionSheetWithOptions")
    @js.native
    def showActionSheetWithOptions(config: ActionSheetWithOptions): Unit = js.native
    @JSImport("antd-mobile/lib/action-sheet", "default.showActionSheetWithOptions")
    @js.native
    def showActionSheetWithOptions(config: ActionSheetWithOptions, callback: ActionCallBack): Unit = js.native
    
    @JSImport("antd-mobile/lib/action-sheet", "default.showShareActionSheetWithOptions")
    @js.native
    def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions): Unit = js.native
    @JSImport("antd-mobile/lib/action-sheet", "default.showShareActionSheetWithOptions")
    @js.native
    def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions, callback: ActionCallBack): Unit = js.native
  }
  
  type ActionCallBack = js.Function2[/* index */ Double, /* rowIndex */ js.UndefOr[Double], js.Thenable[js.Any] | Unit]
  
  @js.native
  trait ActionSheetOptions extends StObject {
    
    var cancelButtonIndex: js.UndefOr[Double] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var destructiveButtonIndex: js.UndefOr[Double] = js.native
    
    var maskClosable: js.UndefOr[Boolean] = js.native
    
    var maskTransitionName: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[ReactNode] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
  }
  object ActionSheetOptions {
    
    @scala.inline
    def apply(): ActionSheetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionSheetOptions]
    }
    
    @scala.inline
    implicit class ActionSheetOptionsMutableBuilder[Self <: ActionSheetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButtonIndex(value: Double): Self = StObject.set(x, "cancelButtonIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonIndexUndefined: Self = StObject.set(x, "cancelButtonIndex", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDestructiveButtonIndex(value: Double): Self = StObject.set(x, "destructiveButtonIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestructiveButtonIndexUndefined: Self = StObject.set(x, "destructiveButtonIndex", js.undefined)
      
      @scala.inline
      def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    }
  }
  
  @js.native
  trait ActionSheetWithOptions extends ActionSheetOptions {
    
    var badges: js.UndefOr[js.Array[BadgesOption]] = js.native
    
    var options: js.Array[String] = js.native
  }
  object ActionSheetWithOptions {
    
    @scala.inline
    def apply(options: js.Array[String]): ActionSheetWithOptions = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionSheetWithOptions]
    }
    
    @scala.inline
    implicit class ActionSheetWithOptionsMutableBuilder[Self <: ActionSheetWithOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadges(value: js.Array[BadgesOption]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgesUndefined: Self = StObject.set(x, "badges", js.undefined)
      
      @scala.inline
      def setBadgesVarargs(value: BadgesOption*): Self = StObject.set(x, "badges", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BadgesOption extends BadgeProps {
    
    var index: Double = js.native
  }
  object BadgesOption {
    
    @scala.inline
    def apply(index: Double): BadgesOption = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgesOption]
    }
    
    @scala.inline
    implicit class BadgesOptionMutableBuilder[Self <: BadgesOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ShareActionSheetWithOptions extends ActionSheetOptions {
    
    var badges: js.UndefOr[js.Array[BadgesOption]] = js.native
    
    var options: js.Array[js.Array[ShareOption] | ShareOption] = js.native
  }
  object ShareActionSheetWithOptions {
    
    @scala.inline
    def apply(options: js.Array[js.Array[ShareOption] | ShareOption]): ShareActionSheetWithOptions = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareActionSheetWithOptions]
    }
    
    @scala.inline
    implicit class ShareActionSheetWithOptionsMutableBuilder[Self <: ShareActionSheetWithOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadges(value: js.Array[BadgesOption]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgesUndefined: Self = StObject.set(x, "badges", js.undefined)
      
      @scala.inline
      def setBadgesVarargs(value: BadgesOption*): Self = StObject.set(x, "badges", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: js.Array[js.Array[ShareOption] | ShareOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: (js.Array[ShareOption] | ShareOption)*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ShareOption extends StObject {
    
    var icon: ReactNode = js.native
    
    var title: String = js.native
  }
  object ShareOption {
    
    @scala.inline
    def apply(title: String): ShareOption = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareOption]
    }
    
    @scala.inline
    implicit class ShareOptionMutableBuilder[Self <: ShareOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
