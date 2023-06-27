package typings.adraffyEnsNormalize

import typings.adraffyEnsNormalize.adraffyEnsNormalizeStrings.disallowed
import typings.adraffyEnsNormalize.adraffyEnsNormalizeStrings.emoji
import typings.adraffyEnsNormalize.adraffyEnsNormalizeStrings.ignored
import typings.adraffyEnsNormalize.adraffyEnsNormalizeStrings.mapped
import typings.adraffyEnsNormalize.adraffyEnsNormalizeStrings.nfc
import typings.adraffyEnsNormalize.adraffyEnsNormalizeStrings.stop
import typings.adraffyEnsNormalize.adraffyEnsNormalizeStrings.valid
import typings.adraffyEnsNormalize.anon.Nf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@adraffy/ens-normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensBeautify(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ens_beautify")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ensEmoji(): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ens_emoji")().asInstanceOf[js.Array[js.Array[Double]]]
  
  inline def ensNormalize(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ens_normalize")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ensNormalizeFragment(frag: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ens_normalize_fragment")(frag.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ensNormalizeFragment(frag: String, decompose: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ens_normalize_fragment")(frag.asInstanceOf[js.Any], decompose.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ensSplit(name: String): js.Array[Label] = ^.asInstanceOf[js.Dynamic].applyDynamic("ens_split")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[Label]]
  inline def ensSplit(name: String, preserve_emoji: Boolean): js.Array[Label] = (^.asInstanceOf[js.Dynamic].applyDynamic("ens_split")(name.asInstanceOf[js.Any], preserve_emoji.asInstanceOf[js.Any])).asInstanceOf[js.Array[Label]]
  
  inline def ensTokenize(name: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("ens_tokenize")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
  inline def ensTokenize(name: String, options: Nf): js.Array[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("ens_tokenize")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]
  
  inline def isCombiningMark(cp: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_combining_mark")(cp.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def nfc(cps: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("nfc")(cps.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def nfd(cps: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("nfd")(cps.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def safeStrFromCps(cps: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safe_str_from_cps")(cps.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def shouldEscape(cp: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("should_escape")(cp.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait DisallowedToken
    extends StObject
       with TextToken {
    
    var cp: Double
    
    var `type`: disallowed
  }
  object DisallowedToken {
    
    inline def apply(cp: Double): DisallowedToken = {
      val __obj = js.Dynamic.literal(cp = cp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("disallowed")
      __obj.asInstanceOf[DisallowedToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisallowedToken] (val x: Self) extends AnyVal {
      
      inline def setCp(value: Double): Self = StObject.set(x, "cp", value.asInstanceOf[js.Any])
      
      inline def setType(value: disallowed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmojiToken
    extends StObject
       with Token {
    
    var cps: js.Array[Double]
    
    var emoji: js.Array[Double]
    
    var input: js.Array[Double]
    
    var `type`: emoji
  }
  object EmojiToken {
    
    inline def apply(cps: js.Array[Double], emoji: js.Array[Double], input: js.Array[Double]): EmojiToken = {
      val __obj = js.Dynamic.literal(cps = cps.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("emoji")
      __obj.asInstanceOf[EmojiToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmojiToken] (val x: Self) extends AnyVal {
      
      inline def setCps(value: js.Array[Double]): Self = StObject.set(x, "cps", value.asInstanceOf[js.Any])
      
      inline def setCpsVarargs(value: Double*): Self = StObject.set(x, "cps", js.Array(value*))
      
      inline def setEmoji(value: js.Array[Double]): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      inline def setEmojiVarargs(value: Double*): Self = StObject.set(x, "emoji", js.Array(value*))
      
      inline def setInput(value: js.Array[Double]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputVarargs(value: Double*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setType(value: emoji): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgnoredToken
    extends StObject
       with TextToken {
    
    var cp: Double
    
    var `type`: ignored
  }
  object IgnoredToken {
    
    inline def apply(cp: Double): IgnoredToken = {
      val __obj = js.Dynamic.literal(cp = cp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ignored")
      __obj.asInstanceOf[IgnoredToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IgnoredToken] (val x: Self) extends AnyVal {
      
      inline def setCp(value: Double): Self = StObject.set(x, "cp", value.asInstanceOf[js.Any])
      
      inline def setType(value: ignored): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Label extends StObject {
    
    var emoji: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var input: js.Array[Double]
    
    var offset: Double
    
    var output: js.UndefOr[js.Array[Double]] = js.undefined
    
    var tokens: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Label {
    
    inline def apply(input: js.Array[Double], offset: Double): Label = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      inline def setEmoji(value: Boolean): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInput(value: js.Array[Double]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputVarargs(value: Double*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: js.Array[Double]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setOutputVarargs(value: Double*): Self = StObject.set(x, "output", js.Array(value*))
      
      inline def setTokens(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      inline def setTokensVarargs(value: js.Array[Double]*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MappedToken
    extends StObject
       with TextToken {
    
    var cp: Double
    
    var cps: js.Array[Double]
    
    var `type`: mapped
  }
  object MappedToken {
    
    inline def apply(cp: Double, cps: js.Array[Double]): MappedToken = {
      val __obj = js.Dynamic.literal(cp = cp.asInstanceOf[js.Any], cps = cps.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mapped")
      __obj.asInstanceOf[MappedToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MappedToken] (val x: Self) extends AnyVal {
      
      inline def setCp(value: Double): Self = StObject.set(x, "cp", value.asInstanceOf[js.Any])
      
      inline def setCps(value: js.Array[Double]): Self = StObject.set(x, "cps", value.asInstanceOf[js.Any])
      
      inline def setCpsVarargs(value: Double*): Self = StObject.set(x, "cps", js.Array(value*))
      
      inline def setType(value: mapped): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NFCToken
    extends StObject
       with Token {
    
    var cps: js.Array[Double]
    
    var input: js.Array[Double]
    
    var tokens: js.Array[TextToken]
    
    var `type`: nfc
  }
  object NFCToken {
    
    inline def apply(cps: js.Array[Double], input: js.Array[Double], tokens: js.Array[TextToken]): NFCToken = {
      val __obj = js.Dynamic.literal(cps = cps.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("nfc")
      __obj.asInstanceOf[NFCToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NFCToken] (val x: Self) extends AnyVal {
      
      inline def setCps(value: js.Array[Double]): Self = StObject.set(x, "cps", value.asInstanceOf[js.Any])
      
      inline def setCpsVarargs(value: Double*): Self = StObject.set(x, "cps", js.Array(value*))
      
      inline def setInput(value: js.Array[Double]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputVarargs(value: Double*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setTokens(value: js.Array[TextToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: TextToken*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setType(value: nfc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait StopToken
    extends StObject
       with Token {
    
    var `type`: stop
  }
  object StopToken {
    
    inline def apply(): StopToken = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("stop")
      __obj.asInstanceOf[StopToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StopToken] (val x: Self) extends AnyVal {
      
      inline def setType(value: stop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.adraffyEnsNormalize.mod.DisallowedToken
    - typings.adraffyEnsNormalize.mod.IgnoredToken
    - typings.adraffyEnsNormalize.mod.ValidToken
    - typings.adraffyEnsNormalize.mod.MappedToken
  */
  trait TextToken
    extends StObject
       with Token
  object TextToken {
    
    inline def DisallowedToken(cp: Double): typings.adraffyEnsNormalize.mod.DisallowedToken = {
      val __obj = js.Dynamic.literal(cp = cp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("disallowed")
      __obj.asInstanceOf[typings.adraffyEnsNormalize.mod.DisallowedToken]
    }
    
    inline def IgnoredToken(cp: Double): typings.adraffyEnsNormalize.mod.IgnoredToken = {
      val __obj = js.Dynamic.literal(cp = cp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ignored")
      __obj.asInstanceOf[typings.adraffyEnsNormalize.mod.IgnoredToken]
    }
    
    inline def MappedToken(cp: Double, cps: js.Array[Double]): typings.adraffyEnsNormalize.mod.MappedToken = {
      val __obj = js.Dynamic.literal(cp = cp.asInstanceOf[js.Any], cps = cps.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mapped")
      __obj.asInstanceOf[typings.adraffyEnsNormalize.mod.MappedToken]
    }
    
    inline def ValidToken(cps: js.Array[Double]): typings.adraffyEnsNormalize.mod.ValidToken = {
      val __obj = js.Dynamic.literal(cps = cps.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("valid")
      __obj.asInstanceOf[typings.adraffyEnsNormalize.mod.ValidToken]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.adraffyEnsNormalize.mod.TextToken
    - typings.adraffyEnsNormalize.mod.EmojiToken
    - typings.adraffyEnsNormalize.mod.NFCToken
    - typings.adraffyEnsNormalize.mod.StopToken
  */
  trait Token extends StObject
  object Token {
    
    inline def DisallowedToken(cp: Double): typings.adraffyEnsNormalize.mod.DisallowedToken = {
      val __obj = js.Dynamic.literal(cp = cp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("disallowed")
      __obj.asInstanceOf[typings.adraffyEnsNormalize.mod.DisallowedToken]
    }
    
    inline def EmojiToken(cps: js.Array[Double], emoji: js.Array[Double], input: js.Array[Double]): typings.adraffyEnsNormalize.mod.EmojiToken = {
      val __obj = js.Dynamic.literal(cps = cps.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("emoji")
      __obj.asInstanceOf[typings.adraffyEnsNormalize.mod.EmojiToken]
    }
    
    inline def IgnoredToken(cp: Double): typings.adraffyEnsNormalize.mod.IgnoredToken = {
      val __obj = js.Dynamic.literal(cp = cp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ignored")
      __obj.asInstanceOf[typings.adraffyEnsNormalize.mod.IgnoredToken]
    }
    
    inline def MappedToken(cp: Double, cps: js.Array[Double]): typings.adraffyEnsNormalize.mod.MappedToken = {
      val __obj = js.Dynamic.literal(cp = cp.asInstanceOf[js.Any], cps = cps.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mapped")
      __obj.asInstanceOf[typings.adraffyEnsNormalize.mod.MappedToken]
    }
    
    inline def NFCToken(cps: js.Array[Double], input: js.Array[Double], tokens: js.Array[TextToken]): typings.adraffyEnsNormalize.mod.NFCToken = {
      val __obj = js.Dynamic.literal(cps = cps.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("nfc")
      __obj.asInstanceOf[typings.adraffyEnsNormalize.mod.NFCToken]
    }
    
    inline def StopToken(): typings.adraffyEnsNormalize.mod.StopToken = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("stop")
      __obj.asInstanceOf[typings.adraffyEnsNormalize.mod.StopToken]
    }
    
    inline def ValidToken(cps: js.Array[Double]): typings.adraffyEnsNormalize.mod.ValidToken = {
      val __obj = js.Dynamic.literal(cps = cps.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("valid")
      __obj.asInstanceOf[typings.adraffyEnsNormalize.mod.ValidToken]
    }
  }
  
  trait ValidToken
    extends StObject
       with TextToken {
    
    var cps: js.Array[Double]
    
    var `type`: valid
  }
  object ValidToken {
    
    inline def apply(cps: js.Array[Double]): ValidToken = {
      val __obj = js.Dynamic.literal(cps = cps.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("valid")
      __obj.asInstanceOf[ValidToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidToken] (val x: Self) extends AnyVal {
      
      inline def setCps(value: js.Array[Double]): Self = StObject.set(x, "cps", value.asInstanceOf[js.Any])
      
      inline def setCpsVarargs(value: Double*): Self = StObject.set(x, "cps", js.Array(value*))
      
      inline def setType(value: valid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
