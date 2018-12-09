package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A class that is used to access all of the children of a many-to-many relationship.
     * Each instance of AV.Relation is associated with a particular parent object and key.
     */
@JSImport("avoscloud-sdk", "Relation")
@js.native
class Relation ()
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Relation {
  def this(parent: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Object) = this()
  def this(parent: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Object, key: java.lang.String) = this()
  /* CompleteClass */
  override var key: java.lang.String = js.native
  /* CompleteClass */
  override var parent: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Object = js.native
  /* CompleteClass */
  override var targetClassName: java.lang.String = js.native
  //Adds a AV.Object or an array of AV.Objects to the relation.
  /* CompleteClass */
  override def add(`object`: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Object): scala.Unit = js.native
  // Returns a AV.Query that is limited to objects in this relation.
  /* CompleteClass */
  override def query(): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Query = js.native
  // Removes a AV.Object or an array of AV.Objects from this relation.
  /* CompleteClass */
  override def remove(`object`: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Object): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

