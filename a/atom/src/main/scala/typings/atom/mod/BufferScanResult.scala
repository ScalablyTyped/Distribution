package typings.atom.mod

import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferScanResult extends StObject {
  
  var buffer: TextBuffer = js.native
  
  var lineText: String = js.native
  
  var `match`: RegExpExecArray = js.native
  
  var matchText: String = js.native
  
  var range: Range = js.native
  
  def replace(replacementText: String): Unit = js.native
  
  def stop(): Unit = js.native
  
  var stopped: Boolean = js.native
}
object BufferScanResult {
  
  @scala.inline
  def apply(
    buffer: TextBuffer,
    lineText: String,
    `match`: RegExpExecArray,
    matchText: String,
    range: Range,
    replace: String => Unit,
    stop: () => Unit,
    stopped: Boolean
  ): BufferScanResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], replace = js.Any.fromFunction1(replace), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferScanResult]
  }
  
  @scala.inline
  implicit class BufferScanResultMutableBuilder[Self <: BufferScanResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: TextBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineText(value: String): Self = StObject.set(x, "lineText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: RegExpExecArray): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchText(value: String): Self = StObject.set(x, "matchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: String => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
  }
}
