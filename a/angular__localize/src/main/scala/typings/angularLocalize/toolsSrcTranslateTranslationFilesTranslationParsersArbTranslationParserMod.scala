package typings.angularLocalize

import typings.angularLocalize.angularLocalizeStrings.css
import typings.angularLocalize.angularLocalizeStrings.image
import typings.angularLocalize.angularLocalizeStrings.text
import typings.angularLocalize.anon.Column
import typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.TranslationParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateTranslationFilesTranslationParsersArbTranslationParserMod {
  
  @JSImport("@angular/localize/tools/src/translate/translation_files/translation_parsers/arb_translation_parser", "ArbTranslationParser")
  @js.native
  open class ArbTranslationParser ()
    extends StObject
       with TranslationParser[ArbJsonObject] {
    
    /* private */ var tryParseArbFormat: Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in @angular/localize.@angular/localize.MessageId ]: @angular/localize.@angular/localize.ɵSourceMessage | @angular/localize.@angular/localize/tools/src/translate/translation_files/translation_parsers/arb_translation_parser.ArbMetadata} */ trait ArbJsonObject extends StObject {
    
    var `@@locale`: String
  }
  object ArbJsonObject {
    
    inline def apply(`@@locale`: String): ArbJsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@@locale")(`@@locale`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArbJsonObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArbJsonObject] (val x: Self) extends AnyVal {
      
      inline def `set@@locale`(value: String): Self = StObject.set(x, "@@locale", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArbLocation extends StObject {
    
    var end: Column
    
    var file: String
    
    var start: Column
  }
  object ArbLocation {
    
    inline def apply(end: Column, file: String, start: Column): ArbLocation = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArbLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArbLocation] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArbMetadata extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[text | image | css] = js.undefined
    
    var `x-locations`: js.UndefOr[js.Array[ArbLocation]] = js.undefined
  }
  object ArbMetadata {
    
    inline def apply(): ArbMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArbMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArbMetadata] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setType(value: text | image | css): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def `setX-locations`(value: js.Array[ArbLocation]): Self = StObject.set(x, "x-locations", value.asInstanceOf[js.Any])
      
      inline def `setX-locationsUndefined`: Self = StObject.set(x, "x-locations", js.undefined)
      
      inline def `setX-locationsVarargs`(value: ArbLocation*): Self = StObject.set(x, "x-locations", js.Array(value*))
    }
  }
}
