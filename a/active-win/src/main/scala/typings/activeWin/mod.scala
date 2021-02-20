package typings.activeWin

import typings.activeWin.activeWinStrings.linux
import typings.activeWin.activeWinStrings.macos
import typings.activeWin.activeWinStrings.windows
import typings.activeWin.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get metadata about the [active window](https://en.wikipedia.org/wiki/Active_window) (title, id, bounds, owner, etc).
  	@returns The active window metadata.
  	@example
  	```
  	import activeWin = require('active-win');
  	(async () => {
  		const result = await activeWin();
  		if (!result) {
  			return;
  		}
  		if (result.platform === 'macos') {
  			// Among other fields, result.owner.bundleId is available on macOS.
  			console.log(`Process title is ${result.title} with bundle id ${result.owner.bundleId}.`);
  		} else if (result.platform === 'windows') {
  			console.log(`Process title is ${result.title} with path ${result.owner.path}.`);
  		} else {
  			console.log(`Process title is ${result.title} with path ${result.owner.path}.`);
  		}
  	})();
  	```
  	*/
  @JSImport("active-win", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[js.UndefOr[Result]] = js.native
  
  /**
  	Synchronously get metadata about the [active window](https://en.wikipedia.org/wiki/Active_window) (title, id, bounds, owner, etc).
  	@returns The active window metadata.
  	@example
  	```
  	import activeWin = require('active-win');
  	const result = activeWin.sync();
  	if (result) {
  		if (result.platform === 'macos') {
  			// Among other fields, result.owner.bundleId is available on macOS.
  			console.log(`Process title is ${result.title} with bundle id ${result.owner.bundleId}.`);
  		} else if (result.platform === 'windows') {
  			console.log(`Process title is ${result.title} with path ${result.owner.path}.`);
  		} else {
  			console.log(`Process title is ${result.title} with path ${result.owner.path}.`);
  		}
  	}
  	```
  	*/
  @JSImport("active-win", "sync")
  @js.native
  def sync(): js.UndefOr[Result] = js.native
  
  @js.native
  trait BaseOwner extends StObject {
    
    /**
    		Name of the app.
    		*/
    var name: String = js.native
    
    /**
    		Path to the app.
    		*/
    var path: String = js.native
    
    /**
    		Process identifier
    		*/
    var processId: Double = js.native
  }
  object BaseOwner {
    
    @scala.inline
    def apply(name: String, path: String, processId: Double): BaseOwner = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseOwner]
    }
    
    @scala.inline
    implicit class BaseOwnerMutableBuilder[Self <: BaseOwner] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BaseResult extends StObject {
    
    /**
    		Window position and size.
    		*/
    var bounds: Height = js.native
    
    /**
    		Window identifier.
    		On Windows, there isn't a clear notion of a "Window ID". Instead it returns the memory address of the window "handle" in the `id` property. That "handle" is unique per window, so it can be used to identify them. [Read more…](https://msdn.microsoft.com/en-us/library/windows/desktop/ms632597(v=vs.85).aspx#window_handle).
    		*/
    var id: Double = js.native
    
    /**
    		Memory usage by the window.
    		*/
    var memoryUsage: Double = js.native
    
    /**
    		App that owns the window.
    		*/
    var owner: BaseOwner = js.native
    
    /**
    		Window title.
    		*/
    var title: String = js.native
  }
  object BaseResult {
    
    @scala.inline
    def apply(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, title: String): BaseResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseResult]
    }
    
    @scala.inline
    implicit class BaseResultMutableBuilder[Self <: BaseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Height): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryUsage(value: Double): Self = StObject.set(x, "memoryUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: BaseOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LinuxResult
    extends BaseResult
       with Result {
    
    var platform: linux = js.native
  }
  object LinuxResult {
    
    @scala.inline
    def apply(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, platform: linux, title: String): LinuxResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinuxResult]
    }
    
    @scala.inline
    implicit class LinuxResultMutableBuilder[Self <: LinuxResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlatform(value: linux): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MacOSOwner extends BaseOwner {
    
    /**
    		Bundle identifier.
    		*/
    var bundleId: Double = js.native
  }
  object MacOSOwner {
    
    @scala.inline
    def apply(bundleId: Double, name: String, path: String, processId: Double): MacOSOwner = {
      val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MacOSOwner]
    }
    
    @scala.inline
    implicit class MacOSOwnerMutableBuilder[Self <: MacOSOwner] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBundleId(value: Double): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MacOSResult
    extends BaseResult
       with Result {
    
    @JSName("owner")
    var owner_MacOSResult: MacOSOwner = js.native
    
    var platform: macos = js.native
    
    /**
    		URL of the active browser tab if the active window is Safari, Chrome, Edge, or Brave.
    		*/
    var url: js.UndefOr[String] = js.native
  }
  object MacOSResult {
    
    @scala.inline
    def apply(bounds: Height, id: Double, memoryUsage: Double, owner: MacOSOwner, platform: macos, title: String): MacOSResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MacOSResult]
    }
    
    @scala.inline
    implicit class MacOSResultMutableBuilder[Self <: MacOSResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOwner(value: MacOSOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: macos): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activeWin.mod.MacOSResult
    - typings.activeWin.mod.LinuxResult
    - typings.activeWin.mod.WindowsResult
  */
  trait Result extends StObject
  object Result {
    
    @scala.inline
    def LinuxResult(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, platform: linux, title: String): typings.activeWin.mod.LinuxResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.activeWin.mod.LinuxResult]
    }
    
    @scala.inline
    def MacOSResult(bounds: Height, id: Double, memoryUsage: Double, owner: MacOSOwner, platform: macos, title: String): typings.activeWin.mod.MacOSResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.activeWin.mod.MacOSResult]
    }
    
    @scala.inline
    def WindowsResult(
      bounds: Height,
      id: Double,
      memoryUsage: Double,
      owner: BaseOwner,
      platform: windows,
      title: String
    ): typings.activeWin.mod.WindowsResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.activeWin.mod.WindowsResult]
    }
  }
  
  @js.native
  trait WindowsResult
    extends BaseResult
       with Result {
    
    var platform: windows = js.native
  }
  object WindowsResult {
    
    @scala.inline
    def apply(
      bounds: Height,
      id: Double,
      memoryUsage: Double,
      owner: BaseOwner,
      platform: windows,
      title: String
    ): WindowsResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowsResult]
    }
    
    @scala.inline
    implicit class WindowsResultMutableBuilder[Self <: WindowsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlatform(value: windows): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
}
