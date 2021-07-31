package typings.atom.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowLoadSettings extends StObject {
  
  val appVersion: String
  
  val atomHome: String
  
  val devMode: Boolean
  
  val env: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  
  val profileStartup: js.UndefOr[Boolean] = js.undefined
  
  val resourcePath: String
  
  val safeMode: Boolean
}
object WindowLoadSettings {
  
  @scala.inline
  def apply(appVersion: String, atomHome: String, devMode: Boolean, resourcePath: String, safeMode: Boolean): WindowLoadSettings = {
    val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], atomHome = atomHome.asInstanceOf[js.Any], devMode = devMode.asInstanceOf[js.Any], resourcePath = resourcePath.asInstanceOf[js.Any], safeMode = safeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowLoadSettings]
  }
  
  @scala.inline
  implicit class WindowLoadSettingsMutableBuilder[Self <: WindowLoadSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtomHome(value: String): Self = StObject.set(x, "atomHome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevMode(value: Boolean): Self = StObject.set(x, "devMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setProfileStartup(value: Boolean): Self = StObject.set(x, "profileStartup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileStartupUndefined: Self = StObject.set(x, "profileStartup", js.undefined)
    
    @scala.inline
    def setResourcePath(value: String): Self = StObject.set(x, "resourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeMode(value: Boolean): Self = StObject.set(x, "safeMode", value.asInstanceOf[js.Any])
  }
}
