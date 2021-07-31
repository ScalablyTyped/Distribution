package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IThemeConfig extends StObject {
  
  var alwaysWatchTheme: Boolean
  
  var defaultTheme: String
  
  var disableTheming: Boolean
  
  var generateOnDemand: Boolean
  
  var nonce: String
  
  var registeredStyles: js.Array[String]
}
object IThemeConfig {
  
  @scala.inline
  def apply(
    alwaysWatchTheme: Boolean,
    defaultTheme: String,
    disableTheming: Boolean,
    generateOnDemand: Boolean,
    nonce: String,
    registeredStyles: js.Array[String]
  ): IThemeConfig = {
    val __obj = js.Dynamic.literal(alwaysWatchTheme = alwaysWatchTheme.asInstanceOf[js.Any], defaultTheme = defaultTheme.asInstanceOf[js.Any], disableTheming = disableTheming.asInstanceOf[js.Any], generateOnDemand = generateOnDemand.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], registeredStyles = registeredStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeConfig]
  }
  
  @scala.inline
  implicit class IThemeConfigMutableBuilder[Self <: IThemeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysWatchTheme(value: Boolean): Self = StObject.set(x, "alwaysWatchTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTheme(value: String): Self = StObject.set(x, "defaultTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTheming(value: Boolean): Self = StObject.set(x, "disableTheming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateOnDemand(value: Boolean): Self = StObject.set(x, "generateOnDemand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredStyles(value: js.Array[String]): Self = StObject.set(x, "registeredStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredStylesVarargs(value: String*): Self = StObject.set(x, "registeredStyles", js.Array(value :_*))
  }
}
