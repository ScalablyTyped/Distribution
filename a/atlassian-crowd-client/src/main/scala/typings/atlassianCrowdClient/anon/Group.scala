package typings.atlassianCrowdClient.anon

import typings.atlassianCrowdClient.groupMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  def group(restriction: String): js.Promise[js.Array[String | ^ ]] = js.native
  def group(
    restriction: String,
    expand: js.UndefOr[scala.Nothing],
    startIndex: js.UndefOr[scala.Nothing],
    maxResults: Double
  ): js.Promise[js.Array[String | ^ ]] = js.native
  def group(restriction: String, expand: js.UndefOr[scala.Nothing], startIndex: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def group(restriction: String, expand: js.UndefOr[scala.Nothing], startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def group(restriction: String, expand: Boolean): js.Promise[js.Array[String | ^ ]] = js.native
  def group(restriction: String, expand: Boolean, startIndex: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def group(restriction: String, expand: Boolean, startIndex: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def group(restriction: String, expand: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def user(restriction: String): js.Promise[js.Array[String | typings.atlassianCrowdClient.userMod.^ ]] = js.native
  def user(
    restriction: String,
    expand: js.UndefOr[scala.Nothing],
    startIndex: js.UndefOr[scala.Nothing],
    maxResults: Double
  ): js.Promise[js.Array[String | typings.atlassianCrowdClient.userMod.^ ]] = js.native
  def user(restriction: String, expand: js.UndefOr[scala.Nothing], startIndex: Double): js.Promise[js.Array[String | typings.atlassianCrowdClient.userMod.^ ]] = js.native
  def user(restriction: String, expand: js.UndefOr[scala.Nothing], startIndex: Double, maxResults: Double): js.Promise[js.Array[String | typings.atlassianCrowdClient.userMod.^ ]] = js.native
  def user(restriction: String, expand: Boolean): js.Promise[js.Array[String | typings.atlassianCrowdClient.userMod.^ ]] = js.native
  def user(restriction: String, expand: Boolean, startIndex: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[js.Array[String | typings.atlassianCrowdClient.userMod.^ ]] = js.native
  def user(restriction: String, expand: Boolean, startIndex: Double): js.Promise[js.Array[String | typings.atlassianCrowdClient.userMod.^ ]] = js.native
  def user(restriction: String, expand: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | typings.atlassianCrowdClient.userMod.^ ]] = js.native
}

