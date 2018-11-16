package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CollectionSessionStorage extends SessionStorage {
  def clear(session: Session): scala.Boolean
  @JSName("new")
  def new_MCollectionSessionStorage(): Session
  def prune(): js.Array[java.lang.String]
  def save(session: Session): Session
}

