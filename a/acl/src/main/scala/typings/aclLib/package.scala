package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aclLib {
  type Action = js.Function0[js.Any]
  type AllowedCallback = js.Function2[/* err */ nodeLib.Error, /* allowed */ scala.Boolean, js.Any]
  type AnyCallback = js.Function2[/* err */ nodeLib.Error, /* obj */ js.Any, js.Any]
  type Callback = js.Function1[/* err */ nodeLib.Error, js.Any]
  type GetUserId = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify http.IncomingMessage */ /* req */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify http.ServerResponse */ /* res */ js.Any, 
    Value
  ]
  type Value = java.lang.String | scala.Double
  type Values = Value | js.Array[Value]
  type strings = java.lang.String | js.Array[java.lang.String]
}
