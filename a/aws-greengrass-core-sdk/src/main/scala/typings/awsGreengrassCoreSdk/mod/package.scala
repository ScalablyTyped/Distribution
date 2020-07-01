package typings.awsGreengrassCoreSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IotCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* data */ typings.awsGreengrassCoreSdk.mod.IotCallbackData | scala.Null, 
    scala.Unit
  ]
}
