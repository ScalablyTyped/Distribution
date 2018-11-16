package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LetBinding extends js.Object {
  /**
       * The expression to access/assign/connect the binding source property.
       */
  var sourceExpression: aureliaDashBindingLib.aureliaDashBindingMod.Expression
  /**
       * Connects the binding to a scope.
       */
  def bind(source: aureliaDashBindingLib.aureliaDashBindingMod.Scope): scala.Unit
  /**
       * Disconnects the binding from a scope.
       */
  def unbind(): scala.Unit
  /**
       * Assigns a value to the target.
       */
  def updateTarget(value: js.Any): scala.Unit
}

