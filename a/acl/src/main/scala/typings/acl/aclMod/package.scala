package typings.acl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aclMod {
  import typings.node.httpMod.IncomingMessage
  import typings.node.httpMod.ServerResponse
  import typings.redis.redisMod.RedisClient
  import typings.std.Error

  type Action = js.Function0[js.Any]
  type AllowedCallback = js.Function2[/* err */ Error, /* allowed */ Boolean, js.Any]
  type AnyCallback = js.Function2[/* err */ Error, /* obj */ js.Any, js.Any]
  type Callback = js.Function1[/* err */ js.UndefOr[Error], js.Any]
  type GetUserId = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Value]
  type MemoryBackend = Backend[js.Array[Action]]
  // for mongodb backend
  type MongodbBackend = Backend[Callback]
  // for redis backend
  type RedisBackend = Backend[RedisClient]
  type Value = String | Double
  type Values = Value | js.Array[Value]
  type strings = String | js.Array[String]
}
