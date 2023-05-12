package typings.adraffyEnsNormalize

import typings.adraffyEnsNormalize.anon.Nf
import typings.adraffyEnsNormalize.distMod.Label
import typings.adraffyEnsNormalize.distMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object xnfMod {
  
  @JSImport("@adraffy/ens-normalize/xnf", JSImport.Namespace)
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
}
