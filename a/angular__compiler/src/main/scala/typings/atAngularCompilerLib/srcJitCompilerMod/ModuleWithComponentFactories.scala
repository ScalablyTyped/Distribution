package typings
package atAngularCompilerLib.srcJitCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleWithComponentFactories extends js.Object {
  var componentFactories: js.Array[js.Object]
  var ngModuleFactory: js.Object
}

object ModuleWithComponentFactories {
  @scala.inline
  def apply(componentFactories: js.Array[js.Object], ngModuleFactory: js.Object): ModuleWithComponentFactories = {
    val __obj = js.Dynamic.literal(componentFactories = componentFactories, ngModuleFactory = ngModuleFactory)
  
    __obj.asInstanceOf[ModuleWithComponentFactories]
  }
}

