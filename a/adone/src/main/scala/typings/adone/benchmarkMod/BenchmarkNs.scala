package typings.adone.benchmarkMod

import typings.benchmark.benchmarkMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/benchmark", "Benchmark")
@js.native
object BenchmarkNs extends js.Object {
  @js.native
  class Deferred protected ()
    extends typings.benchmark.benchmarkMod.Deferred {
    def this(clone: typings.benchmark.benchmarkMod.Benchmark) = this()
  }
  
  @js.native
  class Event protected ()
    extends typings.benchmark.benchmarkMod.Event {
    def this(`type`: String) = this()
    def this(`type`: js.Object) = this()
  }
  
  @js.native
  class Suite ()
    extends typings.benchmark.benchmarkMod.Suite {
    def this(name: String) = this()
    def this(name: String, options: Options) = this()
  }
  
  /* static members */
  @js.native
  object Suite extends js.Object {
    var options: typings.benchmark.Anon_Name = js.native
  }
  
}

