package typings.ajvKeywords

import typings.ajvKeywords.ajvKeywordsBooleans.`true`
import typings.ajvKeywords.dynamicDefaultsMod.DynamicDefaultFunc
import typings.ajvKeywords.instanceofMod.Constructor
import typings.ajvKeywords.transformMod.TransformConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CONSTRUCTORS extends StObject {
    
    var CONSTRUCTORS: Record[String, js.UndefOr[Constructor]]
  }
  object CONSTRUCTORS {
    
    inline def apply(CONSTRUCTORS: Record[String, js.UndefOr[Constructor]]): CONSTRUCTORS = {
      val __obj = js.Dynamic.literal(CONSTRUCTORS = CONSTRUCTORS.asInstanceOf[js.Any])
      __obj.asInstanceOf[CONSTRUCTORS]
    }
    
    extension [Self <: CONSTRUCTORS](x: Self) {
      
      inline def setCONSTRUCTORS(value: Record[String, js.UndefOr[Constructor]]): Self = StObject.set(x, "CONSTRUCTORS", value.asInstanceOf[js.Any])
    }
  }
  
  trait DEFAULTS extends StObject {
    
    var DEFAULTS: Record[String, js.UndefOr[DynamicDefaultFunc]]
  }
  object DEFAULTS {
    
    inline def apply(DEFAULTS: Record[String, js.UndefOr[DynamicDefaultFunc]]): DEFAULTS = {
      val __obj = js.Dynamic.literal(DEFAULTS = DEFAULTS.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEFAULTS]
    }
    
    extension [Self <: DEFAULTS](x: Self) {
      
      inline def setDEFAULTS(value: Record[String, js.UndefOr[DynamicDefaultFunc]]): Self = StObject.set(x, "DEFAULTS", value.asInstanceOf[js.Any])
    }
  }
  
  trait FailingCase extends StObject {
    
    var failingCase: js.UndefOr[String] = js.undefined
    
    var failingDefault: js.UndefOr[`true`] = js.undefined
  }
  object FailingCase {
    
    inline def apply(): FailingCase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FailingCase]
    }
    
    extension [Self <: FailingCase](x: Self) {
      
      inline def setFailingCase(value: String): Self = StObject.set(x, "failingCase", value.asInstanceOf[js.Any])
      
      inline def setFailingCaseUndefined: Self = StObject.set(x, "failingCase", js.undefined)
      
      inline def setFailingDefault(value: `true`): Self = StObject.set(x, "failingDefault", value.asInstanceOf[js.Any])
      
      inline def setFailingDefaultUndefined: Self = StObject.set(x, "failingDefault", js.undefined)
    }
  }
  
  trait MissingPattern extends StObject {
    
    var missingPattern: String
  }
  object MissingPattern {
    
    inline def apply(missingPattern: String): MissingPattern = {
      val __obj = js.Dynamic.literal(missingPattern = missingPattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[MissingPattern]
    }
    
    extension [Self <: MissingPattern](x: Self) {
      
      inline def setMissingPattern(value: String): Self = StObject.set(x, "missingPattern", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transform extends StObject {
    
    var transform: keyinTransformNameTransfo
  }
  object Transform {
    
    inline def apply(transform: keyinTransformNameTransfo): Transform = {
      val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transform]
    }
    
    extension [Self <: Transform](x: Self) {
      
      inline def setTransform(value: keyinTransformNameTransfo): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in ajv-keywords.ajv-keywords/dist/definitions/transform.TransformName ]: ajv-keywords.ajv-keywords/dist/definitions/transform.Transform} */
  trait keyinTransformNameTransfo extends StObject {
    
    def toEnumCase(s: String): String
    def toEnumCase(s: String, cfg: TransformConfig): String
    @JSName("toEnumCase")
    var toEnumCase_Original: typings.ajvKeywords.transformMod.Transform
    
    def toLowerCase(s: String): String
    def toLowerCase(s: String, cfg: TransformConfig): String
    @JSName("toLowerCase")
    var toLowerCase_Original: typings.ajvKeywords.transformMod.Transform
    
    def toUpperCase(s: String): String
    def toUpperCase(s: String, cfg: TransformConfig): String
    @JSName("toUpperCase")
    var toUpperCase_Original: typings.ajvKeywords.transformMod.Transform
    
    def trim(s: String): String
    def trim(s: String, cfg: TransformConfig): String
    
    def trimEnd(s: String): String
    def trimEnd(s: String, cfg: TransformConfig): String
    @JSName("trimEnd")
    var trimEnd_Original: typings.ajvKeywords.transformMod.Transform
    
    def trimLeft(s: String): String
    def trimLeft(s: String, cfg: TransformConfig): String
    @JSName("trimLeft")
    var trimLeft_Original: typings.ajvKeywords.transformMod.Transform
    
    def trimRight(s: String): String
    def trimRight(s: String, cfg: TransformConfig): String
    @JSName("trimRight")
    var trimRight_Original: typings.ajvKeywords.transformMod.Transform
    
    def trimStart(s: String): String
    def trimStart(s: String, cfg: TransformConfig): String
    @JSName("trimStart")
    var trimStart_Original: typings.ajvKeywords.transformMod.Transform
    
    @JSName("trim")
    var trim_Original: typings.ajvKeywords.transformMod.Transform
  }
  object keyinTransformNameTransfo {
    
    inline def apply(
      toEnumCase: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String,
      toLowerCase: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String,
      toUpperCase: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String,
      trim: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String,
      trimEnd: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String,
      trimLeft: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String,
      trimRight: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String,
      trimStart: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String
    ): keyinTransformNameTransfo = {
      val __obj = js.Dynamic.literal(toEnumCase = js.Any.fromFunction2(toEnumCase), toLowerCase = js.Any.fromFunction2(toLowerCase), toUpperCase = js.Any.fromFunction2(toUpperCase), trim = js.Any.fromFunction2(trim), trimEnd = js.Any.fromFunction2(trimEnd), trimLeft = js.Any.fromFunction2(trimLeft), trimRight = js.Any.fromFunction2(trimRight), trimStart = js.Any.fromFunction2(trimStart))
      __obj.asInstanceOf[keyinTransformNameTransfo]
    }
    
    extension [Self <: keyinTransformNameTransfo](x: Self) {
      
      inline def setToEnumCase(value: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String): Self = StObject.set(x, "toEnumCase", js.Any.fromFunction2(value))
      
      inline def setToLowerCase(value: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String): Self = StObject.set(x, "toLowerCase", js.Any.fromFunction2(value))
      
      inline def setToUpperCase(value: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String): Self = StObject.set(x, "toUpperCase", js.Any.fromFunction2(value))
      
      inline def setTrim(value: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String): Self = StObject.set(x, "trim", js.Any.fromFunction2(value))
      
      inline def setTrimEnd(value: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String): Self = StObject.set(x, "trimEnd", js.Any.fromFunction2(value))
      
      inline def setTrimLeft(value: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String): Self = StObject.set(x, "trimLeft", js.Any.fromFunction2(value))
      
      inline def setTrimRight(value: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String): Self = StObject.set(x, "trimRight", js.Any.fromFunction2(value))
      
      inline def setTrimStart(value: (/* s */ String, /* cfg */ js.UndefOr[TransformConfig]) => String): Self = StObject.set(x, "trimStart", js.Any.fromFunction2(value))
    }
  }
}
