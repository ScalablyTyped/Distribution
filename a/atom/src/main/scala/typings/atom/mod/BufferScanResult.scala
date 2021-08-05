package typings.atom.mod

import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferScanResult extends StObject {
  
  var buffer: TextBuffer
  
  var lineText: String
  
  var `match`: RegExpExecArray
  
  var matchText: String
  
  var range: Range
  
  def replace(replacementText: String): Unit
  
  def stop(): Unit
  
  var stopped: Boolean
}
object BufferScanResult {
  
  inline def apply(
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
  
  extension [Self <: BufferScanResult](x: Self) {
    
    inline def setBuffer(value: TextBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setLineText(value: String): Self = StObject.set(x, "lineText", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: RegExpExecArray): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchText(value: String): Self = StObject.set(x, "matchText", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: String => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
  }
}
