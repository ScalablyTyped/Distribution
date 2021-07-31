package typings.alex

import typings.alex.alexNumbers.`0`
import typings.alex.alexNumbers.`1`
import typings.alex.alexNumbers.`2`
import typings.vfile.mod.VFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(value: String): VFile = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  @scala.inline
  def apply(value: String, config: Config): VFile = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  /**
    * finds gender favoring, polarizing, race related, religion inconsiderate, or other unequal phrasing in text.
    */
  @scala.inline
  def apply(value: VFile): VFile = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  @scala.inline
  def apply(value: VFile, config: Config): VFile = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  @JSImport("alex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def html(value: String): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  @scala.inline
  def html(value: String, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  /** Check HTML (ignoring syntax). */
  @scala.inline
  def html(value: VFile): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  @scala.inline
  def html(value: VFile, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  @scala.inline
  def markdown(value: String): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("markdown")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  @scala.inline
  def markdown(value: String, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("markdown")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  /** Check Markdown (ignoring syntax). */
  @scala.inline
  def markdown(value: VFile): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("markdown")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  @scala.inline
  def markdown(value: VFile, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("markdown")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  @scala.inline
  def mdx(value: String): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  @scala.inline
  def mdx(value: String, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  /**
    * Check [MDX][] (ignoring syntax).
    *
    * Note: the syntax for [MDX@2][mdx-next], while currently in beta, is used in
    * alex
    */
  @scala.inline
  def mdx(value: VFile): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  @scala.inline
  def mdx(value: VFile, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  @scala.inline
  def text(value: String): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  @scala.inline
  def text(value: String, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  /** Check plain text (as in, syntax is checked). */
  @scala.inline
  def text(value: VFile): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  @scala.inline
  def text(value: VFile, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  trait AlexOptions extends StObject {
    
    /** an array of rules (the default is []) */
    var allow: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * When provided, only the rules specified are reported.
      * @default []
      */
    var deny: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * When turned on (`true`), pairs such as `he` and `she` and `garbageman` or `garbagewoman` are seen as errors.
      * When turned off (`false`, the default), such pairs are okay
      */
    var noBinary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the minimum rating (including) that you want to check for.
      * If you set it to 1 (maybe) then it will warn for level 1 and 2 (likely) profanities,
      * but not for level 0 (unlikely).
      */
    var profanitySureness: js.UndefOr[`0` | `1` | `2`] = js.undefined
  }
  object AlexOptions {
    
    @scala.inline
    def apply(): AlexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlexOptions]
    }
    
    @scala.inline
    implicit class AlexOptionsMutableBuilder[Self <: AlexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow(value: js.Array[String]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      @scala.inline
      def setAllowVarargs(value: String*): Self = StObject.set(x, "allow", js.Array(value :_*))
      
      @scala.inline
      def setDeny(value: js.Array[String]): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenyUndefined: Self = StObject.set(x, "deny", js.undefined)
      
      @scala.inline
      def setDenyVarargs(value: String*): Self = StObject.set(x, "deny", js.Array(value :_*))
      
      @scala.inline
      def setNoBinary(value: Boolean): Self = StObject.set(x, "noBinary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoBinaryUndefined: Self = StObject.set(x, "noBinary", js.undefined)
      
      @scala.inline
      def setProfanitySureness(value: `0` | `1` | `2`): Self = StObject.set(x, "profanitySureness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfanitySurenessUndefined: Self = StObject.set(x, "profanitySureness", js.undefined)
    }
  }
  
  /**
    * This is either an array of words to ignore or custom Alex' config
    */
  type Config = AlexOptions | js.Array[String]
}
