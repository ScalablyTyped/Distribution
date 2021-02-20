package typings.autoLaunch

import typings.autoLaunch.anon.UseLaunchAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("auto-launch", JSImport.Namespace)
  @js.native
  class ^ protected () extends AutoLaunch {
    def this(options: AutoLaunchOptions) = this()
  }
  
  @js.native
  trait AutoLaunch extends StObject {
    
    /**
      * Disables auto-launch at start up.
      */
    def disable(): js.Promise[Unit] = js.native
    
    /**
      * Enables auto-launch at start up.
      */
    def enable(): js.Promise[Unit] = js.native
    
    /**
      * Returns true if auto-launch is enabled.
      */
    def isEnabled(): js.Promise[Boolean] = js.native
  }
  object AutoLaunch {
    
    @scala.inline
    def apply(
      disable: () => js.Promise[Unit],
      enable: () => js.Promise[Unit],
      isEnabled: () => js.Promise[Boolean]
    ): AutoLaunch = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), isEnabled = js.Any.fromFunction0(isEnabled))
      __obj.asInstanceOf[AutoLaunch]
    }
    
    @scala.inline
    implicit class AutoLaunchMutableBuilder[Self <: AutoLaunch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEnabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait AutoLaunchOptions extends StObject {
    
    /**
      * Hidden on launch. Default is `false`.
      */
    var isHidden: js.UndefOr[Boolean] = js.native
    
    /**
      * For Mac-only options.
      */
    var mac: js.UndefOr[UseLaunchAgent] = js.native
    
    /**
      * Application name.
      */
    var name: String = js.native
    
    /**
      * Path to application. Default is `process.execPath`.
      */
    var path: js.UndefOr[String] = js.native
  }
  object AutoLaunchOptions {
    
    @scala.inline
    def apply(name: String): AutoLaunchOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoLaunchOptions]
    }
    
    @scala.inline
    implicit class AutoLaunchOptionsMutableBuilder[Self <: AutoLaunchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      @scala.inline
      def setMac(value: UseLaunchAgent): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
