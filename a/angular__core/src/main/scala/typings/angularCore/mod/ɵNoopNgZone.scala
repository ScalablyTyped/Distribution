package typings.angularCore.mod

import typings.angularCore.anon.EnableLongStackTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "\u0275NoopNgZone")
@js.native
open class ɵNoopNgZone protected () extends NgZone {
  def this(hasEnableLongStackTraceShouldCoalesceEventChangeDetectionShouldCoalesceRunChangeDetection: EnableLongStackTrace) = this()
  
  def run[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Any, applyArgs: Any): T = js.native
  def run[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Unit, applyArgs: Any): T = js.native
  
  def runGuarded[T](fn: js.Function1[/* repeated */ Any, Any], applyThis: Any, applyArgs: Any): T = js.native
  def runGuarded[T](fn: js.Function1[/* repeated */ Any, Any], applyThis: Unit, applyArgs: Any): T = js.native
  
  def runTask[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Any, applyArgs: Any): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Any, applyArgs: Any, name: String): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Unit, applyArgs: Any): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Unit, applyArgs: Any, name: String): T = js.native
}
