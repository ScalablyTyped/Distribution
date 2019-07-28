package typings.angularDashEs.angularDashEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("angular-es", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Register component
    *
    * @param {Object<iComponent>} component - component config
    *
    * @returns {ngESDecorator} - decorated class
    */
  def Component(component: iComponent): ngESDecorator = js.native
  /**
    * Register config block
    */
  def Config(): ngESDecorator = js.native
  /**
    * Register constant
    *
    * @param {string} name - constant name
    *
    * @returns {ngESDecorator} - decorated class
    */
  def Constant(name: String): ngESDecorator = js.native
  /**
    * Register controller
    *
    * @param {string} name - controller name
    *
    * @returns {ngESDecorator} - decorated class
    */
  def Controller(name: String): ngESDecorator = js.native
  /**
    * Register decorator
    *
    * @param {string} name - provider name to decorate
    *
    * @returns {ngESDecorator} - decorated class
    */
  def Decorator(name: String): ngESDecorator = js.native
  /**
    * Register directive
    *
    * @param {string} name - directive selector, can be in hyphen-case
    *
    * @returns {ngESDecorator} - decorated class
    */
  def Directive(name: String): ngESDecorator = js.native
  /**
    * Register factory
    *
    * @param {string} name - factory name
    *
    * @returns {ngESDecorator} - decorated class
    */
  def Factory(name: String): ngESDecorator = js.native
  /**
    * Register filter
    *
    * @param {string} name - filter name
    *
    * @returns {ngESDecorator} - decorated class
    */
  def Filter(name: String): ngESDecorator = js.native
  /**
    * Add $inject property to target
    *
    * @param {Array<string>} dependencies - dependencies to inject
    *
    * @returns {ngESDecorator} - decorated class
    */
  def Inject(dependencies: String*): ngESDecorator = js.native
  /**
    * Inject dependencies as properties to target
    *
    * @param {Array<string>} dependencies - dependencies to inject
    *
    * @returns {ngESDecorator} - decorated class
    */
  def InjectAsProperty(dependencies: String*): ngESDecorator = js.native
  /**
    * Attach target to the specified module
    *
    * @param {string} name - module name
    *
    * @returns {ngESDecorator} - decorated class
    */
  def Module(name: String): ngESDecorator = js.native
  /**
    * Register provider
    *
    * @param {string} name - provider name
    *
    * @returns {ngESDecorator} - decorated class
    */
  def Provider(name: String): ngESDecorator = js.native
  /**
    * Register run block
    *
    * @returns {ngESDecorator} - decorated class
    */
  def Run(): ngESDecorator = js.native
  /**
    * Register service
    *
    * @param {string} name - service name
    *
    * @returns {ngESDecorator} - decorated class
    */
  def Service(name: String): ngESDecorator = js.native
  /**
    * Register value
    *
    * @param {string} name - value name
    *
    * @returns {ngESDecorator} - decorated class
    */
  def Value(name: String): ngESDecorator = js.native
}

