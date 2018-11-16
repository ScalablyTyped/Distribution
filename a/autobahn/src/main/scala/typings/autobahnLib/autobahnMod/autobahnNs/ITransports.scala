package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITransports extends js.Object {
  def get(name: java.lang.String): js.Any
  def isRegistered(name: java.lang.String): scala.Boolean
  def list(): js.Array[java.lang.String]
  def register(name: java.lang.String, factory: js.Any): scala.Unit
}

