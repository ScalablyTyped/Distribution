package typings
package avoscloudDashSdkLib.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * A AV.Op is an atomic operation that can be applied to a field in a
  * AV.Object. For example, calling <code>object.set("foo", "bar")</code>
  * is an example of a AV.Op.Set. Calling <code>object.unset("foo")</code>
  * is a AV.Op.Unset. These operations are stored in a AV.Object and
  * sent to the server as part of <code>object.save()</code> operations.
  * Instances of AV.Op should be immutable.
  *
  * You should not create subclasses of AV.Op or instantiate AV.Op
  * directly.
  */
@JSImport("leanengine", "Op")
@js.native
object OpNs extends js.Object

