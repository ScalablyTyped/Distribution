package typings.angularCore.mod

import typings.angularCore.anon.EnableLongStackTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "\u0275NoopNgZone")
@js.native
class ɵNoopNgZone protected () extends NgZone {
  def this(hasEnableLongStackTraceShouldCoalesceEventChangeDetection: EnableLongStackTrace) = this()
  
  def run[T](fn: js.Function1[/* repeated */ js.Any, T], applyThis: js.Any, applyArgs: js.Any): T = js.native
  def run[T](fn: js.Function1[/* repeated */ js.Any, T], applyThis: Unit, applyArgs: js.Any): T = js.native
  
  def runGuarded[T](fn: js.Function1[/* repeated */ js.Any, js.Any], applyThis: js.Any, applyArgs: js.Any): T = js.native
  def runGuarded[T](fn: js.Function1[/* repeated */ js.Any, js.Any], applyThis: Unit, applyArgs: js.Any): T = js.native
  
  def runTask[T](fn: js.Function1[/* repeated */ js.Any, T], applyThis: js.Any, applyArgs: js.Any): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ js.Any, T], applyThis: js.Any, applyArgs: js.Any, name: String): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ js.Any, T], applyThis: Unit, applyArgs: js.Any): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ js.Any, T], applyThis: Unit, applyArgs: js.Any, name: String): T = js.native
}
