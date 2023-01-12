package typings.acornHammerhead

import typings.acornHammerhead.acornHammerheadStrings.module
import typings.acornHammerhead.acornHammerheadStrings.script
import typings.estree.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("acorn-hammerhead", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(input: String): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Program]
  inline def parse(input: String, options: AcornOptions): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Program]
  
  trait AcornOptions extends StObject {
    
    var allowAwaitOutsideFunction: js.UndefOr[Boolean] = js.undefined
    
    var allowHashBang: js.UndefOr[Boolean] = js.undefined
    
    var allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined
    
    var allowReserved: js.UndefOr[Boolean] = js.undefined
    
    var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined
    
    var ecmaVersion: js.UndefOr[Double] = js.undefined
    
    var locations: js.UndefOr[Boolean] = js.undefined
    
    var onComment: js.UndefOr[js.Function] = js.undefined
    
    var onInsertedSemicolon: js.UndefOr[js.Function] = js.undefined
    
    var onToken: js.UndefOr[js.Function] = js.undefined
    
    var onTrailingComma: js.UndefOr[js.Function] = js.undefined
    
    var preserveParens: js.UndefOr[Boolean] = js.undefined
    
    var ranges: js.UndefOr[Boolean] = js.undefined
    
    var sourceType: js.UndefOr[script | module] = js.undefined
  }
  object AcornOptions {
    
    inline def apply(): AcornOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcornOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AcornOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowAwaitOutsideFunction(value: Boolean): Self = StObject.set(x, "allowAwaitOutsideFunction", value.asInstanceOf[js.Any])
      
      inline def setAllowAwaitOutsideFunctionUndefined: Self = StObject.set(x, "allowAwaitOutsideFunction", js.undefined)
      
      inline def setAllowHashBang(value: Boolean): Self = StObject.set(x, "allowHashBang", value.asInstanceOf[js.Any])
      
      inline def setAllowHashBangUndefined: Self = StObject.set(x, "allowHashBang", js.undefined)
      
      inline def setAllowImportExportEverywhere(value: Boolean): Self = StObject.set(x, "allowImportExportEverywhere", value.asInstanceOf[js.Any])
      
      inline def setAllowImportExportEverywhereUndefined: Self = StObject.set(x, "allowImportExportEverywhere", js.undefined)
      
      inline def setAllowReserved(value: Boolean): Self = StObject.set(x, "allowReserved", value.asInstanceOf[js.Any])
      
      inline def setAllowReservedUndefined: Self = StObject.set(x, "allowReserved", js.undefined)
      
      inline def setAllowReturnOutsideFunction(value: Boolean): Self = StObject.set(x, "allowReturnOutsideFunction", value.asInstanceOf[js.Any])
      
      inline def setAllowReturnOutsideFunctionUndefined: Self = StObject.set(x, "allowReturnOutsideFunction", js.undefined)
      
      inline def setEcmaVersion(value: Double): Self = StObject.set(x, "ecmaVersion", value.asInstanceOf[js.Any])
      
      inline def setEcmaVersionUndefined: Self = StObject.set(x, "ecmaVersion", js.undefined)
      
      inline def setLocations(value: Boolean): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      inline def setOnComment(value: js.Function): Self = StObject.set(x, "onComment", value.asInstanceOf[js.Any])
      
      inline def setOnCommentUndefined: Self = StObject.set(x, "onComment", js.undefined)
      
      inline def setOnInsertedSemicolon(value: js.Function): Self = StObject.set(x, "onInsertedSemicolon", value.asInstanceOf[js.Any])
      
      inline def setOnInsertedSemicolonUndefined: Self = StObject.set(x, "onInsertedSemicolon", js.undefined)
      
      inline def setOnToken(value: js.Function): Self = StObject.set(x, "onToken", value.asInstanceOf[js.Any])
      
      inline def setOnTokenUndefined: Self = StObject.set(x, "onToken", js.undefined)
      
      inline def setOnTrailingComma(value: js.Function): Self = StObject.set(x, "onTrailingComma", value.asInstanceOf[js.Any])
      
      inline def setOnTrailingCommaUndefined: Self = StObject.set(x, "onTrailingComma", js.undefined)
      
      inline def setPreserveParens(value: Boolean): Self = StObject.set(x, "preserveParens", value.asInstanceOf[js.Any])
      
      inline def setPreserveParensUndefined: Self = StObject.set(x, "preserveParens", js.undefined)
      
      inline def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setSourceType(value: script | module): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    }
  }
}
