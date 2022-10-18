package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Generator extends StObject {
  
  /**
    * The target version of the GameSparks Game SDK.
    */
  var GameSdkVersion: js.UndefOr[typings.awsSdk.clientsGamesparksMod.GameSdkVersion] = js.undefined
  
  /**
    * The programming language for the generated code.  Not all languages are supported for each platform. For cases where multiple languages are supported, this parameter specifies the language to be used. If this value is omitted, the default language for the target platform will be used. 
    */
  var Language: js.UndefOr[typings.awsSdk.clientsGamesparksMod.Language] = js.undefined
  
  /**
    * The platform that will be used to run the generated code.
    */
  var TargetPlatform: js.UndefOr[typings.awsSdk.clientsGamesparksMod.TargetPlatform] = js.undefined
}
object Generator {
  
  inline def apply(): Generator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Generator]
  }
  
  extension [Self <: Generator](x: Self) {
    
    inline def setGameSdkVersion(value: GameSdkVersion): Self = StObject.set(x, "GameSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setGameSdkVersionUndefined: Self = StObject.set(x, "GameSdkVersion", js.undefined)
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
    
    inline def setTargetPlatform(value: TargetPlatform): Self = StObject.set(x, "TargetPlatform", value.asInstanceOf[js.Any])
    
    inline def setTargetPlatformUndefined: Self = StObject.set(x, "TargetPlatform", js.undefined)
  }
}
