package typings.`3box`.mod

import typings.`3box`.anon.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Storage extends js.Object {
  
  def all(): js.Promise[js.UndefOr[js.Array[_]]] = js.native
  def all(opts: Metadata): js.Promise[js.UndefOr[js.Array[_]]] = js.native
  
  def get(key: String): js.Promise[_] = js.native
  
  def getMetadata(key: String): js.Promise[_] = js.native
  
  def log(): js.Array[StorageLog] = js.native
  
  def remove(key: String): js.Promise[Boolean] = js.native
  
  def set(key: String, value: js.Any): js.Promise[Boolean] = js.native
  
  def setMultiple(keys: js.Array[String], values: js.Array[_]): js.Promise[Boolean] = js.native
}
