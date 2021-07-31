package typings.astring.anon

import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined astring.astring.Options & {  output :node.stream.Stream} */
trait OptionsoutputStream extends StObject {
  
  /** generate comments if true (defaults to false) */
  var comments: js.UndefOr[Boolean] = js.undefined
  
  /** custom code generator (defaults to astring.baseGenerator) */
  var generator: js.UndefOr[js.Object] = js.undefined
  
  /** string to use for indentation (defaults to "  ") */
  var indent: js.UndefOr[String] = js.undefined
  
  /** string to use for line endings (defaults to "\n") */
  var lineEnd: js.UndefOr[String] = js.undefined
  
  /** output stream to write the rendered code to (defaults to null) */
  var output: Stream
  
  /** source map generator (defaults to null), see https://github.com/mozilla/source-map#sourcemapgenerator */
  var sourceMap: js.UndefOr[js.Any] = js.undefined
  
  /** indent level to start from (defaults to 0) */
  var startingIndentLevel: js.UndefOr[Double] = js.undefined
}
object OptionsoutputStream {
  
  @scala.inline
  def apply(output: Stream): OptionsoutputStream = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsoutputStream]
  }
  
  @scala.inline
  implicit class OptionsoutputStreamMutableBuilder[Self <: OptionsoutputStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setGenerator(value: js.Object): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    
    @scala.inline
    def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    @scala.inline
    def setLineEnd(value: String): Self = StObject.set(x, "lineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineEndUndefined: Self = StObject.set(x, "lineEnd", js.undefined)
    
    @scala.inline
    def setOutput(value: Stream): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMap(value: js.Any): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    @scala.inline
    def setStartingIndentLevel(value: Double): Self = StObject.set(x, "startingIndentLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingIndentLevelUndefined: Self = StObject.set(x, "startingIndentLevel", js.undefined)
  }
}
