package typings.adone

import org.scalablytyped.runtime.Instantiable1
import typings.adone.benchmarkMod.BenchmarkNs.Deferred
import typings.adone.benchmarkMod.BenchmarkNs.Event
import typings.benchmark.benchmarkMod.Benchmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofBenchmark extends js.Object {
  var Deferred: Instantiable1[/* clone */ Benchmark, typings.adone.benchmarkMod.BenchmarkNs.Deferred]
  var Event: Instantiable1[/* type */ String, typings.adone.benchmarkMod.BenchmarkNs.Event]
  var Suite: TypeofClassSuite
}

object TypeofBenchmark {
  @scala.inline
  def apply(
    Deferred: Instantiable1[/* clone */ Benchmark, Deferred],
    Event: Instantiable1[/* type */ String, Event],
    Suite: TypeofClassSuite
  ): TypeofBenchmark = {
    val __obj = js.Dynamic.literal(Deferred = Deferred, Event = Event, Suite = Suite)
  
    __obj.asInstanceOf[TypeofBenchmark]
  }
}

