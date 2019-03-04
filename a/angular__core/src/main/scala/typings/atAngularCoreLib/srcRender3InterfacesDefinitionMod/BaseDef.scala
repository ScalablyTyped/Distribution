package typings
package atAngularCoreLib.srcRender3InterfacesDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseDef[T] extends js.Object {
  /**
    * @deprecated This is only here because `NgOnChanges` incorrectly uses declared name instead of
    * public or minified name.
    */
  val declaredInputs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: P}
    */ atAngularCoreLib.atAngularCoreLibStrings.BaseDef with js.Any
  /**
    * A dictionary mapping the inputs' minified property names to their public API names, which
    * are their aliases if any, or their original unminified property names
    * (as in `@Input('alias') propertyName: any;`).
    */
  val inputs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ atAngularCoreLib.atAngularCoreLibStrings.BaseDef with js.Any
  /**
    * A dictionary mapping the outputs' minified property names to their public API names, which
    * are their aliases if any, or their original unminified property names
    * (as in `@Output('alias') propertyName: any;`).
    */
  val outputs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: P}
    */ atAngularCoreLib.atAngularCoreLibStrings.BaseDef with js.Any
}

object BaseDef {
  @scala.inline
  def apply[T](
    declaredInputs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: P}
    */ atAngularCoreLib.atAngularCoreLibStrings.BaseDef with js.Any,
    inputs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ atAngularCoreLib.atAngularCoreLibStrings.BaseDef with js.Any,
    outputs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: P}
    */ atAngularCoreLib.atAngularCoreLibStrings.BaseDef with js.Any
  ): BaseDef[T] = {
    val __obj = js.Dynamic.literal(declaredInputs = declaredInputs, inputs = inputs, outputs = outputs)
  
    __obj.asInstanceOf[BaseDef[T]]
  }
}

