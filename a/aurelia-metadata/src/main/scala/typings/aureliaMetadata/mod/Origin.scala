package typings.aureliaMetadata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-metadata", "Origin")
@js.native
class Origin protected () extends js.Object {
  /**
    * Creates an instance of Origin metadata.
    * @param moduleId The id of the module from which the item originated.
    * @param moduleMember The member name of the export on the module object from which the item originated.
    */
  def this(moduleId: String, moduleMember: String) = this()
  /**
    * The id of the module from which the item originated.
    */
  var moduleId: String = js.native
  /**
    * The member name of the export on the module object from which the item originated.
    */
  var moduleMember: String = js.native
}

/* static members */
@JSImport("aurelia-metadata", "Origin")
@js.native
object Origin extends js.Object {
  /**
    * Get the Origin metadata for the specified function.
    * @param fn The function to inspect for Origin metadata.
    * @return Returns the Origin metadata.
    */
  def get(fn: js.Function): Origin = js.native
  /**
    * Set the Origin metadata for the specified function.
    * @param fn The function to set the Origin metadata on.
    * @param fn The Origin metadata to store on the function.
    * @return Returns the Origin metadata.
    */
  def set(fn: js.Function, origin: Origin): Unit = js.native
}

