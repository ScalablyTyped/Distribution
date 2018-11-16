package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A class that is used to access all of the children of a many-to-many relationship.
     * Each instance of AV.Relation is associated with a particular parent object and key.
     */

trait Relation extends BaseObject {
  var key: java.lang.String
  var parent: js.Object
  var targetClassName: java.lang.String
  //Adds a AV.Object or an array of AV.Objects to the relation.
  def add(`object`: js.Object): scala.Unit
  // Returns a AV.Query that is limited to objects in this relation.
  def query(): Query
  // Removes a AV.Object or an array of AV.Objects from this relation.
  def remove(`object`: js.Object): scala.Unit
}

