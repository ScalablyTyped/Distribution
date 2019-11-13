package typings.asyncDashSema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-sema/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class Sema protected () extends js.Object {
    def this(nr: Double) = this()
    def this(nr: Double, hasInitFnPauseFnResumeFnCapacity: Anon_Capacity) = this()
    var free: js.Any = js.native
    var noTokens: js.Any = js.native
    var nrTokens: js.Any = js.native
    var pauseFn: js.UndefOr[js.Any] = js.native
    var paused: js.Any = js.native
    var releaseEmitter: js.Any = js.native
    var resumeFn: js.UndefOr[js.Any] = js.native
    var waiting: js.Any = js.native
    def acquire(): js.Promise[_] = js.native
    def drain(): js.Promise[js.Array[_]] = js.native
    def nrWaiting(): Double = js.native
    def release(): Unit = js.native
    def release(token: js.Any): Unit = js.native
  }
  
  def RateLimit(rps: Double): js.Function0[js.Promise[Unit]] = js.native
  def RateLimit(rps: Double, hasTimeUnitUniformDistribution: Anon_TimeUnit): js.Function0[js.Promise[Unit]] = js.native
}

