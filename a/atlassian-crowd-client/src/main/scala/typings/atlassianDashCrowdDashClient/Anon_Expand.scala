package typings.atlassianDashCrowdDashClient

import typings.atlassianDashCrowdDashClient.libModelsGroupMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Expand extends js.Object {
  def group(restriction: String): js.Promise[js.Array[String | ^ ]] = js.native
  def group(restriction: String, expand: Boolean): js.Promise[js.Array[String | ^ ]] = js.native
  def group(restriction: String, expand: Boolean, startIndex: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def group(restriction: String, expand: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def user(restriction: String): js.Promise[js.Array[String | typings.atlassianDashCrowdDashClient.libModelsUserMod.^ ]] = js.native
  def user(restriction: String, expand: Boolean): js.Promise[js.Array[String | typings.atlassianDashCrowdDashClient.libModelsUserMod.^ ]] = js.native
  def user(restriction: String, expand: Boolean, startIndex: Double): js.Promise[js.Array[String | typings.atlassianDashCrowdDashClient.libModelsUserMod.^ ]] = js.native
  def user(restriction: String, expand: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | typings.atlassianDashCrowdDashClient.libModelsUserMod.^ ]] = js.native
}

