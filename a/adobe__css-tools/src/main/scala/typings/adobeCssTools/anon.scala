package typings.adobeCssTools

import typings.adobeCssTools.cssParseErrorMod.default
import typings.adobeCssTools.typeMod.CssAtRuleAST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Column {
    
    inline def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Compress extends StObject {
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[String] = js.undefined
  }
  object Compress {
    
    inline def apply(): Compress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compress]
    }
    
    extension [Self <: Compress](x: Self) {
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    }
  }
  
  trait ParsingErrors extends StObject {
    
    var parsingErrors: js.UndefOr[js.Array[default]] = js.undefined
    
    var rules: js.Array[CssAtRuleAST]
    
    var source: js.UndefOr[String] = js.undefined
  }
  object ParsingErrors {
    
    inline def apply(rules: js.Array[CssAtRuleAST]): ParsingErrors = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsingErrors]
    }
    
    extension [Self <: ParsingErrors](x: Self) {
      
      inline def setParsingErrors(value: js.Array[default]): Self = StObject.set(x, "parsingErrors", value.asInstanceOf[js.Any])
      
      inline def setParsingErrorsUndefined: Self = StObject.set(x, "parsingErrors", js.undefined)
      
      inline def setParsingErrorsVarargs(value: default*): Self = StObject.set(x, "parsingErrors", js.Array(value*))
      
      inline def setRules(value: js.Array[CssAtRuleAST]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: CssAtRuleAST*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait Silent extends StObject {
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
  }
  object Silent {
    
    inline def apply(): Silent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Silent]
    }
    
    extension [Self <: Silent](x: Self) {
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
}
