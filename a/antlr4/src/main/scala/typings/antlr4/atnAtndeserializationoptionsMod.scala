package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atnAtndeserializationoptionsMod {
  
  @JSImport("antlr4/atn/ATNDeserializationOptions", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ATNDeserializationOptions {
    def this(copyFrom: ATNDeserializationOptions) = this()
    
    /* CompleteClass */
    var generateRuleBypassTransitions: Boolean = js.native
    
    /* CompleteClass */
    var readOnly: Boolean = js.native
    
    /* CompleteClass */
    var verifyATN: Boolean | Null = js.native
  }
  /* static members */
  object default {
    
    @JSImport("antlr4/atn/ATNDeserializationOptions", "default.defaultOptions")
    @js.native
    val defaultOptions: ATNDeserializationOptions = js.native
  }
  
  trait ATNDeserializationOptions extends StObject {
    
    var generateRuleBypassTransitions: Boolean
    
    var readOnly: Boolean
    
    var verifyATN: Boolean | Null
  }
  object ATNDeserializationOptions {
    
    inline def apply(generateRuleBypassTransitions: Boolean, readOnly: Boolean): ATNDeserializationOptions = {
      val __obj = js.Dynamic.literal(generateRuleBypassTransitions = generateRuleBypassTransitions.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], verifyATN = null)
      __obj.asInstanceOf[ATNDeserializationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ATNDeserializationOptions] (val x: Self) extends AnyVal {
      
      inline def setGenerateRuleBypassTransitions(value: Boolean): Self = StObject.set(x, "generateRuleBypassTransitions", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setVerifyATN(value: Boolean): Self = StObject.set(x, "verifyATN", value.asInstanceOf[js.Any])
      
      inline def setVerifyATNNull: Self = StObject.set(x, "verifyATN", null)
    }
  }
}
