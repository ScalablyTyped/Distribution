package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentLanguage extends StObject {
  
  /**
    * The list of Docker images that are related by the specified programming language.
    */
  var images: js.UndefOr[EnvironmentImages] = js.undefined
  
  /**
    * The programming language for the Docker images.
    */
  var language: js.UndefOr[LanguageType] = js.undefined
}
object EnvironmentLanguage {
  
  inline def apply(): EnvironmentLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentLanguage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentLanguage] (val x: Self) extends AnyVal {
    
    inline def setImages(value: EnvironmentImages): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: EnvironmentImage*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setLanguage(value: LanguageType): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
