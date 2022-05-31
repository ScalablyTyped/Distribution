package typings.alex

import typings.alex.mod.Config
import typings.vfile.mod.VFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object alex {
    
    inline def apply(value: String): VFile = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
    inline def apply(value: String, config: Config): VFile = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
    /**
      * finds gender favoring, polarizing, race related, religion inconsiderate, or other unequal phrasing in text.
      */
    inline def apply(value: VFile): VFile = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
    inline def apply(value: VFile, config: Config): VFile = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
    
    @JSGlobal("alex")
    @js.native
    val ^ : js.Any = js.native
    
    inline def html(value: String): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
    inline def html(value: String, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
    /** Check HTML (ignoring syntax). */
    inline def html(value: VFile): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
    inline def html(value: VFile, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
    
    inline def markdown(value: String): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("markdown")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
    inline def markdown(value: String, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("markdown")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
    /** Check Markdown (ignoring syntax). */
    inline def markdown(value: VFile): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("markdown")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
    inline def markdown(value: VFile, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("markdown")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
    
    inline def mdx(value: String): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
    inline def mdx(value: String, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
    /**
      * Check [MDX][] (ignoring syntax).
      *
      * Note: the syntax for [MDX@2][mdx-next], while currently in beta, is used in
      * alex
      */
    inline def mdx(value: VFile): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
    inline def mdx(value: VFile, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
    
    inline def text(value: String): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
    inline def text(value: String, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
    /** Check plain text (as in, syntax is checked). */
    inline def text(value: VFile): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
    inline def text(value: VFile, config: Config): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  }
}
