package typings.atom.mod

import typings.std.Document
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildEnvironmentOptions extends StObject {
  
  /**
    *  An object responsible for Atom's interaction with the browser process and host OS.
    *  Use buildDefaultApplicationDelegate for a default instance.
    */
  var applicationDelegate: js.UndefOr[js.Object] = js.undefined
  
  /** A path to the configuration directory (usually ~/.atom). */
  var configDirPath: js.UndefOr[String] = js.undefined
  
  /** A document global. */
  var document: js.UndefOr[Document] = js.undefined
  
  /**
    *  A boolean indicating whether the Atom environment should save or load state
    *  from the file system. You probably want this to be false.
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  
  /** A window global. */
  var window: js.UndefOr[Window] = js.undefined
}
object BuildEnvironmentOptions {
  
  inline def apply(): BuildEnvironmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildEnvironmentOptions]
  }
  
  extension [Self <: BuildEnvironmentOptions](x: Self) {
    
    inline def setApplicationDelegate(value: js.Object): Self = StObject.set(x, "applicationDelegate", value.asInstanceOf[js.Any])
    
    inline def setApplicationDelegateUndefined: Self = StObject.set(x, "applicationDelegate", js.undefined)
    
    inline def setConfigDirPath(value: String): Self = StObject.set(x, "configDirPath", value.asInstanceOf[js.Any])
    
    inline def setConfigDirPathUndefined: Self = StObject.set(x, "configDirPath", js.undefined)
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
    
    inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
    
    inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
