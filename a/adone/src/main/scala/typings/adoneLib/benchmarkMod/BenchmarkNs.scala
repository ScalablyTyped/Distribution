package typings
package adoneLib.benchmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/benchmark", "Benchmark")
@js.native
object BenchmarkNs extends js.Object {
  @js.native
  class Deferred protected ()
    extends benchmarkLib.benchmarkMod.Deferred {
    def this(clone: benchmarkLib.benchmarkMod.Benchmark) = this()
  }
  
  @js.native
  class Event protected ()
    extends benchmarkLib.benchmarkMod.Event {
    def this(`type`: java.lang.String) = this()
    def this(`type`: js.Object) = this()
  }
  
  @js.native
  class Suite ()
    extends benchmarkLib.benchmarkMod.Suite {
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, options: benchmarkLib.benchmarkMod.BenchmarkNs.Options) = this()
  }
  
  /* static members */
  @js.native
  object Suite extends js.Object {
    var options: benchmarkLib.Anon_Name = js.native
  }
  
}

