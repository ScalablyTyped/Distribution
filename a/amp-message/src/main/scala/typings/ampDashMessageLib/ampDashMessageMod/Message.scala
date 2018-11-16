package typings
package ampDashMessageLib.ampDashMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Message extends js.Object {
  def inspect(): java.lang.String
  def pop(): js.UndefOr[nodeLib.Buffer]
  def push(items: nodeLib.Buffer*): scala.Double
  def shift(): js.UndefOr[nodeLib.Buffer]
  def toBuffer(): nodeLib.Buffer
  def unshift(items: nodeLib.Buffer*): scala.Double
}

