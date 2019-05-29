package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Expand extends js.Object {
  def group(restriction: java.lang.String): js.Promise[
    js.Array[java.lang.String | atlassianDashCrowdDashClientLib.libModelsGroupMod.^ ]
  ] = js.native
  def group(restriction: java.lang.String, expand: scala.Boolean): js.Promise[
    js.Array[java.lang.String | atlassianDashCrowdDashClientLib.libModelsGroupMod.^ ]
  ] = js.native
  def group(restriction: java.lang.String, expand: scala.Boolean, startIndex: scala.Double): js.Promise[
    js.Array[java.lang.String | atlassianDashCrowdDashClientLib.libModelsGroupMod.^ ]
  ] = js.native
  def group(
    restriction: java.lang.String,
    expand: scala.Boolean,
    startIndex: scala.Double,
    maxResults: scala.Double
  ): js.Promise[
    js.Array[java.lang.String | atlassianDashCrowdDashClientLib.libModelsGroupMod.^ ]
  ] = js.native
  def user(restriction: java.lang.String): js.Promise[js.Array[java.lang.String | atlassianDashCrowdDashClientLib.libModelsUserMod.^ ]] = js.native
  def user(restriction: java.lang.String, expand: scala.Boolean): js.Promise[js.Array[java.lang.String | atlassianDashCrowdDashClientLib.libModelsUserMod.^ ]] = js.native
  def user(restriction: java.lang.String, expand: scala.Boolean, startIndex: scala.Double): js.Promise[js.Array[java.lang.String | atlassianDashCrowdDashClientLib.libModelsUserMod.^ ]] = js.native
  def user(
    restriction: java.lang.String,
    expand: scala.Boolean,
    startIndex: scala.Double,
    maxResults: scala.Double
  ): js.Promise[js.Array[java.lang.String | atlassianDashCrowdDashClientLib.libModelsUserMod.^ ]] = js.native
}

