package typings.activeWin

import typings.activeWin.activeWinStrings.linux
import typings.activeWin.activeWinStrings.macos
import typings.activeWin.activeWinStrings.windows
import typings.activeWin.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def apply(): js.Promise[js.UndefOr[Result]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[js.UndefOr[Result]]]
  
  @JSImport("active-win", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def sync(): js.UndefOr[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.UndefOr[Result]]
  
  trait BaseOwner extends StObject {
    
    /**
    		Name of the app.
    		*/
    var name: String
    
    /**
    		Path to the app.
    		*/
    var path: String
    
    /**
    		Process identifier
    		*/
    var processId: Double
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
  
  trait BaseResult extends StObject {
    
    /**
    		Window position and size.
    		*/
    var bounds: Height
    
    /**
    		Window identifier.
    		On Windows, there isn't a clear notion of a "Window ID". Instead it returns the memory address of the window "handle" in the `id` property. That "handle" is unique per window, so it can be used to identify them. [Read more…](https://msdn.microsoft.com/en-us/library/windows/desktop/ms632597(v=vs.85).aspx#window_handle).
    		*/
    var id: Double
    
    /**
    		Memory usage by the window.
    		*/
    var memoryUsage: Double
    
    /**
    		App that owns the window.
    		*/
    var owner: BaseOwner
    
    /**
    		Window title.
    		*/
    var title: String
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
  
  trait LinuxResult
    extends StObject
       with BaseResult
       with Result {
    
    var platform: linux
  }
  object LinuxResult {
    
    @scala.inline
    def apply(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, title: String): LinuxResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = "linux", title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinuxResult]
    }
    
    @scala.inline
    implicit class LinuxResultMutableBuilder[Self <: LinuxResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlatform(value: linux): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  trait MacOSOwner
    extends StObject
       with BaseOwner {
    
    /**
    		Bundle identifier.
    		*/
    var bundleId: Double
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
  
  trait MacOSResult
    extends StObject
       with BaseResult
       with Result {
    
    @JSName("owner")
    var owner_MacOSResult: MacOSOwner
    
    var platform: macos
    
    /**
    		URL of the active browser tab if the active window is Safari, Chrome, Edge, or Brave.
    		*/
    var url: js.UndefOr[String] = js.undefined
  }
  object MacOSResult {
    
    @scala.inline
    def apply(bounds: Height, id: Double, memoryUsage: Double, owner: MacOSOwner, title: String): MacOSResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = "macos", title = title.asInstanceOf[js.Any])
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
    def LinuxResult(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, title: String): typings.activeWin.mod.LinuxResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = "linux", title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.activeWin.mod.LinuxResult]
    }
    
    @scala.inline
    def MacOSResult(bounds: Height, id: Double, memoryUsage: Double, owner: MacOSOwner, title: String): typings.activeWin.mod.MacOSResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = "macos", title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.activeWin.mod.MacOSResult]
    }
    
    @scala.inline
    def WindowsResult(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, title: String): typings.activeWin.mod.WindowsResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = "windows", title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.activeWin.mod.WindowsResult]
    }
  }
  
  trait WindowsResult
    extends StObject
       with BaseResult
       with Result {
    
    var platform: windows
  }
  object WindowsResult {
    
    @scala.inline
    def apply(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, title: String): WindowsResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = "windows", title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowsResult]
    }
    
    @scala.inline
    implicit class WindowsResultMutableBuilder[Self <: WindowsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlatform(value: windows): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
}
