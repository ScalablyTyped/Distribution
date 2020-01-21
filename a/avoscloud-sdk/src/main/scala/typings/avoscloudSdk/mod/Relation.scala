package typings.avoscloudSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class that is used to access all of the children of a many-to-many relationship.
  * Each instance of AV.Relation is associated with a particular parent object and key.
  */
@JSImport("avoscloud-sdk", "Relation")
@js.native
class Relation () extends BaseObject {
  def this(parent: Object) = this()
  def this(parent: Object, key: String) = this()
  var key: String = js.native
  var parent: Object = js.native
  var targetClassName: String = js.native
  //Adds a AV.Object or an array of AV.Objects to the relation.
  def add(`object`: Object): Unit = js.native
  // Returns a AV.Query that is limited to objects in this relation.
  def query(): Query = js.native
  // Removes a AV.Object or an array of AV.Objects from this relation.
  def remove(`object`: Object): Unit = js.native
}

