package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Benchmark extends js.Object {
  val BenchmarkNs: js.Any
  var Deferred: org.scalablytyped.runtime.Instantiable1[
    /* clone */ benchmarkLib.benchmarkMod.Benchmark, 
    adoneLib.benchmarkMod.BenchmarkNs.Deferred
  ]
  var Event: org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, adoneLib.benchmarkMod.BenchmarkNs.Event]
  var Suite: Anon_OptionsAnonName
}

object Anon_Benchmark {
  @scala.inline
  def apply(
    BenchmarkNs: js.Any,
    Deferred: org.scalablytyped.runtime.Instantiable1[
      /* clone */ benchmarkLib.benchmarkMod.Benchmark, 
      adoneLib.benchmarkMod.BenchmarkNs.Deferred
    ],
    Event: org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, adoneLib.benchmarkMod.BenchmarkNs.Event],
    Suite: Anon_OptionsAnonName
  ): Anon_Benchmark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BenchmarkNs")(BenchmarkNs)
    __obj.updateDynamic("Deferred")(Deferred)
    __obj.updateDynamic("Event")(Event)
    __obj.updateDynamic("Suite")(Suite)
    __obj.asInstanceOf[Anon_Benchmark]
  }
}

