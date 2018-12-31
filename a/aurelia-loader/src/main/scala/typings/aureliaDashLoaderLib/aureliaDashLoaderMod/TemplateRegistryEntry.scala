package typings
package aureliaDashLoaderLib.aureliaDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-loader", "TemplateRegistryEntry")
@js.native
class TemplateRegistryEntry protected () extends js.Object {
  /**
    * Creates an instance of TemplateRegistryEntry.
    * @param address The address of the template that this entry represents.
    */
  def this(address: java.lang.String) = this()
  /**
    * The address of the template that this entry represents.
    */
  var address: java.lang.String = js.native
  /**
    * The dependencies of the associated template. Dependencies are not available until after the template is loaded.
    */
  var dependencies: js.Array[TemplateDependency] = js.native
  /**
    * Gets the factory capable of creating instances of this template.
    */
  var factory: js.Any = js.native
  /**
    * Indicates whether the factory is ready to be used to create instances of the associated template.
    */
  var factoryIsReady: scala.Boolean = js.native
  /**
    * Sets the resources associated with this entry.
    */
  var resources: js.Object = js.native
  /**
    * Gets the template for this registry entry.
    */
  var template: stdLib.Element = js.native
  /**
    * Indicates whether or not the associated template is loaded .
    */
  var templateIsLoaded: scala.Boolean = js.native
  /**
    * Adds a dependency to this template registry entry. Cannot be called until after the template is set.
    * @param src The dependency instance or a relative path to its module.
    * @param name An optional local name by which this dependency is used in the template.
    */
  def addDependency(src: java.lang.String): scala.Unit = js.native
  def addDependency(src: java.lang.String, name: java.lang.String): scala.Unit = js.native
  def addDependency(src: js.Function): scala.Unit = js.native
  def addDependency(src: js.Function, name: java.lang.String): scala.Unit = js.native
}

