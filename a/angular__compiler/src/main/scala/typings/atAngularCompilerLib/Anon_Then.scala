package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Then extends js.Object {
  var all: js.Function1[
    /* syncAsyncValues */ js.Array[atAngularCompilerLib.srcUtilMod.SyncAsync[_]], 
    atAngularCompilerLib.srcUtilMod.SyncAsync[js.Array[_]]
  ]
  var assertSync: js.Function1[/* value */ atAngularCompilerLib.srcUtilMod.SyncAsync[_], _]
  var `then`: js.Function2[
    /* value */ atAngularCompilerLib.srcUtilMod.SyncAsync[_], 
    /* cb */ js.Function1[/* value */ js.Any, atAngularCompilerLib.srcUtilMod.SyncAsync[_]], 
    atAngularCompilerLib.srcUtilMod.SyncAsync[_]
  ]
}

