package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddExpand extends js.Object {
  def add(groupname: java.lang.String, username: java.lang.String): js.Promise[scala.Unit] = js.native
  def get(groupname: java.lang.String, username: java.lang.String): js.Promise[java.lang.String] = js.native
  def get(groupname: java.lang.String, username: java.lang.String, nested: scala.Boolean): js.Promise[java.lang.String] = js.native
  def list(groupname: java.lang.String): js.Promise[js.Array[java.lang.String | atlassianDashCrowdDashClientLib.libModelsUserMod.^ ]] = js.native
  def list(groupname: java.lang.String, nested: scala.Boolean): js.Promise[js.Array[java.lang.String | atlassianDashCrowdDashClientLib.libModelsUserMod.^ ]] = js.native
  def list(groupname: java.lang.String, nested: scala.Boolean, startIndex: scala.Double): js.Promise[js.Array[java.lang.String | atlassianDashCrowdDashClientLib.libModelsUserMod.^ ]] = js.native
  def list(
    groupname: java.lang.String,
    nested: scala.Boolean,
    startIndex: scala.Double,
    maxResults: scala.Double
  ): js.Promise[js.Array[java.lang.String | atlassianDashCrowdDashClientLib.libModelsUserMod.^ ]] = js.native
  def list(
    groupname: java.lang.String,
    nested: scala.Boolean,
    startIndex: scala.Double,
    maxResults: scala.Double,
    expand: scala.Boolean
  ): js.Promise[js.Array[java.lang.String | atlassianDashCrowdDashClientLib.libModelsUserMod.^ ]] = js.native
  def remove(groupname: java.lang.String, username: java.lang.String): js.Promise[scala.Unit] = js.native
}

