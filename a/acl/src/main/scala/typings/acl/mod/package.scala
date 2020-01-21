package typings.acl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Action = js.Function0[js.Any]
  type AllowedCallback = js.Function2[/* err */ typings.std.Error, /* allowed */ scala.Boolean, js.Any]
  type AnyCallback = js.Function2[/* err */ typings.std.Error, /* obj */ js.Any, js.Any]
  type Callback = js.Function1[/* err */ js.UndefOr[typings.std.Error], js.Any]
  type GetUserId = js.Function2[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    typings.acl.mod.Value
  ]
  type MemoryBackend = typings.acl.mod.Backend[js.Array[typings.acl.mod.Action]]
  // for mongodb backend
  type MongodbBackend = typings.acl.mod.Backend[typings.acl.mod.Callback]
  // for redis backend
  type RedisBackend = typings.acl.mod.Backend[typings.redis.mod.RedisClient]
  type Value = java.lang.String | scala.Double
  type Values = typings.acl.mod.Value | js.Array[typings.acl.mod.Value]
  type strings = java.lang.String | js.Array[java.lang.String]
}
