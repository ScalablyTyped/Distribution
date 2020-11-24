package typings.angular.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteRegistry extends js.Object {
  
  /**
    * Given a component and a configuration object, add the route to this registry
    */
  def config(parentComponent: js.Any, config: RouteDefinition): Unit = js.native
  
  /**
    * Reads the annotations of a component and configures the registry based on them
    */
  def configFromComponent(component: js.Any): Unit = js.native
  
  /**
    * Given a normalized list with component names and params like: `['user', {id: 3 }]`
    * generates a url with a leading slash relative to the provided `parentComponent`.
    *
    * If the optional param `_aux` is `true`, then we generate starting at an auxiliary
    * route boundary.
    */
  def generate(linkParams: js.Array[_], ancestorInstructions: js.Array[Instruction]): Instruction = js.native
  def generate(linkParams: js.Array[_], ancestorInstructions: js.Array[Instruction], _aux: Boolean): Instruction = js.native
  
  def generateDefault(componentCursor: js.Any): Instruction = js.native
  
  def hasRoute(name: String, parentComponent: js.Any): Boolean = js.native
  
  /**
    * Given a URL and a parent component, return the most specific instruction for navigating
    * the application into the state specified by the url
    */
  def recognize(url: String, ancestorInstructions: js.Array[Instruction]): js.Any = js.native
}
