package typings.atlassianCrowdClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddGet extends js.Object {
  
  def add(groupname: String, parentname: String): js.Promise[Unit] = js.native
  
  def get(groupname: String, parentname: String): js.Promise[String] = js.native
  def get(groupname: String, parentname: String, nested: Boolean): js.Promise[String] = js.native
  
  def list(groupname: String): js.Promise[js.Array[String]] = js.native
  def list(
    groupname: String,
    nested: js.UndefOr[scala.Nothing],
    startIndex: js.UndefOr[scala.Nothing],
    maxResults: Double
  ): js.Promise[js.Array[String]] = js.native
  def list(groupname: String, nested: js.UndefOr[scala.Nothing], startIndex: Double): js.Promise[js.Array[String]] = js.native
  def list(groupname: String, nested: js.UndefOr[scala.Nothing], startIndex: Double, maxResults: Double): js.Promise[js.Array[String]] = js.native
  def list(groupname: String, nested: Boolean): js.Promise[js.Array[String]] = js.native
  def list(groupname: String, nested: Boolean, startIndex: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[js.Array[String]] = js.native
  def list(groupname: String, nested: Boolean, startIndex: Double): js.Promise[js.Array[String]] = js.native
  def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String]] = js.native
}
