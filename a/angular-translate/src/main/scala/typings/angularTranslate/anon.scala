package typings.angularTranslate

import org.scalablytyped.runtime.StringDictionary
import typings.angularTranslate.mod.angularAugmentingMod.translate.IStaticFilesLoaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Files extends StObject {
    
    var files: js.Array[IStaticFilesLoaderOptions]
  }
  object Files {
    
    inline def apply(files: js.Array[IStaticFilesLoaderOptions]): Files = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Files]
    }
    
    extension [Self <: Files](x: Self) {
      
      inline def setFiles(value: js.Array[IStaticFilesLoaderOptions]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: IStaticFilesLoaderOptions*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(translationId: String): String = js.native
    def apply(translationId: String, interpolateParams: Any): String = js.native
    def apply(translationId: String, interpolateParams: Any, interpolation: String): String = js.native
    def apply(translationId: String, interpolateParams: Any, interpolation: String, forceLanguage: String): String = js.native
    def apply(translationId: String, interpolateParams: Any, interpolation: Unit, forceLanguage: String): String = js.native
    def apply(translationId: String, interpolateParams: Unit, interpolation: String): String = js.native
    def apply(translationId: String, interpolateParams: Unit, interpolation: String, forceLanguage: String): String = js.native
    def apply(translationId: String, interpolateParams: Unit, interpolation: Unit, forceLanguage: String): String = js.native
    def apply(translationIds: js.Array[String]): StringDictionary[String] = js.native
    def apply(translationIds: js.Array[String], interpolateParams: Any): StringDictionary[String] = js.native
    def apply(translationIds: js.Array[String], interpolateParams: Any, interpolation: String): StringDictionary[String] = js.native
    def apply(
      translationIds: js.Array[String],
      interpolateParams: Any,
      interpolation: String,
      forceLanguage: String
    ): StringDictionary[String] = js.native
    def apply(
      translationIds: js.Array[String],
      interpolateParams: Any,
      interpolation: Unit,
      forceLanguage: String
    ): StringDictionary[String] = js.native
    def apply(translationIds: js.Array[String], interpolateParams: Unit, interpolation: String): StringDictionary[String] = js.native
    def apply(
      translationIds: js.Array[String],
      interpolateParams: Unit,
      interpolation: String,
      forceLanguage: String
    ): StringDictionary[String] = js.native
    def apply(
      translationIds: js.Array[String],
      interpolateParams: Unit,
      interpolation: Unit,
      forceLanguage: String
    ): StringDictionary[String] = js.native
  }
}
