package typings.atlassianCrowdClient.anon

import typings.atlassianCrowdClient.userMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Get extends js.Object {
  
  def add(groupname: String, username: String): js.Promise[Unit] = js.native
  
  def get(groupname: String, username: String): js.Promise[String] = js.native
  def get(groupname: String, username: String, nested: Boolean): js.Promise[String] = js.native
  
  def list(groupname: String): js.Promise[js.Array[String | ^ ]] = js.native
  def list(
    groupname: String,
    nested: js.UndefOr[scala.Nothing],
    startIndex: js.UndefOr[scala.Nothing],
    maxResults: js.UndefOr[scala.Nothing],
    expand: Boolean
  ): js.Promise[js.Array[String | ^ ]] = js.native
  def list(
    groupname: String,
    nested: js.UndefOr[scala.Nothing],
    startIndex: js.UndefOr[scala.Nothing],
    maxResults: Double
  ): js.Promise[js.Array[String | ^ ]] = js.native
  def list(
    groupname: String,
    nested: js.UndefOr[scala.Nothing],
    startIndex: js.UndefOr[scala.Nothing],
    maxResults: Double,
    expand: Boolean
  ): js.Promise[js.Array[String | ^ ]] = js.native
  def list(groupname: String, nested: js.UndefOr[scala.Nothing], startIndex: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def list(
    groupname: String,
    nested: js.UndefOr[scala.Nothing],
    startIndex: Double,
    maxResults: js.UndefOr[scala.Nothing],
    expand: Boolean
  ): js.Promise[js.Array[String | ^ ]] = js.native
  def list(groupname: String, nested: js.UndefOr[scala.Nothing], startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def list(
    groupname: String,
    nested: js.UndefOr[scala.Nothing],
    startIndex: Double,
    maxResults: Double,
    expand: Boolean
  ): js.Promise[js.Array[String | ^ ]] = js.native
  def list(groupname: String, nested: Boolean): js.Promise[js.Array[String | ^ ]] = js.native
  def list(
    groupname: String,
    nested: Boolean,
    startIndex: js.UndefOr[scala.Nothing],
    maxResults: js.UndefOr[scala.Nothing],
    expand: Boolean
  ): js.Promise[js.Array[String | ^ ]] = js.native
  def list(groupname: String, nested: Boolean, startIndex: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def list(
    groupname: String,
    nested: Boolean,
    startIndex: js.UndefOr[scala.Nothing],
    maxResults: Double,
    expand: Boolean
  ): js.Promise[js.Array[String | ^ ]] = js.native
  def list(groupname: String, nested: Boolean, startIndex: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def list(
    groupname: String,
    nested: Boolean,
    startIndex: Double,
    maxResults: js.UndefOr[scala.Nothing],
    expand: Boolean
  ): js.Promise[js.Array[String | ^ ]] = js.native
  def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Double, expand: Boolean): js.Promise[js.Array[String | ^ ]] = js.native
  
  def remove(groupname: String, username: String): js.Promise[Unit] = js.native
}
