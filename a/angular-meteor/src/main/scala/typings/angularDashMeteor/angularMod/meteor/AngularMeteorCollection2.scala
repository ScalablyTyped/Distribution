package typings.angularDashMeteor.angularMod.meteor

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that connects a Meteor Collection to an AngularJS scope variable,
  * but can use a differen type for updates.
  */
@js.native
trait AngularMeteorCollection2[T, U] extends Array[T] {
  /**
    * @param [keys] - The keys of the object to remove from the Meteor Collection.
    *               - If nothing is passed, the method removes all the documents from the AngularMeteorCollection.
    *               - If an object is passed, the method removes the object with that key from the AngularMeteorCollection.
    *               - If an array is passed, the method removes all objects that matches the keys in the array from the AngularMeteorCollection.
    */
  def remove(): Unit = js.native
  def remove(keys: U): Unit = js.native
  def remove(keys: String): Unit = js.native
  def remove(keys: js.Array[Double | String]): Unit = js.native
  def remove(keys: Double): Unit = js.native
  /**
    * @param [docs] - The docs to save to the Meteor Collection.
    *               - If the docs parameter is empty, the method saves everything in the AngularMeteorCollection as is.
    *               - If an object is passed, the method pushes that object into the AngularMeteorCollection.
    *               - If an array is passed, the method pushes all objects in the array into the AngularMeteorCollection.
    */
  def save(): Unit = js.native
  def save(docs: U): Unit = js.native
  def save(docs: js.Array[U]): Unit = js.native
  /**
    * A shorten (Syntactic sugar) function for the $meteor.subscribe function.
    * Takes only one parameter and not returns a promise like $meteor.subscribe does.
    *
    * @param subscriptionName - The subscription name to subscribe to. Exactly like the first parameter in $meteor.subscribe service.
    */
  def subscribe(subscriptionName: String): AngularMeteorCollection2[T, U] = js.native
}

