package typings.atom.mod

import typings.std.Document
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildEnvironmentOptions extends js.Object {
  
  /**
    *  An object responsible for Atom's interaction with the browser process and host OS.
    *  Use buildDefaultApplicationDelegate for a default instance.
    */
  var applicationDelegate: js.UndefOr[js.Object] = js.native
  
  /** A path to the configuration directory (usually ~/.atom). */
  var configDirPath: js.UndefOr[String] = js.native
  
  /** A document global. */
  var document: js.UndefOr[Document] = js.native
  
  /**
    *  A boolean indicating whether the Atom environment should save or load state
    *  from the file system. You probably want this to be false.
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  
  /** A window global. */
  var window: js.UndefOr[Window] = js.native
}
object BuildEnvironmentOptions {
  
  @scala.inline
  def apply(): BuildEnvironmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildEnvironmentOptions]
  }
  
  @scala.inline
  implicit class BuildEnvironmentOptionsOps[Self <: BuildEnvironmentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationDelegate(value: js.Object): Self = this.set("applicationDelegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationDelegate: Self = this.set("applicationDelegate", js.undefined)
    
    @scala.inline
    def setConfigDirPath(value: String): Self = this.set("configDirPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigDirPath: Self = this.set("configDirPath", js.undefined)
    
    @scala.inline
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    
    @scala.inline
    def setWindow(value: Window): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
}
