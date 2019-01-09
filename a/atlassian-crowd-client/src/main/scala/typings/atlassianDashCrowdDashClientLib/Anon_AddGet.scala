package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddGet extends js.Object {
  def add(groupname: java.lang.String, parentname: java.lang.String): js.Promise[scala.Unit] = js.native
  def get(groupname: java.lang.String, parentname: java.lang.String): js.Promise[java.lang.String] = js.native
  def get(groupname: java.lang.String, parentname: java.lang.String, nested: scala.Boolean): js.Promise[java.lang.String] = js.native
  def list(groupname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def list(groupname: java.lang.String, nested: scala.Boolean): js.Promise[js.Array[java.lang.String]] = js.native
  def list(groupname: java.lang.String, nested: scala.Boolean, startIndex: scala.Double): js.Promise[js.Array[java.lang.String]] = js.native
  def list(
    groupname: java.lang.String,
    nested: scala.Boolean,
    startIndex: scala.Double,
    maxResults: scala.Double
  ): js.Promise[js.Array[java.lang.String]] = js.native
}

