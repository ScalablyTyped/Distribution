package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clone extends js.Object {
  var Deferred: org.scalablytyped.runtime.Instantiable1[
    /* clone */ benchmarkLib.benchmarkMod.Benchmark, 
    adoneLib.benchmarkMod.BenchmarkNs.Deferred
  ]
  var Event: org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, adoneLib.benchmarkMod.BenchmarkNs.Event]
  var Suite: Anon_OptionsAnonName
}

object Anon_Clone {
  @scala.inline
  def apply(
    Deferred: org.scalablytyped.runtime.Instantiable1[
      /* clone */ benchmarkLib.benchmarkMod.Benchmark, 
      adoneLib.benchmarkMod.BenchmarkNs.Deferred
    ],
    Event: org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, adoneLib.benchmarkMod.BenchmarkNs.Event],
    Suite: Anon_OptionsAnonName
  ): Anon_Clone = {
    val __obj = js.Dynamic.literal(Deferred = Deferred, Event = Event, Suite = Suite)
  
    __obj.asInstanceOf[Anon_Clone]
  }
}

