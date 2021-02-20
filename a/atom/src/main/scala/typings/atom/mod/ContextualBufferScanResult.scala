package typings.atom.mod

import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextualBufferScanResult extends BufferScanResult {
  
  var leadingContextLines: js.Array[String] = js.native
  
  var trailingContextLines: js.Array[String] = js.native
}
object ContextualBufferScanResult {
  
  @scala.inline
  def apply(
    buffer: TextBuffer,
    leadingContextLines: js.Array[String],
    lineText: String,
    `match`: RegExpExecArray,
    matchText: String,
    range: Range,
    replace: String => Unit,
    stop: () => Unit,
    stopped: Boolean,
    trailingContextLines: js.Array[String]
  ): ContextualBufferScanResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], leadingContextLines = leadingContextLines.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], replace = js.Any.fromFunction1(replace), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any], trailingContextLines = trailingContextLines.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextualBufferScanResult]
  }
  
  @scala.inline
  implicit class ContextualBufferScanResultMutableBuilder[Self <: ContextualBufferScanResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeadingContextLines(value: js.Array[String]): Self = StObject.set(x, "leadingContextLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingContextLinesVarargs(value: String*): Self = StObject.set(x, "leadingContextLines", js.Array(value :_*))
    
    @scala.inline
    def setTrailingContextLines(value: js.Array[String]): Self = StObject.set(x, "trailingContextLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingContextLinesVarargs(value: String*): Self = StObject.set(x, "trailingContextLines", js.Array(value :_*))
  }
}
