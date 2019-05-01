package typings
package aclLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aclMod {
  type Action = js.Function0[js.Any]
  type AllowedCallback = js.Function2[/* err */ stdLib.Error, /* allowed */ scala.Boolean, js.Any]
  type AnyCallback = js.Function2[/* err */ stdLib.Error, /* obj */ js.Any, js.Any]
  type Callback = js.Function1[/* err */ js.UndefOr[stdLib.Error], js.Any]
  type GetUserId = js.Function2[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    Value
  ]
  type MemoryBackend = Backend[js.Array[Action]]
  // for mongodb backend
  type MongodbBackend = Backend[Callback]
  // for redis backend
  type RedisBackend = Backend[redisLib.redisMod.RedisClient]
  type Value = java.lang.String | scala.Double
  type Values = Value | js.Array[Value]
  type strings = java.lang.String | js.Array[java.lang.String]
}
