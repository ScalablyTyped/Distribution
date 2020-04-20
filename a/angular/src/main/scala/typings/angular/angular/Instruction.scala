package typings.angular.angular

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Instruction` is a tree of {@link ComponentInstruction}s with all the information needed
  * to transition each component in the app to a given route, including all auxiliary routes.
  *
  * `Instruction`s can be created using {@link Router#generate}, and can be used to
  * perform route changes with {@link Router#navigateByInstruction}.
  *
  * ### Example
  *
  * ```
  * import { Component } from 'angular2/core';
  * import {bootstrap} from 'angular2/platform/browser';
  * import {Router, ROUTER_DIRECTIVES, ROUTER_PROVIDERS, RouteConfig} from 'angular2/router';
  *
  * @Component({directives: [ROUTER_DIRECTIVES]})
  * @RouteConfig([
  *  {...},
  * ])
  * class AppCmp {
  *   constructor(router: Router) {
  *     var instruction = router.generate(['/MyRoute']);
  *     router.navigateByInstruction(instruction);
  *   }
  * }
  *
  * bootstrap(AppCmp, ROUTER_PROVIDERS);
  * ```
  */
trait Instruction extends js.Object {
  var auxInstruction: StringDictionary[Instruction]
  var child: Instruction
  var component: ComponentInstruction
  /**
    * Returns a new instruction that shares the state of the existing instruction, but with
    * the given child {@link Instruction} replacing the existing child.
    */
  def replaceChild(child: Instruction): Instruction
  def resolveComponent(): js.Any
  def specificity(): Double
  /**
    * default instructions override these
    */
  def toLinkUrl(): String
  /**
    * converts the instruction into a URL string
    */
  def toRootUrl(): String
  /**
    * If the final URL for the instruction is ``
    */
  def toUrlPath(): String
  def toUrlQuery(): String
  def urlParams(): js.Array[String]
  def urlPath(): String
}

object Instruction {
  @scala.inline
  def apply(
    auxInstruction: StringDictionary[Instruction],
    child: Instruction,
    component: ComponentInstruction,
    replaceChild: Instruction => Instruction,
    resolveComponent: () => js.Any,
    specificity: () => Double,
    toLinkUrl: () => String,
    toRootUrl: () => String,
    toUrlPath: () => String,
    toUrlQuery: () => String,
    urlParams: () => js.Array[String],
    urlPath: () => String
  ): Instruction = {
    val __obj = js.Dynamic.literal(auxInstruction = auxInstruction.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], replaceChild = js.Any.fromFunction1(replaceChild), resolveComponent = js.Any.fromFunction0(resolveComponent), specificity = js.Any.fromFunction0(specificity), toLinkUrl = js.Any.fromFunction0(toLinkUrl), toRootUrl = js.Any.fromFunction0(toRootUrl), toUrlPath = js.Any.fromFunction0(toUrlPath), toUrlQuery = js.Any.fromFunction0(toUrlQuery), urlParams = js.Any.fromFunction0(urlParams), urlPath = js.Any.fromFunction0(urlPath))
    __obj.asInstanceOf[Instruction]
  }
}

