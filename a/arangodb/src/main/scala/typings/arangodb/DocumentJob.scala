package typings.arangodb

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.queuesMod.Script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined arangodb.ArangoDB.Document<arangodb.@arangodb/foxx/queues.Job> */
@js.native
trait DocumentJob
  extends /* key */ StringDictionary[js.Any] {
  var _from: js.UndefOr[String] = js.native
  var _id: String = js.native
  var _key: String = js.native
  var _rev: String = js.native
  var _to: js.UndefOr[String] = js.native
  @JSName("abort")
  var abort_Original: js.Function0[Unit] = js.native
  var created: Double = js.native
  var data: js.Any = js.native
  var delayUntil: Double = js.native
  var failure: js.UndefOr[String] = js.native
  var failures: js.Array[js.Object] = js.native
  var maxFailures: Double = js.native
  var modified: Double = js.native
  var queue: String = js.native
  var repeatDelay: Double = js.native
  var repeatTimes: Double = js.native
  var repeatUntil: Double = js.native
  var runFailures: Double = js.native
  var runs: Double = js.native
  var status: String = js.native
  var success: js.UndefOr[String] = js.native
  var `type`: Script = js.native
  def abort(): Unit = js.native
}

